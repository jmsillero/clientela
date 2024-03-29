package com.cubaback.unete.cache.model.mapper

import com.cubaback.unete.cache.model.CachedClient
import com.cubaback.unete.data.model.EntityClient
import com.cubaback.unete.mapper.Mapper
import java.util.*

open class CachedClientMapper() : Mapper<EntityClient, CachedClient> {
    //constructor()

    override fun map(type: EntityClient): CachedClient {
        val date = Date(); // todo: transformar el date segun venga del API

        return CachedClient(type.id, type.phone, type.birthDate.toString())
    }

    override fun reverseMap(type: CachedClient): EntityClient {
        return EntityClient(type.id, type.phone, type.birthDate.toString())
    }
}
