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

import io.swagger.client.models.GetRateOpinionDto
import io.swagger.client.models.Pageable
import io.swagger.client.models.Sort

/**
 * 
 * @param content 
 * @param empty 
 * @param first 
 * @param last 
 * @param number 
 * @param numberOfElements 
 * @param pageable 
 * @param size 
 * @param sort 
 * @param totalElements 
 * @param totalPages 
 */
data class Page_GetRateOpinionDto_ (

    val content: kotlin.Array<GetRateOpinionDto>? = null,
    val empty: kotlin.Boolean? = null,
    val first: kotlin.Boolean? = null,
    val last: kotlin.Boolean? = null,
    val number: kotlin.Int? = null,
    val numberOfElements: kotlin.Int? = null,
    val pageable: Pageable? = null,
    val size: kotlin.Int? = null,
    val sort: Sort? = null,
    val totalElements: kotlin.Long? = null,
    val totalPages: kotlin.Int? = null
) {
}