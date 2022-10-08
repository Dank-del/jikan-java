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
 * Anime Stats
 */
@ApiModel(description = "Anime Stats")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-08T15:18:52.497326700+05:30[Asia/Calcutta]")
public class UsersTempDataInnerAnimeStats {
  public static final String SERIALIZED_NAME_DAYS_WATCHED = "days_watched";
  @SerializedName(SERIALIZED_NAME_DAYS_WATCHED)
  private Float daysWatched;

  public static final String SERIALIZED_NAME_MEAN_SCORE = "mean_score";
  @SerializedName(SERIALIZED_NAME_MEAN_SCORE)
  private Float meanScore;

  public static final String SERIALIZED_NAME_WATCHING = "watching";
  @SerializedName(SERIALIZED_NAME_WATCHING)
  private Integer watching;

  public static final String SERIALIZED_NAME_COMPLETED = "completed";
  @SerializedName(SERIALIZED_NAME_COMPLETED)
  private Integer completed;

  public static final String SERIALIZED_NAME_ON_HOLD = "on_hold";
  @SerializedName(SERIALIZED_NAME_ON_HOLD)
  private Integer onHold;

  public static final String SERIALIZED_NAME_DROPPED = "dropped";
  @SerializedName(SERIALIZED_NAME_DROPPED)
  private Integer dropped;

  public static final String SERIALIZED_NAME_PLAN_TO_WATCH = "plan_to_watch";
  @SerializedName(SERIALIZED_NAME_PLAN_TO_WATCH)
  private Integer planToWatch;

  public static final String SERIALIZED_NAME_TOTAL_ENTRIES = "total_entries";
  @SerializedName(SERIALIZED_NAME_TOTAL_ENTRIES)
  private Integer totalEntries;

  public static final String SERIALIZED_NAME_REWATCHED = "rewatched";
  @SerializedName(SERIALIZED_NAME_REWATCHED)
  private Integer rewatched;

  public static final String SERIALIZED_NAME_EPISODES_WATCHED = "episodes_watched";
  @SerializedName(SERIALIZED_NAME_EPISODES_WATCHED)
  private Integer episodesWatched;

  public UsersTempDataInnerAnimeStats() {
  }

  public UsersTempDataInnerAnimeStats daysWatched(Float daysWatched) {
    
    this.daysWatched = daysWatched;
    return this;
  }

   /**
   * Number of days spent watching Anime
   * @return daysWatched
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of days spent watching Anime")

  public Float getDaysWatched() {
    return daysWatched;
  }


  public void setDaysWatched(Float daysWatched) {
    this.daysWatched = daysWatched;
  }


  public UsersTempDataInnerAnimeStats meanScore(Float meanScore) {
    
    this.meanScore = meanScore;
    return this;
  }

   /**
   * Mean Score
   * @return meanScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mean Score")

  public Float getMeanScore() {
    return meanScore;
  }


  public void setMeanScore(Float meanScore) {
    this.meanScore = meanScore;
  }


  public UsersTempDataInnerAnimeStats watching(Integer watching) {
    
    this.watching = watching;
    return this;
  }

   /**
   * Anime Watching
   * @return watching
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Anime Watching")

  public Integer getWatching() {
    return watching;
  }


  public void setWatching(Integer watching) {
    this.watching = watching;
  }


  public UsersTempDataInnerAnimeStats completed(Integer completed) {
    
    this.completed = completed;
    return this;
  }

   /**
   * Anime Completed
   * @return completed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Anime Completed")

  public Integer getCompleted() {
    return completed;
  }


  public void setCompleted(Integer completed) {
    this.completed = completed;
  }


  public UsersTempDataInnerAnimeStats onHold(Integer onHold) {
    
    this.onHold = onHold;
    return this;
  }

   /**
   * Anime On-Hold
   * @return onHold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Anime On-Hold")

  public Integer getOnHold() {
    return onHold;
  }


  public void setOnHold(Integer onHold) {
    this.onHold = onHold;
  }


  public UsersTempDataInnerAnimeStats dropped(Integer dropped) {
    
    this.dropped = dropped;
    return this;
  }

   /**
   * Anime Dropped
   * @return dropped
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Anime Dropped")

  public Integer getDropped() {
    return dropped;
  }


  public void setDropped(Integer dropped) {
    this.dropped = dropped;
  }


  public UsersTempDataInnerAnimeStats planToWatch(Integer planToWatch) {
    
    this.planToWatch = planToWatch;
    return this;
  }

   /**
   * Anime Planned to Watch
   * @return planToWatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Anime Planned to Watch")

  public Integer getPlanToWatch() {
    return planToWatch;
  }


  public void setPlanToWatch(Integer planToWatch) {
    this.planToWatch = planToWatch;
  }


  public UsersTempDataInnerAnimeStats totalEntries(Integer totalEntries) {
    
    this.totalEntries = totalEntries;
    return this;
  }

   /**
   * Total Anime entries on User list
   * @return totalEntries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total Anime entries on User list")

  public Integer getTotalEntries() {
    return totalEntries;
  }


  public void setTotalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
  }


  public UsersTempDataInnerAnimeStats rewatched(Integer rewatched) {
    
    this.rewatched = rewatched;
    return this;
  }

   /**
   * Anime re-watched
   * @return rewatched
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Anime re-watched")

  public Integer getRewatched() {
    return rewatched;
  }


  public void setRewatched(Integer rewatched) {
    this.rewatched = rewatched;
  }


  public UsersTempDataInnerAnimeStats episodesWatched(Integer episodesWatched) {
    
    this.episodesWatched = episodesWatched;
    return this;
  }

   /**
   * Number of Anime Episodes Watched
   * @return episodesWatched
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of Anime Episodes Watched")

  public Integer getEpisodesWatched() {
    return episodesWatched;
  }


  public void setEpisodesWatched(Integer episodesWatched) {
    this.episodesWatched = episodesWatched;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersTempDataInnerAnimeStats usersTempDataInnerAnimeStats = (UsersTempDataInnerAnimeStats) o;
    return Objects.equals(this.daysWatched, usersTempDataInnerAnimeStats.daysWatched) &&
        Objects.equals(this.meanScore, usersTempDataInnerAnimeStats.meanScore) &&
        Objects.equals(this.watching, usersTempDataInnerAnimeStats.watching) &&
        Objects.equals(this.completed, usersTempDataInnerAnimeStats.completed) &&
        Objects.equals(this.onHold, usersTempDataInnerAnimeStats.onHold) &&
        Objects.equals(this.dropped, usersTempDataInnerAnimeStats.dropped) &&
        Objects.equals(this.planToWatch, usersTempDataInnerAnimeStats.planToWatch) &&
        Objects.equals(this.totalEntries, usersTempDataInnerAnimeStats.totalEntries) &&
        Objects.equals(this.rewatched, usersTempDataInnerAnimeStats.rewatched) &&
        Objects.equals(this.episodesWatched, usersTempDataInnerAnimeStats.episodesWatched);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysWatched, meanScore, watching, completed, onHold, dropped, planToWatch, totalEntries, rewatched, episodesWatched);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersTempDataInnerAnimeStats {\n");
    sb.append("    daysWatched: ").append(toIndentedString(daysWatched)).append("\n");
    sb.append("    meanScore: ").append(toIndentedString(meanScore)).append("\n");
    sb.append("    watching: ").append(toIndentedString(watching)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    onHold: ").append(toIndentedString(onHold)).append("\n");
    sb.append("    dropped: ").append(toIndentedString(dropped)).append("\n");
    sb.append("    planToWatch: ").append(toIndentedString(planToWatch)).append("\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
    sb.append("    rewatched: ").append(toIndentedString(rewatched)).append("\n");
    sb.append("    episodesWatched: ").append(toIndentedString(episodesWatched)).append("\n");
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
    openapiFields.add("days_watched");
    openapiFields.add("mean_score");
    openapiFields.add("watching");
    openapiFields.add("completed");
    openapiFields.add("on_hold");
    openapiFields.add("dropped");
    openapiFields.add("plan_to_watch");
    openapiFields.add("total_entries");
    openapiFields.add("rewatched");
    openapiFields.add("episodes_watched");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersTempDataInnerAnimeStats
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UsersTempDataInnerAnimeStats.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsersTempDataInnerAnimeStats is not found in the empty JSON string", UsersTempDataInnerAnimeStats.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UsersTempDataInnerAnimeStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UsersTempDataInnerAnimeStats` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersTempDataInnerAnimeStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersTempDataInnerAnimeStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersTempDataInnerAnimeStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersTempDataInnerAnimeStats.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersTempDataInnerAnimeStats>() {
           @Override
           public void write(JsonWriter out, UsersTempDataInnerAnimeStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UsersTempDataInnerAnimeStats read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UsersTempDataInnerAnimeStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersTempDataInnerAnimeStats
  * @throws IOException if the JSON string is invalid with respect to UsersTempDataInnerAnimeStats
  */
  public static UsersTempDataInnerAnimeStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersTempDataInnerAnimeStats.class);
  }

 /**
  * Convert an instance of UsersTempDataInnerAnimeStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

