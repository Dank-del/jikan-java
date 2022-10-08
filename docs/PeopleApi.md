# PeopleApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPeopleSearch**](PeopleApi.md#getPeopleSearch) | **GET** /people |  |
| [**getPersonAnime**](PeopleApi.md#getPersonAnime) | **GET** /people/{id}/anime |  |
| [**getPersonById**](PeopleApi.md#getPersonById) | **GET** /people/{id} |  |
| [**getPersonFullById**](PeopleApi.md#getPersonFullById) | **GET** /people/{id}/full |  |
| [**getPersonManga**](PeopleApi.md#getPersonManga) | **GET** /people/{id}/manga |  |
| [**getPersonPictures**](PeopleApi.md#getPersonPictures) | **GET** /people/{id}/pictures |  |
| [**getPersonVoices**](PeopleApi.md#getPersonVoices) | **GET** /people/{id}/voices |  |


<a name="getPeopleSearch"></a>
# **getPeopleSearch**
> PeopleSearch getPeopleSearch(page, limit, q, orderBy, sort, letter)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer limit = 56; // Integer | 
    String q = "q_example"; // String | 
    PeopleSearchQueryOrderby orderBy = PeopleSearchQueryOrderby.fromValue("mal_id"); // PeopleSearchQueryOrderby | 
    SearchQuerySort sort = SearchQuerySort.fromValue("desc"); // SearchQuerySort | 
    String letter = "letter_example"; // String | Return entries starting with the given letter
    try {
      PeopleSearch result = apiInstance.getPeopleSearch(page, limit, q, orderBy, sort, letter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPeopleSearch");
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
| **orderBy** | [**PeopleSearchQueryOrderby**](.md)|  | [optional] [enum: mal_id, name, birthday, favorites] |
| **sort** | [**SearchQuerySort**](.md)|  | [optional] [enum: desc, asc] |
| **letter** | **String**| Return entries starting with the given letter | [optional] |

### Return type

[**PeopleSearch**](PeopleSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns search results for people |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getPersonAnime"></a>
# **getPersonAnime**
> PersonAnime getPersonAnime(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      PersonAnime result = apiInstance.getPersonAnime(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonAnime");
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

[**PersonAnime**](PersonAnime.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns person&#39;s anime staff positions |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getPersonById"></a>
# **getPersonById**
> GetPersonById200Response getPersonById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      GetPersonById200Response result = apiInstance.getPersonById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonById");
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

[**GetPersonById200Response**](GetPersonById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns pictures related to the entry |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getPersonFullById"></a>
# **getPersonFullById**
> GetPersonFullById200Response getPersonFullById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      GetPersonFullById200Response result = apiInstance.getPersonFullById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonFullById");
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

[**GetPersonFullById200Response**](GetPersonFullById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns complete character resource data |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getPersonManga"></a>
# **getPersonManga**
> PersonManga getPersonManga(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      PersonManga result = apiInstance.getPersonManga(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonManga");
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

[**PersonManga**](PersonManga.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns person&#39;s published manga works |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getPersonPictures"></a>
# **getPersonPictures**
> PersonPictures getPersonPictures(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      PersonPictures result = apiInstance.getPersonPictures(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonPictures");
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

[**PersonPictures**](PersonPictures.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of pictures of the person |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getPersonVoices"></a>
# **getPersonVoices**
> PersonVoiceActingRoles getPersonVoices(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PeopleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    PeopleApi apiInstance = new PeopleApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      PersonVoiceActingRoles result = apiInstance.getPersonVoices(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#getPersonVoices");
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

[**PersonVoiceActingRoles**](PersonVoiceActingRoles.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns person&#39;s voice acting roles |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

