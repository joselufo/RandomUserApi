package com.terro.services;


import com.terro.BaseTestCase;
import com.terro.entities.UserRandomResponse;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import static org.fest.assertions.api.Assertions.assertThat;

public class UserServicesTest extends BaseTestCase {

    public void testUser() throws Exception {

        UserRandomResponse result = getManager().userServices().user();
        assertThat(result).isNotNull();


    }

    public void testUserAsynchronous() throws Exception {

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

    public void testListUsers() throws Exception {

    }

    public void testListUserAsynchronous() throws Exception {

    }

    public void testUserWithGender() throws Exception {

    }

    public void testUserWithGenderAsynchronous() throws Exception {

    }

    public void testListUsersWithGender() throws Exception {

    }

    public void testListUsersWithGenderAsynchronous() throws Exception {

    }
}