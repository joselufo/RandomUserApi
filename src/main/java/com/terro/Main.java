package com.terro;

import com.sun.tools.javac.jvm.Gen;
import com.terro.entities.UserRandomResponse;
import com.terro.services.UserServices;
import com.terro.services.UserServicesAsync;
import com.terro.services.UserServicesObservable;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import rx.Observer;

/**
 * Created by TeRRo on 27/08/14.
 */
public class Main {

    public static void main(String[] args) {
        RandomUser randomUser = new RandomUser();
        randomUser.setIsDebug(false);

 /*       UserServices userServices = randomUser.userServices();

        // Get one user
        final UserRandomResponse result = userServices.user();
        print(result);

        // Get one collections of users
        UserRandomResponse collectionResult = userServices.listUsers(20);
        print(collectionResult);

        // Get one user with gender
        UserRandomResponse resultGender = userServices.userWithGender(Gender.MALE);
        print(resultGender);

        // Get one collection of users with gender
        UserRandomResponse collectionResultGender = userServices.listUsersWithGender(20, Gender.FEMALE);
        print(collectionResultGender);

        UserServicesAsync userServicesAsync = randomUser.userServicesAsync();

        // Get one user asynchronous
        userServicesAsync.userAsync(listener);

        // Get one collections of users asynchronous
        userServicesAsync.listUserAsync(10, listener);

        // Get one user with gender asynchronous
        userServicesAsync.userWithGenderAsync(Gender.MALE, listener);

        // Get one collection of users with gender
        userServicesAsync.listUsersWithGenderAsync(10, Gender.FEMALE, listener);*/

        UserServicesObservable userServicesObservable = randomUser.userServicesObservable();

        userServicesObservable.user().subscribe(new Observer<UserRandomResponse>() {
            @Override
            public void onCompleted() {
                print("Observable 'user()' -> onCompleted()");
                print("-------------------------------------");
            }

            @Override
            public void onError(Throwable throwable) {
                print("Observable 'user()' -> onError()");

            }

            @Override
            public void onNext(UserRandomResponse userRandomResponse) {
                print("-------------------------------------");
                print("Observable 'user()' -> onNext() with data -> " + userRandomResponse.toString());


            }
        });


        userServicesObservable.listUsers(3).subscribe(new Observer<UserRandomResponse>() {
            @Override
            public void onCompleted() {
                print("Observable 'listUsers()' -> onCompleted()");
                print("-------------------------------------");
            }

            @Override
            public void onError(Throwable throwable) {
                print("Observable 'listUsers()' -> onError()");
            }

            @Override
            public void onNext(UserRandomResponse userRandomResponse) {
                print("-------------------------------------");
                print("Observable 'listUsers()' -> onNext() with data -> " + userRandomResponse.toString());
            }
        });

        userServicesObservable.userWithGender(Gender.FEMALE).subscribe(new Observer<UserRandomResponse>() {
            @Override
            public void onCompleted() {
                print("Observable 'userWithGender()' -> onCompleted()");
                print("-------------------------------------");
            }

            @Override
            public void onError(Throwable throwable) {
                print("Observable 'userWithGender()' -> onError()");

            }

            @Override
            public void onNext(UserRandomResponse userRandomResponse) {
                print("-------------------------------------");
                print("Observable 'userWithGender()' -> onNext() with data -> " + userRandomResponse.toString());
            }
        });

        userServicesObservable.listUsersWithGender(20, Gender.MALE).subscribe(new Observer<UserRandomResponse>() {
            @Override
            public void onCompleted() {
                print("Observable 'listUsersWithGender()' -> onCompleted()");
                print("-------------------------------------");

            }

            @Override
            public void onError(Throwable throwable) {
                print("Observable 'listUsersWithGender()' -> onError()");
            }

            @Override
            public void onNext(UserRandomResponse userRandomResponse) {
                print("-------------------------------------");
                print("Observable 'listUsersWithGender()' -> onNext() with data -> " + userRandomResponse.toString());
            }
        });

        userServicesObservable.userWithSeed("foobar").subscribe(new Observer<UserRandomResponse>() {
            @Override
            public void onCompleted() {
                print("Observable 'userWithSeed()' -> onCompleted()");
                print("-------------------------------------");
            }

            @Override
            public void onError(Throwable throwable) {
                print("Observable 'userWithSeed()' -> onError()");
            }

            @Override
            public void onNext(UserRandomResponse userRandomResponse) {
                print("-------------------------------------");
                print("Observable 'userWithSeed()' -> onNext() with data -> " + userRandomResponse.toString());
            }
        });
    }


    static Callback<UserRandomResponse> listener = new Callback<UserRandomResponse>() {
        @Override
        public void success(UserRandomResponse result, Response response) {
            print(result);
        }

        @Override
        public void failure(RetrofitError retrofitError) {

        }
    };

    public static void print (UserRandomResponse result) {
        System.out.println(result.toString());
    }
    public static void print (String result) {
        System.out.println(result);
    }

}
