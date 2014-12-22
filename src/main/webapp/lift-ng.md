# lift-ng

lift-ng is the most powerful, most secure AngularJS backend available today.

The design philosophy of **lift-ng** is to capture the spirit of both [Lift](http://liftweb.net) and [AngularJS](http://docs.angularjs.org/guide/overview) into one package.
The result is a secure-by-default framework facilitating powerful and robust client/server interactions for building today's modern web applications.
By utilizing Scala's powerfully-flexible language, **lift-ng** provides a DSL that is natural to use for AngularJS developers and Scala developers alike.

Lift as a backend should appeal to AngularJS developers for the following reasons:
* Lift's templating is unlike most web application frameworks in that it is plain HTML.
There is no massaging of your Angular templates to make the framework happy.
* The approach of manipulating the templates on the server by Lift is similar to how you manipulate them on the client with AngularJS.
Hence you can manipulate the DOM at the time you know the information, while on the client or earlier while on the server.
* Lift is not MVC.
No need to navigate another MVC framework while building with Angular's MVC approach.
* Lift is excellent at slinging HTML and JS.
This is precisely what an Angular application needs for a backend.
* Security is handled for you, making it virtually impossible to have your http endpoints successfully attacked.
(More on [Lift's security](http://seventhings.liftweb.net/security))
* Your application will be built on the rock-solid JVM as a time-tested Java servlet on the most mature Scala web framework.

AngularJS as a front end should appeal to Scala and Lift developers for the following reasons:
* JQuery is a pain for non-trivial applications.
* AngularJS does a fantastic job of managing complex client-side interactions for you.
* With **lift-ng** in particular, you get to utilize Lift's reactive features such as asynchronous comet updates to the client and returning `LAFuture[T]` results for services.

**lift-ng** has three major feature areas (click the respective link for details and usage examples):
* [Client-Initiated Service Calls](#client-initiated-service-calls): Write secure services in the Scala DSL which can be invoked by the client.
* [Server-Initiated Events](#server-initiated-events): Send events to `$rootScope` or a given `$scope` easily via familiar AngularJS-like calls to `broadcast` and `emit`.
* [Client-Server Model Binding](#client-server-model-binding): Define your model, declare your scope, and assign a name.
Then let **lift-ng** keep your data in sync between the client(s) and server.

