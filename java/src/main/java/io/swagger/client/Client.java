/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.client;

import io.swagger.client.api.MemberApi;
import io.swagger.client.model.Member;

/**
 *
 * @author jonas
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ApiException {
        ApiClient client = new ApiClient();
        client.setBasePath("http://localhost:8080");
        MemberApi api = new MemberApi(client);
        Member p1 = new Member();
        
        p1.setAddress("123");
        p1.setAge(1);
        p1.setEmail("john@email.com");
        p1.setFirstName("benny");
        p1.setId(2);
        p1.setLastName("snow");
        p1.setPassword("superman");
        p1.setPhoneNumber("911");
        
        api.addMember(p1);
        
    }

}
