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

import io.swagger.client.models.GetLocationDto
import io.swagger.client.models.GetLocationPropertyOptionDto
import io.swagger.client.models.LocationAddressDto
import io.swagger.client.models.LocationCategoryDto
import io.swagger.client.models.LocationTagDto
import io.swagger.client.models.OwnerDto

/**
 * 
 * @param address 
 * @param banner 
 * @param categories 
 * @param children 
 * @param confirmedBy 
 * @param createdDate 
 * @param description 
 * @param id 
 * @param lat 
 * @param lng 
 * @param metaData 
 * @param owner 
 * @param parentId 
 * @param properties 
 * @param propertiesId 
 * @param publishDate 
 * @param status 
 * @param tags 
 * @param title 
 * @param type 
 */
data class GetLocationDto (

    val address: LocationAddressDto? = null,
    val banner: kotlin.Array<kotlin.String>? = null,
    val categories: kotlin.Array<LocationCategoryDto>? = null,
    val children: kotlin.Array<GetLocationDto>? = null,
    val confirmedBy: kotlin.Long? = null,
    val createdDate: kotlin.String? = null,
    val description: kotlin.String? = null,
    val id: kotlin.String? = null,
    val lat: kotlin.Double? = null,
    val lng: kotlin.Double? = null,
    val metaData: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    val owner: OwnerDto? = null,
    val parentId: kotlin.String? = null,
    val properties: kotlin.Array<GetLocationPropertyOptionDto>? = null,
    val propertiesId: kotlin.Array<kotlin.String>? = null,
    val publishDate: kotlin.Long? = null,
    val status: GetLocationDto.Status? = null,
    val tags: kotlin.Array<LocationTagDto>? = null,
    val title: kotlin.String? = null,
    val type: kotlin.String? = null
) {
    /**
    * 
    * Values: DRAFT,PUBLISHED
    */
    enum class Status(val value: kotlin.String){
        DRAFT("DRAFT"),
        PUBLISHED("PUBLISHED");
    }
}