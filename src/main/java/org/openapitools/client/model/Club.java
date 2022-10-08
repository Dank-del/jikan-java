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
import org.openapitools.client.model.CommonImages;

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
 * Club Resource
 */
@ApiModel(description = "Club Resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-08T15:34:51.366952+05:30[Asia/Calcutta]")
public class Club {
  public static final String SERIALIZED_NAME_MAL_ID = "mal_id";
  @SerializedName(SERIALIZED_NAME_MAL_ID)
  private Integer malId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private CommonImages images;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private Integer members;

  /**
   * Club Category
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    ACTORS_ARTISTS("actors & artists"),
    
    ANIME("anime"),
    
    CHARACTERS("characters"),
    
    CITIES_NEIGHBORHOODS("cities & neighborhoods"),
    
    COMPANIES("companies"),
    
    CONVENTIONS("conventions"),
    
    GAMES("games"),
    
    JAPAN("japan"),
    
    MANGA("manga"),
    
    MUSIC("music"),
    
    OTHERS("others"),
    
    SCHOOLS("schools");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private CategoryEnum category;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  /**
   * Club access
   */
  @JsonAdapter(AccessEnum.Adapter.class)
  public enum AccessEnum {
    PUBLIC("public"),
    
    PRIVATE("private"),
    
    SECRET("secret");

    private String value;

    AccessEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessEnum fromValue(String value) {
      for (AccessEnum b : AccessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccessEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccessEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCESS = "access";
  @SerializedName(SERIALIZED_NAME_ACCESS)
  private AccessEnum access;

  public Club() {
  }

  public Club malId(Integer malId) {
    
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


  public Club name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Club name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Club name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Club url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Club URL
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Club URL")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Club images(CommonImages images) {
    
    this.images = images;
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonImages getImages() {
    return images;
  }


  public void setImages(CommonImages images) {
    this.images = images;
  }


  public Club members(Integer members) {
    
    this.members = members;
    return this;
  }

   /**
   * Number of club members
   * @return members
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of club members")

  public Integer getMembers() {
    return members;
  }


  public void setMembers(Integer members) {
    this.members = members;
  }


  public Club category(CategoryEnum category) {
    
    this.category = category;
    return this;
  }

   /**
   * Club Category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Club Category")

  public CategoryEnum getCategory() {
    return category;
  }


  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  public Club created(String created) {
    
    this.created = created;
    return this;
  }

   /**
   * Date Created ISO8601
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date Created ISO8601")

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    this.created = created;
  }


  public Club access(AccessEnum access) {
    
    this.access = access;
    return this;
  }

   /**
   * Club access
   * @return access
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Club access")

  public AccessEnum getAccess() {
    return access;
  }


  public void setAccess(AccessEnum access) {
    this.access = access;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Club club = (Club) o;
    return Objects.equals(this.malId, club.malId) &&
        Objects.equals(this.name, club.name) &&
        Objects.equals(this.url, club.url) &&
        Objects.equals(this.images, club.images) &&
        Objects.equals(this.members, club.members) &&
        Objects.equals(this.category, club.category) &&
        Objects.equals(this.created, club.created) &&
        Objects.equals(this.access, club.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(malId, name, url, images, members, category, created, access);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Club {\n");
    sb.append("    malId: ").append(toIndentedString(malId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("url");
    openapiFields.add("images");
    openapiFields.add("members");
    openapiFields.add("category");
    openapiFields.add("created");
    openapiFields.add("access");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Club
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Club.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Club is not found in the empty JSON string", Club.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Club.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Club` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the optional field `images`
      if (jsonObj.get("images") != null && !jsonObj.get("images").isJsonNull()) {
        CommonImages.validateJsonObject(jsonObj.getAsJsonObject("images"));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("created") != null && !jsonObj.get("created").isJsonNull()) && !jsonObj.get("created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created").toString()));
      }
      if ((jsonObj.get("access") != null && !jsonObj.get("access").isJsonNull()) && !jsonObj.get("access").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Club.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Club' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Club> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Club.class));

       return (TypeAdapter<T>) new TypeAdapter<Club>() {
           @Override
           public void write(JsonWriter out, Club value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Club read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Club given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Club
  * @throws IOException if the JSON string is invalid with respect to Club
  */
  public static Club fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Club.class);
  }

 /**
  * Convert an instance of Club to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

