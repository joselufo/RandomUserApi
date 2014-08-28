package com.terro.services;


import com.terro.entities.UserRandomResponse;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

public interface UserServicesObservable {

    @GET("/")
    public Observable<UserRandomResponse> user();

    @GET("/")
    public Observable<UserRandomResponse> listUsers(@Query("results") Integer results);

    @GET("/")
    public Observable<UserRandomResponse> userWithGender(@Query("gender") String gender);

    @GET("/")
    public Observable<UserRandomResponse> listUsersWithGender(@Query("results") Integer results, @Query("gender") String gender);

    @GET("/")
    public Observable<UserRandomResponse> userWithSeed (@Query("seed") String seed);

}
