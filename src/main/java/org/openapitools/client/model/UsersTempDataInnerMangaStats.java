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
 * Manga Stats
 */
@ApiModel(description = "Manga Stats")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-08T15:34:51.366952+05:30[Asia/Calcutta]")
public class UsersTempDataInnerMangaStats {
  public static final String SERIALIZED_NAME_DAYS_READ = "days_read";
  @SerializedName(SERIALIZED_NAME_DAYS_READ)
  private Float daysRead;

  public static final String SERIALIZED_NAME_MEAN_SCORE = "mean_score";
  @SerializedName(SERIALIZED_NAME_MEAN_SCORE)
  private Float meanScore;

  public static final String SERIALIZED_NAME_READING = "reading";
  @SerializedName(SERIALIZED_NAME_READING)
  private Integer reading;

  public static final String SERIALIZED_NAME_COMPLETED = "completed";
  @SerializedName(SERIALIZED_NAME_COMPLETED)
  private Integer completed;

  public static final String SERIALIZED_NAME_ON_HOLD = "on_hold";
  @SerializedName(SERIALIZED_NAME_ON_HOLD)
  private Integer onHold;

  public static final String SERIALIZED_NAME_DROPPED = "dropped";
  @SerializedName(SERIALIZED_NAME_DROPPED)
  private Integer dropped;

  public static final String SERIALIZED_NAME_PLAN_TO_READ = "plan_to_read";
  @SerializedName(SERIALIZED_NAME_PLAN_TO_READ)
  private Integer planToRead;

  public static final String SERIALIZED_NAME_TOTAL_ENTRIES = "total_entries";
  @SerializedName(SERIALIZED_NAME_TOTAL_ENTRIES)
  private Integer totalEntries;

  public static final String SERIALIZED_NAME_REREAD = "reread";
  @SerializedName(SERIALIZED_NAME_REREAD)
  private Integer reread;

  public static final String SERIALIZED_NAME_CHAPTERS_READ = "chapters_read";
  @SerializedName(SERIALIZED_NAME_CHAPTERS_READ)
  private Integer chaptersRead;

  public static final String SERIALIZED_NAME_VOLUMES_READ = "volumes_read";
  @SerializedName(SERIALIZED_NAME_VOLUMES_READ)
  private Integer volumesRead;

  public UsersTempDataInnerMangaStats() {
  }

  public UsersTempDataInnerMangaStats daysRead(Float daysRead) {
    
    this.daysRead = daysRead;
    return this;
  }

   /**
   * Number of days spent reading Manga
   * @return daysRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of days spent reading Manga")

  public Float getDaysRead() {
    return daysRead;
  }


  public void setDaysRead(Float daysRead) {
    this.daysRead = daysRead;
  }


  public UsersTempDataInnerMangaStats meanScore(Float meanScore) {
    
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


  public UsersTempDataInnerMangaStats reading(Integer reading) {
    
    this.reading = reading;
    return this;
  }

   /**
   * Manga Reading
   * @return reading
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manga Reading")

  public Integer getReading() {
    return reading;
  }


  public void setReading(Integer reading) {
    this.reading = reading;
  }


  public UsersTempDataInnerMangaStats completed(Integer completed) {
    
    this.completed = completed;
    return this;
  }

   /**
   * Manga Completed
   * @return completed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manga Completed")

  public Integer getCompleted() {
    return completed;
  }


  public void setCompleted(Integer completed) {
    this.completed = completed;
  }


  public UsersTempDataInnerMangaStats onHold(Integer onHold) {
    
    this.onHold = onHold;
    return this;
  }

   /**
   * Manga On-Hold
   * @return onHold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manga On-Hold")

  public Integer getOnHold() {
    return onHold;
  }


  public void setOnHold(Integer onHold) {
    this.onHold = onHold;
  }


  public UsersTempDataInnerMangaStats dropped(Integer dropped) {
    
    this.dropped = dropped;
    return this;
  }

   /**
   * Manga Dropped
   * @return dropped
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manga Dropped")

  public Integer getDropped() {
    return dropped;
  }


  public void setDropped(Integer dropped) {
    this.dropped = dropped;
  }


  public UsersTempDataInnerMangaStats planToRead(Integer planToRead) {
    
    this.planToRead = planToRead;
    return this;
  }

   /**
   * Manga Planned to Read
   * @return planToRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manga Planned to Read")

  public Integer getPlanToRead() {
    return planToRead;
  }


  public void setPlanToRead(Integer planToRead) {
    this.planToRead = planToRead;
  }


  public UsersTempDataInnerMangaStats totalEntries(Integer totalEntries) {
    
    this.totalEntries = totalEntries;
    return this;
  }

   /**
   * Total Manga entries on User list
   * @return totalEntries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total Manga entries on User list")

  public Integer getTotalEntries() {
    return totalEntries;
  }


  public void setTotalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
  }


  public UsersTempDataInnerMangaStats reread(Integer reread) {
    
    this.reread = reread;
    return this;
  }

   /**
   * Manga re-read
   * @return reread
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manga re-read")

  public Integer getReread() {
    return reread;
  }


  public void setReread(Integer reread) {
    this.reread = reread;
  }


  public UsersTempDataInnerMangaStats chaptersRead(Integer chaptersRead) {
    
    this.chaptersRead = chaptersRead;
    return this;
  }

   /**
   * Number of Manga Chapters Read
   * @return chaptersRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of Manga Chapters Read")

  public Integer getChaptersRead() {
    return chaptersRead;
  }


  public void setChaptersRead(Integer chaptersRead) {
    this.chaptersRead = chaptersRead;
  }


  public UsersTempDataInnerMangaStats volumesRead(Integer volumesRead) {
    
    this.volumesRead = volumesRead;
    return this;
  }

   /**
   * Number of Manga Volumes Read
   * @return volumesRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of Manga Volumes Read")

  public Integer getVolumesRead() {
    return volumesRead;
  }


  public void setVolumesRead(Integer volumesRead) {
    this.volumesRead = volumesRead;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersTempDataInnerMangaStats usersTempDataInnerMangaStats = (UsersTempDataInnerMangaStats) o;
    return Objects.equals(this.daysRead, usersTempDataInnerMangaStats.daysRead) &&
        Objects.equals(this.meanScore, usersTempDataInnerMangaStats.meanScore) &&
        Objects.equals(this.reading, usersTempDataInnerMangaStats.reading) &&
        Objects.equals(this.completed, usersTempDataInnerMangaStats.completed) &&
        Objects.equals(this.onHold, usersTempDataInnerMangaStats.onHold) &&
        Objects.equals(this.dropped, usersTempDataInnerMangaStats.dropped) &&
        Objects.equals(this.planToRead, usersTempDataInnerMangaStats.planToRead) &&
        Objects.equals(this.totalEntries, usersTempDataInnerMangaStats.totalEntries) &&
        Objects.equals(this.reread, usersTempDataInnerMangaStats.reread) &&
        Objects.equals(this.chaptersRead, usersTempDataInnerMangaStats.chaptersRead) &&
        Objects.equals(this.volumesRead, usersTempDataInnerMangaStats.volumesRead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysRead, meanScore, reading, completed, onHold, dropped, planToRead, totalEntries, reread, chaptersRead, volumesRead);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersTempDataInnerMangaStats {\n");
    sb.append("    daysRead: ").append(toIndentedString(daysRead)).append("\n");
    sb.append("    meanScore: ").append(toIndentedString(meanScore)).append("\n");
    sb.append("    reading: ").append(toIndentedString(reading)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    onHold: ").append(toIndentedString(onHold)).append("\n");
    sb.append("    dropped: ").append(toIndentedString(dropped)).append("\n");
    sb.append("    planToRead: ").append(toIndentedString(planToRead)).append("\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
    sb.append("    reread: ").append(toIndentedString(reread)).append("\n");
    sb.append("    chaptersRead: ").append(toIndentedString(chaptersRead)).append("\n");
    sb.append("    volumesRead: ").append(toIndentedString(volumesRead)).append("\n");
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
    openapiFields.add("days_read");
    openapiFields.add("mean_score");
    openapiFields.add("reading");
    openapiFields.add("completed");
    openapiFields.add("on_hold");
    openapiFields.add("dropped");
    openapiFields.add("plan_to_read");
    openapiFields.add("total_entries");
    openapiFields.add("reread");
    openapiFields.add("chapters_read");
    openapiFields.add("volumes_read");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersTempDataInnerMangaStats
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UsersTempDataInnerMangaStats.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsersTempDataInnerMangaStats is not found in the empty JSON string", UsersTempDataInnerMangaStats.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UsersTempDataInnerMangaStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UsersTempDataInnerMangaStats` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersTempDataInnerMangaStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersTempDataInnerMangaStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersTempDataInnerMangaStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersTempDataInnerMangaStats.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersTempDataInnerMangaStats>() {
           @Override
           public void write(JsonWriter out, UsersTempDataInnerMangaStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UsersTempDataInnerMangaStats read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UsersTempDataInnerMangaStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersTempDataInnerMangaStats
  * @throws IOException if the JSON string is invalid with respect to UsersTempDataInnerMangaStats
  */
  public static UsersTempDataInnerMangaStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersTempDataInnerMangaStats.class);
  }

 /**
  * Convert an instance of UsersTempDataInnerMangaStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

