RandomUserApi
=============

A Java wrapper for [RandomUser.me][1] API written in Java with [Retrofit][2].

RandomUser generate random user data. Like Lorem Ipsum, but for people.

This provides a fairly complete api users. This is the data structure that gives us the api.

```json
{
 results: [{
   user: {
     gender: "male",
     name: {
       title: "mr",
       first: "patrick",
       last: "coleman"
     },
     location: {
       street: "4046 hickory creek dr",
       city: "stockton",
       state: "minnesota",
       zip: "10532"
     },
     email: "patrick.coleman45@example.com",
     username: "ticklishostrich48",
     password: "darkknight55",
     salt: ">DyBf9aih",
     md5: "5d6bf4508070fba41e2d602c847cdbd9",
     sha1: "19e5b0b59e6c86dbf370c431a7edb2aa4f1420a6",
     sha256: "9434e04d307839d9b6411254007072412c11f7e6b5d8fd848e56fe5f0c660a04",
     registered: "1144410814",
     dob: "122791739",
     phone: "(510)-200-1728",
     cell: "(201)-442-6033",
     SSN: "525-20-3862",
     picture: "http://api.randomuser.me/portraits/men/9.jpg"
   },
   seed: "graywolf"
   version: "0.4"
 }]
}
```

You can use this library in Android apps, Desktop and web.

Usage
-----

Create an instance of RandomUser. This is class contains all services available in the API.

```java
RandomUser randomUser = new RandomUser();
randomUser.setIsDebug(true); // By default is false.
```

Now you can to create the services that you want.

```java
UserService userService = randomUser.userServices(); // Synchronous
UserServiceAsync userServiceAsync = randomUser.userServicesAsync(); // Asynchronous
UserServiceObservable userServiceObservable = randomUser.userServicesObservable(); // Observables with RXJava
```

You can now call the different methods of API

```java
// Get a random user synchronously
UserRandomResponse response = userService.user();
User user = response.getResults().get(0).getUser();

// Get a random user asynchronous
userServiceAsync.userAsync(new Callback<UserRandomResponse>() {
    @Override
    public void success(UserRandomResponse userRandomResponse, Response response) {
        User user = userRandomResponse.getResults().get(0).getUser();
    }

    @Override
    public void failure(RetrofitError error) {
        // Handle error
    }
});

// Subscribe one observer for get one random user
    userServiceObservable.user().subscribe(new Observer<UserRandomResponse>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(UserRandomResponse userRandomResponse) {
            User user = userRandomResponse.getResults().get(0).getUser();
        }
    });
```

See test cases in `src/test/` for more examples

Import RandomUserApi dependency
-------------------------------

You can find this library on Maven Central. All you have to do is add it on your gradle build:

```xml
dependencies {
    compile 'com.github.terro:randomuserapi:1.0.0'
}
```

Developed By
------------

* Jose Luis Franconetti Olmedo - <joseluis.franconetti@gmail.com>

Acknowledgments
---------------

* Aldo Borrero González – <aldo@aldoborrero.com> | The man who adapted the project to use Gradle!

License
-------

    Copyright 2014 Jose Luis Franconetti Olmedo

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[1]: http://randomuser.me/
[2]: https://github.com/square/retrofit