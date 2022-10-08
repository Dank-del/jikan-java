# RecommendationsApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRecentAnimeRecommendations**](RecommendationsApi.md#getRecentAnimeRecommendations) | **GET** /recommendations/anime |  |
| [**getRecentMangaRecommendations**](RecommendationsApi.md#getRecentMangaRecommendations) | **GET** /recommendations/manga |  |


<a name="getRecentAnimeRecommendations"></a>
# **getRecentAnimeRecommendations**
> Recommendations getRecentAnimeRecommendations(page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecommendationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    RecommendationsApi apiInstance = new RecommendationsApi(defaultClient);
    Integer page = 56; // Integer | 
    try {
      Recommendations result = apiInstance.getRecentAnimeRecommendations(page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecommendationsApi#getRecentAnimeRecommendations");
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

[**Recommendations**](Recommendations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns recent anime recommendations |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getRecentMangaRecommendations"></a>
# **getRecentMangaRecommendations**
> Recommendations getRecentMangaRecommendations(page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecommendationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    RecommendationsApi apiInstance = new RecommendationsApi(defaultClient);
    Integer page = 56; // Integer | 
    try {
      Recommendations result = apiInstance.getRecentMangaRecommendations(page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecommendationsApi#getRecentMangaRecommendations");
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

[**Recommendations**](Recommendations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns recent manga recommendations |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

