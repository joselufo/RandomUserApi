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

 public interface UserServiceAsync {

    /**
     * Returns a random user asynchronously.
     *
     * @param callback
     */
    @GET("/")
    public void userAsync(Callback<UserRandomResponse> callback);

    /**
     * Returns a list of random users asynchronously.
     *
     * @param results - Number of users
     * @param callback - Callback
     */
    @GET("/")
    public void listUserAsync(@Query("results") Integer results, Callback<UserRandomResponse> callback);

    /**
     * Returns a random user with a specific gender asynchronously.
     *
     * @param gender - Gender user to return (Male or Fermale)
     * @param callback - Callback
     */
    @GET("/")
    public void userWithGenderAsync(@Query("gender") String gender, Callback<UserRandomResponse> callback);

    /**
     * Returns a list of random users with a specific gender asynchronously.
     *
     * @param results - Number of users
     * @param gender - Gender user to return (Male or Female)
     * @param callback - Callback
     */
    @GET("/")
    public void listUsersWithGenderAsync(@Query("results") Integer results, @Query("gender") String gender, Callback<UserRandomResponse> callback);

     /**
      * Return a random user specified since the parameter seed is implemented in that way.
      *
      * @param seed - Specified a user
      * @param callback - Callback
      */
     @GET("/")
     public void userWithSeedAsync (@Query("seed") String seed, Callback<UserRandomResponse> callback);
}
