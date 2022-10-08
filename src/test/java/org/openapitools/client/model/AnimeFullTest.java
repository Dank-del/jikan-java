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
import org.openapitools.client.model.AnimeFullExternalInner;
import org.openapitools.client.model.AnimeFullRelationsInner;
import org.openapitools.client.model.AnimeFullTheme;
import org.openapitools.client.model.AnimeImages;
import org.openapitools.client.model.Broadcast;
import org.openapitools.client.model.Daterange;
import org.openapitools.client.model.MalUrl;
import org.openapitools.client.model.Title;
import org.openapitools.client.model.TrailerBase;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for AnimeFull
 */
public class AnimeFullTest {
    private final AnimeFull model = new AnimeFull();

    /**
     * Model tests for AnimeFull
     */
    @Test
    public void testAnimeFull() {
        // TODO: test AnimeFull
    }

    /**
     * Test the property 'malId'
     */
    @Test
    public void malIdTest() {
        // TODO: test malId
    }

    /**
     * Test the property 'url'
     */
    @Test
    public void urlTest() {
        // TODO: test url
    }

    /**
     * Test the property 'images'
     */
    @Test
    public void imagesTest() {
        // TODO: test images
    }

    /**
     * Test the property 'trailer'
     */
    @Test
    public void trailerTest() {
        // TODO: test trailer
    }

    /**
     * Test the property 'approved'
     */
    @Test
    public void approvedTest() {
        // TODO: test approved
    }

    /**
     * Test the property 'titles'
     */
    @Test
    public void titlesTest() {
        // TODO: test titles
    }

    /**
     * Test the property 'title'
     */
    @Test
    public void titleTest() {
        // TODO: test title
    }

    /**
     * Test the property 'titleEnglish'
     */
    @Test
    public void titleEnglishTest() {
        // TODO: test titleEnglish
    }

    /**
     * Test the property 'titleJapanese'
     */
    @Test
    public void titleJapaneseTest() {
        // TODO: test titleJapanese
    }

    /**
     * Test the property 'titleSynonyms'
     */
    @Test
    public void titleSynonymsTest() {
        // TODO: test titleSynonyms
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'source'
     */
    @Test
    public void sourceTest() {
        // TODO: test source
    }

    /**
     * Test the property 'episodes'
     */
    @Test
    public void episodesTest() {
        // TODO: test episodes
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'airing'
     */
    @Test
    public void airingTest() {
        // TODO: test airing
    }

    /**
     * Test the property 'aired'
     */
    @Test
    public void airedTest() {
        // TODO: test aired
    }

    /**
     * Test the property 'duration'
     */
    @Test
    public void durationTest() {
        // TODO: test duration
    }

    /**
     * Test the property 'rating'
     */
    @Test
    public void ratingTest() {
        // TODO: test rating
    }

    /**
     * Test the property 'score'
     */
    @Test
    public void scoreTest() {
        // TODO: test score
    }

    /**
     * Test the property 'scoredBy'
     */
    @Test
    public void scoredByTest() {
        // TODO: test scoredBy
    }

    /**
     * Test the property 'rank'
     */
    @Test
    public void rankTest() {
        // TODO: test rank
    }

    /**
     * Test the property 'popularity'
     */
    @Test
    public void popularityTest() {
        // TODO: test popularity
    }

    /**
     * Test the property 'members'
     */
    @Test
    public void membersTest() {
        // TODO: test members
    }

    /**
     * Test the property 'favorites'
     */
    @Test
    public void favoritesTest() {
        // TODO: test favorites
    }

    /**
     * Test the property 'synopsis'
     */
    @Test
    public void synopsisTest() {
        // TODO: test synopsis
    }

    /**
     * Test the property 'background'
     */
    @Test
    public void backgroundTest() {
        // TODO: test background
    }

    /**
     * Test the property 'season'
     */
    @Test
    public void seasonTest() {
        // TODO: test season
    }

    /**
     * Test the property 'year'
     */
    @Test
    public void yearTest() {
        // TODO: test year
    }

    /**
     * Test the property 'broadcast'
     */
    @Test
    public void broadcastTest() {
        // TODO: test broadcast
    }

    /**
     * Test the property 'producers'
     */
    @Test
    public void producersTest() {
        // TODO: test producers
    }

    /**
     * Test the property 'licensors'
     */
    @Test
    public void licensorsTest() {
        // TODO: test licensors
    }

    /**
     * Test the property 'studios'
     */
    @Test
    public void studiosTest() {
        // TODO: test studios
    }

    /**
     * Test the property 'genres'
     */
    @Test
    public void genresTest() {
        // TODO: test genres
    }

    /**
     * Test the property 'explicitGenres'
     */
    @Test
    public void explicitGenresTest() {
        // TODO: test explicitGenres
    }

    /**
     * Test the property 'themes'
     */
    @Test
    public void themesTest() {
        // TODO: test themes
    }

    /**
     * Test the property 'demographics'
     */
    @Test
    public void demographicsTest() {
        // TODO: test demographics
    }

    /**
     * Test the property 'relations'
     */
    @Test
    public void relationsTest() {
        // TODO: test relations
    }

    /**
     * Test the property 'theme'
     */
    @Test
    public void themeTest() {
        // TODO: test theme
    }

    /**
     * Test the property 'external'
     */
    @Test
    public void externalTest() {
        // TODO: test external
    }

    /**
     * Test the property 'streaming'
     */
    @Test
    public void streamingTest() {
        // TODO: test streaming
    }

}
