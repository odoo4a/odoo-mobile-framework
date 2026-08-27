package com.odoo.core.rpc.helper.utils.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class OdooRecord<K, V> extends AbstractMap<K, V> {

    public List<OdooRecord<K, V>> records = new ArrayList<>();

    private static class ConcreteOdooRecord extends OdooRecord<Object, Object> {
        private final LinkedTreeMap<Object, Object> delegateMap = new LinkedTreeMap<>();

        @Override
        public Object put(Object key, Object value) {
            return delegateMap.put(key, value);
        }

        @Override
        public Object get(Object key) {
            return delegateMap.get(key);
        }

        @Override
        public boolean containsKey(Object key) {
            return delegateMap.containsKey(key);
        }

        @Override
        public Set<Entry<Object, Object>> entrySet() {
            return delegateMap.entrySet();
        }
    }

    public String getString(String key) {
        if (containsKey(key)) {
            Object val = get(key);
            return val != null ? val.toString() : "false";
        }
        return "false";
    }

    public Double getDouble(String key) {
        Object val = get(key);
        if (val instanceof Number) {
            return ((Number) val).doubleValue();
        }
        return (Double) val;
    }

    public Integer getInt(String key) {
        Double d = getDouble(key);
        return d != null ? d.intValue() : null;
    }

    public Boolean getBoolean(String key) {
        return (Boolean) get(key);
    }

    public OdooRecord<Object, Object> getM20(String key) {
        if (!getString(key).equals("false")) {
            OdooRecord<Object, Object> rec = new ConcreteOdooRecord();
            List<Object> value = getArray(key);
            if (value != null && value.size() >= 2) {
                rec.put("id", value.get(0));
                rec.put("name", value.get(1));
            }
            return rec;
        }
        return null;
    }

    public List<Integer> getM2M(String key) {
        return getO2M(key);
    }

    public List<Integer> getO2M(String key) {
        if (!getString(key).equals("false")) {
            List<Object> rawList = getArray(key);
            List<Integer> result = new ArrayList<>();
            if (rawList != null) {
                for (Object item : rawList) {
                    if (item instanceof Number) {
                        result.add(((Number) item).intValue());
                    } else if (item instanceof Integer) {
                        result.add((Integer) item);
                    }
                }
            }
            return result;
        }
        return new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> getArray(String key) {
        return (List<T>) get(key);
    }
}
