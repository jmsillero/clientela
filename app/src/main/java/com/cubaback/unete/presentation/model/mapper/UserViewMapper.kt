package com.cubaback.unete.presentation.model.mapper

import com.cubaback.unete.domain.model.UserBo
import com.cubaback.unete.data.model.UserView
import com.cubaback.unete.mapper.Mapper
import java.util.*

class UserViewMapper : Mapper<UserBo, UserView> {

    override fun map(type: UserBo): UserView {
        return UserView(type.id, type.name, type.lastName, type.email, type.password, type.token, type.createAt.toString(), type.updatedAt.toString())
    }

    override fun reverseMap(type: UserView): UserBo {
        return UserBo(type.id, type.name, type.lastName, type.email, type.password!!, type.token, Date(), Date())
    }
}