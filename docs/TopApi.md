# TopApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTopAnime**](TopApi.md#getTopAnime) | **GET** /top/anime |  |
| [**getTopCharacters**](TopApi.md#getTopCharacters) | **GET** /top/characters |  |
| [**getTopManga**](TopApi.md#getTopManga) | **GET** /top/manga |  |
| [**getTopPeople**](TopApi.md#getTopPeople) | **GET** /top/people |  |
| [**getTopReviews**](TopApi.md#getTopReviews) | **GET** /top/reviews |  |


<a name="getTopAnime"></a>
# **getTopAnime**
> AnimeSearch getTopAnime(type, filter, page, limit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    TopApi apiInstance = new TopApi(defaultClient);
    AnimeSearchQueryType type = AnimeSearchQueryType.fromValue("tv"); // AnimeSearchQueryType | 
    String filter = "airing"; // String | 
    Integer page = 56; // Integer | 
    Integer limit = 56; // Integer | 
    try {
      AnimeSearch result = apiInstance.getTopAnime(type, filter, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TopApi#getTopAnime");
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
| **type** | [**AnimeSearchQueryType**](.md)|  | [optional] [enum: tv, movie, ova, special, ona, music] |
| **filter** | **String**|  | [optional] [enum: airing, upcoming, bypopularity, favorite] |
| **page** | **Integer**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**AnimeSearch**](AnimeSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns top anime |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getTopCharacters"></a>
# **getTopCharacters**
> CharactersSearch getTopCharacters(page, limit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    TopApi apiInstance = new TopApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer limit = 56; // Integer | 
    try {
      CharactersSearch result = apiInstance.getTopCharacters(page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TopApi#getTopCharacters");
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

### Return type

[**CharactersSearch**](CharactersSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns top characters |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getTopManga"></a>
# **getTopManga**
> MangaSearch getTopManga(type, filter, page, limit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    TopApi apiInstance = new TopApi(defaultClient);
    MangaSearchQueryType type = MangaSearchQueryType.fromValue("manga"); // MangaSearchQueryType | 
    String filter = "publishing"; // String | 
    Integer page = 56; // Integer | 
    Integer limit = 56; // Integer | 
    try {
      MangaSearch result = apiInstance.getTopManga(type, filter, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TopApi#getTopManga");
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
| **type** | [**MangaSearchQueryType**](.md)|  | [optional] [enum: manga, novel, lightnovel, oneshot, doujin, manhwa, manhua] |
| **filter** | **String**|  | [optional] [enum: publishing, upcoming, bypopularity, favorite] |
| **page** | **Integer**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**MangaSearch**](MangaSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns top manga |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getTopPeople"></a>
# **getTopPeople**
> PeopleSearch getTopPeople(page, limit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    TopApi apiInstance = new TopApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer limit = 56; // Integer | 
    try {
      PeopleSearch result = apiInstance.getTopPeople(page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TopApi#getTopPeople");
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
| **200** | Returns top people |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getTopReviews"></a>
# **getTopReviews**
> GetTopReviews200Response getTopReviews(page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TopApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    TopApi apiInstance = new TopApi(defaultClient);
    Integer page = 56; // Integer | 
    try {
      GetTopReviews200Response result = apiInstance.getTopReviews(page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TopApi#getTopReviews");
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

### Return type

[**GetTopReviews200Response**](GetTopReviews200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns top reviews |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

