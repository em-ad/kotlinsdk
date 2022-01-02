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

import io.swagger.client.models.Sort

/**
 * 
 * @param offset 
 * @param pageNumber 
 * @param pageSize 
 * @param paged 
 * @param sort 
 * @param unpaged 
 */
data class Pageable (

    val offset: kotlin.Long? = null,
    val pageNumber: kotlin.Int? = null,
    val pageSize: kotlin.Int? = null,
    val paged: kotlin.Boolean? = null,
    val sort: Sort? = null,
    val unpaged: kotlin.Boolean? = null
) {
}