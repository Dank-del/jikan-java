# CharactersApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCharacterAnime**](CharactersApi.md#getCharacterAnime) | **GET** /characters/{id}/anime |  |
| [**getCharacterById**](CharactersApi.md#getCharacterById) | **GET** /characters/{id} |  |
| [**getCharacterFullById**](CharactersApi.md#getCharacterFullById) | **GET** /characters/{id}/full |  |
| [**getCharacterManga**](CharactersApi.md#getCharacterManga) | **GET** /characters/{id}/manga |  |
| [**getCharacterPictures**](CharactersApi.md#getCharacterPictures) | **GET** /characters/{id}/pictures |  |
| [**getCharacterVoiceActors**](CharactersApi.md#getCharacterVoiceActors) | **GET** /characters/{id}/voices |  |
| [**getCharactersSearch**](CharactersApi.md#getCharactersSearch) | **GET** /characters |  |


<a name="getCharacterAnime"></a>
# **getCharacterAnime**
> CharacterAnime getCharacterAnime(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CharactersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    CharactersApi apiInstance = new CharactersApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      CharacterAnime result = apiInstance.getCharacterAnime(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CharactersApi#getCharacterAnime");
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

[**CharacterAnime**](CharacterAnime.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns anime that character is in |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getCharacterById"></a>
# **getCharacterById**
> GetCharacterById200Response getCharacterById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CharactersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    CharactersApi apiInstance = new CharactersApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      GetCharacterById200Response result = apiInstance.getCharacterById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CharactersApi#getCharacterById");
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

[**GetCharacterById200Response**](GetCharacterById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns character resource |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getCharacterFullById"></a>
# **getCharacterFullById**
> GetCharacterFullById200Response getCharacterFullById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CharactersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    CharactersApi apiInstance = new CharactersApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      GetCharacterFullById200Response result = apiInstance.getCharacterFullById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CharactersApi#getCharacterFullById");
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

[**GetCharacterFullById200Response**](GetCharacterFullById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns complete character resource data |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getCharacterManga"></a>
# **getCharacterManga**
> CharacterManga getCharacterManga(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CharactersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    CharactersApi apiInstance = new CharactersApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      CharacterManga result = apiInstance.getCharacterManga(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CharactersApi#getCharacterManga");
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

[**CharacterManga**](CharacterManga.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns manga that character is in |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getCharacterPictures"></a>
# **getCharacterPictures**
> CharacterPictures getCharacterPictures(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CharactersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    CharactersApi apiInstance = new CharactersApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      CharacterPictures result = apiInstance.getCharacterPictures(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CharactersApi#getCharacterPictures");
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

[**CharacterPictures**](CharacterPictures.md)

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

<a name="getCharacterVoiceActors"></a>
# **getCharacterVoiceActors**
> CharacterVoiceActors getCharacterVoiceActors(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CharactersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    CharactersApi apiInstance = new CharactersApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      CharacterVoiceActors result = apiInstance.getCharacterVoiceActors(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CharactersApi#getCharacterVoiceActors");
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

[**CharacterVoiceActors**](CharacterVoiceActors.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the character&#39;s voice actors |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getCharactersSearch"></a>
# **getCharactersSearch**
> CharactersSearch getCharactersSearch(page, limit, q, orderBy, sort, letter)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CharactersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    CharactersApi apiInstance = new CharactersApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer limit = 56; // Integer | 
    String q = "q_example"; // String | 
    CharactersSearchQueryOrderby orderBy = CharactersSearchQueryOrderby.fromValue("mal_id"); // CharactersSearchQueryOrderby | 
    SearchQuerySort sort = SearchQuerySort.fromValue("desc"); // SearchQuerySort | 
    String letter = "letter_example"; // String | Return entries starting with the given letter
    try {
      CharactersSearch result = apiInstance.getCharactersSearch(page, limit, q, orderBy, sort, letter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CharactersApi#getCharactersSearch");
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
| **orderBy** | [**CharactersSearchQueryOrderby**](.md)|  | [optional] [enum: mal_id, name, favorites] |
| **sort** | [**SearchQuerySort**](.md)|  | [optional] [enum: desc, asc] |
| **letter** | **String**| Return entries starting with the given letter | [optional] |

### Return type

[**CharactersSearch**](CharactersSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns search results for characters |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

