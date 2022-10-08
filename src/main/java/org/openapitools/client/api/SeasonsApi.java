/*
 * Jikan API
 * [Jikan](https://jikan.moe) is an **Unofficial** MyAnimeList API. It scrapes the website to satisfy the need for a complete API - which MyAnimeList lacks.  # Information  ⚡ Jikan is powered by it's awesome backers - 🙏 [Become a backer](https://www.patreon.com/jikan)  ## Rate Limiting  | Duration | Requests | |----|----| | Monthly | **Unlimited** | | Per Minute | 60 requests | | Per Second | 3 requests |   ## JSON Notes - Any property (except arrays or objects) whose value does not exist or is undetermined, will be `null`. - Any array or object property whose value does not exist or is undetermined, will be empty. - Any `score` property whose value does not exist or is undetermined, will be `0`. - All dates and timestamps are returned in [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) format and in UTC timezone  ## Caching By **CACHING**, we refer to the data parsed from MyAnimeList which is stored temporarily on our servers to provide better API performance.  All requests, by default are cached for **24 hours** except the following endpoints which have their own unique cache **Time To Live**.   | Request | TTL | | ---- | ---- | | All (Default) | 24 hours |   The following response headers will detail cache information.  | Header | Remarks | | ---- | ---- | | `Expires` | Cache expiry date | | `Last-Modified` | Cache set date | | `X-Request-Fingerprint` | Unique request fingerprint |   Note: Caching headers will only be available on single resource requests and their child endpoints. e.g `/anime/1`, `/anime/1/relations`.  They won't be available on pages which perform queries, like /anime, or /top/anime, etc.  ## Allowed HTTP(s) requests  **Jikan REST API does not provide authenticated requests for MyAnimeList.** This means you can not use it to update your anime/manga list. Only GET requests are supported which return READ-ONLY data.  ## HTTP Responses  | HTTP Status | Remarks | | ---- | ---- | | `200 - OK` | The request was successful | | `304 - Not Modified` | You have the latest data (Cache Validation response) | | `400 - Bad Request` | You've made an invalid request. Recheck documentation | | `404 - Not Found` | The resource was not found or MyAnimeList responded with a `404` | | `405 - Method Not Allowed` | Requested Method is not supported for resource. Only `GET` requests are allowed | | `429 - Too Many Request` | You are being rate limited by Jikan or MyAnimeList is rate-limiting our servers (specified in the error response) | | `500 - Internal Server Error` | Something is not working on our end. If you see an error response with a `report_url` URL, please click on it to open an auto-generated GitHub issue | | `503 - Service Unavailable` | The service has broke. |   ## JSON Error Response  ```json  {      \"status\": 404,      \"type\": \"BadResponseException\",      \"message\": \"Resource does not exist\",      \"error\": \"Something Happened\",      \"report_url\": \"https://github.com...\"   } ```  | Property | Remarks | | ---- | ---- | | `status` | Returned HTTP Status Code | | `type` | Thrown Exception | | `message` | Human-readable error message | | `error` | Error response and trace from the API | | `report_url` | Clicking this would redirect you to a generated GitHub issue. ℹ It's only returned on a parser error. |   ## Cache Validation  - All requests return a `ETag` header which is an MD5 hash of the response - You can use this hash to verify if there's new or updated content by suppliying it as the value for the `If-None-Match` in your next request header - You will get a HTTP `304 - Not Modified` response if the content has not changed - If the content has changed, you'll get a HTTP `200 - OK` response with the updated JSON response  ![Cache Validation](https://i.imgur.com/925ozVn.png 'Cache Validation')  ## Disclaimer  - Jikan is not affiliated with MyAnimeList.net. - Jikan is a free, open-source API. Please use it responsibly.  ----  By using the API, you are agreeing to Jikan's [terms of use](https://jikan.moe/terms) policy.  [v3 Documentation](https://jikan.docs.apiary.io/) - [Wrappers/SDKs](https://github.com/jikan-me/jikan#wrappers) - [Report an issue](https://github.com/jikan-me/jikan-rest/issues/new) - [Host your own server](https://github.com/jikan-me/jikan-rest)
 *
 * The version of the OpenAPI document: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.AnimeSearch;
import org.openapitools.client.model.Seasons;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SeasonsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SeasonsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SeasonsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getSeason
     * @param year  (required)
     * @param season  (required)
     * @param page  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns seasonal anime </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSeasonCall(Integer year, String season, Integer page, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/seasons/{year}/{season}"
            .replaceAll("\\{" + "year" + "\\}", localVarApiClient.escapeString(year.toString()))
            .replaceAll("\\{" + "season" + "\\}", localVarApiClient.escapeString(season.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSeasonValidateBeforeCall(Integer year, String season, Integer page, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new ApiException("Missing the required parameter 'year' when calling getSeason(Async)");
        }
        
        // verify the required parameter 'season' is set
        if (season == null) {
            throw new ApiException("Missing the required parameter 'season' when calling getSeason(Async)");
        }
        

        okhttp3.Call localVarCall = getSeasonCall(year, season, page, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param year  (required)
     * @param season  (required)
     * @param page  (optional)
     * @return AnimeSearch
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns seasonal anime </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public AnimeSearch getSeason(Integer year, String season, Integer page) throws ApiException {
        ApiResponse<AnimeSearch> localVarResp = getSeasonWithHttpInfo(year, season, page);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param year  (required)
     * @param season  (required)
     * @param page  (optional)
     * @return ApiResponse&lt;AnimeSearch&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns seasonal anime </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AnimeSearch> getSeasonWithHttpInfo(Integer year, String season, Integer page) throws ApiException {
        okhttp3.Call localVarCall = getSeasonValidateBeforeCall(year, season, page, null);
        Type localVarReturnType = new TypeToken<AnimeSearch>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param year  (required)
     * @param season  (required)
     * @param page  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns seasonal anime </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSeasonAsync(Integer year, String season, Integer page, final ApiCallback<AnimeSearch> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSeasonValidateBeforeCall(year, season, page, _callback);
        Type localVarReturnType = new TypeToken<AnimeSearch>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSeasonNow
     * @param page  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns current seasonal anime </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSeasonNowCall(Integer page, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/seasons/now";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSeasonNowValidateBeforeCall(Integer page, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSeasonNowCall(page, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param page  (optional)
     * @return AnimeSearch
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns current seasonal anime </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public AnimeSearch getSeasonNow(Integer page) throws ApiException {
        ApiResponse<AnimeSearch> localVarResp = getSeasonNowWithHttpInfo(page);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param page  (optional)
     * @return ApiResponse&lt;AnimeSearch&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns current seasonal anime </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AnimeSearch> getSeasonNowWithHttpInfo(Integer page) throws ApiException {
        okhttp3.Call localVarCall = getSeasonNowValidateBeforeCall(page, null);
        Type localVarReturnType = new TypeToken<AnimeSearch>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param page  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns current seasonal anime </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSeasonNowAsync(Integer page, final ApiCallback<AnimeSearch> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSeasonNowValidateBeforeCall(page, _callback);
        Type localVarReturnType = new TypeToken<AnimeSearch>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSeasonUpcoming
     * @param page  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns upcoming season&#39;s anime </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSeasonUpcomingCall(Integer page, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/seasons/upcoming";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSeasonUpcomingValidateBeforeCall(Integer page, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSeasonUpcomingCall(page, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param page  (optional)
     * @return AnimeSearch
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns upcoming season&#39;s anime </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public AnimeSearch getSeasonUpcoming(Integer page) throws ApiException {
        ApiResponse<AnimeSearch> localVarResp = getSeasonUpcomingWithHttpInfo(page);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param page  (optional)
     * @return ApiResponse&lt;AnimeSearch&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns upcoming season&#39;s anime </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AnimeSearch> getSeasonUpcomingWithHttpInfo(Integer page) throws ApiException {
        okhttp3.Call localVarCall = getSeasonUpcomingValidateBeforeCall(page, null);
        Type localVarReturnType = new TypeToken<AnimeSearch>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param page  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns upcoming season&#39;s anime </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSeasonUpcomingAsync(Integer page, final ApiCallback<AnimeSearch> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSeasonUpcomingValidateBeforeCall(page, _callback);
        Type localVarReturnType = new TypeToken<AnimeSearch>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSeasonsList
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns available list of seasons </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSeasonsListCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/seasons";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSeasonsListValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSeasonsListCall(_callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @return Seasons
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns available list of seasons </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public Seasons getSeasonsList() throws ApiException {
        ApiResponse<Seasons> localVarResp = getSeasonsListWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @return ApiResponse&lt;Seasons&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns available list of seasons </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Seasons> getSeasonsListWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getSeasonsListValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Seasons>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns available list of seasons </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Error: Bad request. When required parameters were not supplied. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSeasonsListAsync(final ApiCallback<Seasons> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSeasonsListValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Seasons>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
