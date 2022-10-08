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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.PeopleImages;
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
 * Person Resource
 */
@ApiModel(description = "Person Resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-08T15:18:52.497326700+05:30[Asia/Calcutta]")
public class Person {
  public static final String SERIALIZED_NAME_MAL_ID = "mal_id";
  @SerializedName(SERIALIZED_NAME_MAL_ID)
  private Integer malId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_WEBSITE_URL = "website_url";
  @SerializedName(SERIALIZED_NAME_WEBSITE_URL)
  private String websiteUrl;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private PeopleImages images;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_GIVEN_NAME = "given_name";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "family_name";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;

  public static final String SERIALIZED_NAME_ALTERNATE_NAMES = "alternate_names";
  @SerializedName(SERIALIZED_NAME_ALTERNATE_NAMES)
  private List<String> alternateNames = null;

  public static final String SERIALIZED_NAME_BIRTHDAY = "birthday";
  @SerializedName(SERIALIZED_NAME_BIRTHDAY)
  private String birthday;

  public static final String SERIALIZED_NAME_FAVORITES = "favorites";
  @SerializedName(SERIALIZED_NAME_FAVORITES)
  private Integer favorites;

  public static final String SERIALIZED_NAME_ABOUT = "about";
  @SerializedName(SERIALIZED_NAME_ABOUT)
  private String about;

  public Person() {
  }

  public Person malId(Integer malId) {
    
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


  public Person url(String url) {
    
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


  public Person websiteUrl(String websiteUrl) {
    
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * Person&#39;s website URL
   * @return websiteUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Person's website URL")

  public String getWebsiteUrl() {
    return websiteUrl;
  }


  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }


  public Person images(PeopleImages images) {
    
    this.images = images;
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PeopleImages getImages() {
    return images;
  }


  public void setImages(PeopleImages images) {
    this.images = images;
  }


  public Person name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Person givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

   /**
   * Given Name
   * @return givenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Given Name")

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public Person familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

   /**
   * Family Name
   * @return familyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Family Name")

  public String getFamilyName() {
    return familyName;
  }


  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public Person alternateNames(List<String> alternateNames) {
    
    this.alternateNames = alternateNames;
    return this;
  }

  public Person addAlternateNamesItem(String alternateNamesItem) {
    if (this.alternateNames == null) {
      this.alternateNames = new ArrayList<>();
    }
    this.alternateNames.add(alternateNamesItem);
    return this;
  }

   /**
   * Other Names
   * @return alternateNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Other Names")

  public List<String> getAlternateNames() {
    return alternateNames;
  }


  public void setAlternateNames(List<String> alternateNames) {
    this.alternateNames = alternateNames;
  }


  public Person birthday(String birthday) {
    
    this.birthday = birthday;
    return this;
  }

   /**
   * Birthday Date ISO8601
   * @return birthday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Birthday Date ISO8601")

  public String getBirthday() {
    return birthday;
  }


  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }


  public Person favorites(Integer favorites) {
    
    this.favorites = favorites;
    return this;
  }

   /**
   * Number of users who have favorited this entry
   * @return favorites
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of users who have favorited this entry")

  public Integer getFavorites() {
    return favorites;
  }


  public void setFavorites(Integer favorites) {
    this.favorites = favorites;
  }


  public Person about(String about) {
    
    this.about = about;
    return this;
  }

   /**
   * Biography
   * @return about
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Biography")

  public String getAbout() {
    return about;
  }


  public void setAbout(String about) {
    this.about = about;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.malId, person.malId) &&
        Objects.equals(this.url, person.url) &&
        Objects.equals(this.websiteUrl, person.websiteUrl) &&
        Objects.equals(this.images, person.images) &&
        Objects.equals(this.name, person.name) &&
        Objects.equals(this.givenName, person.givenName) &&
        Objects.equals(this.familyName, person.familyName) &&
        Objects.equals(this.alternateNames, person.alternateNames) &&
        Objects.equals(this.birthday, person.birthday) &&
        Objects.equals(this.favorites, person.favorites) &&
        Objects.equals(this.about, person.about);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(malId, url, websiteUrl, images, name, givenName, familyName, alternateNames, birthday, favorites, about);
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
    sb.append("class Person {\n");
    sb.append("    malId: ").append(toIndentedString(malId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    alternateNames: ").append(toIndentedString(alternateNames)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    favorites: ").append(toIndentedString(favorites)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
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
    openapiFields.add("website_url");
    openapiFields.add("images");
    openapiFields.add("name");
    openapiFields.add("given_name");
    openapiFields.add("family_name");
    openapiFields.add("alternate_names");
    openapiFields.add("birthday");
    openapiFields.add("favorites");
    openapiFields.add("about");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Person
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Person.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Person is not found in the empty JSON string", Person.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Person.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Person` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("website_url") != null && !jsonObj.get("website_url").isJsonNull()) && !jsonObj.get("website_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website_url").toString()));
      }
      // validate the optional field `images`
      if (jsonObj.get("images") != null && !jsonObj.get("images").isJsonNull()) {
        PeopleImages.validateJsonObject(jsonObj.getAsJsonObject("images"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("given_name") != null && !jsonObj.get("given_name").isJsonNull()) && !jsonObj.get("given_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `given_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("given_name").toString()));
      }
      if ((jsonObj.get("family_name") != null && !jsonObj.get("family_name").isJsonNull()) && !jsonObj.get("family_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `family_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("family_name").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("alternate_names") != null && !jsonObj.get("alternate_names").isJsonNull()) && !jsonObj.get("alternate_names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `alternate_names` to be an array in the JSON string but got `%s`", jsonObj.get("alternate_names").toString()));
      }
      if ((jsonObj.get("birthday") != null && !jsonObj.get("birthday").isJsonNull()) && !jsonObj.get("birthday").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `birthday` to be a primitive type in the JSON string but got `%s`", jsonObj.get("birthday").toString()));
      }
      if ((jsonObj.get("about") != null && !jsonObj.get("about").isJsonNull()) && !jsonObj.get("about").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `about` to be a primitive type in the JSON string but got `%s`", jsonObj.get("about").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Person.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Person' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Person> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Person.class));

       return (TypeAdapter<T>) new TypeAdapter<Person>() {
           @Override
           public void write(JsonWriter out, Person value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Person read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Person given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Person
  * @throws IOException if the JSON string is invalid with respect to Person
  */
  public static Person fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Person.class);
  }

 /**
  * Convert an instance of Person to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
