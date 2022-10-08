# ProducersApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProducerById**](ProducersApi.md#getProducerById) | **GET** /producers/{id} |  |
| [**getProducerExternal**](ProducersApi.md#getProducerExternal) | **GET** /producers/{id}/external |  |
| [**getProducerFullById**](ProducersApi.md#getProducerFullById) | **GET** /producers/{id}/full |  |
| [**getProducers**](ProducersApi.md#getProducers) | **GET** /producers |  |


<a name="getProducerById"></a>
# **getProducerById**
> GetProducerById200Response getProducerById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProducersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    ProducersApi apiInstance = new ProducersApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      GetProducerById200Response result = apiInstance.getProducerById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProducersApi#getProducerById");
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

[**GetProducerById200Response**](GetProducerById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns producer resource |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getProducerExternal"></a>
# **getProducerExternal**
> ExternalLinks getProducerExternal(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProducersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    ProducersApi apiInstance = new ProducersApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      ExternalLinks result = apiInstance.getProducerExternal(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProducersApi#getProducerExternal");
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

[**ExternalLinks**](ExternalLinks.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns producer&#39;s external links |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getProducerFullById"></a>
# **getProducerFullById**
> GetProducerFullById200Response getProducerFullById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProducersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    ProducersApi apiInstance = new ProducersApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      GetProducerFullById200Response result = apiInstance.getProducerFullById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProducersApi#getProducerFullById");
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

[**GetProducerFullById200Response**](GetProducerFullById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns producer resource |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getProducers"></a>
# **getProducers**
> Producers getProducers(page, limit, q, orderBy, sort, letter)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProducersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    ProducersApi apiInstance = new ProducersApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer limit = 56; // Integer | 
    String q = "q_example"; // String | 
    ProducersQueryOrderby orderBy = ProducersQueryOrderby.fromValue("mal_id"); // ProducersQueryOrderby | 
    SearchQuerySort sort = SearchQuerySort.fromValue("desc"); // SearchQuerySort | 
    String letter = "letter_example"; // String | Return entries starting with the given letter
    try {
      Producers result = apiInstance.getProducers(page, limit, q, orderBy, sort, letter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProducersApi#getProducers");
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
| **orderBy** | [**ProducersQueryOrderby**](.md)|  | [optional] [enum: mal_id, name, count, favorites, established] |
| **sort** | [**SearchQuerySort**](.md)|  | [optional] [enum: desc, asc] |
| **letter** | **String**| Return entries starting with the given letter | [optional] |

### Return type

[**Producers**](Producers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns producers collection |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

