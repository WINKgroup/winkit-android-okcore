<p align="center"><img width="40%" src="logo.png"/></p>

# Winkit OkCore

<img src="https://img.shields.io/badge/winkit-okcore-green.svg?logo=android&longCache=true&style=popout"> <img src="https://img.shields.io/badge/kotlin-1.2.71-blue.svg?logo=kotlin&longCache=true&style=popout">

An android core library to improve the connection between Views, Controllers and RestApi.

This project is a WIP evolution from [Wink Android Core](https://github.com/WINKgroup/android-core).

Complete documentation [Here](https://winkgroup.github.io/winkit-android-okcore/okcore).


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
	implementation 'com.github.WINKgroup:winkit-android-okcore:0.0.1'
}
```

## Implementation guide

### Rest

Overriding the **[CoreRest](https://winkgroup.github.io/winkit-android-okcore/okcore/winkit.android.okcore.rest/-core-rest/)** class you are able to *define all api* provided from the server (can exists more than one RestCore classes, one for each endpoint).

Implementation example of a **CoreRest**

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

Override the **[CoreController](https://winkgroup.github.io/winkit-android-okcore/okcore/winkit.android.okcore/-core-controller)** to create a model's controller.
This class join the http calls lifecycle to the view's lifecycle, returning to the view the Api result already converted to the model's classes.

Implementation example of a **CoreController**

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


### Multiple Core requests
There is a way to launch more CoreController's methods that returns models in a callback.
The class that provide this feature is MultipleCoreRequests.

Usage example of a **[MultipleCoreRequests](https://winkgroup.github.io/winkit-android-okcore/okcore/winkit.android.okcore/-multiple-core-requests/)**

```kotlin	
/*
Create the requests to parallelize specifying
 - the controller's method
 - extra paramethers
 - the succes type
*/
val getAll = MultipleCoreRequests.CoreControllerRequest<List<Developer>>(devController::getAll)
val create = MultipleCoreRequests.CoreControllerRequest<Developer>(devController::create, "Luigi", "Vitelli")
	
//Instantiate the MultipleCoreRequests object for requests
val all = MultipleCoreRequests(getAll, create)
	
//If true execute the finish callback on first error occurence (default is false)
all.finishOnFirstError = true
    
//execute the requests
all.start { allSuccess ->
	Log.d("MultipleCoreRequests", "result $allSuccess")
	val getAllResult = getAll.result
	val getAllError = getAll.errorMessage
	val createResult = create.result
	val createError = create.errorMessage
}
```