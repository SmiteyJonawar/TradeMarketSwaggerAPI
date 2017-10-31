package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Member;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MemberApi
 */
public class MemberApiTest {

    private final MemberApi api = new MemberApi();

    
    /**
     * Add member to database
     *
     * This is an example of how the JSON should be structured             {                 \&quot;email\&quot; : \&quot;john@mail.com\&quot;,                 \&quot;firstName\&quot; : \&quot;Benny\&quot;,                 \&quot;lastName\&quot; : \&quot;Bensen\&quot;,                 \&quot;address\&quot; : \&quot;jørgenvej 21\&quot;,                 \&quot;phoneNumber\&quot; : \&quot;+45 21 21 21 21\&quot;,                 \&quot;age\&quot; : 21,                 \&quot;password\&quot; : \&quot;suicune\&quot;,                 \&quot;id\&quot; : 1             }
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMemberTest() throws ApiException {
        Member who = null;
        // Member response = api.addMember(who);

        // TODO: test validations
    }
    
}
