# WatchApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getWatchPopularEpisodes**](WatchApi.md#getWatchPopularEpisodes) | **GET** /watch/episodes/popular |  |
| [**getWatchPopularPromos**](WatchApi.md#getWatchPopularPromos) | **GET** /watch/promos/popular |  |
| [**getWatchRecentEpisodes**](WatchApi.md#getWatchRecentEpisodes) | **GET** /watch/episodes |  |
| [**getWatchRecentPromos**](WatchApi.md#getWatchRecentPromos) | **GET** /watch/promos |  |


<a name="getWatchPopularEpisodes"></a>
# **getWatchPopularEpisodes**
> WatchEpisodes getWatchPopularEpisodes(limit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WatchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    WatchApi apiInstance = new WatchApi(defaultClient);
    Integer limit = 56; // Integer | 
    try {
      WatchEpisodes result = apiInstance.getWatchPopularEpisodes(limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchApi#getWatchPopularEpisodes");
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
| **limit** | **Integer**|  | [optional] |

### Return type

[**WatchEpisodes**](WatchEpisodes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Popular Episodes |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getWatchPopularPromos"></a>
# **getWatchPopularPromos**
> WatchPromos getWatchPopularPromos(limit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WatchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    WatchApi apiInstance = new WatchApi(defaultClient);
    Integer limit = 56; // Integer | 
    try {
      WatchPromos result = apiInstance.getWatchPopularPromos(limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchApi#getWatchPopularPromos");
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
| **limit** | **Integer**|  | [optional] |

### Return type

[**WatchPromos**](WatchPromos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Popular Promotional Videos |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getWatchRecentEpisodes"></a>
# **getWatchRecentEpisodes**
> WatchEpisodes getWatchRecentEpisodes(limit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WatchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    WatchApi apiInstance = new WatchApi(defaultClient);
    Integer limit = 56; // Integer | 
    try {
      WatchEpisodes result = apiInstance.getWatchRecentEpisodes(limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchApi#getWatchRecentEpisodes");
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
| **limit** | **Integer**|  | [optional] |

### Return type

[**WatchEpisodes**](WatchEpisodes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Recently Added Episodes |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getWatchRecentPromos"></a>
# **getWatchRecentPromos**
> WatchPromos getWatchRecentPromos()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WatchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    WatchApi apiInstance = new WatchApi(defaultClient);
    try {
      WatchPromos result = apiInstance.getWatchRecentPromos();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchApi#getWatchRecentPromos");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WatchPromos**](WatchPromos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Recently Added Promotional Videos |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

