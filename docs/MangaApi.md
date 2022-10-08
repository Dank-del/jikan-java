# MangaApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMangaById**](MangaApi.md#getMangaById) | **GET** /manga/{id} |  |
| [**getMangaCharacters**](MangaApi.md#getMangaCharacters) | **GET** /manga/{id}/characters |  |
| [**getMangaExternal**](MangaApi.md#getMangaExternal) | **GET** /manga/{id}/external |  |
| [**getMangaFullById**](MangaApi.md#getMangaFullById) | **GET** /manga/{id}/full |  |
| [**getMangaMoreInfo**](MangaApi.md#getMangaMoreInfo) | **GET** /manga/{id}/moreinfo |  |
| [**getMangaNews**](MangaApi.md#getMangaNews) | **GET** /manga/{id}/news |  |
| [**getMangaPictures**](MangaApi.md#getMangaPictures) | **GET** /manga/{id}/pictures |  |
| [**getMangaRecommendations**](MangaApi.md#getMangaRecommendations) | **GET** /manga/{id}/recommendations |  |
| [**getMangaRelations**](MangaApi.md#getMangaRelations) | **GET** /manga/{id}/relations |  |
| [**getMangaReviews**](MangaApi.md#getMangaReviews) | **GET** /manga/{id}/reviews |  |
| [**getMangaSearch**](MangaApi.md#getMangaSearch) | **GET** /manga |  |
| [**getMangaStatistics**](MangaApi.md#getMangaStatistics) | **GET** /manga/{id}/statistics |  |
| [**getMangaTopics**](MangaApi.md#getMangaTopics) | **GET** /manga/{id}/forum |  |
| [**getMangaUserUpdates**](MangaApi.md#getMangaUserUpdates) | **GET** /manga/{id}/userupdates |  |


<a name="getMangaById"></a>
# **getMangaById**
> GetMangaById200Response getMangaById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MangaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    MangaApi apiInstance = new MangaApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      GetMangaById200Response result = apiInstance.getMangaById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MangaApi#getMangaById");
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

[**GetMangaById200Response**](GetMangaById200Response.md)

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

<a name="getMangaCharacters"></a>
# **getMangaCharacters**
> MangaCharacters getMangaCharacters(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MangaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    MangaApi apiInstance = new MangaApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      MangaCharacters result = apiInstance.getMangaCharacters(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MangaApi#getMangaCharacters");
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

[**MangaCharacters**](MangaCharacters.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns manga characters resource |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getMangaExternal"></a>
# **getMangaExternal**
> ExternalLinks getMangaExternal(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MangaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    MangaApi apiInstance = new MangaApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      ExternalLinks result = apiInstance.getMangaExternal(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MangaApi#getMangaExternal");
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
| **200** | Returns manga external links |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getMangaFullById"></a>
# **getMangaFullById**
> GetMangaFullById200Response getMangaFullById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MangaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    MangaApi apiInstance = new MangaApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      GetMangaFullById200Response result = apiInstance.getMangaFullById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MangaApi#getMangaFullById");
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

[**GetMangaFullById200Response**](GetMangaFullById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns complete manga resource data |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getMangaMoreInfo"></a>
# **getMangaMoreInfo**
> Moreinfo getMangaMoreInfo(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MangaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    MangaApi apiInstance = new MangaApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      Moreinfo result = apiInstance.getMangaMoreInfo(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MangaApi#getMangaMoreInfo");
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
| **200** | Returns manga moreinfo |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getMangaNews"></a>
# **getMangaNews**
> MangaNews getMangaNews(id, page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MangaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    MangaApi apiInstance = new MangaApi(defaultClient);
    Integer id = 56; // Integer | 
    Integer page = 56; // Integer | 
    try {
      MangaNews result = apiInstance.getMangaNews(id, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MangaApi#getMangaNews");
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

[**MangaNews**](MangaNews.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of manga news topics |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getMangaPictures"></a>
# **getMangaPictures**
> MangaPictures getMangaPictures(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MangaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    MangaApi apiInstance = new MangaApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      MangaPictures result = apiInstance.getMangaPictures(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MangaApi#getMangaPictures");
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

[**MangaPictures**](MangaPictures.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of manga pictures |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getMangaRecommendations"></a>
# **getMangaRecommendations**
> EntryRecommendations getMangaRecommendations(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MangaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    MangaApi apiInstance = new MangaApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      EntryRecommendations result = apiInstance.getMangaRecommendations(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MangaApi#getMangaRecommendations");
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
| **200** | Returns manga recommendations |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getMangaRelations"></a>
# **getMangaRelations**
> GetAnimeRelations200Response getMangaRelations(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MangaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    MangaApi apiInstance = new MangaApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      GetAnimeRelations200Response result = apiInstance.getMangaRelations(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MangaApi#getMangaRelations");
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
| **200** | Returns manga relations |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getMangaReviews"></a>
# **getMangaReviews**
> MangaReviews getMangaReviews(id, page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MangaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    MangaApi apiInstance = new MangaApi(defaultClient);
    Integer id = 56; // Integer | 
    Integer page = 56; // Integer | 
    try {
      MangaReviews result = apiInstance.getMangaReviews(id, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MangaApi#getMangaReviews");
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

[**MangaReviews**](MangaReviews.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns manga reviews |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getMangaSearch"></a>
# **getMangaSearch**
> MangaSearch getMangaSearch(page, limit, q, type, score, minScore, maxScore, status, sfw, genres, genresExclude, orderBy, sort, letter, magazines, startDate, endDate)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MangaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    MangaApi apiInstance = new MangaApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer limit = 56; // Integer | 
    String q = "q_example"; // String | 
    MangaSearchQueryType type = MangaSearchQueryType.fromValue("manga"); // MangaSearchQueryType | 
    BigDecimal score = new BigDecimal(78); // BigDecimal | 
    BigDecimal minScore = new BigDecimal(78); // BigDecimal | Set a minimum score for results.
    BigDecimal maxScore = new BigDecimal(78); // BigDecimal | Set a maximum score for results
    MangaSearchQueryStatus status = MangaSearchQueryStatus.fromValue("publishing"); // MangaSearchQueryStatus | 
    Boolean sfw = true; // Boolean | Filter out Adult entries
    String genres = "genres_example"; // String | Filter by genre(s) IDs. Can pass multiple with a comma as a delimiter. e.g 1,2,3
    String genresExclude = "genresExclude_example"; // String | Exclude genre(s) IDs. Can pass multiple with a comma as a delimiter. e.g 1,2,3
    MangaSearchQueryOrderby orderBy = MangaSearchQueryOrderby.fromValue("mal_id"); // MangaSearchQueryOrderby | 
    SearchQuerySort sort = SearchQuerySort.fromValue("desc"); // SearchQuerySort | 
    String letter = "letter_example"; // String | Return entries starting with the given letter
    String magazines = "magazines_example"; // String | Filter by magazine(s) IDs. Can pass multiple with a comma as a delimiter. e.g 1,2,3
    String startDate = "startDate_example"; // String | Filter by starting date. Format: YYYY-MM-DD. e.g `2022`, `2005-05`, `2005-01-01`
    String endDate = "endDate_example"; // String | Filter by ending date. Format: YYYY-MM-DD. e.g `2022`, `2005-05`, `2005-01-01`
    try {
      MangaSearch result = apiInstance.getMangaSearch(page, limit, q, type, score, minScore, maxScore, status, sfw, genres, genresExclude, orderBy, sort, letter, magazines, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MangaApi#getMangaSearch");
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
| **type** | [**MangaSearchQueryType**](.md)|  | [optional] [enum: manga, novel, lightnovel, oneshot, doujin, manhwa, manhua] |
| **score** | **BigDecimal**|  | [optional] |
| **minScore** | **BigDecimal**| Set a minimum score for results. | [optional] |
| **maxScore** | **BigDecimal**| Set a maximum score for results | [optional] |
| **status** | [**MangaSearchQueryStatus**](.md)|  | [optional] [enum: publishing, complete, hiatus, discontinued, upcoming] |
| **sfw** | **Boolean**| Filter out Adult entries | [optional] |
| **genres** | **String**| Filter by genre(s) IDs. Can pass multiple with a comma as a delimiter. e.g 1,2,3 | [optional] |
| **genresExclude** | **String**| Exclude genre(s) IDs. Can pass multiple with a comma as a delimiter. e.g 1,2,3 | [optional] |
| **orderBy** | [**MangaSearchQueryOrderby**](.md)|  | [optional] [enum: mal_id, title, start_date, end_date, chapters, volumes, score, scored_by, rank, popularity, members, favorites] |
| **sort** | [**SearchQuerySort**](.md)|  | [optional] [enum: desc, asc] |
| **letter** | **String**| Return entries starting with the given letter | [optional] |
| **magazines** | **String**| Filter by magazine(s) IDs. Can pass multiple with a comma as a delimiter. e.g 1,2,3 | [optional] |
| **startDate** | **String**| Filter by starting date. Format: YYYY-MM-DD. e.g &#x60;2022&#x60;, &#x60;2005-05&#x60;, &#x60;2005-01-01&#x60; | [optional] |
| **endDate** | **String**| Filter by ending date. Format: YYYY-MM-DD. e.g &#x60;2022&#x60;, &#x60;2005-05&#x60;, &#x60;2005-01-01&#x60; | [optional] |

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
| **200** | Returns search results for manga |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getMangaStatistics"></a>
# **getMangaStatistics**
> MangaStatistics getMangaStatistics(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MangaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    MangaApi apiInstance = new MangaApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      MangaStatistics result = apiInstance.getMangaStatistics(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MangaApi#getMangaStatistics");
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

[**MangaStatistics**](MangaStatistics.md)

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

<a name="getMangaTopics"></a>
# **getMangaTopics**
> Forum getMangaTopics(id, filter)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MangaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    MangaApi apiInstance = new MangaApi(defaultClient);
    Integer id = 56; // Integer | 
    String filter = "all"; // String | Filter topics
    try {
      Forum result = apiInstance.getMangaTopics(id, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MangaApi#getMangaTopics");
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
| **200** | Returns a list of manga forum topics |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getMangaUserUpdates"></a>
# **getMangaUserUpdates**
> MangaUserupdates getMangaUserUpdates(id, page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MangaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    MangaApi apiInstance = new MangaApi(defaultClient);
    Integer id = 56; // Integer | 
    Integer page = 56; // Integer | 
    try {
      MangaUserupdates result = apiInstance.getMangaUserUpdates(id, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MangaApi#getMangaUserUpdates");
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

[**MangaUserupdates**](MangaUserupdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns manga user updates |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

