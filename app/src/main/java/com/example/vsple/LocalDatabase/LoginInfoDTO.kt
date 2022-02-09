package com.example.vsple.LocalDatabase


import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class LoginInfoDTO(

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("deviceInfo")
	val deviceInfo: Any? = null,

	@field:SerializedName("deviceToken")
	val deviceToken: Any? = null,

	@field:SerializedName("createdOn")
	val createdOn: Long? = null,

	@field:SerializedName("modifiedOn")
	val modifiedOn: Long? = null
)