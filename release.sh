#!/bin/bash

# Check if version_name argument is provided
if [ -z "$1" ]; then
    echo "Error: version_name is not specified."
    echo "Usage: $0 <version_name>"
    exit 1
fi

# Get version_name from the first argument
version_name=$1

# Extract current VERSION_CODE from gradle.properties
version_code=$(grep -oP 'VERSION_CODE\s*=\s*\K\d+' gradle.properties)
if [ -z "$version_code" ]; then
    echo "Error: Failed to extract VERSION_CODE from gradle.properties."
    exit 1
fi

# Increment VERSION_CODE by 1
version_code=$((version_code + 1))
if ! [[ "$version_code" =~ ^[0-9]+$ ]]; then
    echo "Error: Failed to increment VERSION_CODE."
    exit 1
fi

# Update VERSION_CODE in gradle.properties.
sed -i "s/VERSION_CODE\s*=\s*[0-9]\+/VERSION_CODE = $version_code/g" gradle.properties
if ! grep -q "VERSION_CODE = $version_code" gradle.properties; then
    echo "Error: Failed to update VERSION_CODE in gradle.properties."
    exit 1
fi

# Update VERSION_NAME in gradle.properties.
sed -i -E "s/^(VERSION_NAME[[:space:]]*=[[:space:]]*)\"?[^\"]*\"?/\1${version_name}/" gradle.properties
if ! grep -qE "^VERSION_NAME[[:space:]]*=[[:space:]]*\"?${version_name}\"?" gradle.properties; then
    echo "Error: Failed to update VERSION_NAME in gradle.properties."
    exit 1
fi


# Make gradlew executable
chmod +x ./gradlew
if [ $? -ne 0 ]; then
    echo "Error: Failed to change permissions for gradlew."
    exit 1
fi

# Build the project
./gradlew --no-daemon spotlessApply
./gradlew --no-daemon assembleRelease
./gradlew --no-daemon bundleRelease
if [ $? -ne 0 ]; then
    echo "Error: Project build failed."
    exit 1
fi

echo "Build completed successfully!"
