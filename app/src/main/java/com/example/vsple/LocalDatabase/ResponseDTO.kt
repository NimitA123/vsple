package com.example.vsple.LocalDatabase


import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class ResponseDTO(

	@field:SerializedName("accessToken")
	val accessToken: String? = null,

	@field:SerializedName("fcmToken")
	val fcmToken: String? = null,

	@field:SerializedName("accessTokenStreamIO")
	val accessTokenStreamIO: String? = null,

	@field:SerializedName("accessTokenStreamIOWithID")
	val accessTokenStreamIOWithID: String? = null,

	@field:SerializedName("tokenType")
	val tokenType: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("createdOn")
	val createdOn: String? = null,

	@field:SerializedName("userName")
	val userName: String? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("savedStocks")
	val savedStocks: String? = null,

	@field:SerializedName("savedMentors")
	val savedMentors: String? = null,

	@field:SerializedName("modifiedOn")
	val modifiedOn: String? = null,

	@field:SerializedName("socialId")
	val socialId: Any? = null,

	@field:SerializedName("status")
	val status: Any? = null,

	@field:SerializedName("isMentor")
	val isMentor: String? = null,

	@field:SerializedName("deviceLimitExceeded")
	val deviceLimitExceeded: Boolean? = null,

	@field:SerializedName("loginInfo")
	val loginInfo: LoginInfoDTO? = null
)