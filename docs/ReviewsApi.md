# ReviewsApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRecentAnimeReviews**](ReviewsApi.md#getRecentAnimeReviews) | **GET** /reviews/anime |  |
| [**getRecentMangaReviews**](ReviewsApi.md#getRecentMangaReviews) | **GET** /reviews/manga |  |


<a name="getRecentAnimeReviews"></a>
# **getRecentAnimeReviews**
> Object getRecentAnimeReviews(page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    ReviewsApi apiInstance = new ReviewsApi(defaultClient);
    Integer page = 56; // Integer | 
    try {
      Object result = apiInstance.getRecentAnimeReviews(page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewsApi#getRecentAnimeReviews");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns recent anime reviews |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getRecentMangaReviews"></a>
# **getRecentMangaReviews**
> Object getRecentMangaReviews(page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReviewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    ReviewsApi apiInstance = new ReviewsApi(defaultClient);
    Integer page = 56; // Integer | 
    try {
      Object result = apiInstance.getRecentMangaReviews(page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReviewsApi#getRecentMangaReviews");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns recent manga reviews |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

