# SeasonsApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSeason**](SeasonsApi.md#getSeason) | **GET** /seasons/{year}/{season} |  |
| [**getSeasonNow**](SeasonsApi.md#getSeasonNow) | **GET** /seasons/now |  |
| [**getSeasonUpcoming**](SeasonsApi.md#getSeasonUpcoming) | **GET** /seasons/upcoming |  |
| [**getSeasonsList**](SeasonsApi.md#getSeasonsList) | **GET** /seasons |  |


<a name="getSeason"></a>
# **getSeason**
> AnimeSearch getSeason(year, season, page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeasonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    SeasonsApi apiInstance = new SeasonsApi(defaultClient);
    Integer year = 56; // Integer | 
    String season = "season_example"; // String | 
    Integer page = 56; // Integer | 
    try {
      AnimeSearch result = apiInstance.getSeason(year, season, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeasonsApi#getSeason");
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
| **year** | **Integer**|  | |
| **season** | **String**|  | |
| **page** | **Integer**|  | [optional] |

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
| **200** | Returns seasonal anime |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getSeasonNow"></a>
# **getSeasonNow**
> AnimeSearch getSeasonNow(page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeasonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    SeasonsApi apiInstance = new SeasonsApi(defaultClient);
    Integer page = 56; // Integer | 
    try {
      AnimeSearch result = apiInstance.getSeasonNow(page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeasonsApi#getSeasonNow");
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

[**AnimeSearch**](AnimeSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns current seasonal anime |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getSeasonUpcoming"></a>
# **getSeasonUpcoming**
> AnimeSearch getSeasonUpcoming(page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeasonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    SeasonsApi apiInstance = new SeasonsApi(defaultClient);
    Integer page = 56; // Integer | 
    try {
      AnimeSearch result = apiInstance.getSeasonUpcoming(page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeasonsApi#getSeasonUpcoming");
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

[**AnimeSearch**](AnimeSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns upcoming season&#39;s anime |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getSeasonsList"></a>
# **getSeasonsList**
> Seasons getSeasonsList()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeasonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    SeasonsApi apiInstance = new SeasonsApi(defaultClient);
    try {
      Seasons result = apiInstance.getSeasonsList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SeasonsApi#getSeasonsList");
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

[**Seasons**](Seasons.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns available list of seasons |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

