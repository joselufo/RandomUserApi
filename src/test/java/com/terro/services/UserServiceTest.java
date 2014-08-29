package com.terro.services;


import com.terro.BaseTestCase;
import com.terro.Gender;
import com.terro.entities.Result;
import com.terro.entities.User;
import com.terro.entities.UserRandomResponse;

import static org.fest.assertions.api.Assertions.assertThat;

public class UserServiceTest extends BaseTestCase {

    public void testUser() throws Exception {

        UserRandomResponse result = getManager().userServices().user();
        assertThat(result).isNotNull();
        assertThat(result.getResults().size()).isEqualTo(1);

    }

    public void testListUsers() throws Exception {
        UserRandomResponse response = getManager().userServices().listUsers(20);
        assertThat(response).isNotNull();
        assertThat(response.getResults().size()).isEqualTo(20);
    }

    public void testUserWithGender() throws Exception {
        UserRandomResponse responseMale = getManager().userServices().userWithGender(Gender.MALE);
        assertThat(responseMale).isNotNull();
        assertThat(responseMale.getResults().get(0).getUser().getGender()).isEqualTo(Gender.MALE);

        UserRandomResponse responseFemale = getManager().userServices().userWithGender(Gender.FEMALE);
        assertThat(responseFemale).isNotNull();
        assertThat(responseFemale.getResults().get(0).getUser().getGender()).isEqualTo(Gender.FEMALE);
    }

    public void testListUsersWithGender() throws Exception {
        UserRandomResponse response = getManager().userServices().listUsersWithGender(20, Gender.MALE);
        assertThat(response).isNotNull();
        assertThat(response.getResults().size()).isEqualTo(20);

        for (Result result : response.getResults()) {
            User user = result.getUser();
            assertThat(user).isNotNull();
            assertThat(user.getGender()).isEqualTo(Gender.MALE);
        }

        UserRandomResponse responseFemale = getManager().userServices().listUsersWithGender(20, Gender.FEMALE);
        assertThat(responseFemale).isNotNull();
        assertThat(responseFemale.getResults().size()).isEqualTo(20);

        for (Result resultFemale : responseFemale.getResults()) {
            User user = resultFemale.getUser();
            assertThat(user).isNotNull();
            assertThat(user.getGender()).isEqualTo(Gender.FEMALE);
        }

    }

    public void testUserWithSeed() throws Exception {
        UserRandomResponse response = getManager().userServices().listUsers(20);

        for (Result result : response.getResults()) {
            User user = result.getUser();
            assertThat(user).isNotNull();

            UserRandomResponse responseSeeds = getManager().userServices().userWithSeed(result.getSeed());

            assertThat(responseSeeds.getResults().get(0).getSeed()).isEqualTo(result.getSeed());

        }
    }
}