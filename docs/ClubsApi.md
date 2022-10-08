# ClubsApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getClubMembers**](ClubsApi.md#getClubMembers) | **GET** /clubs/{id}/members |  |
| [**getClubRelations**](ClubsApi.md#getClubRelations) | **GET** /clubs/{id}/relations |  |
| [**getClubStaff**](ClubsApi.md#getClubStaff) | **GET** /clubs/{id}/staff |  |
| [**getClubsById**](ClubsApi.md#getClubsById) | **GET** /clubs/{id} |  |
| [**getClubsSearch**](ClubsApi.md#getClubsSearch) | **GET** /clubs |  |


<a name="getClubMembers"></a>
# **getClubMembers**
> GetClubMembers200Response getClubMembers(id, page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClubsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    ClubsApi apiInstance = new ClubsApi(defaultClient);
    Integer id = 56; // Integer | 
    Integer page = 56; // Integer | 
    try {
      GetClubMembers200Response result = apiInstance.getClubMembers(id, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClubsApi#getClubMembers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **page** | **Integer**|  | [optional] |

### Return type

[**GetClubMembers200Response**](GetClubMembers200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Club Members Resource |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getClubRelations"></a>
# **getClubRelations**
> ClubRelations getClubRelations(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClubsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    ClubsApi apiInstance = new ClubsApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      ClubRelations result = apiInstance.getClubRelations(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClubsApi#getClubRelations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**ClubRelations**](ClubRelations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Club Relations |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getClubStaff"></a>
# **getClubStaff**
> ClubStaff getClubStaff(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClubsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    ClubsApi apiInstance = new ClubsApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      ClubStaff result = apiInstance.getClubStaff(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClubsApi#getClubStaff");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**ClubStaff**](ClubStaff.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Club Staff |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getClubsById"></a>
# **getClubsById**
> GetClubsById200Response getClubsById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClubsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    ClubsApi apiInstance = new ClubsApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      GetClubsById200Response result = apiInstance.getClubsById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClubsApi#getClubsById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**GetClubsById200Response**](GetClubsById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Club Resource |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getClubsSearch"></a>
# **getClubsSearch**
> ClubsSearch getClubsSearch(page, limit, q, type, category, orderBy, sort, letter)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClubsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    ClubsApi apiInstance = new ClubsApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer limit = 56; // Integer | 
    String q = "q_example"; // String | 
    ClubSearchQueryType type = ClubSearchQueryType.fromValue("public"); // ClubSearchQueryType | 
    ClubSearchQueryCategory category = ClubSearchQueryCategory.fromValue("anime"); // ClubSearchQueryCategory | 
    ClubSearchQueryOrderby orderBy = ClubSearchQueryOrderby.fromValue("mal_id"); // ClubSearchQueryOrderby | 
    SearchQuerySort sort = SearchQuerySort.fromValue("desc"); // SearchQuerySort | 
    String letter = "letter_example"; // String | Return entries starting with the given letter
    try {
      ClubsSearch result = apiInstance.getClubsSearch(page, limit, q, type, category, orderBy, sort, letter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClubsApi#getClubsSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **q** | **String**|  | [optional] |
| **type** | [**ClubSearchQueryType**](.md)|  | [optional] [enum: public, private, secret] |
| **category** | [**ClubSearchQueryCategory**](.md)|  | [optional] [enum: anime, manga, actors_and_artists, characters, cities_and_neighborhoods, companies, conventions, games, japan, music, other, schools] |
| **orderBy** | [**ClubSearchQueryOrderby**](.md)|  | [optional] [enum: mal_id, title, members_count, pictures_count, created] |
| **sort** | [**SearchQuerySort**](.md)|  | [optional] [enum: desc, asc] |
| **letter** | **String**| Return entries starting with the given letter | [optional] |

### Return type

[**ClubsSearch**](ClubsSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns search results for clubs |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

