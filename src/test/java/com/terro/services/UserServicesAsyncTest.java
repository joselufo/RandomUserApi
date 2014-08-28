package com.terro.services;

import com.terro.BaseTestCase;
import com.terro.Gender;
import com.terro.entities.UserRandomResponse;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import static org.fest.assertions.api.Assertions.assertThat;

public class UserServicesAsyncTest extends BaseTestCase {

    public void testUserAsync() throws Exception {
        getManager().userServicesAsync().userAsync(new Callback<UserRandomResponse>() {
            @Override
            public void success(UserRandomResponse userRandomResponse, Response response) {
                assertThat(userRandomResponse).isNotNull();
            }

            @Override
            public void failure(RetrofitError retrofitError) {

            }
        });
    }

    public void testListUserAsync() throws Exception {
        getManager().userServicesAsync().listUserAsync(20, new Callback<UserRandomResponse>() {
            @Override
            public void success(UserRandomResponse userRandomResponse, Response response) {
                assertThat(userRandomResponse).isNotNull();
            }

            @Override
            public void failure(RetrofitError retrofitError) {

            }
        });
    }

    public void testUserWithGenderAsync() throws Exception {
        getManager().userServicesAsync().userWithGenderAsync(Gender.MALE, new Callback<UserRandomResponse>() {
            @Override
            public void success(UserRandomResponse userRandomResponse, Response response) {
                assertThat(userRandomResponse).isNotNull();
            }

            @Override
            public void failure(RetrofitError retrofitError) {

            }
        });
    }

    public void testListUsersWithGenderAsync() throws Exception {
        getManager().userServicesAsync().listUsersWithGenderAsync(20, Gender.FEMALE, new Callback<UserRandomResponse>() {
            @Override
            public void success(UserRandomResponse userRandomResponse, Response response) {
                assertThat(userRandomResponse).isNotNull();
            }

            @Override
            public void failure(RetrofitError retrofitError) {

            }
        });
    }
}