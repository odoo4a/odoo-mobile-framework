# CHANGELOG

## [2.3.1](https://github.com/odoo4a/odoo-mobile-framework/compare/v2.3.0...v2.3.1) (2026-08-26)

### Documentation Changes 📝

* **legacy:** Added legacy changelog ([cc97fc4](https://github.com/odoo4a/odoo-mobile-framework/commit/cc97fc4e34ac8622f81f4cff411361adcaa5c584))
* Rename LICENSE ([3a17bd0](https://github.com/odoo4a/odoo-mobile-framework/commit/3a17bd0fab91b8703e5bf847720cd25006f008a5))
* Update README ([a0f2e50](https://github.com/odoo4a/odoo-mobile-framework/commit/a0f2e5012793672ebd59946dca30c79bbd613aba))

### Code Refactor 💅

* Adaptation for Java 17 ([eb22a5d](https://github.com/odoo4a/odoo-mobile-framework/commit/eb22a5dfa477578edc427dc3f024605b19e24206))

### Build system 🛠️

* Upgrade gradle ([3a185a7](https://github.com/odoo4a/odoo-mobile-framework/commit/3a185a7334063b0b167f1674adc7c29abed4c6e1))
* Version and build parameters have been overridden ([c91379a](https://github.com/odoo4a/odoo-mobile-framework/commit/c91379a2e6de0eee2db6a6a9cf70685e4681aaeb))

## v2.3.0 (2016-12-21)

### Bug Fixes

- Account remove issue
  ([`154c07d`](https://github.com/odoo4a/odoo-mobile-framework/commit/154c07d823baef0ff7d8157f7704352bca9ccd0f))

- Background color handled while swapping the notes
  ([`b9c984f`](https://github.com/odoo4a/odoo-mobile-framework/commit/b9c984f950853391c4d09cd6c17f29999cb0e55e))

- Camera permission in OFileManager
  ([`4511acb`](https://github.com/odoo4a/odoo-mobile-framework/commit/4511acb1b9f2f0349ffe3b70c31b2d55c2fd069a))

- Casting problem when receiving relational data in join
  ([`347b18c`](https://github.com/odoo4a/odoo-mobile-framework/commit/347b18c673594acafd6420a57867c90c80cd3c31))

- Creating new record if append contains OValues, Deleting record from relation table
  ([`a43d032`](https://github.com/odoo4a/odoo-mobile-framework/commit/a43d0326dac25df26d6ce5e58682856d4a7795f7))

- Cursor crash detail high definition image load #228
  ([`57ba7fd`](https://github.com/odoo4a/odoo-mobile-framework/commit/57ba7fd1e207eff84cdfec0f31905ff6140552e0))

- Db listing for Odoo 10.0+
  ([`8c56569`](https://github.com/odoo4a/odoo-mobile-framework/commit/8c56569398d766c1bbcb759d537e68cf2a330646))

- Delete many2many record
  ([`2d1e566`](https://github.com/odoo4a/odoo-mobile-framework/commit/2d1e566c726b2207d21a130488393f41be1d127b))

- Fix handle many2manyrecord relationship in OModel
  ([`c04b4fb`](https://github.com/odoo4a/odoo-mobile-framework/commit/c04b4fbeea76f30cf3c2eb95368f1ae89bc4e265))

- Fixed database created session expire issue with version 7.0
  ([`7689d84`](https://github.com/odoo4a/odoo-mobile-framework/commit/7689d847d7ed52d5b5dd0779bd2bca5eb0f9ec48))

- Fixed HTTP Request with multiple content-type
  ([`badd412`](https://github.com/odoo4a/odoo-mobile-framework/commit/badd412ca04553a915975dbb50a2cfb0635c8c8c))

- Fixed int parse issue in chatter, [IMP] Updated readme
  ([`f13a709`](https://github.com/odoo4a/odoo-mobile-framework/commit/f13a7098bf22b278c5a7c9664b205e56eb688ef7))

- Fixed int parse issue in chatter, [IMP] Updated readme
  ([`805a05b`](https://github.com/odoo4a/odoo-mobile-framework/commit/805a05bde5bb3ec7f0bdc37b4834c970ef5c2eb0))

- Fixed issue of O2M from M2M records
  ([`2d4c975`](https://github.com/odoo4a/odoo-mobile-framework/commit/2d4c97583c1402a24c23237e241bbe2256b59915))

- Fixed library for db list without authenticate.
  ([`2f328ca`](https://github.com/odoo4a/odoo-mobile-framework/commit/2f328cae00f403182e4b40b5466094078dcbb12d))

- Fixed library for db list without authenticate.
  ([`0d83d1a`](https://github.com/odoo4a/odoo-mobile-framework/commit/0d83d1abd325bc1b708e4c199af529038ca55a6d))

- Fixed login Transaction Too Large Exception crash
  ([`e7874fc`](https://github.com/odoo4a/odoo-mobile-framework/commit/e7874fc28dd7cef3c8fdbcc451526ffa794778f2))

- Fixed many to one sync id
  ([`10dff27`](https://github.com/odoo4a/odoo-mobile-framework/commit/10dff27608d4745ee9ead530e6b68b64da1bd763))

- Fixed multiple record process in single sync request for same record. (Performance improved for
  sync processing)
  ([`2fdd997`](https://github.com/odoo4a/odoo-mobile-framework/commit/2fdd9976ea2e6a77cd42bd577c1be2d19214f9bb))

- Fixed password change issue
  ([`40b2c2d`](https://github.com/odoo4a/odoo-mobile-framework/commit/40b2c2d9def14967fa51eaa079a87807b44fb39c))

- Fixed supplier creation (default takes customer = true, added partner type and set the flag as per
  type) => #143
  ([`22599f5`](https://github.com/odoo4a/odoo-mobile-framework/commit/22599f5148bd19b9df182a6d11a2a6b4f8cef29c))

- Fixed two directional sync issues.
  ([`4e8cdb9`](https://github.com/odoo4a/odoo-mobile-framework/commit/4e8cdb9045ea2a4782db41c844844123ca43823d))

- Fragment lock screen
  ([`0bdd0d4`](https://github.com/odoo4a/odoo-mobile-framework/commit/0bdd0d485c73a5f4fda542bff35c2cfcf0df16b8))

- Fragment lock screen
  ([`322ed46`](https://github.com/odoo4a/odoo-mobile-framework/commit/322ed46f114c29a6d5892966370f61b707f77a5f))

- Hangs on empty inbox in message module and empty notes when trying to sync first time
  ([`0093883`](https://github.com/odoo4a/odoo-mobile-framework/commit/0093883f2e8ff40e0389b2d0c8d0f44a8cf840ae))

- Issue with Login using SSL url
  ([`0886980`](https://github.com/odoo4a/odoo-mobile-framework/commit/08869804d0ddbd926b7217bc28ef50a0eeee1af6))

- Label text changed 'optional' to 'If any'
  ([`60fc456`](https://github.com/odoo4a/odoo-mobile-framework/commit/60fc4561b0756c6c4d690d2663d599e38dda3699))

- NULL authority with BaseModelProvider at runtime
  ([`f691971`](https://github.com/odoo4a/odoo-mobile-framework/commit/f691971ff4b7257c92c45168218bd29920cbad8f))

- OSelection field issue fixed
  ([`bbbd243`](https://github.com/odoo4a/odoo-mobile-framework/commit/bbbd2437617fad41ab8ec8ab7de876b689f8f41e))

- Problem with notes when the note modules is not installed resolved
  ([`375ba58`](https://github.com/odoo4a/odoo-mobile-framework/commit/375ba58e8223b295b2a715b5835e99d2ce1ce923))

- Record create on server
  ([`82b9954`](https://github.com/odoo4a/odoo-mobile-framework/commit/82b9954e82a804b3e0a6e81515834329c25067e0))

- RelValue fix, when OValue contain Spannable string (Converted to String)
  ([`7882e6c`](https://github.com/odoo4a/odoo-mobile-framework/commit/7882e6c6705b51863b41775ee34605965fd049b7))

- Searchable live activity broadcast receiver crash
  ([`104522d`](https://github.com/odoo4a/odoo-mobile-framework/commit/104522dac38ccaa62aaec48f909c4367460a3271))

- Searchable Live item index selection
  ([`934d96b`](https://github.com/odoo4a/odoo-mobile-framework/commit/934d96b35aa4eb770d5f12aff41c9c178bde802b))

- Selection Field value change listener
  ([`8113bbf`](https://github.com/odoo4a/odoo-mobile-framework/commit/8113bbfd4c5dcc05ae4775290bae77446406fdff))

- Sync_data_limit issue
  ([`b7f3408`](https://github.com/odoo4a/odoo-mobile-framework/commit/b7f34081add99f0b46436f09ba05faa16ac7cd05))

- Tablet login issue
  ([`15b8d01`](https://github.com/odoo4a/odoo-mobile-framework/commit/15b8d01e5dda8cc1097df73856cad52f3607a47a))

- Usability-Consistency in menu name resolved
  ([`bf755b6`](https://github.com/odoo4a/odoo-mobile-framework/commit/bf755b60b4e66c70b948da5dee25fbf7c8c7b910))

- User image too Large (Add exception)
  ([`94e396d`](https://github.com/odoo4a/odoo-mobile-framework/commit/94e396d5865b00229215624d98bb9aac86006bed))

- Userrname and password update and remove account
  ([`b7eb41b`](https://github.com/odoo4a/odoo-mobile-framework/commit/b7eb41b899ba4621c60ca66977d8892ac46b787b))

- **db**: Create one database per user
  ([`477e5d6`](https://github.com/odoo4a/odoo-mobile-framework/commit/477e5d63f62f52eab493462aa21dd5fa5c91bf16))

- **defaultValue already exists in com.android.support**: Preference-v7:24.0.0 library
  ([`334aed9`](https://github.com/odoo4a/odoo-mobile-framework/commit/334aed942c95a7db540a6299c8f267b87883a268))

- **fastscroll**: Fix behaviour
  ([`3f3a8cc`](https://github.com/odoo4a/odoo-mobile-framework/commit/3f3a8cc068edaf6f79a46274d31fc18113d3ac44))

- **framework**: Fix timeout requestSync / auth
  ([`5521812`](https://github.com/odoo4a/odoo-mobile-framework/commit/552181277fdacbf549f7b0631366fbe0bee2f8ac))

- **https**: //github.com/Odoo-mobile/framework/issues/245
  ([`606213b`](https://github.com/odoo4a/odoo-mobile-framework/commit/606213badb702f171313f9125b9ab92f5a5ee0b8))

- **manyToOne**: Not able to update record on server if many to one column has null value.
  ([`f9cf3ad`](https://github.com/odoo4a/odoo-mobile-framework/commit/f9cf3ad08d33a16d5b82ec744343ba643ca0a615))

- **OSyncAdapter**: Relationrecords sync issue
  ([`1d1901f`](https://github.com/odoo4a/odoo-mobile-framework/commit/1d1901f7c5a05286560c5b92d608afdf7d9b8c24))

- **OSyncAdapter**: Relationrecords sync issue
  ([`fa64845`](https://github.com/odoo4a/odoo-mobile-framework/commit/fa64845ff5ff6082b549a2c5916e9738433fbbeb))

- **Saas session expire issue with 10.0 (https**: //github.com/Odoo-mobile/framework/issues/231)
  ([`e50a40b`](https://github.com/odoo4a/odoo-mobile-framework/commit/e50a40bb993d8c78d4b4645fe9380069f851b11e))

- **Selection Field**: Error when default value not set in readonly mode. Ref Issue: #145
  ([`6aa86cd`](https://github.com/odoo4a/odoo-mobile-framework/commit/6aa86cd2f93b5ad450778483c8f013d31525a0c3))

### Features

- : INIT Projecty
  ([`4312662`](https://github.com/odoo4a/odoo-mobile-framework/commit/43126620b7cbe0ed093b29a5e8308dbf26b97b22))

- Add about company details
  ([`2a97712`](https://github.com/odoo4a/odoo-mobile-framework/commit/2a97712574cc02da33d69ab24a6caf7f155326ec))

- Added application description
  ([`9fa59e9`](https://github.com/odoo4a/odoo-mobile-framework/commit/9fa59e92c8eb376f77e1d911e5e3dd43e5fbc7bf))

- Added attachment handler class
  ([`a54c07d`](https://github.com/odoo4a/odoo-mobile-framework/commit/a54c07d1041aeb253020ce812f108f01a00d93d5))

- Added attachment support with chatter
  ([`a6697a5`](https://github.com/odoo4a/odoo-mobile-framework/commit/a6697a59fb9ebdbbee56628f389c8c55c7e2cd03))

- Added back button press listener for fragments
  ([`1d36b72`](https://github.com/odoo4a/odoo-mobile-framework/commit/1d36b727a356c0258243406ddb07ab2e556fb11d))

- Added background process support for onChange
  ([`be2262d`](https://github.com/odoo4a/odoo-mobile-framework/commit/be2262de391d7f8301f37e6f2dbcf7b2ee619624))

- Added before list row create callback to handle view before displaying it
  ([`7aa440f`](https://github.com/odoo4a/odoo-mobile-framework/commit/7aa440f9bcdaaf6cbfce06db332e95d8c2695c84))

- Added card view support for list
  ([`f0f2538`](https://github.com/odoo4a/odoo-mobile-framework/commit/f0f2538331f4794b8d8613b7b7a6147dbffff7aa))

- Added column onChange support for offline mode
  ([`7c9561b`](https://github.com/odoo4a/odoo-mobile-framework/commit/7c9561bcecea4acf1970a323b64870aaede917c0))

- Added contact quick creation and contact view feature to message author image
  ([`49e8fcc`](https://github.com/odoo4a/odoo-mobile-framework/commit/49e8fcca905c87b67c95804bd348793db2135ec3))

- Added contact support to app with new framework update
  ([`9c24ac3`](https://github.com/odoo4a/odoo-mobile-framework/commit/9c24ac3f0fc380a0e4744d26b90d28d0875ff46b))

- Added cursor loader support, Sync with adapter and content provider
  ([`aef829e`](https://github.com/odoo4a/odoo-mobile-framework/commit/aef829ecb1ad47514a34e474c8e15018220237dc))

- Added default domain filter on column, added call_kw for Sync Helper
  ([`b21034d`](https://github.com/odoo4a/odoo-mobile-framework/commit/b21034daf591d960da9f49d6a17c1a678416b37a))

- Added dimention for v19 api
  ([`a7910ff`](https://github.com/odoo4a/odoo-mobile-framework/commit/a7910ff01ce1e07d1408284cadd7c642d78b70f8))

- Added execute_workflow method
  ([`bfa90db`](https://github.com/odoo4a/odoo-mobile-framework/commit/bfa90dbb4e82330b8b7c2efa259cbb48a0d483c3))

- Added feature for note stages with menu stage color tag and stage label colors in listview
  ([`f63cda9`](https://github.com/odoo4a/odoo-mobile-framework/commit/f63cda9c624f4b7e59e06088a5e05a90e0e51658))

- Added feature to store functional column value in db
  ([`aa0a51e`](https://github.com/odoo4a/odoo-mobile-framework/commit/aa0a51e29beb6c747a9e2a8fc62bcea405355cd6))

- Added floating data type
  ([`bec289f`](https://github.com/odoo4a/odoo-mobile-framework/commit/bec289f26d660954b53c38d83f3da33d42bc08d2))

- Added framework features
  ([`5a5ff75`](https://github.com/odoo4a/odoo-mobile-framework/commit/5a5ff75d3aa64ab2f8f0b8200597a0c44a2e8ee8))

- Added functional field annotation support
  ([`2d6d7b8`](https://github.com/odoo4a/odoo-mobile-framework/commit/2d6d7b859a0ebe0b6fa70354ef6ab7914e7efec8))

- Added google android widget library for swipe refresh on pull
  ([`864432a`](https://github.com/odoo4a/odoo-mobile-framework/commit/864432a1360197afee739d04155868939c8a3269))

- Added JOIN support for selecting records
  ([`36f136c`](https://github.com/odoo4a/odoo-mobile-framework/commit/36f136c203366796420cb70c9be641b51b2f796c))

- Added library support for OpenERP 7.0.saas2 and OpenERP trunk
  ([`52afa84`](https://github.com/odoo4a/odoo-mobile-framework/commit/52afa84711c567fb660c8ef298f1967f4b4075de))

- Added License information
  ([`1ae9fe0`](https://github.com/odoo4a/odoo-mobile-framework/commit/1ae9fe05a6651cd5c15d8a0a80ffb0547870939c))

- Added license informations
  ([`6315a66`](https://github.com/odoo4a/odoo-mobile-framework/commit/6315a6658383063598751c1f80b65e87151c4468))

- Added ManyToMany Tags, OneToMany Tags, Updated relation handling in offline mode.
  ([`227f839`](https://github.com/odoo4a/odoo-mobile-framework/commit/227f8390c86f7b7d4fbdb362d64e394357952f5e))

- Added message model tag feature in message module
  ([`edcc264`](https://github.com/odoo4a/odoo-mobile-framework/commit/edcc26492f0ea8948fe2a15eed6d84db5ee0dbab))

- Added methods for handling manytomany records (add, delete and replace)
  ([`ba2d020`](https://github.com/odoo4a/odoo-mobile-framework/commit/ba2d020293ec12fff60567e53425805fd2e2a6cd))

- Added new API, custom controls, Updated ORM...
  ([`ef03872`](https://github.com/odoo4a/odoo-mobile-framework/commit/ef03872f0ef2fe539559365f309834daf5e6ae8a))

- Added new data types (boolean, datetime, timestamp), code improved
  ([`d6cc8d6`](https://github.com/odoo4a/odoo-mobile-framework/commit/d6cc8d604b5141eee29eac478316b40131e3b1d0))

- Added new module for user groups
  ([`d39734a`](https://github.com/odoo4a/odoo-mobile-framework/commit/d39734a3b49d60d72cf139d0808e7651a508f194))

- Added new multi select tags feature
  ([`419669b`](https://github.com/odoo4a/odoo-mobile-framework/commit/419669bec5192cb8cb2f188394a28962874b568a))

- Added new updated library for pulling and swipe feature together
  ([`96730db`](https://github.com/odoo4a/odoo-mobile-framework/commit/96730db9c1ff5c92cd8f5af815ca6eeaf2da6331))

- Added note widget for app
  ([`289d36b`](https://github.com/odoo4a/odoo-mobile-framework/commit/289d36b47a426516bddd325b42d57fb9149e2ce3))

- Added odoo library (replaced openerp with odoo)
  ([`71c5b86`](https://github.com/odoo4a/odoo-mobile-framework/commit/71c5b86de02bf28dcee63b186927fd8cae1b951d))

- Added odoo news feature
  ([`ae73218`](https://github.com/odoo4a/odoo-mobile-framework/commit/ae732189ae8412f8a251787d1d7d68c371fe46f9))

- Added orm support
  ([`e315ae7`](https://github.com/odoo4a/odoo-mobile-framework/commit/e315ae7b569ad77d12e8e6757775ab256ed101db))

- Added OViewPager control
  ([`3932bc4`](https://github.com/odoo4a/odoo-mobile-framework/commit/3932bc43e3915929d56ea9a84fe642051c5d61a2))

- Added Pad into Notes
  ([`c0e6d97`](https://github.com/odoo4a/odoo-mobile-framework/commit/c0e6d97b172ceb649a60cb1a03ea5316e4e30068))

- Added partner remove menu in detail view
  ([`66b1161`](https://github.com/odoo4a/odoo-mobile-framework/commit/66b1161599e217f5206571854ae8b30a39b42f78))

- Added password check when re-login user
  ([`022d275`](https://github.com/odoo4a/odoo-mobile-framework/commit/022d275a4c7e0b4b304d3991d2a6d21c8f83f4e0))

- Added preloader while application going to connect with odoo server
  ([`13c532b`](https://github.com/odoo4a/odoo-mobile-framework/commit/13c532b7af56d8391aa668a8fd356a0d0e11b9d5))

- Added rating feature for application
  ([`b649cd8`](https://github.com/odoo4a/odoo-mobile-framework/commit/b649cd82742a355103c2d7c1e208457c69b86e54))

- Added runtime domain filter for manytoone
  ([`54123b0`](https://github.com/odoo4a/odoo-mobile-framework/commit/54123b00eac3a876b73fe870d10ce9d0712e0f44))

- Added runtime permission model for API23+
  ([`d40f364`](https://github.com/odoo4a/odoo-mobile-framework/commit/d40f3649200a3f79136129b342b92e08efd50169))

- Added search support for OList Control
  ([`fbc928e`](https://github.com/odoo4a/odoo-mobile-framework/commit/fbc928eb31f05ac8e8f199e18441727129a76a96))

- Added searchable many to one control
  ([`77f1311`](https://github.com/odoo4a/odoo-mobile-framework/commit/77f1311f94a643f104d127b2da0be1a2798fcfd4))

- Added shared app user id
  ([`7a62a27`](https://github.com/odoo4a/odoo-mobile-framework/commit/7a62a27947a3a22236686d34e730d945c41db82c))

- Added sync data limit (setting option)
  ([`2862cc4`](https://github.com/odoo4a/odoo-mobile-framework/commit/2862cc44d59c320c5ee90206460ff089223a3ec9))

- Added sync finish listener
  ([`d900cec`](https://github.com/odoo4a/odoo-mobile-framework/commit/d900cece02f4d33d1d5460b207cd718c69c990c4))

- Added sync threaded support, cursorloader for better speed
  ([`a6a7623`](https://github.com/odoo4a/odoo-mobile-framework/commit/a6a762378c4b9d3b71ddfe5afe013bc8f4695776))

- Added tablet landscape feature
  ([`2aa27a4`](https://github.com/odoo4a/odoo-mobile-framework/commit/2aa27a458538b4e164efee1004d4a6819f210e91))

- Added Tags Features in Notes
  ([`25c2892`](https://github.com/odoo4a/odoo-mobile-framework/commit/25c28925d8bf88977609cc2e7826bb14da08d410))

- Added v11alpha api column annotation
  ([`3a9c476`](https://github.com/odoo4a/odoo-mobile-framework/commit/3a9c476cdae222b6b66d3440d2c3839b7c29f0eb))

- Added vote feature for message module (like/unline)
  ([`5978721`](https://github.com/odoo4a/odoo-mobile-framework/commit/5978721dc8de54697ceb1352d86f7943d50305f8))

- Adding message widget of application
  ([`3932b87`](https://github.com/odoo4a/odoo-mobile-framework/commit/3932b878990f228cb9e603e5cb74ca6490d245ff))

- Adding note.note module in openerp-mobile
  ([`3183d3d`](https://github.com/odoo4a/odoo-mobile-framework/commit/3183d3dd4a5793ecde46c6dc67d3c6885b9e8d2c))

- Crm.meeting for openerp-mobile
  ([`d008466`](https://github.com/odoo4a/odoo-mobile-framework/commit/d00846618b578809f3a675240c029cdf1db25643))

- Drag drop support for OList control
  ([`3a6a78f`](https://github.com/odoo4a/odoo-mobile-framework/commit/3a6a78f67878daf8ad717c4c28b176b340d5a478))

- Export database in developer mode
  ([`11c20a4`](https://github.com/odoo4a/odoo-mobile-framework/commit/11c20a409f92a074a188028c63557cb8dcd19785))

- Framework documentation added
  ([`f3b15d4`](https://github.com/odoo4a/odoo-mobile-framework/commit/f3b15d440545b47207c685e58670389fde6d21bf))

- Handle user profile feature added
  ([`fd8df1b`](https://github.com/odoo4a/odoo-mobile-framework/commit/fd8df1ba69b2b0557ef91997d4022fbc772f1978))

- Message Attachment download feature added
  ([`ee7e8f3`](https://github.com/odoo4a/odoo-mobile-framework/commit/ee7e8f3d144fdaf98406a68b8a77756dce8355fa))

- Message Module for OpenERP-Mobile
  ([`cd16413`](https://github.com/odoo4a/odoo-mobile-framework/commit/cd16413a823f60c4cd7fe07228497720ee43c102))

- Migrated v3 library with framework. Performance improved. Some of bug fixed
  ([`b17db96`](https://github.com/odoo4a/odoo-mobile-framework/commit/b17db966390f400d01d36363190d7eb7dab9c40a))

- Module config supporter file
  ([`3cd7ec4`](https://github.com/odoo4a/odoo-mobile-framework/commit/3cd7ec4935874302515222cb040770398bff9583))

- New Idea module using res partner
  ([`40385e3`](https://github.com/odoo4a/odoo-mobile-framework/commit/40385e376331cead14da7ab1784343c578d2a977))

- Odoo News Feature
  ([`9665d57`](https://github.com/odoo4a/odoo-mobile-framework/commit/9665d5701437007470990dfde5f1c0c843c149ff))

- One to many column support added
  ([`36c4e67`](https://github.com/odoo4a/odoo-mobile-framework/commit/36c4e67dfeab553cb534c9027ee50107fe543bd4))

- One2many issue solved. replaced Idea module with Library for testing relation data from server
  ([`dc47aad`](https://github.com/odoo4a/odoo-mobile-framework/commit/dc47aadac4a6a9071ead9659a18340ec80f1348b))

- Openerp-mobile-widget added
  ([`6e866fc`](https://github.com/odoo4a/odoo-mobile-framework/commit/6e866fcb96edbffa72dc5cbae95b492fc59cd4b6))

- Replaced odoo rpc library with v3. Sync performance improved.
  ([`224cbbe`](https://github.com/odoo4a/odoo-mobile-framework/commit/224cbbeb6e8b07081d7771f14ee7e95c29766dc2))

- Service listener added
  ([`5341eb4`](https://github.com/odoo4a/odoo-mobile-framework/commit/5341eb424935f897891953121435b214d537a03c))

- Sync res.partner with android contacts
  ([`d6db040`](https://github.com/odoo4a/odoo-mobile-framework/commit/d6db0407d5f9bb8a2169fffae2a2e67b9ff6afca))

- **added additional methods for OModel **: Sync() and getContext() -> #144
  ([`489e0e1`](https://github.com/odoo4a/odoo-mobile-framework/commit/489e0e150bee223b43566e3b93ec2525995b70e4))

### Improvements

- Account setting improved and font set to default
  ([`4aadd1f`](https://github.com/odoo4a/odoo-mobile-framework/commit/4aadd1fa2c0bdafea823a842741778c8b99f5533))

- Add notification for new messgaes
  ([`6a01018`](https://github.com/odoo4a/odoo-mobile-framework/commit/6a0101826fcb2f9148d426495a098399368481fa))

- Added app installed or not checker
  ([`fd3437f`](https://github.com/odoo4a/odoo-mobile-framework/commit/fd3437f2e2a18069aa7ec7fa5ccc1035ac57dc5e))

- Added attachment download support
  ([`3d52e3a`](https://github.com/odoo4a/odoo-mobile-framework/commit/3d52e3a391bf105b19c322cf66a30b985c7c819d))

- Added attachment handler
  ([`3e8ecbb`](https://github.com/odoo4a/odoo-mobile-framework/commit/3e8ecbb84eb2c6323618cade5099c17e37fa9c86))

- Added drawer support, loading fragments
  ([`324a36e`](https://github.com/odoo4a/odoo-mobile-framework/commit/324a36e9083a54e252a8680db00dd71b91d4951b))

- Added field attribute for reference column (many2one, many2many,...), added view listeners
  ([`ac6b0b3`](https://github.com/odoo4a/odoo-mobile-framework/commit/ac6b0b3e58f10504f501b600504530c3feea02dc))

- Added JSONUtil list to array convert, added tags create listener
  ([`76b3353`](https://github.com/odoo4a/odoo-mobile-framework/commit/76b3353f823f4a6b2de80748290fd89b2777a716))

- Added License information to files
  ([`a6da81e`](https://github.com/odoo4a/odoo-mobile-framework/commit/a6da81ea2a0c27a18f8cd4bded95316785c701e9))

- Added provider for base models (attachment, users)
  ([`38e8044`](https://github.com/odoo4a/odoo-mobile-framework/commit/38e80442a1ca3214930c842d4852cba061e6001e))

- Added server notification receiver
  ([`b081d46`](https://github.com/odoo4a/odoo-mobile-framework/commit/b081d469f8bf0ef2ffbe3877a3d1da1ac8a8ba5b))

- Added source for odoo-rpc-v3 inside framework
  ([`1943036`](https://github.com/odoo4a/odoo-mobile-framework/commit/194303651a82cd5b0732f3529ea370e893ef8147))

- Added static strings for multi language support, overlay actionbar, minor bug fixes
  ([`969cd34`](https://github.com/odoo4a/odoo-mobile-framework/commit/969cd3483c1b7654a7235e90dd0c102b7ed9a89f))

- Added sync finish call back for OSyncAdapter
  ([`f9c3e54`](https://github.com/odoo4a/odoo-mobile-framework/commit/f9c3e548aefe508317c44959f9fa92d37482a61d))

- Added Tags Features in Notes
  ([`6c66127`](https://github.com/odoo4a/odoo-mobile-framework/commit/6c66127d19b15bee05bb4312249df7e5839c4117))

- Addon registration error when user try to register addon with class.
  ([`80891f2`](https://github.com/odoo4a/odoo-mobile-framework/commit/80891f2f62d66a27c49e21798beac022430632ad))

- Android application orientation listview refresh
  ([`aed9065`](https://github.com/odoo4a/odoo-mobile-framework/commit/aed9065b1ebd4f8bd4639f3b22357b32a7a6ee87))

- App sync updates
  ([`f6a90b1`](https://github.com/odoo4a/odoo-mobile-framework/commit/f6a90b1c3d420c969024dca387fc4d8fcdbbc960))

- Application auth provider updated to odoo
  ([`d7e555b`](https://github.com/odoo4a/odoo-mobile-framework/commit/d7e555b793f1d3cc709d73b6b16a50125ced4ca0))

- Application icon changed and permission updated
  ([`e96dbc1`](https://github.com/odoo4a/odoo-mobile-framework/commit/e96dbc1178f1fb221d52ac07039ec390202772ad))

- Application startup, fragment manager, drawer listener updated
  ([`8db50c5`](https://github.com/odoo4a/odoo-mobile-framework/commit/8db50c5c058f6c6bfe11fcaa1c9f643268e8278e))

- Attachment db update
  ([`e267ca4`](https://github.com/odoo4a/odoo-mobile-framework/commit/e267ca40eb7c46e5102c279b4762a3197cbc9150))

- Attachment downloader progress updated, sqlite helper create tables on upgrade db
  ([`de6e7ce`](https://github.com/odoo4a/odoo-mobile-framework/commit/de6e7ceab9194af69d8339eae53a5c5b86c271ff))

- Attachment improved, Expandable gridview added
  ([`8178875`](https://github.com/odoo4a/odoo-mobile-framework/commit/8178875a088bc5d958ad2ccb615d33dbcfe380b5))

- Backstate issue updated
  ([`ebd9105`](https://github.com/odoo4a/odoo-mobile-framework/commit/ebd910565c365b8c21f66a70411f00318f76d39f))

- Calendar code updated
  ([`daf4870`](https://github.com/odoo4a/odoo-mobile-framework/commit/daf4870ce8e848074fc7b6d9510dff6ab97ac1eb))

- Calendar meeting module updated for OpenERP 7.0.saas3 and 8.0 support
  ([`6283459`](https://github.com/odoo4a/odoo-mobile-framework/commit/62834595e213d08c08c94317a231997a67c8d93b))

- Changed activity ActionBarActivity to AppCompactActivity, Minor bug fixes for actionbar show/hide
  in chatter dialog
  ([`9371294`](https://github.com/odoo4a/odoo-mobile-framework/commit/937129403efe06c44812df3cff97e404ca82fa81))

- Changed setting account label and logo, updated libraries to latest version
  ([`cb9500b`](https://github.com/odoo4a/odoo-mobile-framework/commit/cb9500b5f54deac40ce8a80057f2efac7256b021))

- Check for exists account, forgot password and create account support
  ([`5dec83a`](https://github.com/odoo4a/odoo-mobile-framework/commit/5dec83a5f96de5d15fb3bd6710e50d7367395c02))

- Check for false value in many2one record
  ([`942e153`](https://github.com/odoo4a/odoo-mobile-framework/commit/942e1539047c739675abce4ecd44fb5d415cab85))

- Clean user records on account remove
  ([`497ebc3`](https://github.com/odoo4a/odoo-mobile-framework/commit/497ebc36c08b7380e4d2e061d70fc9e14d23d8fc))

- Code for note_stages improved
  ([`8ded0ce`](https://github.com/odoo4a/odoo-mobile-framework/commit/8ded0ce3b40c5ed183f019e88aa6c1bda3c8e3bc))

- Code improved
  ([`0a905fd`](https://github.com/odoo4a/odoo-mobile-framework/commit/0a905fd1b2cd6c0f9279c68c88bcc9f2154d3116))

- Code improved
  ([`fc1e5eb`](https://github.com/odoo4a/odoo-mobile-framework/commit/fc1e5eb80369385373aa03ca7ca794e8563055c4))

- Code improved
  ([`8aa0b13`](https://github.com/odoo4a/odoo-mobile-framework/commit/8aa0b135119b89836fd19c4cfa46b5d1864a1252))

- Code improved
  ([`677ccc4`](https://github.com/odoo4a/odoo-mobile-framework/commit/677ccc479a6f63e6e1196afe94006c3368ec2103))

- Code improved and extra code removed from note
  ([`d1fc5f8`](https://github.com/odoo4a/odoo-mobile-framework/commit/d1fc5f829e458e14bf6fe76451aed3547c9fe31f))

- Code improved for AsyncTask
  ([`9bae152`](https://github.com/odoo4a/odoo-mobile-framework/commit/9bae15219688abb338ecc75658e5e9df7fb3f9bf))

- Code improved for check installed module
  ([`4348602`](https://github.com/odoo4a/odoo-mobile-framework/commit/434860243ccb8e64838be3210765e398652810e9))

- Code improved for device rotation module loading issue
  ([`37a301d`](https://github.com/odoo4a/odoo-mobile-framework/commit/37a301d71f68af8ec743e6329f69ff2c076e6b14))

- Code improved for many2many related model for sync data limit
  ([`ed7916e`](https://github.com/odoo4a/odoo-mobile-framework/commit/ed7916e7ed7e10e524abc6ced784802351843dfe))

- Code improved for message quic reply and modified notification for message.
  ([`8f65bd0`](https://github.com/odoo4a/odoo-mobile-framework/commit/8f65bd0abdd75961987ce038b38b796b513e82a9))

- Code improved for ORM, SQLiteDatabase, Modules Config, Login, Deleting user records from database
  when removing account from app.
  ([`57c520e`](https://github.com/odoo4a/odoo-mobile-framework/commit/57c520e2e1a44c2718476bd483d3cf766b3944ce))

- Code improved for res partner sync helper
  ([`0e66e7d`](https://github.com/odoo4a/odoo-mobile-framework/commit/0e66e7d53b3de3b93a58a6781f70bd125bbe2833))

- Code improved for tag in not module
  ([`43581b7`](https://github.com/odoo4a/odoo-mobile-framework/commit/43581b71cdd23bf0ee8fb5753eeef331deca8bb1))

- Code improved for the openerp notes
  ([`486d840`](https://github.com/odoo4a/odoo-mobile-framework/commit/486d840803b9ce95c51170a8ee9a62a6264c988c))

- Code improvement
  ([`61f65ce`](https://github.com/odoo4a/odoo-mobile-framework/commit/61f65ce6d81bf0f349521efe9d849f9296def6cb))

- Code improvement
  ([`4a38edb`](https://github.com/odoo4a/odoo-mobile-framework/commit/4a38edb8253adbcc81635820434cb1116aff0726))

- Code improvement and optimization
  ([`2a78d66`](https://github.com/odoo4a/odoo-mobile-framework/commit/2a78d6670ea3b12f0010cb8407bb2fc8471ffddd))

- Code improvement and updates
  ([`c2102bc`](https://github.com/odoo4a/odoo-mobile-framework/commit/c2102bcaae9467c7c2e01826f562f1240518db03))

- Code improvement for All accounts manage, New sync config wizard in create account steps, ListView
  adapter View listener from fragment (interface) added
  ([`f7254ea`](https://github.com/odoo4a/odoo-mobile-framework/commit/f7254eaa32709191131b357ab3cf0931b534aa57))

- Code improvement for application settings updates, manage sync interval
  ([`8d70df9`](https://github.com/odoo4a/odoo-mobile-framework/commit/8d70df9f3753fb7122bf3a8f2425dccfb12138c1))

- Code improvement for loading messages and search functionality.
  ([`72b2373`](https://github.com/odoo4a/odoo-mobile-framework/commit/72b2373a886deb3fa90ae5ba4fbfca671ee9eeb7))

- Code improvement for message module. Traceback when sync finish broadcast call. list adapter null
  resolved.
  ([`913b7e8`](https://github.com/odoo4a/odoo-mobile-framework/commit/913b7e84b0ee58ec525df8662cd6aa30d5903cc8))

- Code improvement in ORM file for better performance
  ([`74e036a`](https://github.com/odoo4a/odoo-mobile-framework/commit/74e036a458952069370d0fa3303b9ec7c2f9e6e8))

- Code Improvement.
  ([`8dda517`](https://github.com/odoo4a/odoo-mobile-framework/commit/8dda517c4e647e082a95aad18ebe39147d64f45a))

- Contact linked for send direct message from openerp (contact connection)
  ([`1af0687`](https://github.com/odoo4a/odoo-mobile-framework/commit/1af06870bdd56213a011dce17a3fa349a69a0a05))

- Contact sync and wizard information update
  ([`04770be`](https://github.com/odoo4a/odoo-mobile-framework/commit/04770be53b99458e28f3753d3c24ad88a57ddaf2))

- Content resolver support with model
  ([`b1b68db`](https://github.com/odoo4a/odoo-mobile-framework/commit/b1b68db865617dcfb42ef291d78a697ea8f0c037))

- Created domain from infix to prefix odoo supported for live search
  ([`403cd33`](https://github.com/odoo4a/odoo-mobile-framework/commit/403cd33aec49f8d5ab6102f7ae395016c08280a6))

- Custom column and table name for many to many relation column
  ([`654554a`](https://github.com/odoo4a/odoo-mobile-framework/commit/654554aaf48969f2e7757cabeb197973776e97fb))

- Customer,supplier,company catogrized data
  ([`e5e2504`](https://github.com/odoo4a/odoo-mobile-framework/commit/e5e25047eb09b6cc5bbb1165cfb4a496901a0a63))

- Data loading Mechanism updated
  ([`6ec2bcd`](https://github.com/odoo4a/odoo-mobile-framework/commit/6ec2bcd05c24898778f2f5cc36b69f03e140d0ee))

- Database Upgrade
  ([`127a8ba`](https://github.com/odoo4a/odoo-mobile-framework/commit/127a8ba926152ea7dd7cd44a7a78d7c184bf8fcb))

- Date issue solved. real with no size type added
  ([`8f7a90a`](https://github.com/odoo4a/odoo-mobile-framework/commit/8f7a90a0c8b47c4bbec33ec6d89bd29c5d6882b4))

- Dialog message updated
  ([`9647ebf`](https://github.com/odoo4a/odoo-mobile-framework/commit/9647ebfd2c24db98c9b1b409af2e73893d31013a))

- Directory structure updated
  ([`b549154`](https://github.com/odoo4a/odoo-mobile-framework/commit/b549154b8ab8e8f534d805972d2931408a68a45e))

- Domain filter at runtime for fields
  ([`8eaa098`](https://github.com/odoo4a/odoo-mobile-framework/commit/8eaa09813517e49deeb03140c89e15c124d073fc))

- Drawer addon menu sorting with sequence value
  ([`6e229f0`](https://github.com/odoo4a/odoo-mobile-framework/commit/6e229f088a1034ff1e004821ffa7e99565491208))

- Drawer improved with new ui
  ([`98ad172`](https://github.com/odoo4a/odoo-mobile-framework/commit/98ad172939782c74ccc0ac356f15f10c0211794a))

- Editor action added, cleaning data improved
  ([`4db2405`](https://github.com/odoo4a/odoo-mobile-framework/commit/4db2405948d5673de1ea094a608c8450a24cad12))

- Fix OModel null column, renamed attr for Image Field
  ([`48ec706`](https://github.com/odoo4a/odoo-mobile-framework/commit/48ec706af59308e4dc9a66473f835ebc8af5f934))

- Fragment restore state issue resolved
  ([`41ba29e`](https://github.com/odoo4a/odoo-mobile-framework/commit/41ba29e237d18ddcbe50b0362442af521e22b9c3))

- Framework code improvement (ORM, OEHelper, OpenERP JSON-RPC Calls)
  ([`bdf6015`](https://github.com/odoo4a/odoo-mobile-framework/commit/bdf6015b514b6787a9b6bc7839373d14ae852543))

- Framework code improvement. (Pull To Sync)
  ([`ad86345`](https://github.com/odoo4a/odoo-mobile-framework/commit/ad863451af2387dce90b68f95201f7827fa98698))

- Framework sync code improvement for better performance and fast sync with server
  ([`c6dd021`](https://github.com/odoo4a/odoo-mobile-framework/commit/c6dd02177b32380bde6e551be75f3324194bbe53))

- Gradle version update
  ([`c688ff0`](https://github.com/odoo4a/odoo-mobile-framework/commit/c688ff02118dc4698bdb3abb9ddea8abc6531547))

- Icon added and search view problem resolved
  ([`1757682`](https://github.com/odoo4a/odoo-mobile-framework/commit/1757682065a8d1c0308be58716437fc2b4fa6025))

- Imported required package
  ([`c128a64`](https://github.com/odoo4a/odoo-mobile-framework/commit/c128a64c71623521f5bba7843a6726debefa340a))

- Imporved sync adapter, renamed package authority for partners
  ([`6cf00a5`](https://github.com/odoo4a/odoo-mobile-framework/commit/6cf00a552f091ec077f745a9036622899c244134))

- Improve code and license detail
  ([`712c024`](https://github.com/odoo4a/odoo-mobile-framework/commit/712c0249076ee5673ca2f21a480bd560115bce18))

- Improve code for add number of child after subject and loading only specific columns for message
  ([`bf1fe7d`](https://github.com/odoo4a/odoo-mobile-framework/commit/bf1fe7da0174218e487c298a42a1c1e8009620eb))

- Improve code for crm.meeting
  ([`975c882`](https://github.com/odoo4a/odoo-mobile-framework/commit/975c882643187126bebeee83c23fb5f69bfb35a5))

- Improve common_listview genericity
  ([`8ab7440`](https://github.com/odoo4a/odoo-mobile-framework/commit/8ab74400659d2fa308a2b57cfbdaae23aecf2b57))

- Improve crm.meeting module
  ([`178914c`](https://github.com/odoo4a/odoo-mobile-framework/commit/178914c5ccaaf038cd0eabcd7dff0ba22d0c21f1))

- Improve mark as done functionality and improve code for notes
  ([`f73ae5f`](https://github.com/odoo4a/odoo-mobile-framework/commit/f73ae5fe29c75a954fbf91f2ee1dd7aa1cbbe983))

- Improve sync res.partner with android contacts
  ([`4d55e11`](https://github.com/odoo4a/odoo-mobile-framework/commit/4d55e117562af5ef1ca4a2fd1dcce9607caf4c82))

- Improve Timezone,calendar syncing and deleting calendar when app uninstall
  ([`05ba78d`](https://github.com/odoo4a/odoo-mobile-framework/commit/05ba78db3c7fb6ba10ad648f063d6430ebc6dc1c))

- Improve userObject properties for company_id
  ([`cd7e715`](https://github.com/odoo4a/odoo-mobile-framework/commit/cd7e7152a943a60e2def25008a558be60cd28cad))

- Improved account related issues
  ([`10417be`](https://github.com/odoo4a/odoo-mobile-framework/commit/10417bef55d1ea25dfe1d38e775d622bcecca0a9))

- Improved accounts view and renamed base xml files
  ([`f16e11e`](https://github.com/odoo4a/odoo-mobile-framework/commit/f16e11eb9a7fcac5da0fdbfaf2f4162b7e6518d2))

- Improved actionbar hide/show
  ([`0115a74`](https://github.com/odoo4a/odoo-mobile-framework/commit/0115a740f27cc057441ede608b9d3073d798bf35))

- Improved api with annotations, sync compatibility for different versions
  ([`366d655`](https://github.com/odoo4a/odoo-mobile-framework/commit/366d655f3131ad71628e1fb1a81802b673fb1e61))

- Improved attachment, sync id warning
  ([`b2d4ffc`](https://github.com/odoo4a/odoo-mobile-framework/commit/b2d4ffc6f27dba82fae7b1cb627cc412c7fb0408))

- Improved binary field for display reference image
  ([`b1e4a0b`](https://github.com/odoo4a/odoo-mobile-framework/commit/b1e4a0ba33b134fed27c6df01021e8cd47d82a23))

- Improved call_kw return value
  ([`57f5b8d`](https://github.com/odoo4a/odoo-mobile-framework/commit/57f5b8d2213c298abb6f3dce4bc50d6f7208996b))

- Improved card view padding
  ([`610e932`](https://github.com/odoo4a/odoo-mobile-framework/commit/610e93270373843009a6bc0ca29234a0ea5e8c89))

- Improved card view padding for olist
  ([`37bc6b0`](https://github.com/odoo4a/odoo-mobile-framework/commit/37bc6b049f07e402eaaba17ea4c0a39970f94ab1))

- Improved chatter
  ([`e5f039a`](https://github.com/odoo4a/odoo-mobile-framework/commit/e5f039a433cc5378dd620f43bbba80af5cbb441f))

- Improved chatter view
  ([`42eafa4`](https://github.com/odoo4a/odoo-mobile-framework/commit/42eafa44f59bfd9c0814833ada45b499fee5e07b))

- Improved code
  ([`c629ef6`](https://github.com/odoo4a/odoo-mobile-framework/commit/c629ef6e76b71c86f45d8a93dbacce557028d718))

- Improved code for handling new note stages
  ([`8d00145`](https://github.com/odoo4a/odoo-mobile-framework/commit/8d00145967a61948e200645e04c570b18d6c2a0d))

- Improved code for notes
  ([`ce695ce`](https://github.com/odoo4a/odoo-mobile-framework/commit/ce695ce32cc3a607e43b8ec63f630ebec3aeb24e))

- Improved code for secure connection (added checkbox to indicate secure connection)
  ([`a3b460f`](https://github.com/odoo4a/odoo-mobile-framework/commit/a3b460fa61270d9d3fcf0bc340a443c8c8658172))

- Improved code for sync, view pagger
  ([`d041bc6`](https://github.com/odoo4a/odoo-mobile-framework/commit/d041bc627c7f2e0560877421ed7e24282c9dbf9d))

- Improved code in ORM for handle many2many and many2one record sync with server (Performance
  improved)
  ([`c61d668`](https://github.com/odoo4a/odoo-mobile-framework/commit/c61d668fb736a19018c80af13d7a1fbb2be4a98f))

- Improved controls, style
  ([`0412e0c`](https://github.com/odoo4a/odoo-mobile-framework/commit/0412e0c53c46ca63e045c9d418336a58c44c3642))

- Improved cursor list adapter with cache view support, view bind callbacks
  ([`71b0b70`](https://github.com/odoo4a/odoo-mobile-framework/commit/71b0b70afa75f0d851c4f6995547f3a67e508395))

- Improved data loader on scroll
  ([`dc7019f`](https://github.com/odoo4a/odoo-mobile-framework/commit/dc7019f2660bc0a572fed102de55b9b45e57ce3f))

- Improved data loader with offset and limit, [ADD] added empty list custom layout
  ([`295a630`](https://github.com/odoo4a/odoo-mobile-framework/commit/295a630c50294cbf6577a142caeb1c9f1260a1c5))

- Improved datatabase creation for user
  ([`bb0c339`](https://github.com/odoo4a/odoo-mobile-framework/commit/bb0c339f400d0ae192c7aca599516cc15b963b81))

- Improved device rotation reloading fragment
  ([`8d39448`](https://github.com/odoo4a/odoo-mobile-framework/commit/8d39448aa1cd1e9575b2a2ba73d5f9fe10c00703))

- Improved dirty and inactive record sync
  ([`f44534a`](https://github.com/odoo4a/odoo-mobile-framework/commit/f44534aa70412314e41c4e72226f76fcbef69089))

- Improved drawer menu layout and fragment loading flow
  ([`2662903`](https://github.com/odoo4a/odoo-mobile-framework/commit/2662903762df7788cd46b0d3fd28e970bc9a21ea))

- Improved drawer with material design
  ([`7ec3418`](https://github.com/odoo4a/odoo-mobile-framework/commit/7ec34186a44a40c9d3276f6cb4a57a5b46118a33))

- Improved field control, added showAsText, displayPatter attributes to Ofield.
  ([`dc79fd8`](https://github.com/odoo4a/odoo-mobile-framework/commit/dc79fd8ab062d40d558383b89818976929201f14))

- Improved font, nav drawer
  ([`d78875c`](https://github.com/odoo4a/odoo-mobile-framework/commit/d78875c71eab7df71d06e45baa91c5343fc20761))

- Improved fragment loading, added background task from main scope, query updated
  ([`71573dc`](https://github.com/odoo4a/odoo-mobile-framework/commit/71573dcd617621727962aa1e7c9650bd5f63a54f))

- Improved fragment loading, check for odoo instance when not in network
  ([`42145c8`](https://github.com/odoo4a/odoo-mobile-framework/commit/42145c8ffc33ce26f109f77433de7319fd03aa87))

- Improved functional store field
  ([`b711b0a`](https://github.com/odoo4a/odoo-mobile-framework/commit/b711b0af8e60f19d333fe02106490abdee783e25))

- Improved functional store field with depend values
  ([`e42155b`](https://github.com/odoo4a/odoo-mobile-framework/commit/e42155b8b6cdeb42585854e1fda0cac1075be72a))

- Improved icon for odoo mobile connect
  ([`39e1de0`](https://github.com/odoo4a/odoo-mobile-framework/commit/39e1de0458e1c5b4edb061e0eeef2353cb339c2f))

- Improved intent requests, replaced launcher icons
  ([`ad26702`](https://github.com/odoo4a/odoo-mobile-framework/commit/ad26702394041bb7cc212993d4424fa4d5983d49))

- Improved join datarow fill in field
  ([`b1a2987`](https://github.com/odoo4a/odoo-mobile-framework/commit/b1a298793332fb7960e91a9df7b5c9335aae11b5))

- Improved layout, data loader
  ([`3b2444f`](https://github.com/odoo4a/odoo-mobile-framework/commit/3b2444fc9211c227448d7aed1d06b887b7478a2b))

- Improved library module with new API, added offline check flag when no instance of odoo check
  ([`13f2627`](https://github.com/odoo4a/odoo-mobile-framework/commit/13f2627f1d3f85e591785de853e3c3e84ccad27b))

- Improved library module, improved files
  ([`17a8da7`](https://github.com/odoo4a/odoo-mobile-framework/commit/17a8da7a0177d0b45a9676a3f57e465d28c9fec3))

- Improved library, added chatter feature
  ([`04f70b4`](https://github.com/odoo4a/odoo-mobile-framework/commit/04f70b49a29d6fe8a87d2025782c3c7da78ad67f))

- Improved list control for append, handling manytomany records command (add, remove, replace)
  ([`d74ecdd`](https://github.com/odoo4a/odoo-mobile-framework/commit/d74ecdd656152049c41d8abe20f405986c8e7b5f))

- Improved logger and attachment
  ([`20e5d26`](https://github.com/odoo4a/odoo-mobile-framework/commit/20e5d26142814a2e3700d7c2ab8600ba22445f86))

- Improved login page. added terms of service and privacy policy link
  ([`dfc2744`](https://github.com/odoo4a/odoo-mobile-framework/commit/dfc27445aab9bdad2e2e92b6b5c8d4bbce370b4e))

- Improved media read permission for kitkat
  ([`13fe2e0`](https://github.com/odoo4a/odoo-mobile-framework/commit/13fe2e06e797fb231c9dcbf79bb8f03d0773d12f))

- Improved message detail for supporing webview for message detail body.
  ([`f3f1557`](https://github.com/odoo4a/odoo-mobile-framework/commit/f3f155763d5261763bf4ae33b6793475045ac02c))

- Improved message empty notes in message module
  ([`776822f`](https://github.com/odoo4a/odoo-mobile-framework/commit/776822f8baf5518bfa75e6cbab9906be07fd24e9))

- Improved message features after beta test
  ([`9db8f7c`](https://github.com/odoo4a/odoo-mobile-framework/commit/9db8f7cf1c8b5a898b530542a2f1854e5108355b))

- Improved model for handling runtime model name with different odoo versions
  ([`8028c5c`](https://github.com/odoo4a/odoo-mobile-framework/commit/8028c5c444f1f7c254d23eb6cf327bf7d249946d))

- Improved Model object mapping
  ([`5107627`](https://github.com/odoo4a/odoo-mobile-framework/commit/510762725fef7a3fe789a9c826fed30a20d04784))

- Improved ofield column property
  ([`ba8e70f`](https://github.com/odoo4a/odoo-mobile-framework/commit/ba8e70fc0136a1c2f9a72df06df6642e7aee3939))

- Improved OField for handling many2many and one2many custom layout with oriantation
  ([`a32118c`](https://github.com/odoo4a/odoo-mobile-framework/commit/a32118ceb4c609007f6298f08593091a8d79e723))

- Improved OField for manytomany tags
  ([`1d809b9`](https://github.com/odoo4a/odoo-mobile-framework/commit/1d809b92572d406b8719d905c30f3d7544ba3ef1))

- Improved OField view click from OList control
  ([`cdbf9ee`](https://github.com/odoo4a/odoo-mobile-framework/commit/cdbf9ee4a5d6eb5e1e87e0f6716eac823b971353))

- Improved OForm validation
  ([`6ba42b2`](https://github.com/odoo4a/odoo-mobile-framework/commit/6ba42b2abb31aed1aea68fe0e84a06e63852a763))

- Improved olist control
  ([`68c7d8f`](https://github.com/odoo4a/odoo-mobile-framework/commit/68c7d8f8287379dcda2e4ba698dc088949425dee))

- Improved ORM, column, selecting relation records
  ([`a1ea8b4`](https://github.com/odoo4a/odoo-mobile-framework/commit/a1ea8b445621f39bbf126454645023752e8796f9))

- Improved performance for searchable dialog
  ([`e78d49c`](https://github.com/odoo4a/odoo-mobile-framework/commit/e78d49cc5dc1efe557a21702c91931a5eb7ef810))

- Improved performance of Message module. Code improved. Starred, make (un)read improved
  ([`87b89f9`](https://github.com/odoo4a/odoo-mobile-framework/commit/87b89f9fdbfd3a657947ce5404a3ea83e487d9d2))

- Improved profile layout, control attributes, rounded image support
  ([`8db317f`](https://github.com/odoo4a/odoo-mobile-framework/commit/8db317f711e466c53ba9d4d50481f5068bc07137))

- Improved profile ui, app bar utils
  ([`b901bc6`](https://github.com/odoo4a/odoo-mobile-framework/commit/b901bc6a9b6f4e12893e97917d45f78cacd28a8a))

- Improved pull to refresh library, drawer UI, Settings UI, [FIX] manytomany record entries
  ([`bbf099c`](https://github.com/odoo4a/odoo-mobile-framework/commit/bbf099c9bba33d5a046be58f267eb4a7b8a7fd7b))

- Improved query builder for content provider with join support
  ([`87534e9`](https://github.com/odoo4a/odoo-mobile-framework/commit/87534e9ca3b1e29ee6704b80273ddb3c285ea92f))

- Improved rotation issue
  ([`70be1b9`](https://github.com/odoo4a/odoo-mobile-framework/commit/70be1b9307592c0ba5078d402b80647994b8f711))

- Improved self signed ssl certificate warning
  ([`04c54a5`](https://github.com/odoo4a/odoo-mobile-framework/commit/04c54a56c95dd23868d77a6015d898700681c222))

- Improved support for start activity from menu
  ([`03f3321`](https://github.com/odoo4a/odoo-mobile-framework/commit/03f332153a3914b5362a3692412a0e090ff92fe5))

- Improved sync adapter
  ([`e7cb2de`](https://github.com/odoo4a/odoo-mobile-framework/commit/e7cb2defbe3aeb19233fbc49729d7d988d8aa74c))

- Improved sync adapter, service and extras before perform sync
  ([`b73450e`](https://github.com/odoo4a/odoo-mobile-framework/commit/b73450ea063f698619641456bc75beeb8dc68b0e))

- Improved sync service
  ([`2f54926`](https://github.com/odoo4a/odoo-mobile-framework/commit/2f54926a4849e06f79d8d2019c5f6de94489b6fe))

- Improved sync service with flag check for updating and removing data from server and local, added
  state for selecting functional value when syncing data
  ([`8f90769`](https://github.com/odoo4a/odoo-mobile-framework/commit/8f90769a735f2e91af69da0108d0191c02080192))

- Improved sync service, adapter, relation query
  ([`b5af9c2`](https://github.com/odoo4a/odoo-mobile-framework/commit/b5af9c27d495539bf576ca7e6636fce752788b1a))

- Improved sync service, API updates, offline support tested
  ([`f205dc5`](https://github.com/odoo4a/odoo-mobile-framework/commit/f205dc5c2ff6898866ce27dfddd13525059bae11))

- Improved sync service, callmethod, fragment quick resource access,...
  ([`639f997`](https://github.com/odoo4a/odoo-mobile-framework/commit/639f9973b9469fa7c9124847439aecc7daf1dff0))

- Improved sync service, ORM field version validation, field for OneToMany
  ([`89978a0`](https://github.com/odoo4a/odoo-mobile-framework/commit/89978a07a7172d6e4f170a9d08263d836618eab1))

- Improved sync service. Handling of relation records
  ([`a542afc`](https://github.com/odoo4a/odoo-mobile-framework/commit/a542afc958cca2f0486f330565f649714dd1c484))

- Improved sync wizard and added contact sync setting in global setting
  ([`7b097d3`](https://github.com/odoo4a/odoo-mobile-framework/commit/7b097d3145ad1f04178fa43c3b8cfaafbe399852))

- Improved syncing data flag for relational data syncing
  ([`ac9dbd3`](https://github.com/odoo4a/odoo-mobile-framework/commit/ac9dbd3ac07641dcaa555ef840aa612d0bb37eb1))

- Improved to Android OS 4.3 supported
  ([`ccdd4c9`](https://github.com/odoo4a/odoo-mobile-framework/commit/ccdd4c9a7dcd18b346366dce2e7d84da935041d0))

- Improved two-way sync, tested performance
  ([`ed0a5e0`](https://github.com/odoo4a/odoo-mobile-framework/commit/ed0a5e071822de70dac87dac0044709e9b6b27bb))

- Improved user object migration
  ([`c2d96fd`](https://github.com/odoo4a/odoo-mobile-framework/commit/c2d96fd8514d796941bd088f3a5ebf4a93b32dc3))

- Improved webview to webtextview, read less/more feature for webview, CursorListAdapter view click
  handler, ....
  ([`4b1ff21`](https://github.com/odoo4a/odoo-mobile-framework/commit/4b1ff210198f18b3f59935e45456236c5f820b34))

- Improved widget controls, added many to one, many to many, boolean (radio, switch and checkbox)
  control, tags control (readonly), image/file control
  ([`76d592d`](https://github.com/odoo4a/odoo-mobile-framework/commit/76d592da93736451493bdfc37ac72abcc9e3a05f))

- Improvement in openerp mobile (android) framework for better performance
  ([`0fbeaec`](https://github.com/odoo4a/odoo-mobile-framework/commit/0fbeaec12af549bde7cdfcb1af04b19518946107))

- Landscape flag updated
  ([`b928ada`](https://github.com/odoo4a/odoo-mobile-framework/commit/b928adaa4e6a7c2b1cfc70fd7bd79c27c76b6228))

- Launcher icon updated
  ([`c3ad27b`](https://github.com/odoo4a/odoo-mobile-framework/commit/c3ad27b84f63bcfde69e3acd370cb7c763b8470f))

- Layout and removed extra stuff, [REM] idea library module, [ADD] ResCountry java class
  ([`55bcae5`](https://github.com/odoo4a/odoo-mobile-framework/commit/55bcae552f5a922b5707277f7b5e5350cb50ef93))

- Layout of partner list and detail
  ([`5496ecf`](https://github.com/odoo4a/odoo-mobile-framework/commit/5496ecf5510b2227d83db79f7501d7c9195519cf))

- Library dependancy removed.
  ([`54a5b89`](https://github.com/odoo4a/odoo-mobile-framework/commit/54a5b894705aee159c2dd2f22356b1ce8b93d4b6))

- Library updated
  ([`6426feb`](https://github.com/odoo4a/odoo-mobile-framework/commit/6426feb26381a32c0670d0f4469fb56211e42805))

- Like/unlike thumb view improved
  ([`ba4999f`](https://github.com/odoo4a/odoo-mobile-framework/commit/ba4999f18421c0b3a7e60c5d305b6324a202d201))

- Mail group module update as per new framework
  ([`3edae3f`](https://github.com/odoo4a/odoo-mobile-framework/commit/3edae3f39459bcd8babfa31b1f2055c90ce37d16))

- Mail.message (android message module) code improvement
  ([`ea46abe`](https://github.com/odoo4a/odoo-mobile-framework/commit/ea46abe02280c6b8d4166fabe0162315a65f2098))

- Mail.message (message module) updates for add partners in compose message.
  ([`7e296ae`](https://github.com/odoo4a/odoo-mobile-framework/commit/7e296aefbc736c0ba3dc1b0aafbd7da5837b2d3d))

- Manage default instance
  ([`cee5705`](https://github.com/odoo4a/odoo-mobile-framework/commit/cee570570647f7c931c2961f2c09dddc1dd67233))

- Meeting and note service improved
  ([`d1026b6`](https://github.com/odoo4a/odoo-mobile-framework/commit/d1026b6fb0dd18d8de99efdf137aebabd8bfb945))

- Meeting calendar selection value change to calendar
  ([`2fd104f`](https://github.com/odoo4a/odoo-mobile-framework/commit/2fd104f438ca1e1252b5d306f0769ebce61904c0))

- Meeting(event) module update as per new framework
  ([`b40fcf5`](https://github.com/odoo4a/odoo-mobile-framework/commit/b40fcf5cf1f6cefc37d8853854e0e2280bfbedcd))

- Menu refresh performance improved and added specific changes update only
  ([`db1c709`](https://github.com/odoo4a/odoo-mobile-framework/commit/db1c7093671605e63dde1cead958fe268046a8a5))

- Message compose attachment improved
  ([`7a8282e`](https://github.com/odoo4a/odoo-mobile-framework/commit/7a8282e43281161f2cd58c5294f2e4d273179743))

- Message counter improved
  ([`cef7944`](https://github.com/odoo4a/odoo-mobile-framework/commit/cef794450851b4dd3702cdad1c78d189a1ed7237))

- Message counter improved, New Message notification added. old message update improved
  ([`1e1ac4a`](https://github.com/odoo4a/odoo-mobile-framework/commit/1e1ac4a3bc1695f2a2b27e48b1655fa5cfd71928))

- Message detail view and performance improved
  ([`1bab14f`](https://github.com/odoo4a/odoo-mobile-framework/commit/1bab14f0062f8b1fdf444689c4a24d5da2f86ac0))

- Message groups and message detail view module improvement + performance increased.
  ([`2284d7c`](https://github.com/odoo4a/odoo-mobile-framework/commit/2284d7c1e6af0224f7499a779a18c041142645b9))

- Message module code improvement for changing in layout with android os 4.0 (run on main UI thread)
  ([`ee0e412`](https://github.com/odoo4a/odoo-mobile-framework/commit/ee0e4123894b9c3b3994477cdfc843c06288a034))

- Message module compose, replay, groups code and performance improved
  ([`e25c932`](https://github.com/odoo4a/odoo-mobile-framework/commit/e25c932de63c3f710b235e025412482afef302fb))

- Message module update as per new framework
  ([`cda43a1`](https://github.com/odoo4a/odoo-mobile-framework/commit/cda43a12922dcf3ebea9cf17e87f6427dcf86e07))

- Message read/unread row color updates, message reply compose improved
  ([`d89db18`](https://github.com/odoo4a/odoo-mobile-framework/commit/d89db188983dd0ed92f185f0b4a8e66120063824))

- Message starred icon and syncwizard sequence updated
  ([`9a2a9ef`](https://github.com/odoo4a/odoo-mobile-framework/commit/9a2a9efb26c80a4bdcefd0015e03fce9caf99bb0))

- Message view and reply udpate message improved
  ([`d61284b`](https://github.com/odoo4a/odoo-mobile-framework/commit/d61284b6cbd8a9b9226ea4ddc9bb19979c96afbd))

- Message vote sync+icon updated
  ([`5a49959`](https://github.com/odoo4a/odoo-mobile-framework/commit/5a4995926989fd1847f450ebe1e92fb015da5a2c))

- Message vote UI update
  ([`692d24b`](https://github.com/odoo4a/odoo-mobile-framework/commit/692d24baceea5187b156c3c2fcf0d257aa044d10))

- Message Vote UI updated
  ([`2aeba38`](https://github.com/odoo4a/odoo-mobile-framework/commit/2aeba38c73f7d4808e145acb365147f0d0dd196c))

- Migrated to API 21 Support
  ([`e577afc`](https://github.com/odoo4a/odoo-mobile-framework/commit/e577afc27accb0dbc20956c45ea5fd64e4c911b7))

- Minor bug fixes
  ([`d7dd3d6`](https://github.com/odoo4a/odoo-mobile-framework/commit/d7dd3d6da0ac597e28ae732345810cdaaf3a69aa))

- Minor bug fixes and Self sign certificate warning added
  ([`847787b`](https://github.com/odoo4a/odoo-mobile-framework/commit/847787b0b137777ff117a8345aa68757e5a6971c))

- Multiple attachment problem resoved
  ([`5e504da`](https://github.com/odoo4a/odoo-mobile-framework/commit/5e504da36f05c9d8d4882401eab7069580d360c4))

- Note empty message improved
  ([`a2c4ce6`](https://github.com/odoo4a/odoo-mobile-framework/commit/a2c4ce678470a04c123cc5fa53619fdde5215ffa))

- Note follower UI and flow updated
  ([`aa42387`](https://github.com/odoo4a/odoo-mobile-framework/commit/aa423872deb8eafbb99be5941e43bbf2012ab5b4))

- Note module improved + added supporting control files
  ([`8473c12`](https://github.com/odoo4a/odoo-mobile-framework/commit/8473c124948ef555c15601af367712888e971043))

- Note module tag updated
  ([`20d146c`](https://github.com/odoo4a/odoo-mobile-framework/commit/20d146ccb435e7a78861d7361f348fa189fe8ae5))

- Note module udpated as per new framework
  ([`c74e388`](https://github.com/odoo4a/odoo-mobile-framework/commit/c74e388ec75580b7564f7afb2bd9afe0c003904e))

- Note module updated
  ([`581e5a5`](https://github.com/odoo4a/odoo-mobile-framework/commit/581e5a5357c0f165b6230204695fe51149773431))

- Note module updates + issue fixed
  ([`e61905e`](https://github.com/odoo4a/odoo-mobile-framework/commit/e61905e68e2ea6d74d786e0798f9ab776da6978d))

- Null pointer bug fixed when rotation changed in account creation
  ([`db5b6a6`](https://github.com/odoo4a/odoo-mobile-framework/commit/db5b6a6733f9ffbb36a6a876ed3f62d72f256460))

- Odoo 10.0 method improvements
  ([`40517ff`](https://github.com/odoo4a/odoo-mobile-framework/commit/40517ff24ba819f23f9e877a5001d3d7d69fb7e1))

- OEHelper sync with server delete records improved
  ([`cac89c9`](https://github.com/odoo4a/odoo-mobile-framework/commit/cac89c9ebf048ed4402600edf6a7b5d6d4245f27))

- OEHelper updated for large relation data sync
  ([`13991a0`](https://github.com/odoo4a/odoo-mobile-framework/commit/13991a07ba5c6d50bfa57fdd2fdda395d1c89bca))

- Onetomany record create and update
  ([`29a108f`](https://github.com/odoo4a/odoo-mobile-framework/commit/29a108f2b193f14bd873e4c14150d602359ed0b8))

- OpenERP JSON RPC library improved, connection test improved, Message reply code improved.
  ([`67d4c63`](https://github.com/odoo4a/odoo-mobile-framework/commit/67d4c6398493b1da24e9a2cfebdcc63accf08767))

- OpenERP Library support update. (openerp version checking)
  ([`b73f59b`](https://github.com/odoo4a/odoo-mobile-framework/commit/b73f59b9364d39c495425d1f90255a8698c4169a))

- Openerp library update
  ([`f2716f2`](https://github.com/odoo4a/odoo-mobile-framework/commit/f2716f2bfffb586917bfba35bb830fa3960c0955))

- OpenERP Login request reduced. Performance improved
  ([`d758650`](https://github.com/odoo4a/odoo-mobile-framework/commit/d75865064dea6c748c5095c1531ab365c749f725))

- Openerp-mobile widget code improved
  ([`eb32387`](https://github.com/odoo4a/odoo-mobile-framework/commit/eb32387e9adf2924319f9848857b2feb54b706f2))

- Openerp-mobile-note usablity issues improved
  ([`f4ec5ce`](https://github.com/odoo4a/odoo-mobile-framework/commit/f4ec5ce93c5c1641118e1d10059b8cf51a324de3))

- Openerp-mobile-widget composing problem solved
  ([`13162ad`](https://github.com/odoo4a/odoo-mobile-framework/commit/13162ad4e0b875c32e869a857097ba6f3a14f12a))

- ORM code improvement
  ([`f262316`](https://github.com/odoo4a/odoo-mobile-framework/commit/f262316451c02c383e3d66829892c66e992b503f))

- Provider package update , imporved sync adapter
  ([`9e987f5`](https://github.com/odoo4a/odoo-mobile-framework/commit/9e987f54ef848be8e2edb233f8b64be6f7f0ba48))

- Put domain for note_stages to avoid duplication
  ([`055bb56`](https://github.com/odoo4a/odoo-mobile-framework/commit/055bb56006453dd7347d669abbc8bea41e656568))

- README.md Updated
  ([`bcf2df8`](https://github.com/odoo4a/odoo-mobile-framework/commit/bcf2df80510e7b856b8382ff3ea4a199ba63d48b))

- Reduce code for ContentProvider. Added new OEContentProvider
  ([`7a1d615`](https://github.com/odoo4a/odoo-mobile-framework/commit/7a1d615d0223d39b205994f45ecaa2bf9c4f1a66))

- Refresh drawer
  ([`a73c5af`](https://github.com/odoo4a/odoo-mobile-framework/commit/a73c5af489a7df94960d3ad0f9b307b464cbb445))

- Relation record update issue at sync
  ([`8502e7a`](https://github.com/odoo4a/odoo-mobile-framework/commit/8502e7a8dacd01382ba1d0e45e3d81c6c80b346c))

- Remove unused code(OUser,setFromBundle method)
  ([`8a3fcfb`](https://github.com/odoo4a/odoo-mobile-framework/commit/8a3fcfbf0ec39ed93cb7d9b3ec94ac97319e5cc9))

- Removed build dependancy
  ([`b817a4b`](https://github.com/odoo4a/odoo-mobile-framework/commit/b817a4b4c72014a489d2d132631e0c5db0e9b044))

- Removed contact service
  ([`15b9096`](https://github.com/odoo4a/odoo-mobile-framework/commit/15b9096fd275f757e3d3097a39f37bd38b82d24e))

- Removed extra field, addes field to layout of detail
  ([`28a1a31`](https://github.com/odoo4a/odoo-mobile-framework/commit/28a1a31f21f86153cdc0237bb2c20e3d866ab614))

- Removed unnecessary code
  ([`b708dc1`](https://github.com/odoo4a/odoo-mobile-framework/commit/b708dc18d8844b7e5bc9b0df9f7fc1aa8267b644))

- Removed unrequired code
  ([`2c04338`](https://github.com/odoo4a/odoo-mobile-framework/commit/2c0433828afc4d3f1c5f0f9ea1396d58e5d5f895))

- Removed unrequired files from framework. replaced user detail from actionbar to drawer header.
  replaced custom font with default fonts.
  ([`1cb3a69`](https://github.com/odoo4a/odoo-mobile-framework/commit/1cb3a699fbba634494704220bc31f7eca6181d1a))

- Renamed classes, removed unused files, icons
  ([`7ed093b`](https://github.com/odoo4a/odoo-mobile-framework/commit/7ed093b658edf2f3b0ce3c01c1ee81ddaa896797))

- Renamed settings.java, blank init form
  ([`27f7a00`](https://github.com/odoo4a/odoo-mobile-framework/commit/27f7a002aa37ed02e27833c0c5c13051e7258a01))

- Renaming files Fields to OEColumn, Types to OETypes, OEListViewRows to OEListViewRow
  ([`59f5c2a`](https://github.com/odoo4a/odoo-mobile-framework/commit/59f5c2af4bc2169342825d6dbbdf20694227e486))

- Replaced layout for landscape
  ([`724094f`](https://github.com/odoo4a/odoo-mobile-framework/commit/724094f8c6bd46f610cb58c8077da0208024a3cd))

- Replaced with valid shared user id
  ([`faa24dd`](https://github.com/odoo4a/odoo-mobile-framework/commit/faa24ddb61f51ba9c033884af248891732a511cc))

- Screen rotation state handled
  ([`32376fe`](https://github.com/odoo4a/odoo-mobile-framework/commit/32376fea04d9115c291a1ac8675d03febc5086a3))

- Solved issue of user logout
  ([`62efc8c`](https://github.com/odoo4a/odoo-mobile-framework/commit/62efc8ca702b7de807058d8bde9b88d0696e8533))

- Swipe library and method name updates
  ([`e4d956a`](https://github.com/odoo4a/odoo-mobile-framework/commit/e4d956aa4cb19ef7c1d2406c427d39bfc8dc5df1))

- Swipe to archive functionality added in notes
  ([`e5261e7`](https://github.com/odoo4a/odoo-mobile-framework/commit/e5261e73ee0b62980b8aebff734cd5a43192c8bb))

- Sync data limit improved, seperate account sync updated
  ([`ea102cf`](https://github.com/odoo4a/odoo-mobile-framework/commit/ea102cfcaeab855cd4e5ba0f74b65ae8449fdcd6))

- Sync method added for custom methods, login database select issue solved. updated library classes
  ([`437d53c`](https://github.com/odoo4a/odoo-mobile-framework/commit/437d53c3e924b165844a420c4f120abb1d1cfa62))

- Sync periodic issue solved
  ([`47288a8`](https://github.com/odoo4a/odoo-mobile-framework/commit/47288a8f23d5f47703ac9472529c07f6b701d9f5))

- Sync Service updation for two-way sync
  ([`76946aa`](https://github.com/odoo4a/odoo-mobile-framework/commit/76946aa63974cd57ff2bd6bd521fb80d5b86f687))

- Sync with server method improvement - domain filter
  ([`3daf4fd`](https://github.com/odoo4a/odoo-mobile-framework/commit/3daf4fd8a73669320b3ff4255b22cb20ca988d9d))

- System framework, ORM updated.
  ([`49ff212`](https://github.com/odoo4a/odoo-mobile-framework/commit/49ff212b4334778c755573dd5af949878980953d))

- Tags implemented with message module
  ([`a5a2258`](https://github.com/odoo4a/odoo-mobile-framework/commit/a5a225831b3afbe32cf48b2b85a0091d6ce140ae))

- Tags UI update
  ([`cd2524b`](https://github.com/odoo4a/odoo-mobile-framework/commit/cd2524b27ab47462f6f3c630b76a895eb66d3f3f))

- Updated flow of sync service for hadling relational data
  ([`3592723`](https://github.com/odoo4a/odoo-mobile-framework/commit/3592723ca02d3174870340b13c22994e2a982fb1))

- Updated font support for controls
  ([`a11f558`](https://github.com/odoo4a/odoo-mobile-framework/commit/a11f5586bf34e941bf893fa3054329748e8cec70))

- Updated gradle build versions for app and project classpath.
  ([`21a6b95`](https://github.com/odoo4a/odoo-mobile-framework/commit/21a6b95b8946738de98e7aaf19308683333bad42))

- Updated gradle build, fixed library dependancy versions
  ([`be13206`](https://github.com/odoo4a/odoo-mobile-framework/commit/be13206b8536d5d2c768feb8244f131a723ec5f8))

- Updated gradle, dependancy and compile sdk versions
  ([`bbc4b8d`](https://github.com/odoo4a/odoo-mobile-framework/commit/bbc4b8d539f8cef232d60048d59ecfc75df77d18))

- Updated library for odoo9.0+ support
  ([`4c2d838`](https://github.com/odoo4a/odoo-mobile-framework/commit/4c2d83803734071f8a75db89e53179cc7dcb3a05))

- Updated library gradle build. added package checker for forked repo
  ([`78aa963`](https://github.com/odoo4a/odoo-mobile-framework/commit/78aa963c0fb99cb5fca88fa454ed2864c74b1028))

- Updated manifest merger for different package and app name. Auto change prefix for providers and
  actions
  ([`bdd4d71`](https://github.com/odoo4a/odoo-mobile-framework/commit/bdd4d716df417fdd1c2de83d7b8ee97c914ba86a))

- Updated provider to export false.
  ([`6a56e48`](https://github.com/odoo4a/odoo-mobile-framework/commit/6a56e4890311fe73ed4fa353992f915406cda570))

- Updated rpc library
  ([`2e2d387`](https://github.com/odoo4a/odoo-mobile-framework/commit/2e2d38710904ad924336243440d1d030c1f1515b))

- Updated setting menu position
  ([`db443cb`](https://github.com/odoo4a/odoo-mobile-framework/commit/db443cb96b38edc820f0b83b67cddcfb6f9de5ec))

- Updating base app fonts
  ([`fa48935`](https://github.com/odoo4a/odoo-mobile-framework/commit/fa48935783de9da62d4cdc0ed0ae74d7058ee626))

- Usability Improvements done
  ([`de04da2`](https://github.com/odoo4a/odoo-mobile-framework/commit/de04da25997b74052857016b45fd16b4a0b677a4))

- Usability label improvement
  ([`9177958`](https://github.com/odoo4a/odoo-mobile-framework/commit/91779580d5beadaf4084a78d0e4cfdd44f73fddf))

- User Profile UI
  ([`ced6067`](https://github.com/odoo4a/odoo-mobile-framework/commit/ced606795a4246e180b01a19f42f8c546ad37161))

- Widget code improved
  ([`f8937d7`](https://github.com/odoo4a/odoo-mobile-framework/commit/f8937d7e8a0fc5a3a58ba4f5ad841bb01842287f))

- Widget configure activity package changed
  ([`3f7f337`](https://github.com/odoo4a/odoo-mobile-framework/commit/3f7f337a1e4eebf2f1925fc56bcc87c179b74dad))

- Widget layout changed
  ([`a047197`](https://github.com/odoo4a/odoo-mobile-framework/commit/a0471978bd215a37a32f2135b4f60c75ace8e1ea))

- Widget mechanism improved for updation
  ([`4e46985`](https://github.com/odoo4a/odoo-mobile-framework/commit/4e4698513a8a852690e99286a5d9575965dea989))

- **improved sync domain, OField **: Check for no record for image widget
  ([`007ab85`](https://github.com/odoo4a/odoo-mobile-framework/commit/007ab85121e59fa61c5d043b37edb47a9b4905ec))

- **odoo-rpc-v3**: Updated library, fixed V9+ sync issue
  ([`b9f6df8`](https://github.com/odoo4a/odoo-mobile-framework/commit/b9f6df86764546becc891aaadfc087aac6c43322))

- **OFileManager**: Allowed to capture HIGH resolution images
  ([`1e164be`](https://github.com/odoo4a/odoo-mobile-framework/commit/1e164be9eb27f64af4774a10089409b9063f3bfc))

- **ORM**: Added function field value with select query record, order by support for one to many
  records
  ([`90c2874`](https://github.com/odoo4a/odoo-mobile-framework/commit/90c287443a6487482b71cbe6654abd7f0b02b50a))

- **orm **: Improved sync service with limiting data, [FIX] controls : updated field control for
  check manytoone related record in binary image
  ([`992597e`](https://github.com/odoo4a/odoo-mobile-framework/commit/992597e199d13b193870b36fa24534ad5d7a0b3f))

### Refactoring

- Refactore parallax library using support design library
  ([`a44abf6`](https://github.com/odoo4a/odoo-mobile-framework/commit/a44abf6d8622de15bea3a0bd222678cd59fc1d3d))

### Removals

- Removed extra commented code
  ([`6147c45`](https://github.com/odoo4a/odoo-mobile-framework/commit/6147c45f8be6d16b365f54d902bf08813ac1932d))

- Removed iml files
  ([`6f506e3`](https://github.com/odoo4a/odoo-mobile-framework/commit/6f506e34a370857f8cf47581f30793376ff14e5c))
