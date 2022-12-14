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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Anime Episode Resource
 */
@ApiModel(description = "Anime Episode Resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-08T15:34:51.366952+05:30[Asia/Calcutta]")
public class AnimeEpisode {
  public static final String SERIALIZED_NAME_MAL_ID = "mal_id";
  @SerializedName(SERIALIZED_NAME_MAL_ID)
  private Integer malId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TITLE_JAPANESE = "title_japanese";
  @SerializedName(SERIALIZED_NAME_TITLE_JAPANESE)
  private String titleJapanese;

  public static final String SERIALIZED_NAME_TITLE_ROMANJI = "title_romanji";
  @SerializedName(SERIALIZED_NAME_TITLE_ROMANJI)
  private String titleRomanji;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_AIRED = "aired";
  @SerializedName(SERIALIZED_NAME_AIRED)
  private String aired;

  public static final String SERIALIZED_NAME_FILLER = "filler";
  @SerializedName(SERIALIZED_NAME_FILLER)
  private Boolean filler;

  public static final String SERIALIZED_NAME_RECAP = "recap";
  @SerializedName(SERIALIZED_NAME_RECAP)
  private Boolean recap;

  public static final String SERIALIZED_NAME_SYNOPSIS = "synopsis";
  @SerializedName(SERIALIZED_NAME_SYNOPSIS)
  private String synopsis;

  public AnimeEpisode() {
  }

  public AnimeEpisode malId(Integer malId) {
    
    this.malId = malId;
    return this;
  }

   /**
   * MyAnimeList ID
   * @return malId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MyAnimeList ID")

  public Integer getMalId() {
    return malId;
  }


  public void setMalId(Integer malId) {
    this.malId = malId;
  }


  public AnimeEpisode url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * MyAnimeList URL
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MyAnimeList URL")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public AnimeEpisode title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public AnimeEpisode titleJapanese(String titleJapanese) {
    
    this.titleJapanese = titleJapanese;
    return this;
  }

   /**
   * Title Japanese
   * @return titleJapanese
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title Japanese")

  public String getTitleJapanese() {
    return titleJapanese;
  }


  public void setTitleJapanese(String titleJapanese) {
    this.titleJapanese = titleJapanese;
  }


  public AnimeEpisode titleRomanji(String titleRomanji) {
    
    this.titleRomanji = titleRomanji;
    return this;
  }

   /**
   * title_romanji
   * @return titleRomanji
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "title_romanji")

  public String getTitleRomanji() {
    return titleRomanji;
  }


  public void setTitleRomanji(String titleRomanji) {
    this.titleRomanji = titleRomanji;
  }


  public AnimeEpisode duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Episode duration in seconds
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Episode duration in seconds")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public AnimeEpisode aired(String aired) {
    
    this.aired = aired;
    return this;
  }

   /**
   * Aired Date ISO8601
   * @return aired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Aired Date ISO8601")

  public String getAired() {
    return aired;
  }


  public void setAired(String aired) {
    this.aired = aired;
  }


  public AnimeEpisode filler(Boolean filler) {
    
    this.filler = filler;
    return this;
  }

   /**
   * Filler episode
   * @return filler
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filler episode")

  public Boolean getFiller() {
    return filler;
  }


  public void setFiller(Boolean filler) {
    this.filler = filler;
  }


  public AnimeEpisode recap(Boolean recap) {
    
    this.recap = recap;
    return this;
  }

   /**
   * Recap episode
   * @return recap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Recap episode")

  public Boolean getRecap() {
    return recap;
  }


  public void setRecap(Boolean recap) {
    this.recap = recap;
  }


  public AnimeEpisode synopsis(String synopsis) {
    
    this.synopsis = synopsis;
    return this;
  }

   /**
   * Episode Synopsis
   * @return synopsis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Episode Synopsis")

  public String getSynopsis() {
    return synopsis;
  }


  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimeEpisode animeEpisode = (AnimeEpisode) o;
    return Objects.equals(this.malId, animeEpisode.malId) &&
        Objects.equals(this.url, animeEpisode.url) &&
        Objects.equals(this.title, animeEpisode.title) &&
        Objects.equals(this.titleJapanese, animeEpisode.titleJapanese) &&
        Objects.equals(this.titleRomanji, animeEpisode.titleRomanji) &&
        Objects.equals(this.duration, animeEpisode.duration) &&
        Objects.equals(this.aired, animeEpisode.aired) &&
        Objects.equals(this.filler, animeEpisode.filler) &&
        Objects.equals(this.recap, animeEpisode.recap) &&
        Objects.equals(this.synopsis, animeEpisode.synopsis);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(malId, url, title, titleJapanese, titleRomanji, duration, aired, filler, recap, synopsis);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimeEpisode {\n");
    sb.append("    malId: ").append(toIndentedString(malId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleJapanese: ").append(toIndentedString(titleJapanese)).append("\n");
    sb.append("    titleRomanji: ").append(toIndentedString(titleRomanji)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    aired: ").append(toIndentedString(aired)).append("\n");
    sb.append("    filler: ").append(toIndentedString(filler)).append("\n");
    sb.append("    recap: ").append(toIndentedString(recap)).append("\n");
    sb.append("    synopsis: ").append(toIndentedString(synopsis)).append("\n");
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
    openapiFields.add("mal_id");
    openapiFields.add("url");
    openapiFields.add("title");
    openapiFields.add("title_japanese");
    openapiFields.add("title_romanji");
    openapiFields.add("duration");
    openapiFields.add("aired");
    openapiFields.add("filler");
    openapiFields.add("recap");
    openapiFields.add("synopsis");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnimeEpisode
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AnimeEpisode.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnimeEpisode is not found in the empty JSON string", AnimeEpisode.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AnimeEpisode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnimeEpisode` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("title_japanese") != null && !jsonObj.get("title_japanese").isJsonNull()) && !jsonObj.get("title_japanese").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title_japanese` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title_japanese").toString()));
      }
      if ((jsonObj.get("title_romanji") != null && !jsonObj.get("title_romanji").isJsonNull()) && !jsonObj.get("title_romanji").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title_romanji` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title_romanji").toString()));
      }
      if ((jsonObj.get("aired") != null && !jsonObj.get("aired").isJsonNull()) && !jsonObj.get("aired").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aired` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aired").toString()));
      }
      if ((jsonObj.get("synopsis") != null && !jsonObj.get("synopsis").isJsonNull()) && !jsonObj.get("synopsis").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `synopsis` to be a primitive type in the JSON string but got `%s`", jsonObj.get("synopsis").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnimeEpisode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnimeEpisode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnimeEpisode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnimeEpisode.class));

       return (TypeAdapter<T>) new TypeAdapter<AnimeEpisode>() {
           @Override
           public void write(JsonWriter out, AnimeEpisode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnimeEpisode read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnimeEpisode given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnimeEpisode
  * @throws IOException if the JSON string is invalid with respect to AnimeEpisode
  */
  public static AnimeEpisode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnimeEpisode.class);
  }

 /**
  * Convert an instance of AnimeEpisode to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

