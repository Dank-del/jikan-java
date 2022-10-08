# SchedulesApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSchedules**](SchedulesApi.md#getSchedules) | **GET** /schedules |  |


<a name="getSchedules"></a>
# **getSchedules**
> Schedules getSchedules(page, filter, kids, sfw, limit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SchedulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    SchedulesApi apiInstance = new SchedulesApi(defaultClient);
    Integer page = 56; // Integer | 
    String filter = "monday"; // String | Filter by day
    String kids = "true"; // String | When supplied, it will filter entries with the `Kids` Genre Demographic. When supplied as `kids=true`, it will return only Kid entries and when supplied as `kids=false`, it will filter out any Kid entries. Defaults to `false`.
    String sfw = "true"; // String | 'Safe For Work'. When supplied, it will filter entries with the `Hentai` Genre. When supplied as `sfw=true`, it will return only SFW entries and when supplied as `sfw=false`, it will filter out any Hentai entries. Defaults to `false`.
    Integer limit = 56; // Integer | 
    try {
      Schedules result = apiInstance.getSchedules(page, filter, kids, sfw, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchedulesApi#getSchedules");
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
| **filter** | **String**| Filter by day | [optional] [enum: monday, tuesday, wednesday, thursday, friday, unknown, other] |
| **kids** | **String**| When supplied, it will filter entries with the &#x60;Kids&#x60; Genre Demographic. When supplied as &#x60;kids&#x3D;true&#x60;, it will return only Kid entries and when supplied as &#x60;kids&#x3D;false&#x60;, it will filter out any Kid entries. Defaults to &#x60;false&#x60;. | [optional] [enum: true, false] |
| **sfw** | **String**| &#39;Safe For Work&#39;. When supplied, it will filter entries with the &#x60;Hentai&#x60; Genre. When supplied as &#x60;sfw&#x3D;true&#x60;, it will return only SFW entries and when supplied as &#x60;sfw&#x3D;false&#x60;, it will filter out any Hentai entries. Defaults to &#x60;false&#x60;. | [optional] [enum: true, false] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**Schedules**](Schedules.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns weekly schedule |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

