# GenresApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAnimeGenres**](GenresApi.md#getAnimeGenres) | **GET** /genres/anime |  |
| [**getMangaGenres**](GenresApi.md#getMangaGenres) | **GET** /genres/manga |  |


<a name="getAnimeGenres"></a>
# **getAnimeGenres**
> Genres getAnimeGenres(filter)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GenresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    GenresApi apiInstance = new GenresApi(defaultClient);
    GenreQueryFilter filter = GenreQueryFilter.fromValue("genres"); // GenreQueryFilter | 
    try {
      Genres result = apiInstance.getAnimeGenres(filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenresApi#getAnimeGenres");
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
| **filter** | [**GenreQueryFilter**](.md)|  | [optional] [enum: genres, explicit_genres, themes, demographics] |

### Return type

[**Genres**](Genres.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns entry genres, explicit_genres, themes and demographics |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getMangaGenres"></a>
# **getMangaGenres**
> Genres getMangaGenres(filter)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GenresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    GenresApi apiInstance = new GenresApi(defaultClient);
    GenreQueryFilter filter = GenreQueryFilter.fromValue("genres"); // GenreQueryFilter | 
    try {
      Genres result = apiInstance.getMangaGenres(filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GenresApi#getMangaGenres");
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
| **filter** | [**GenreQueryFilter**](.md)|  | [optional] [enum: genres, explicit_genres, themes, demographics] |

### Return type

[**Genres**](Genres.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns entry genres, explicit_genres, themes and demographics |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

