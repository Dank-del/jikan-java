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
import org.openapitools.client.model.AnimeMeta;
import org.openapitools.client.model.GetTopReviews200ResponseDataAllOfDataInnerAnyOf;
import org.openapitools.client.model.GetTopReviews200ResponseDataAllOfDataInnerAnyOf1;
import org.openapitools.client.model.MangaMeta;
import org.openapitools.client.model.MangaReviewScores;
import org.openapitools.client.model.UserMeta;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-08T15:34:51.366952+05:30[Asia/Calcutta]")
public class GetTopReviews200ResponseDataAllOfDataInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetTopReviews200ResponseDataAllOfDataInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetTopReviews200ResponseDataAllOfDataInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetTopReviews200ResponseDataAllOfDataInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetTopReviews200ResponseDataAllOfDataInnerAnyOf> adapterGetTopReviews200ResponseDataAllOfDataInnerAnyOf = gson.getDelegateAdapter(this, TypeToken.get(GetTopReviews200ResponseDataAllOfDataInnerAnyOf.class));
            final TypeAdapter<GetTopReviews200ResponseDataAllOfDataInnerAnyOf1> adapterGetTopReviews200ResponseDataAllOfDataInnerAnyOf1 = gson.getDelegateAdapter(this, TypeToken.get(GetTopReviews200ResponseDataAllOfDataInnerAnyOf1.class));

            return (TypeAdapter<T>) new TypeAdapter<GetTopReviews200ResponseDataAllOfDataInner>() {
                @Override
                public void write(JsonWriter out, GetTopReviews200ResponseDataAllOfDataInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `GetTopReviews200ResponseDataAllOfDataInnerAnyOf`
                    if (value.getActualInstance() instanceof GetTopReviews200ResponseDataAllOfDataInnerAnyOf) {
                        JsonObject obj = adapterGetTopReviews200ResponseDataAllOfDataInnerAnyOf.toJsonTree((GetTopReviews200ResponseDataAllOfDataInnerAnyOf)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetTopReviews200ResponseDataAllOfDataInnerAnyOf1`
                    if (value.getActualInstance() instanceof GetTopReviews200ResponseDataAllOfDataInnerAnyOf1) {
                        JsonObject obj = adapterGetTopReviews200ResponseDataAllOfDataInnerAnyOf1.toJsonTree((GetTopReviews200ResponseDataAllOfDataInnerAnyOf1)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: GetTopReviews200ResponseDataAllOfDataInnerAnyOf, GetTopReviews200ResponseDataAllOfDataInnerAnyOf1");
                }

                @Override
                public GetTopReviews200ResponseDataAllOfDataInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize GetTopReviews200ResponseDataAllOfDataInnerAnyOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetTopReviews200ResponseDataAllOfDataInnerAnyOf.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'GetTopReviews200ResponseDataAllOfDataInnerAnyOf'");
                        GetTopReviews200ResponseDataAllOfDataInner ret = new GetTopReviews200ResponseDataAllOfDataInner();
                        ret.setActualInstance(adapterGetTopReviews200ResponseDataAllOfDataInnerAnyOf.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'GetTopReviews200ResponseDataAllOfDataInnerAnyOf'", e);
                    }

                    // deserialize GetTopReviews200ResponseDataAllOfDataInnerAnyOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetTopReviews200ResponseDataAllOfDataInnerAnyOf1.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'GetTopReviews200ResponseDataAllOfDataInnerAnyOf1'");
                        GetTopReviews200ResponseDataAllOfDataInner ret = new GetTopReviews200ResponseDataAllOfDataInner();
                        ret.setActualInstance(adapterGetTopReviews200ResponseDataAllOfDataInnerAnyOf1.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'GetTopReviews200ResponseDataAllOfDataInnerAnyOf1'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for GetTopReviews200ResponseDataAllOfDataInner: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetTopReviews200ResponseDataAllOfDataInner() {
        super("anyOf", Boolean.FALSE);
    }

    public GetTopReviews200ResponseDataAllOfDataInner(GetTopReviews200ResponseDataAllOfDataInnerAnyOf o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetTopReviews200ResponseDataAllOfDataInner(GetTopReviews200ResponseDataAllOfDataInnerAnyOf1 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("GetTopReviews200ResponseDataAllOfDataInnerAnyOf", new GenericType<GetTopReviews200ResponseDataAllOfDataInnerAnyOf>() {
        });
        schemas.put("GetTopReviews200ResponseDataAllOfDataInnerAnyOf1", new GenericType<GetTopReviews200ResponseDataAllOfDataInnerAnyOf1>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetTopReviews200ResponseDataAllOfDataInner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * GetTopReviews200ResponseDataAllOfDataInnerAnyOf, GetTopReviews200ResponseDataAllOfDataInnerAnyOf1
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof GetTopReviews200ResponseDataAllOfDataInnerAnyOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetTopReviews200ResponseDataAllOfDataInnerAnyOf1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be GetTopReviews200ResponseDataAllOfDataInnerAnyOf, GetTopReviews200ResponseDataAllOfDataInnerAnyOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * GetTopReviews200ResponseDataAllOfDataInnerAnyOf, GetTopReviews200ResponseDataAllOfDataInnerAnyOf1
     *
     * @return The actual instance (GetTopReviews200ResponseDataAllOfDataInnerAnyOf, GetTopReviews200ResponseDataAllOfDataInnerAnyOf1)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetTopReviews200ResponseDataAllOfDataInnerAnyOf`. If the actual instance is not `GetTopReviews200ResponseDataAllOfDataInnerAnyOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetTopReviews200ResponseDataAllOfDataInnerAnyOf`
     * @throws ClassCastException if the instance is not `GetTopReviews200ResponseDataAllOfDataInnerAnyOf`
     */
    public GetTopReviews200ResponseDataAllOfDataInnerAnyOf getGetTopReviews200ResponseDataAllOfDataInnerAnyOf() throws ClassCastException {
        return (GetTopReviews200ResponseDataAllOfDataInnerAnyOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetTopReviews200ResponseDataAllOfDataInnerAnyOf1`. If the actual instance is not `GetTopReviews200ResponseDataAllOfDataInnerAnyOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetTopReviews200ResponseDataAllOfDataInnerAnyOf1`
     * @throws ClassCastException if the instance is not `GetTopReviews200ResponseDataAllOfDataInnerAnyOf1`
     */
    public GetTopReviews200ResponseDataAllOfDataInnerAnyOf1 getGetTopReviews200ResponseDataAllOfDataInnerAnyOf1() throws ClassCastException {
        return (GetTopReviews200ResponseDataAllOfDataInnerAnyOf1)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetTopReviews200ResponseDataAllOfDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with GetTopReviews200ResponseDataAllOfDataInnerAnyOf
    try {
      GetTopReviews200ResponseDataAllOfDataInnerAnyOf.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with GetTopReviews200ResponseDataAllOfDataInnerAnyOf1
    try {
      GetTopReviews200ResponseDataAllOfDataInnerAnyOf1.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for GetTopReviews200ResponseDataAllOfDataInner with anyOf schemas: GetTopReviews200ResponseDataAllOfDataInnerAnyOf, GetTopReviews200ResponseDataAllOfDataInnerAnyOf1. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of GetTopReviews200ResponseDataAllOfDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTopReviews200ResponseDataAllOfDataInner
  * @throws IOException if the JSON string is invalid with respect to GetTopReviews200ResponseDataAllOfDataInner
  */
  public static GetTopReviews200ResponseDataAllOfDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTopReviews200ResponseDataAllOfDataInner.class);
  }

 /**
  * Convert an instance of GetTopReviews200ResponseDataAllOfDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

