/**
 * Datyar REST APIs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.models

import io.swagger.client.models.Author
import io.swagger.client.models.CategoryDto
import io.swagger.client.models.ContentRowDto
import io.swagger.client.models.GetContentDto
import io.swagger.client.models.TagDto

/**
 * 
 * @param author 
 * @param averageRate 
 * @param banner 
 * @param categories 
 * @param catsId 
 * @param children 
 * @param content 
 * @param contentType 
 * @param createdDate 
 * @param featured 
 * @param highlight 
 * @param id 
 * @param language 
 * @param lastModifiedDate 
 * @param lat 
 * @param liked 
 * @param lng 
 * @param metaData 
 * @param publishDate 
 * @param publishDateIso 
 * @param rateValue 
 * @param ratesCount 
 * @param ratesSum 
 * @param status 
 * @param studyDuration 
 * @param summary 
 * @param tags 
 * @param tagsId 
 * @param title 
 * @param totalVisitCount 
 * @param type 
 * @param userRate 
 * @param videoFile 
 * @param visitedCount 
 * @param voteCount 
 */
data class GetContentDto (

    val author: Author? = null,
    val averageRate: kotlin.Float? = null,
    val banner: ContentRowDto? = null,
    val categories: kotlin.Array<CategoryDto>? = null,
    val catsId: kotlin.Array<kotlin.String>? = null,
    val children: kotlin.Array<GetContentDto>? = null,
    val content: kotlin.Array<ContentRowDto>? = null,
    val contentType: GetContentDto.ContentType? = null,
    val createdDate: kotlin.String? = null,
    val featured: kotlin.Boolean? = null,
    val highlight: kotlin.Boolean? = null,
    val id: kotlin.String? = null,
    val language: GetContentDto.Language? = null,
    val lastModifiedDate: kotlin.String? = null,
    val lat: kotlin.Double? = null,
    val liked: kotlin.Boolean? = null,
    val lng: kotlin.Double? = null,
    val metaData: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    val publishDate: kotlin.Long? = null,
    val publishDateIso: kotlin.String? = null,
    val rateValue: kotlin.Int? = null,
    val ratesCount: kotlin.Int? = null,
    val ratesSum: kotlin.Int? = null,
    val status: GetContentDto.Status? = null,
    val studyDuration: kotlin.Int? = null,
    val summary: ContentRowDto? = null,
    val tags: kotlin.Array<TagDto>? = null,
    val tagsId: kotlin.Array<kotlin.String>? = null,
    val title: ContentRowDto? = null,
    val totalVisitCount: kotlin.Int? = null,
    val type: kotlin.String? = null,
    val userRate: kotlin.Int? = null,
    val videoFile: ContentRowDto? = null,
    val visitedCount: kotlin.Int? = null,
    val voteCount: kotlin.Long? = null
) {
    /**
    * 
    * Values: IMAGE,VIDEO
    */
    enum class ContentType(val value: kotlin.String){
        IMAGE("IMAGE"),
        VIDEO("VIDEO");
    }
    /**
    * 
    * Values: EN,FA,FR
    */
    enum class Language(val value: kotlin.String){
        EN("EN"),
        FA("FA"),
        FR("FR");
    }
    /**
    * 
    * Values: DRAFT,PUBLISHED
    */
    enum class Status(val value: kotlin.String){
        DRAFT("DRAFT"),
        PUBLISHED("PUBLISHED");
    }
}