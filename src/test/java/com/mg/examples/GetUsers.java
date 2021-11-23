package com.mg.examples;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetUsers {

    @Test
    public void statusCode200() {
        HttpResponse<JsonNode> users = Unirest.get("https://0f5900a2-f989-449d-94e8-9c63893d0c86.mock.pstmn.io/api/users").asJson();
        Assertions.assertTrue(users.getStatus()==200);
    }
    @Test
    public void nullCheck() {
        HttpResponse<JsonNode> users = Unirest.get("https://0f5900a2-f989-449d-94e8-9c63893d0c86.mock.pstmn.io/api/users").asJson();
        Assertions.assertTrue(users.getBody()==null);
    }
    @Test
    public void checkFirstName() {
        HttpResponse<JsonNode> users = Unirest.get("https://0f5900a2-f989-449d-94e8-9c63893d0c86.mock.pstmn.io/api/users").asJson();
        String name = users.getBody().getArray().getJSONObject(0).getString("name");
        Assertions.assertTrue(name=="Jason Ray");
    }
    @Test
    public void checkProfiles() {
        HttpResponse<JsonNode> users = Unirest.get("https://0f5900a2-f989-449d-94e8-9c63893d0c86.mock.pstmn.io/api/users").asJson();
        JSONArray profiles = users.getBody().getArray().getJSONObject(0).getJSONArray("socialProfiles");
        Assertions.assertTrue(profiles == null);
        Assertions.assertTrue(!profiles.isEmpty());
        Assertions.assertTrue(profiles.length() > 0);
    }
    @Test
    public void checkNumberOfUsers() {
        HttpResponse<JsonNode> users = Unirest.get("https://0f5900a2-f989-449d-94e8-9c63893d0c86.mock.pstmn.io/api/users").asJson();
        Assertions.assertEquals( users.getBody().getArray().length(),3);
    }
    @Test
    public void checkLanguages() {
        HttpResponse<JsonNode> users = Unirest.get("https://0f5900a2-f989-449d-94e8-9c63893d0c86.mock.pstmn.io/api/users").asJson();
        JSONArray languages = users.getBody().getArray().getJSONObject(0).getJSONArray("languages");
        boolean check = false;
        for (int i = 0; i < languages.length(); i++) {
            if (languages.get(i).toString().equals("Java"))
            {
                check = true;
            }
            else
            {
                check = false;
            }
        }
        Assertions.assertTrue(check);
    }
}
