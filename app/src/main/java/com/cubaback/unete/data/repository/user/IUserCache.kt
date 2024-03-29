package com.cubaback.unete.data.repository.user

import com.cubaback.unete.data.model.EntityUser
import io.reactivex.Completable
import io.reactivex.Single

interface IUserCache {

   fun saveUser(user : EntityUser) : Completable

   fun getSavedUser() : Single<EntityUser>

   fun isLoged() : Boolean

   fun logOut() : Completable

   fun getToken() : String

   fun saveToken(token : String) : Boolean
}