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


/**
 * 
 * @param avatar 
 * @param gradeEnum 
 * @param gradeName 
 * @param lawyerFirstName 
 * @param lawyerId 
 * @param lawyerLastName 
 * @param numberOfConsultations 
 * @param province 
 * @param rate 
 */
data class TopLawyerOutputDto (

    val avatar: kotlin.String? = null,
    val gradeEnum: TopLawyerOutputDto.GradeEnum? = null,
    val gradeName: kotlin.String? = null,
    val lawyerFirstName: kotlin.String? = null,
    val lawyerId: kotlin.String? = null,
    val lawyerLastName: kotlin.String? = null,
    val numberOfConsultations: kotlin.Int? = null,
    val province: kotlin.String? = null,
    val rate: kotlin.Float? = null
) {
    /**
    * 
    * Values: KANOONDADGOSTARIKARAMOOZ,KANOONDADGOSTARIPAYE1,KANOONDADGOSTARIPAYE2,KARSEHNASHOGHOOGHI,MARKAZVOKALAKARAMOOZ,MARKAZVOKALAPAYE1,MARKAZVOKALAPAYE2
    */
    enum class GradeEnum(val value: kotlin.String){
        KANOONDADGOSTARIKARAMOOZ("KANOON_DADGOSTARI_KARAMOOZ"),
        KANOONDADGOSTARIPAYE1("KANOON_DADGOSTARI_PAYE_1"),
        KANOONDADGOSTARIPAYE2("KANOON_DADGOSTARI_PAYE_2"),
        KARSEHNASHOGHOOGHI("KARSEHNAS_HOGHOOGHI"),
        MARKAZVOKALAKARAMOOZ("MARKAZ_VOKALA_KARAMOOZ"),
        MARKAZVOKALAPAYE1("MARKAZ_VOKALA_PAYE_1"),
        MARKAZVOKALAPAYE2("MARKAZ_VOKALA_PAYE_2");
    }
}