# MagazinesApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMagazines**](MagazinesApi.md#getMagazines) | **GET** /magazines |  |


<a name="getMagazines"></a>
# **getMagazines**
> Magazines getMagazines(page, limit, q, orderBy, sort, letter)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MagazinesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    MagazinesApi apiInstance = new MagazinesApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer limit = 56; // Integer | 
    String q = "q_example"; // String | 
    MagazinesQueryOrderby orderBy = MagazinesQueryOrderby.fromValue("mal_id"); // MagazinesQueryOrderby | 
    SearchQuerySort sort = SearchQuerySort.fromValue("desc"); // SearchQuerySort | 
    String letter = "letter_example"; // String | Return entries starting with the given letter
    try {
      Magazines result = apiInstance.getMagazines(page, limit, q, orderBy, sort, letter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagazinesApi#getMagazines");
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
| **orderBy** | [**MagazinesQueryOrderby**](.md)|  | [optional] [enum: mal_id, name, count] |
| **sort** | [**SearchQuerySort**](.md)|  | [optional] [enum: desc, asc] |
| **letter** | **String**| Return entries starting with the given letter | [optional] |

### Return type

[**Magazines**](Magazines.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns magazines collection |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

