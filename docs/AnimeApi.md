# AnimeApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAnimeById**](AnimeApi.md#getAnimeById) | **GET** /anime/{id} |  |
| [**getAnimeCharacters**](AnimeApi.md#getAnimeCharacters) | **GET** /anime/{id}/characters |  |
| [**getAnimeEpisodeById**](AnimeApi.md#getAnimeEpisodeById) | **GET** /anime/{id}/episodes/{episode} |  |
| [**getAnimeEpisodes**](AnimeApi.md#getAnimeEpisodes) | **GET** /anime/{id}/episodes |  |
| [**getAnimeExternal**](AnimeApi.md#getAnimeExternal) | **GET** /anime/{id}/external |  |
| [**getAnimeForum**](AnimeApi.md#getAnimeForum) | **GET** /anime/{id}/forum |  |
| [**getAnimeFullById**](AnimeApi.md#getAnimeFullById) | **GET** /anime/{id}/full |  |
| [**getAnimeMoreInfo**](AnimeApi.md#getAnimeMoreInfo) | **GET** /anime/{id}/moreinfo |  |
| [**getAnimeNews**](AnimeApi.md#getAnimeNews) | **GET** /anime/{id}/news |  |
| [**getAnimePictures**](AnimeApi.md#getAnimePictures) | **GET** /anime/{id}/pictures |  |
| [**getAnimeRecommendations**](AnimeApi.md#getAnimeRecommendations) | **GET** /anime/{id}/recommendations |  |
| [**getAnimeRelations**](AnimeApi.md#getAnimeRelations) | **GET** /anime/{id}/relations |  |
| [**getAnimeReviews**](AnimeApi.md#getAnimeReviews) | **GET** /anime/{id}/reviews |  |
| [**getAnimeSearch**](AnimeApi.md#getAnimeSearch) | **GET** /anime |  |
| [**getAnimeStaff**](AnimeApi.md#getAnimeStaff) | **GET** /anime/{id}/staff |  |
| [**getAnimeStatistics**](AnimeApi.md#getAnimeStatistics) | **GET** /anime/{id}/statistics |  |
| [**getAnimeStreaming**](AnimeApi.md#getAnimeStreaming) | **GET** /anime/{id}/streaming |  |
| [**getAnimeThemes**](AnimeApi.md#getAnimeThemes) | **GET** /anime/{id}/themes |  |
| [**getAnimeUserUpdates**](AnimeApi.md#getAnimeUserUpdates) | **GET** /anime/{id}/userupdates |  |
| [**getAnimeVideos**](AnimeApi.md#getAnimeVideos) | **GET** /anime/{id}/videos |  |
| [**getAnimeVideosEpisodes**](AnimeApi.md#getAnimeVideosEpisodes) | **GET** /anime/{id}/videos/episodes |  |


<a name="getAnimeById"></a>
# **getAnimeById**
> GetAnimeById200Response getAnimeById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      GetAnimeById200Response result = apiInstance.getAnimeById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeById");
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

[**GetAnimeById200Response**](GetAnimeById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns anime resource |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeCharacters"></a>
# **getAnimeCharacters**
> AnimeCharacters getAnimeCharacters(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      AnimeCharacters result = apiInstance.getAnimeCharacters(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeCharacters");
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

[**AnimeCharacters**](AnimeCharacters.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns anime characters resource |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeEpisodeById"></a>
# **getAnimeEpisodeById**
> GetAnimeEpisodeById200Response getAnimeEpisodeById(id, episode)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    Integer episode = 56; // Integer | 
    try {
      GetAnimeEpisodeById200Response result = apiInstance.getAnimeEpisodeById(id, episode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeEpisodeById");
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
| **episode** | **Integer**|  | |

### Return type

[**GetAnimeEpisodeById200Response**](GetAnimeEpisodeById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single anime episode resource |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeEpisodes"></a>
# **getAnimeEpisodes**
> AnimeEpisodes getAnimeEpisodes(id, page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    Integer page = 56; // Integer | 
    try {
      AnimeEpisodes result = apiInstance.getAnimeEpisodes(id, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeEpisodes");
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
| **page** | **Integer**|  | [optional] |

### Return type

[**AnimeEpisodes**](AnimeEpisodes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of anime episodes |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeExternal"></a>
# **getAnimeExternal**
> ExternalLinks getAnimeExternal(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      ExternalLinks result = apiInstance.getAnimeExternal(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeExternal");
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
| **200** | Returns anime external links |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeForum"></a>
# **getAnimeForum**
> Forum getAnimeForum(id, filter)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    String filter = "all"; // String | Filter topics
    try {
      Forum result = apiInstance.getAnimeForum(id, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeForum");
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
| **filter** | **String**| Filter topics | [optional] [enum: all, episode, other] |

### Return type

[**Forum**](Forum.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of forum topics related to the entry |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeFullById"></a>
# **getAnimeFullById**
> GetAnimeFullById200Response getAnimeFullById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      GetAnimeFullById200Response result = apiInstance.getAnimeFullById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeFullById");
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

[**GetAnimeFullById200Response**](GetAnimeFullById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns complete anime resource data |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeMoreInfo"></a>
# **getAnimeMoreInfo**
> Moreinfo getAnimeMoreInfo(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      Moreinfo result = apiInstance.getAnimeMoreInfo(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeMoreInfo");
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

[**Moreinfo**](Moreinfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns anime statistics |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeNews"></a>
# **getAnimeNews**
> AnimeNews getAnimeNews(id, page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    Integer page = 56; // Integer | 
    try {
      AnimeNews result = apiInstance.getAnimeNews(id, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeNews");
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
| **page** | **Integer**|  | [optional] |

### Return type

[**AnimeNews**](AnimeNews.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of news articles related to the entry |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimePictures"></a>
# **getAnimePictures**
> PicturesVariants getAnimePictures(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      PicturesVariants result = apiInstance.getAnimePictures(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimePictures");
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

[**PicturesVariants**](PicturesVariants.md)

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

<a name="getAnimeRecommendations"></a>
# **getAnimeRecommendations**
> EntryRecommendations getAnimeRecommendations(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      EntryRecommendations result = apiInstance.getAnimeRecommendations(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeRecommendations");
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

[**EntryRecommendations**](EntryRecommendations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns anime recommendations |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeRelations"></a>
# **getAnimeRelations**
> GetAnimeRelations200Response getAnimeRelations(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      GetAnimeRelations200Response result = apiInstance.getAnimeRelations(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeRelations");
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

[**GetAnimeRelations200Response**](GetAnimeRelations200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns anime relations |  -  |

<a name="getAnimeReviews"></a>
# **getAnimeReviews**
> AnimeReviews getAnimeReviews(id, page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    Integer page = 56; // Integer | 
    try {
      AnimeReviews result = apiInstance.getAnimeReviews(id, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeReviews");
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
| **page** | **Integer**|  | [optional] |

### Return type

[**AnimeReviews**](AnimeReviews.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns anime reviews |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeSearch"></a>
# **getAnimeSearch**
> AnimeSearch getAnimeSearch(page, limit, q, type, score, minScore, maxScore, status, rating, sfw, genres, genresExclude, orderBy, sort, letter, producers, startDate, endDate)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer limit = 56; // Integer | 
    String q = "q_example"; // String | 
    AnimeSearchQueryType type = AnimeSearchQueryType.fromValue("tv"); // AnimeSearchQueryType | 
    BigDecimal score = new BigDecimal(78); // BigDecimal | 
    BigDecimal minScore = new BigDecimal(78); // BigDecimal | Set a minimum score for results.
    BigDecimal maxScore = new BigDecimal(78); // BigDecimal | Set a maximum score for results
    AnimeSearchQueryStatus status = AnimeSearchQueryStatus.fromValue("airing"); // AnimeSearchQueryStatus | 
    AnimeSearchQueryRating rating = AnimeSearchQueryRating.fromValue("g"); // AnimeSearchQueryRating | 
    Boolean sfw = true; // Boolean | Filter out Adult entries
    String genres = "genres_example"; // String | Filter by genre(s) IDs. Can pass multiple with a comma as a delimiter. e.g 1,2,3
    String genresExclude = "genresExclude_example"; // String | Exclude genre(s) IDs. Can pass multiple with a comma as a delimiter. e.g 1,2,3
    AnimeSearchQueryOrderby orderBy = AnimeSearchQueryOrderby.fromValue("mal_id"); // AnimeSearchQueryOrderby | 
    SearchQuerySort sort = SearchQuerySort.fromValue("desc"); // SearchQuerySort | 
    String letter = "letter_example"; // String | Return entries starting with the given letter
    String producers = "producers_example"; // String | Filter by producer(s) IDs. Can pass multiple with a comma as a delimiter. e.g 1,2,3
    String startDate = "startDate_example"; // String | Filter by starting date. Format: YYYY-MM-DD. e.g `2022`, `2005-05`, `2005-01-01`
    String endDate = "endDate_example"; // String | Filter by ending date. Format: YYYY-MM-DD. e.g `2022`, `2005-05`, `2005-01-01`
    try {
      AnimeSearch result = apiInstance.getAnimeSearch(page, limit, q, type, score, minScore, maxScore, status, rating, sfw, genres, genresExclude, orderBy, sort, letter, producers, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeSearch");
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
| **type** | [**AnimeSearchQueryType**](.md)|  | [optional] [enum: tv, movie, ova, special, ona, music] |
| **score** | **BigDecimal**|  | [optional] |
| **minScore** | **BigDecimal**| Set a minimum score for results. | [optional] |
| **maxScore** | **BigDecimal**| Set a maximum score for results | [optional] |
| **status** | [**AnimeSearchQueryStatus**](.md)|  | [optional] [enum: airing, complete, upcoming] |
| **rating** | [**AnimeSearchQueryRating**](.md)|  | [optional] [enum: g, pg, pg13, r17, r, rx] |
| **sfw** | **Boolean**| Filter out Adult entries | [optional] |
| **genres** | **String**| Filter by genre(s) IDs. Can pass multiple with a comma as a delimiter. e.g 1,2,3 | [optional] |
| **genresExclude** | **String**| Exclude genre(s) IDs. Can pass multiple with a comma as a delimiter. e.g 1,2,3 | [optional] |
| **orderBy** | [**AnimeSearchQueryOrderby**](.md)|  | [optional] [enum: mal_id, title, type, rating, start_date, end_date, episodes, score, scored_by, rank, popularity, members, favorites] |
| **sort** | [**SearchQuerySort**](.md)|  | [optional] [enum: desc, asc] |
| **letter** | **String**| Return entries starting with the given letter | [optional] |
| **producers** | **String**| Filter by producer(s) IDs. Can pass multiple with a comma as a delimiter. e.g 1,2,3 | [optional] |
| **startDate** | **String**| Filter by starting date. Format: YYYY-MM-DD. e.g &#x60;2022&#x60;, &#x60;2005-05&#x60;, &#x60;2005-01-01&#x60; | [optional] |
| **endDate** | **String**| Filter by ending date. Format: YYYY-MM-DD. e.g &#x60;2022&#x60;, &#x60;2005-05&#x60;, &#x60;2005-01-01&#x60; | [optional] |

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
| **200** | Returns search results for anime |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeStaff"></a>
# **getAnimeStaff**
> AnimeStaff getAnimeStaff(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      AnimeStaff result = apiInstance.getAnimeStaff(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeStaff");
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

[**AnimeStaff**](AnimeStaff.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns anime staff resource |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeStatistics"></a>
# **getAnimeStatistics**
> AnimeStatistics getAnimeStatistics(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      AnimeStatistics result = apiInstance.getAnimeStatistics(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeStatistics");
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

[**AnimeStatistics**](AnimeStatistics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns anime statistics |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeStreaming"></a>
# **getAnimeStreaming**
> ExternalLinks getAnimeStreaming(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      ExternalLinks result = apiInstance.getAnimeStreaming(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeStreaming");
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
| **200** | Returns anime streaming links |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeThemes"></a>
# **getAnimeThemes**
> AnimeThemes getAnimeThemes(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      AnimeThemes result = apiInstance.getAnimeThemes(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeThemes");
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

[**AnimeThemes**](AnimeThemes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns anime themes |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeUserUpdates"></a>
# **getAnimeUserUpdates**
> AnimeUserupdates getAnimeUserUpdates(id, page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    Integer page = 56; // Integer | 
    try {
      AnimeUserupdates result = apiInstance.getAnimeUserUpdates(id, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeUserUpdates");
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
| **page** | **Integer**|  | [optional] |

### Return type

[**AnimeUserupdates**](AnimeUserupdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of users who have added/updated/removed the entry on their list |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeVideos"></a>
# **getAnimeVideos**
> AnimeVideos getAnimeVideos(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      AnimeVideos result = apiInstance.getAnimeVideos(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeVideos");
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

[**AnimeVideos**](AnimeVideos.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns videos related to the entry |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getAnimeVideosEpisodes"></a>
# **getAnimeVideosEpisodes**
> AnimeVideosEpisodes getAnimeVideosEpisodes(id, page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnimeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    AnimeApi apiInstance = new AnimeApi(defaultClient);
    Integer id = 56; // Integer | 
    Integer page = 56; // Integer | 
    try {
      AnimeVideosEpisodes result = apiInstance.getAnimeVideosEpisodes(id, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimeApi#getAnimeVideosEpisodes");
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
| **page** | **Integer**|  | [optional] |

### Return type

[**AnimeVideosEpisodes**](AnimeVideosEpisodes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns episode videos related to the entry |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

