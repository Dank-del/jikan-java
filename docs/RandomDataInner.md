

# RandomDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**malId** | **Integer** | MyAnimeList ID |  [optional] |
|**url** | **String** | MyAnimeList URL |  [optional] |
|**images** | [**PeopleImages**](PeopleImages.md) |  |  [optional] |
|**trailer** | [**TrailerBase**](TrailerBase.md) |  |  [optional] |
|**approved** | **Boolean** | Whether the entry is pending approval on MAL or not |  [optional] |
|**titles** | [**List&lt;Title&gt;**](Title.md) | All Titles |  [optional] |
|**title** | **String** | Title |  [optional] |
|**titleEnglish** | **String** | English Title |  [optional] |
|**titleJapanese** | **String** | Japanese Title |  [optional] |
|**titleSynonyms** | **List&lt;String&gt;** | Other Titles |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Manga Type |  [optional] |
|**source** | **String** | Original Material/Source adapted from |  [optional] |
|**episodes** | **Integer** | Episode count |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Publishing status |  [optional] |
|**airing** | **Boolean** | Airing boolean |  [optional] |
|**aired** | [**Daterange**](Daterange.md) |  |  [optional] |
|**duration** | **String** | Parsed raw duration |  [optional] |
|**rating** | [**RatingEnum**](#RatingEnum) | Anime audience rating |  [optional] |
|**score** | **Float** | Score |  [optional] |
|**scoredBy** | **Integer** | Number of users |  [optional] |
|**rank** | **Integer** | Ranking |  [optional] |
|**popularity** | **Integer** | Popularity |  [optional] |
|**members** | **Integer** | Number of users who have added this entry to their list |  [optional] |
|**favorites** | **Integer** | Number of users who have favorited this entry |  [optional] |
|**synopsis** | **String** | Synopsis |  [optional] |
|**background** | **String** | Background |  [optional] |
|**season** | [**SeasonEnum**](#SeasonEnum) | Season |  [optional] |
|**year** | **Integer** | Year |  [optional] |
|**broadcast** | [**Broadcast**](Broadcast.md) |  |  [optional] |
|**producers** | [**List&lt;MalUrl&gt;**](MalUrl.md) |  |  [optional] |
|**licensors** | [**List&lt;MalUrl&gt;**](MalUrl.md) |  |  [optional] |
|**studios** | [**List&lt;MalUrl&gt;**](MalUrl.md) |  |  [optional] |
|**genres** | [**List&lt;MalUrl&gt;**](MalUrl.md) |  |  [optional] |
|**explicitGenres** | [**List&lt;MalUrl&gt;**](MalUrl.md) |  |  [optional] |
|**themes** | [**List&lt;MalUrl&gt;**](MalUrl.md) |  |  [optional] |
|**demographics** | [**List&lt;MalUrl&gt;**](MalUrl.md) |  |  [optional] |
|**chapters** | **Integer** | Chapter count |  [optional] |
|**volumes** | **Integer** | Volume count |  [optional] |
|**publishing** | **Boolean** | Publishing boolean |  [optional] |
|**published** | [**Daterange**](Daterange.md) |  |  [optional] |
|**authors** | [**List&lt;MalUrl&gt;**](MalUrl.md) |  |  [optional] |
|**serializations** | [**List&lt;MalUrl&gt;**](MalUrl.md) |  |  [optional] |
|**name** | **String** | Name |  [optional] |
|**nameKanji** | **String** | Name |  [optional] |
|**nicknames** | **List&lt;String&gt;** | Other Names |  [optional] |
|**about** | **String** | Biography |  [optional] |
|**websiteUrl** | **String** | Person&#39;s website URL |  [optional] |
|**givenName** | **String** | Given Name |  [optional] |
|**familyName** | **String** | Family Name |  [optional] |
|**alternateNames** | **List&lt;String&gt;** | Other Names |  [optional] |
|**birthday** | **String** | Birthday Date ISO8601 |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MANGA | &quot;Manga&quot; |
| NOVEL | &quot;Novel&quot; |
| LIGHT_NOVEL | &quot;Light Novel&quot; |
| ONE_SHOT | &quot;One-shot&quot; |
| DOUJINSHI | &quot;Doujinshi&quot; |
| MANHUA | &quot;Manhua&quot; |
| MANHWA | &quot;Manhwa&quot; |
| OEL | &quot;OEL&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| FINISHED | &quot;Finished&quot; |
| PUBLISHING | &quot;Publishing&quot; |
| ON_HIATUS | &quot;On Hiatus&quot; |
| DISCONTINUED | &quot;Discontinued&quot; |
| NOT_YET_PUBLISHED | &quot;Not yet published&quot; |



## Enum: RatingEnum

| Name | Value |
|---- | -----|
| G_ALL_AGES | &quot;G - All Ages&quot; |
| PG_CHILDREN | &quot;PG - Children&quot; |
| PG_13_TEENS_13_OR_OLDER | &quot;PG-13 - Teens 13 or older&quot; |
| R_17_VIOLENCE_PROFANITY_ | &quot;R - 17+ (violence &amp; profanity)&quot; |
| R_MILD_NUDITY | &quot;R+ - Mild Nudity&quot; |
| RX_HENTAI | &quot;Rx - Hentai&quot; |



## Enum: SeasonEnum

| Name | Value |
|---- | -----|
| SUMMER | &quot;summer&quot; |
| WINTER | &quot;winter&quot; |
| SPRING | &quot;spring&quot; |
| FALL | &quot;fall&quot; |



