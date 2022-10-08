# UsersApi

All URIs are relative to *https://api.jikan.moe/v4*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserAbout**](UsersApi.md#getUserAbout) | **GET** /users/{username}/about |  |
| [**getUserAnimelist**](UsersApi.md#getUserAnimelist) | **GET** /users/{username}/animelist |  |
| [**getUserById**](UsersApi.md#getUserById) | **GET** /users/userbyid/{id} |  |
| [**getUserClubs**](UsersApi.md#getUserClubs) | **GET** /users/{username}/clubs |  |
| [**getUserExternal**](UsersApi.md#getUserExternal) | **GET** /users/{username}/external |  |
| [**getUserFavorites**](UsersApi.md#getUserFavorites) | **GET** /users/{username}/favorites |  |
| [**getUserFriends**](UsersApi.md#getUserFriends) | **GET** /users/{username}/friends |  |
| [**getUserFullProfile**](UsersApi.md#getUserFullProfile) | **GET** /users/{username}/full |  |
| [**getUserHistory**](UsersApi.md#getUserHistory) | **GET** /users/{username}/history |  |
| [**getUserMangaList**](UsersApi.md#getUserMangaList) | **GET** /users/{username}/mangalist |  |
| [**getUserProfile**](UsersApi.md#getUserProfile) | **GET** /users/{username} |  |
| [**getUserRecommendations**](UsersApi.md#getUserRecommendations) | **GET** /users/{username}/recommendations |  |
| [**getUserReviews**](UsersApi.md#getUserReviews) | **GET** /users/{username}/reviews |  |
| [**getUserStatistics**](UsersApi.md#getUserStatistics) | **GET** /users/{username}/statistics |  |
| [**getUserUpdates**](UsersApi.md#getUserUpdates) | **GET** /users/{username}/userupdates |  |
| [**getUsersSearch**](UsersApi.md#getUsersSearch) | **GET** /users |  |


<a name="getUserAbout"></a>
# **getUserAbout**
> UserAbout getUserAbout(username)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | 
    try {
      UserAbout result = apiInstance.getUserAbout(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserAbout");
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
| **username** | **String**|  | |

### Return type

[**UserAbout**](UserAbout.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns user about in raw HTML |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getUserAnimelist"></a>
# **getUserAnimelist**
> Object getUserAnimelist(username)



User Anime lists have been discontinued since May 1st, 2022. &lt;a href&#x3D;&#39;https://docs.google.com/document/d/1-6H-agSnqa8Mfmw802UYfGQrceIEnAaEh4uCXAPiX5A&#39;&gt;Read more&lt;/a&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | 
    try {
      Object result = apiInstance.getUserAnimelist(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserAnimelist");
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
| **username** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns user anime list |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getUserById"></a>
# **getUserById**
> GetUserById200Response getUserById(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      GetUserById200Response result = apiInstance.getUserById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserById");
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

[**GetUserById200Response**](GetUserById200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns username by ID search |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getUserClubs"></a>
# **getUserClubs**
> UserClubs getUserClubs(username, page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | 
    Integer page = 56; // Integer | 
    try {
      UserClubs result = apiInstance.getUserClubs(username, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserClubs");
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
| **username** | **String**|  | |
| **page** | **Integer**|  | [optional] |

### Return type

[**UserClubs**](UserClubs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns user clubs |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getUserExternal"></a>
# **getUserExternal**
> ExternalLinks getUserExternal(username)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | 
    try {
      ExternalLinks result = apiInstance.getUserExternal(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserExternal");
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
| **username** | **String**|  | |

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
| **200** | Returns user&#39;s external links |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getUserFavorites"></a>
# **getUserFavorites**
> GetUserFavorites200Response getUserFavorites(username)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | 
    try {
      GetUserFavorites200Response result = apiInstance.getUserFavorites(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserFavorites");
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
| **username** | **String**|  | |

### Return type

[**GetUserFavorites200Response**](GetUserFavorites200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns user favorites |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getUserFriends"></a>
# **getUserFriends**
> UserFriends getUserFriends(username, page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | 
    Integer page = 56; // Integer | 
    try {
      UserFriends result = apiInstance.getUserFriends(username, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserFriends");
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
| **username** | **String**|  | |
| **page** | **Integer**|  | [optional] |

### Return type

[**UserFriends**](UserFriends.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns user friends |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getUserFullProfile"></a>
# **getUserFullProfile**
> GetUserFullProfile200Response getUserFullProfile(username)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | 
    try {
      GetUserFullProfile200Response result = apiInstance.getUserFullProfile(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserFullProfile");
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
| **username** | **String**|  | |

### Return type

[**GetUserFullProfile200Response**](GetUserFullProfile200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns complete user resource data |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getUserHistory"></a>
# **getUserHistory**
> UserHistory getUserHistory(username, type)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | 
    String type = "anime"; // String | 
    try {
      UserHistory result = apiInstance.getUserHistory(username, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserHistory");
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
| **username** | **String**|  | |
| **type** | **String**|  | [optional] [enum: anime, manga] |

### Return type

[**UserHistory**](UserHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns user history (past 30 days) |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getUserMangaList"></a>
# **getUserMangaList**
> Object getUserMangaList(username)



User Manga lists have been discontinued since May 1st, 2022. &lt;a href&#x3D;&#39;https://docs.google.com/document/d/1-6H-agSnqa8Mfmw802UYfGQrceIEnAaEh4uCXAPiX5A&#39;&gt;Read more&lt;/a&gt;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | 
    try {
      Object result = apiInstance.getUserMangaList(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserMangaList");
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
| **username** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns user manga list |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getUserProfile"></a>
# **getUserProfile**
> GetRandomUsers200Response getUserProfile(username)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | 
    try {
      GetRandomUsers200Response result = apiInstance.getUserProfile(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserProfile");
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
| **username** | **String**|  | |

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
| **200** | Returns user profile |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getUserRecommendations"></a>
# **getUserRecommendations**
> Recommendations getUserRecommendations(username, page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | 
    Integer page = 56; // Integer | 
    try {
      Recommendations result = apiInstance.getUserRecommendations(username, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserRecommendations");
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
| **username** | **String**|  | |
| **page** | **Integer**|  | [optional] |

### Return type

[**Recommendations**](Recommendations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Recent Anime Recommendations |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getUserReviews"></a>
# **getUserReviews**
> GetTopReviews200Response getUserReviews(username, page)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | 
    Integer page = 56; // Integer | 
    try {
      GetTopReviews200Response result = apiInstance.getUserReviews(username, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserReviews");
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
| **username** | **String**|  | |
| **page** | **Integer**|  | [optional] |

### Return type

[**GetTopReviews200Response**](GetTopReviews200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns user reviews |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getUserStatistics"></a>
# **getUserStatistics**
> UserStatistics getUserStatistics(username)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | 
    try {
      UserStatistics result = apiInstance.getUserStatistics(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserStatistics");
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
| **username** | **String**|  | |

### Return type

[**UserStatistics**](UserStatistics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns user statistics |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getUserUpdates"></a>
# **getUserUpdates**
> UserUpdates getUserUpdates(username)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "username_example"; // String | 
    try {
      UserUpdates result = apiInstance.getUserUpdates(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserUpdates");
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
| **username** | **String**|  | |

### Return type

[**UserUpdates**](UserUpdates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns user updates |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

<a name="getUsersSearch"></a>
# **getUsersSearch**
> UsersSearch getUsersSearch(page, limit, q, gender, location, maxAge, minAge)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.jikan.moe/v4");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer limit = 56; // Integer | 
    String q = "q_example"; // String | 
    UsersSearchQueryGender gender = UsersSearchQueryGender.fromValue("any"); // UsersSearchQueryGender | 
    String location = "location_example"; // String | 
    Integer maxAge = 56; // Integer | 
    Integer minAge = 56; // Integer | 
    try {
      UsersSearch result = apiInstance.getUsersSearch(page, limit, q, gender, location, maxAge, minAge);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUsersSearch");
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
| **gender** | [**UsersSearchQueryGender**](.md)|  | [optional] [enum: any, male, female, nonbinary] |
| **location** | **String**|  | [optional] |
| **maxAge** | **Integer**|  | [optional] |
| **minAge** | **Integer**|  | [optional] |

### Return type

[**UsersSearch**](UsersSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns search results for users |  -  |
| **400** | Error: Bad request. When required parameters were not supplied. |  -  |

