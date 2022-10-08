# RandomApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRandomAnime**](RandomApi.md#getRandomAnime) | **GET** /random/anime |  |
| [**getRandomCharacters**](RandomApi.md#getRandomCharacters) | **GET** /random/characters |  |
| [**getRandomManga**](RandomApi.md#getRandomManga) | **GET** /random/manga |  |
| [**getRandomPeople**](RandomApi.md#getRandomPeople) | **GET** /random/people |  |
| [**getRandomUsers**](RandomApi.md#getRandomUsers) | **GET** /random/users |  |


<a name="getRandomAnime"></a>
# **getRandomAnime**
> GetAnimeById200Response getRandomAnime()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RandomApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    RandomApi apiInstance = new RandomApi(defaultClient);
    try {
      GetAnimeById200Response result = apiInstance.getRandomAnime();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RandomApi#getRandomAnime");
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

[**GetAnimeById200Response**](GetAnimeById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a random anime resource |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getRandomCharacters"></a>
# **getRandomCharacters**
> GetCharacterById200Response getRandomCharacters()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RandomApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    RandomApi apiInstance = new RandomApi(defaultClient);
    try {
      GetCharacterById200Response result = apiInstance.getRandomCharacters();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RandomApi#getRandomCharacters");
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

[**GetCharacterById200Response**](GetCharacterById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a random character resource |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getRandomManga"></a>
# **getRandomManga**
> GetMangaById200Response getRandomManga()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RandomApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    RandomApi apiInstance = new RandomApi(defaultClient);
    try {
      GetMangaById200Response result = apiInstance.getRandomManga();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RandomApi#getRandomManga");
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

[**GetMangaById200Response**](GetMangaById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a random manga resource |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getRandomPeople"></a>
# **getRandomPeople**
> GetPersonById200Response getRandomPeople()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RandomApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    RandomApi apiInstance = new RandomApi(defaultClient);
    try {
      GetPersonById200Response result = apiInstance.getRandomPeople();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RandomApi#getRandomPeople");
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

[**GetPersonById200Response**](GetPersonById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a random person resource |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getRandomUsers"></a>
# **getRandomUsers**
> GetRandomUsers200Response getRandomUsers()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RandomApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    RandomApi apiInstance = new RandomApi(defaultClient);
    try {
      GetRandomUsers200Response result = apiInstance.getRandomUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RandomApi#getRandomUsers");
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

[**GetRandomUsers200Response**](GetRandomUsers200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a random user profile resource |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

