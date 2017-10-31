# MemberApi

All URIs are relative to *https://virtserver.swaggerhub.com/Jonawar/HelloWorldBuNoGoodbye/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMember**](MemberApi.md#addMember) | **POST** /member/add | Add member to database


<a name="addMember"></a>
# **addMember**
> addMember(who)

Add member to database

This is an example of how the JSON should be structured             {                 \&quot;email\&quot; : \&quot;john@mail.com\&quot;,                 \&quot;firstName\&quot; : \&quot;Benny\&quot;,                 \&quot;lastName\&quot; : \&quot;Bensen\&quot;,                 \&quot;address\&quot; : \&quot;jørgenvej 21\&quot;,                 \&quot;phoneNumber\&quot; : \&quot;+45 21 21 21 21\&quot;,                 \&quot;age\&quot; : 21,                 \&quot;password\&quot; : \&quot;suicune\&quot;,                 \&quot;id\&quot; : 1             }

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
Member who = new Member(); // Member | Who to say hello to
try {
    apiInstance.addMember(who);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#addMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **who** | [**Member**](Member.md)| Who to say hello to | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: text/plain, application/json, text/json

