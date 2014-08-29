/*
 * Copyright 2014 Jose Luis Franconetti
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.terro.services;


import com.terro.entities.UserRandomResponse;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

public interface UserServiceObservable {

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
