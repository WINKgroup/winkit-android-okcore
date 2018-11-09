# Winkit  

<img src="https://img.shields.io/badge/winkit-okcore-green.svg?logo=android&longCache=true&style=popout"> <img src="https://img.shields.io/badge/kotlin-1.2.71-blue.svg?logo=kotlin&longCache=true&style=popout">

An android core library to improve the connection between Views, Controllers and RestApi.

This project is a WIP evolution from [Wink Android Core](https://github.com/WINKgroup/android-core).

### Install

**1** Add the JitPack repository to your root build.gradle at the end of repositories

```groovy
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

**2** Add the dependency

```groovy
dependencies {
	implementation 'com.github.WINKgroup:winkit-android-okcore:Tag'
}
```

## Implementation guide

### Rest

Overriding the **RestCore** class you are able to *define all api* provided from the server (can exists more than one RestCore classes, one for each endpoint).

Implementation example of an **ApiCore**

```kotlin
/*
    Define the BASE URL as init param
 */
class MockyRest: CoreRest("http://www.mocky.io/v2/") {
    
    /*
        Override this method to define default headers for all requests
    */
    override fun getDefaultHeaders(): HashMap<String, String>? = null
    
    /*
        Define an api that call the "get all devs" and return a json array.
    */
    fun getAllDevs (callback: JsonArrayCallback): CoreRequest = request("592572c21200005100686f0b", callback)
}
```

### Controller

Override the **CoreController** to create a model's controller.
This class join the http calls lifecycle to the view's lifecycle, returning to the view the Api result already converted to the model's classes.

Implementation example of an **DevController**

```kotlin
/*
    Define witch CoreRest instance will be used from this controller
 */
class DevController (view: CoreUi): CoreController<MockyRest>(view, MockyRest()) {
 
    /*
        Define an asyncronus api where the view ask for a list of "Developer" instances.
        Remember, passing "viewLife" paramether as "true" will automatically cancel the http call on view destroy. 
     */
    fun getAll(callback: ParsedCallback<List<Developer>>) {
        enqueue(true, rest.getAllDevs(object: JsonArrayCallback.Secure<List<Developer>>(callback) {
            override fun onSecureResponse(json: JSONArray): List<Developer> = mapJsonArray(json) { json -> Developer(json) }
        }))
    }
}
```

### Model
This library not define and not preclude any way to implement models classes but in Wink we prefer to not use any converting library (Gson, ecc... ).
This choice is due by a bad experience with epi responses provided by external entities.
We suggest to simply create standard classes with a constructor JSONObject param (like in this app example).
