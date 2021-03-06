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
package io.swagger.client.apis

import io.swagger.client.models.CreateFileRequest
import io.swagger.client.models.FileOrFolder

import io.swagger.client.infrastructure.*

class FileControllerApi(basePath: kotlin.String = "https://datyar.vaslapp.com:443") : ApiClient(basePath) {

    /**
     * createFolder
     * 
     * @param body  (optional)
     * @param acceptLanguage language (optional)
     * @return FileOrFolder
     */
    @Suppress("UNCHECKED_CAST")
    fun createFolder(body: CreateFileRequest? = null, acceptLanguage: kotlin.String? = null): FileOrFolder {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/file/folder", headers = localVariableHeaders
        )
        val response = request<FileOrFolder>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as FileOrFolder
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * delete
     * 
     * @param id id 
     * @param acceptLanguage language (optional)
     * @param deleteByChildren  (optional)
     * @return void
     */
    fun delete3(id: kotlin.String, acceptLanguage: kotlin.String? = null, deleteByChildren: kotlin.Boolean? = null): Unit {
        val localVariableQuery: MultiValueMap = mapOf("deleteByChildren" to listOf("$deleteByChildren"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/api/v1/file/{id}".replace("{" + "id" + "}", "$id"), query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<Any?>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * get
     * 
     * @param id id 
     * @param acceptLanguage language (optional)
     * @return FileOrFolder
     */
    @Suppress("UNCHECKED_CAST")
    fun get6(id: kotlin.String, acceptLanguage: kotlin.String? = null): FileOrFolder {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/file/{id}".replace("{" + "id" + "}", "$id"), headers = localVariableHeaders
        )
        val response = request<FileOrFolder>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as FileOrFolder
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getContent
     * 
     * @param folderId folderId 
     * @param acceptLanguage language (optional)
     * @return kotlin.Array<FileOrFolder>
     */
    @Suppress("UNCHECKED_CAST")
    fun getContent1(folderId: kotlin.String, acceptLanguage: kotlin.String? = null): kotlin.Array<FileOrFolder> {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/file/folder/{folderId}".replace("{" + "folderId" + "}", "$folderId"), headers = localVariableHeaders
        )
        val response = request<kotlin.Array<FileOrFolder>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<FileOrFolder>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * getRoot
     * 
     * @param acceptLanguage language (optional)
     * @return kotlin.Array<FileOrFolder>
     */
    @Suppress("UNCHECKED_CAST")
    fun getRoot(acceptLanguage: kotlin.String? = null): kotlin.Array<FileOrFolder> {
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/v1/file/folder/root", headers = localVariableHeaders
        )
        val response = request<kotlin.Array<FileOrFolder>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<FileOrFolder>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * upload
     * 
     * @param file  (optional)
     * @param folderId  (optional)
     * @param name  (optional)
     * @param acceptLanguage language (optional)
     * @return FileOrFolder
     */
    @Suppress("UNCHECKED_CAST")
    fun upload(file: kotlin.Array<kotlin.Byte>? = null, folderId: kotlin.String? = null, name: kotlin.String? = null, acceptLanguage: kotlin.String? = null): FileOrFolder {
        val localVariableBody: kotlin.Any? = mapOf("file" to "$file", "folderId" to "$folderId", "name" to "$name")
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Content-Type" to "multipart/form-data", "Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/file/upload", headers = localVariableHeaders
        )
        val response = request<FileOrFolder>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as FileOrFolder
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * uploadPrivateUserFile
     * 
     * @param file  (optional)
     * @param storeKey  (optional)
     * @param acceptLanguage language (optional)
     * @return FileOrFolder
     */
    @Suppress("UNCHECKED_CAST")
    fun uploadPrivateUserFile(file: kotlin.Array<kotlin.Byte>? = null, storeKey: kotlin.String? = null, acceptLanguage: kotlin.String? = null): FileOrFolder {
        val localVariableBody: kotlin.Any? = mapOf("file" to "$file", "storeKey" to "$storeKey")
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Content-Type" to "multipart/form-data", "Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/file/upload/user/private", headers = localVariableHeaders
        )
        val response = request<FileOrFolder>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as FileOrFolder
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * uploadPublicFile
     * 
     * @param file  (optional)
     * @param folderId  (optional)
     * @param name  (optional)
     * @param acceptLanguage language (optional)
     * @return FileOrFolder
     */
    @Suppress("UNCHECKED_CAST")
    fun uploadPublicFile(file: kotlin.Array<kotlin.Byte>? = null, folderId: kotlin.String? = null, name: kotlin.String? = null, acceptLanguage: kotlin.String? = null): FileOrFolder {
        val localVariableBody: kotlin.Any? = mapOf("file" to "$file", "folderId" to "$folderId", "name" to "$name")
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Content-Type" to "multipart/form-data", "Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/file/upload/public-file", headers = localVariableHeaders
        )
        val response = request<FileOrFolder>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as FileOrFolder
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * uploadPublicFileWithFolderName
     * 
     * @param file  (optional)
     * @param folderName  (optional)
     * @param name  (optional)
     * @param acceptLanguage language (optional)
     * @return FileOrFolder
     */
    @Suppress("UNCHECKED_CAST")
    fun uploadPublicFileWithFolderName(file: kotlin.Array<kotlin.Byte>? = null, folderName: kotlin.String? = null, name: kotlin.String? = null, acceptLanguage: kotlin.String? = null): FileOrFolder {
        val localVariableBody: kotlin.Any? = mapOf("file" to "$file", "folderName" to "$folderName", "name" to "$name")
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Content-Type" to "multipart/form-data", "Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/file/upload/public-file-with-folder-name", headers = localVariableHeaders
        )
        val response = request<FileOrFolder>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as FileOrFolder
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * uploadPublicUserFile
     * 
     * @param file  (optional)
     * @param acceptLanguage language (optional)
     * @return FileOrFolder
     */
    @Suppress("UNCHECKED_CAST")
    fun uploadPublicUserFile(file: kotlin.Array<kotlin.Byte>? = null, acceptLanguage: kotlin.String? = null): FileOrFolder {
        val localVariableBody: kotlin.Any? = mapOf("file" to "$file")
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Content-Type" to "multipart/form-data", "Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/file/upload/user/public", headers = localVariableHeaders
        )
        val response = request<FileOrFolder>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as FileOrFolder
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * uploadWithFolderName
     * 
     * @param file  (optional)
     * @param folderName  (optional)
     * @param name  (optional)
     * @param acceptLanguage language (optional)
     * @return FileOrFolder
     */
    @Suppress("UNCHECKED_CAST")
    fun uploadWithFolderName(file: kotlin.Array<kotlin.Byte>? = null, folderName: kotlin.String? = null, name: kotlin.String? = null, acceptLanguage: kotlin.String? = null): FileOrFolder {
        val localVariableBody: kotlin.Any? = mapOf("file" to "$file", "folderName" to "$folderName", "name" to "$name")
        
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Content-Type" to "multipart/form-data", "Accept-Language" to acceptLanguage.toString())
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/v1/file/upload/folder-name", headers = localVariableHeaders
        )
        val response = request<FileOrFolder>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as FileOrFolder
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
