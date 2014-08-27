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
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;


public interface UserServices {

    public static final String FEMALE = "female";
    public static final String MALE = "male";

    /**
     * Return one random user.
     *
     * @return
     */
    @GET("/")
    public UserRandomResponse user();

    /**
     * Returns a random user asynchronously.
     *
     * @param callback
     */
    @GET("/")
    public void userAsynchronous(Callback<UserRandomResponse> callback);

    /**
     * Returns a list of random users.
     *
     * @param results - Number of users
     */
    @GET("/")
    public UserRandomResponse listUsers(@Query("results") Integer results);

    /**
     * Returns a list of random users asynchronously.
     *
     * @param results - Number of users
     * @param callback - Callback
     */
    @GET("/")
    public void listUserAsynchronous(@Query("results") Integer results, Callback<UserRandomResponse> callback);

    /**
     * Returns a random user with a specific gender.
     *
     * @param gender - Gender user to return (Male or Fermale)
     */
    @GET("/")
    public UserRandomResponse userWithGender(@Query("gender") String gender);

    /**
     * Returns a random user with a specific gender asynchronously.
     *
     * @param gender - Gender user to return (Male or Fermale)
     * @param callback - Callback
     */
    @GET("/")
    public void userWithGenderAsynchronous(@Query("gender") String gender, Callback<UserRandomResponse> callback);

    /**
     * Returns a list of random users with a specific gender.
     *
     * @param results - Number of users
     * @param gender - Gender user to return (Male or Female)
     */
    @GET("/")
    public UserRandomResponse listUsersWithGender(@Query("results") Integer results, @Query("gender") String gender);

    /**
     * Returns a list of random users with a specific gender asynchronously.
     *
     * @param results - Number of users
     * @param gender - Gender user to return (Male or Female)
     * @param callback - Callback
     */
    @GET("/")
    public void listUsersWithGenderAsynchronous(@Query("results") Integer results, @Query("gender") String gender, Callback<UserRandomResponse> callback);




}
