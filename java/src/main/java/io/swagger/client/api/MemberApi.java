

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.Member;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberApi {
    private ApiClient apiClient;

    public MemberApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MemberApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addMember */
    private com.squareup.okhttp.Call addMemberCall(Member who, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = who;
        

        // create path and map variables
        String localVarPath = "/member/add".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/json-patch+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Add member to database
     * This is an example of how the JSON should be structured             {                 \&quot;email\&quot; : \&quot;john@mail.com\&quot;,                 \&quot;firstName\&quot; : \&quot;Benny\&quot;,                 \&quot;lastName\&quot; : \&quot;Bensen\&quot;,                 \&quot;address\&quot; : \&quot;jørgenvej 21\&quot;,                 \&quot;phoneNumber\&quot; : \&quot;+45 21 21 21 21\&quot;,                 \&quot;age\&quot; : 21,                 \&quot;password\&quot; : \&quot;suicune\&quot;,                 \&quot;id\&quot; : 1             }
     * @param who Who to say hello to (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void addMember(Member who) throws ApiException {
        addMemberWithHttpInfo(who);
    }

    /**
     * Add member to database
     * This is an example of how the JSON should be structured             {                 \&quot;email\&quot; : \&quot;john@mail.com\&quot;,                 \&quot;firstName\&quot; : \&quot;Benny\&quot;,                 \&quot;lastName\&quot; : \&quot;Bensen\&quot;,                 \&quot;address\&quot; : \&quot;jørgenvej 21\&quot;,                 \&quot;phoneNumber\&quot; : \&quot;+45 21 21 21 21\&quot;,                 \&quot;age\&quot; : 21,                 \&quot;password\&quot; : \&quot;suicune\&quot;,                 \&quot;id\&quot; : 1             }
     * @param who Who to say hello to (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> addMemberWithHttpInfo(Member who) throws ApiException {
        com.squareup.okhttp.Call call = addMemberCall(who, null, null);
        return apiClient.execute(call);
    }

    /**
     * Add member to database (asynchronously)
     * This is an example of how the JSON should be structured             {                 \&quot;email\&quot; : \&quot;john@mail.com\&quot;,                 \&quot;firstName\&quot; : \&quot;Benny\&quot;,                 \&quot;lastName\&quot; : \&quot;Bensen\&quot;,                 \&quot;address\&quot; : \&quot;jørgenvej 21\&quot;,                 \&quot;phoneNumber\&quot; : \&quot;+45 21 21 21 21\&quot;,                 \&quot;age\&quot; : 21,                 \&quot;password\&quot; : \&quot;suicune\&quot;,                 \&quot;id\&quot; : 1             }
     * @param who Who to say hello to (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addMemberAsync(Member who, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addMemberCall(who, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
