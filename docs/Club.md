

# Club

Club Resource

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**malId** | **Integer** | MyAnimeList ID |  [optional] |
|**name** | **String** | Club name |  [optional] |
|**url** | **String** | Club URL |  [optional] |
|**images** | [**CommonImages**](CommonImages.md) |  |  [optional] |
|**members** | **Integer** | Number of club members |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) | Club Category |  [optional] |
|**created** | **String** | Date Created ISO8601 |  [optional] |
|**access** | [**AccessEnum**](#AccessEnum) | Club access |  [optional] |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| ACTORS_ARTISTS | &quot;actors &amp; artists&quot; |
| ANIME | &quot;anime&quot; |
| CHARACTERS | &quot;characters&quot; |
| CITIES_NEIGHBORHOODS | &quot;cities &amp; neighborhoods&quot; |
| COMPANIES | &quot;companies&quot; |
| CONVENTIONS | &quot;conventions&quot; |
| GAMES | &quot;games&quot; |
| JAPAN | &quot;japan&quot; |
| MANGA | &quot;manga&quot; |
| MUSIC | &quot;music&quot; |
| OTHERS | &quot;others&quot; |
| SCHOOLS | &quot;schools&quot; |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;public&quot; |
| PRIVATE | &quot;private&quot; |
| SECRET | &quot;secret&quot; |



