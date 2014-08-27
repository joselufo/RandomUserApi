package com.terro;


import com.terro.entities.UserRandomResponse;

import static org.fest.assertions.api.Assertions.assertThat;

public class UserServicesTest extends BaseTestCase {

    public void testUser() throws Exception {

        UserRandomResponse result = getManager().userServices().user();
        assertThat(result).isNotNull();


    }

    public void testUserAsynchronous() throws Exception {

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