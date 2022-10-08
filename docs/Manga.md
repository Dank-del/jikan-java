

# Manga

Manga Resource

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**malId** | **Integer** | MyAnimeList ID |  [optional] |
|**url** | **String** | MyAnimeList URL |  [optional] |
|**images** | [**MangaImages**](MangaImages.md) |  |  [optional] |
|**approved** | **Boolean** | Whether the entry is pending approval on MAL or not |  [optional] |
|**titles** | [**List&lt;Title&gt;**](Title.md) | All Titles |  [optional] |
|**title** | **String** | Title |  [optional] |
|**titleEnglish** | **String** | English Title |  [optional] |
|**titleJapanese** | **String** | Japanese Title |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Manga Type |  [optional] |
|**chapters** | **Integer** | Chapter count |  [optional] |
|**volumes** | **Integer** | Volume count |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Publishing status |  [optional] |
|**publishing** | **Boolean** | Publishing boolean |  [optional] |
|**published** | [**Daterange**](Daterange.md) |  |  [optional] |
|**score** | **Float** | Score |  [optional] |
|**scoredBy** | **Integer** | Number of users |  [optional] |
|**rank** | **Integer** | Ranking |  [optional] |
|**popularity** | **Integer** | Popularity |  [optional] |
|**members** | **Integer** | Number of users who have added this entry to their list |  [optional] |
|**favorites** | **Integer** | Number of users who have favorited this entry |  [optional] |
|**synopsis** | **String** | Synopsis |  [optional] |
|**background** | **String** | Background |  [optional] |
|**authors** | [**List&lt;MalUrl&gt;**](MalUrl.md) |  |  [optional] |
|**serializations** | [**List&lt;MalUrl&gt;**](MalUrl.md) |  |  [optional] |
|**genres** | [**List&lt;MalUrl&gt;**](MalUrl.md) |  |  [optional] |
|**explicitGenres** | [**List&lt;MalUrl&gt;**](MalUrl.md) |  |  [optional] |
|**themes** | [**List&lt;MalUrl&gt;**](MalUrl.md) |  |  [optional] |
|**demographics** | [**List&lt;MalUrl&gt;**](MalUrl.md) |  |  [optional] |



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



