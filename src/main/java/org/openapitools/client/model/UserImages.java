/*
 * Jikan API
 * [Jikan](https://jikan.moe) is an **Unofficial** MyAnimeList API. It scrapes the website to satisfy the need for a complete API - which MyAnimeList lacks.  # Information  ⚡ Jikan is powered by it's awesome backers - 🙏 [Become a backer](https://www.patreon.com/jikan)  ## Rate Limiting  | Duration | Requests | |----|----| | Monthly | **Unlimited** | | Per Minute | 60 requests | | Per Second | 3 requests |   ## JSON Notes - Any property (except arrays or objects) whose value does not exist or is undetermined, will be `null`. - Any array or object property whose value does not exist or is undetermined, will be empty. - Any `score` property whose value does not exist or is undetermined, will be `0`. - All dates and timestamps are returned in [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) format and in UTC timezone  ## Caching By **CACHING**, we refer to the data parsed from MyAnimeList which is stored temporarily on our servers to provide better API performance.  All requests, by default are cached for **24 hours** except the following endpoints which have their own unique cache **Time To Live**.   | Request | TTL | | ---- | ---- | | All (Default) | 24 hours |   The following response headers will detail cache information.  | Header | Remarks | | ---- | ---- | | `Expires` | Cache expiry date | | `Last-Modified` | Cache set date | | `X-Request-Fingerprint` | Unique request fingerprint |   Note: Caching headers will only be available on single resource requests and their child endpoints. e.g `/anime/1`, `/anime/1/relations`.  They won't be available on pages which perform queries, like /anime, or /top/anime, etc.  ## Allowed HTTP(s) requests  **Jikan REST API does not provide authenticated requests for MyAnimeList.** This means you can not use it to update your anime/manga list. Only GET requests are supported which return READ-ONLY data.  ## HTTP Responses  | HTTP Status | Remarks | | ---- | ---- | | `200 - OK` | The request was successful | | `304 - Not Modified` | You have the latest data (Cache Validation response) | | `400 - Bad Request` | You've made an invalid request. Recheck documentation | | `404 - Not Found` | The resource was not found or MyAnimeList responded with a `404` | | `405 - Method Not Allowed` | Requested Method is not supported for resource. Only `GET` requests are allowed | | `429 - Too Many Request` | You are being rate limited by Jikan or MyAnimeList is rate-limiting our servers (specified in the error response) | | `500 - Internal Server Error` | Something is not working on our end. If you see an error response with a `report_url` URL, please click on it to open an auto-generated GitHub issue | | `503 - Service Unavailable` | The service has broke. |   ## JSON Error Response  ```json  {      \"status\": 404,      \"type\": \"BadResponseException\",      \"message\": \"Resource does not exist\",      \"error\": \"Something Happened\",      \"report_url\": \"https://github.com...\"   } ```  | Property | Remarks | | ---- | ---- | | `status` | Returned HTTP Status Code | | `type` | Thrown Exception | | `message` | Human-readable error message | | `error` | Error response and trace from the API | | `report_url` | Clicking this would redirect you to a generated GitHub issue. ℹ It's only returned on a parser error. |   ## Cache Validation  - All requests return a `ETag` header which is an MD5 hash of the response - You can use this hash to verify if there's new or updated content by suppliying it as the value for the `If-None-Match` in your next request header - You will get a HTTP `304 - Not Modified` response if the content has not changed - If the content has changed, you'll get a HTTP `200 - OK` response with the updated JSON response  ![Cache Validation](https://i.imgur.com/925ozVn.png 'Cache Validation')  ## Disclaimer  - Jikan is not affiliated with MyAnimeList.net. - Jikan is a free, open-source API. Please use it responsibly.  ----  By using the API, you are agreeing to Jikan's [terms of use](https://jikan.moe/terms) policy.  [v3 Documentation](https://jikan.docs.apiary.io/) - [Wrappers/SDKs](https://github.com/jikan-me/jikan#wrappers) - [Report an issue](https://github.com/jikan-me/jikan-rest/issues/new) - [Host your own server](https://github.com/jikan-me/jikan-rest)
 *
 * The version of the OpenAPI document: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.UserImagesJpg;
import org.openapitools.client.model.UserImagesWebp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * UserImages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-08T15:18:52.497326700+05:30[Asia/Calcutta]")
public class UserImages {
  public static final String SERIALIZED_NAME_JPG = "jpg";
  @SerializedName(SERIALIZED_NAME_JPG)
  private UserImagesJpg jpg;

  public static final String SERIALIZED_NAME_WEBP = "webp";
  @SerializedName(SERIALIZED_NAME_WEBP)
  private UserImagesWebp webp;

  public UserImages() {
  }

  public UserImages jpg(UserImagesJpg jpg) {
    
    this.jpg = jpg;
    return this;
  }

   /**
   * Get jpg
   * @return jpg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserImagesJpg getJpg() {
    return jpg;
  }


  public void setJpg(UserImagesJpg jpg) {
    this.jpg = jpg;
  }


  public UserImages webp(UserImagesWebp webp) {
    
    this.webp = webp;
    return this;
  }

   /**
   * Get webp
   * @return webp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserImagesWebp getWebp() {
    return webp;
  }


  public void setWebp(UserImagesWebp webp) {
    this.webp = webp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserImages userImages = (UserImages) o;
    return Objects.equals(this.jpg, userImages.jpg) &&
        Objects.equals(this.webp, userImages.webp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jpg, webp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserImages {\n");
    sb.append("    jpg: ").append(toIndentedString(jpg)).append("\n");
    sb.append("    webp: ").append(toIndentedString(webp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("jpg");
    openapiFields.add("webp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserImages
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserImages.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserImages is not found in the empty JSON string", UserImages.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserImages.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserImages` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `jpg`
      if (jsonObj.get("jpg") != null && !jsonObj.get("jpg").isJsonNull()) {
        UserImagesJpg.validateJsonObject(jsonObj.getAsJsonObject("jpg"));
      }
      // validate the optional field `webp`
      if (jsonObj.get("webp") != null && !jsonObj.get("webp").isJsonNull()) {
        UserImagesWebp.validateJsonObject(jsonObj.getAsJsonObject("webp"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserImages.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserImages' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserImages> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserImages.class));

       return (TypeAdapter<T>) new TypeAdapter<UserImages>() {
           @Override
           public void write(JsonWriter out, UserImages value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserImages read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserImages given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserImages
  * @throws IOException if the JSON string is invalid with respect to UserImages
  */
  public static UserImages fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserImages.class);
  }

 /**
  * Convert an instance of UserImages to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

