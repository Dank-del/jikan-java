

# Anime

Anime Resource

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**malId** | **Integer** | MyAnimeList ID |  [optional] |
|**url** | **String** | MyAnimeList URL |  [optional] |
|**images** | [**AnimeImages**](AnimeImages.md) |  |  [optional] |
|**trailer** | [**TrailerBase**](TrailerBase.md) |  |  [optional] |
|**approved** | **Boolean** | Whether the entry is pending approval on MAL or not |  [optional] |
|**titles** | [**List&lt;Title&gt;**](Title.md) | All titles |  [optional] |
|**title** | **String** | Title |  [optional] |
|**titleEnglish** | **String** | English Title |  [optional] |
|**titleJapanese** | **String** | Japanese Title |  [optional] |
|**titleSynonyms** | **List&lt;String&gt;** | Other Titles |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Anime Type |  [optional] |
|**source** | **String** | Original Material/Source adapted from |  [optional] |
|**episodes** | **Integer** | Episode count |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Airing status |  [optional] |
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



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TV | &quot;TV&quot; |
| OVA | &quot;OVA&quot; |
| MOVIE | &quot;Movie&quot; |
| SPECIAL | &quot;Special&quot; |
| ONA | &quot;ONA&quot; |
| MUSIC | &quot;Music&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| FINISHED_AIRING | &quot;Finished Airing&quot; |
| CURRENTLY_AIRING | &quot;Currently Airing&quot; |
| NOT_YET_AIRED | &quot;Not yet aired&quot; |



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



