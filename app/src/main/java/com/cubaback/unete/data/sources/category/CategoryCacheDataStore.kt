package com.cubaback.unete.data.sources.category

import com.cubaback.unete.data.model.EntityCategory
import com.cubaback.unete.data.repository.category.ICategoryCache
import com.cubaback.unete.data.repository.category.ICategoryDataStore
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Single
import java.util.*

open class CategoryCacheDataStore(private val categoryCache : ICategoryCache) : ICategoryDataStore {

    override fun clearCategories(): Completable {
        return categoryCache.clearCategories()
    }

    override fun saveCategories(categories: List<EntityCategory>): Completable {
        return categoryCache.saveCategories(categories)
    }

    override fun getCategories(): Flowable<List<EntityCategory>> {
       return categoryCache.getCategories()
    }

    override fun isCached(): Single<Boolean> {
       return categoryCache.isCached()
    }

    override fun getCategoryById(id: Long): Single<EntityCategory> {
       return categoryCache.getBusinessById(id)
    }

    override fun getCategoriesByParentId(parentId: Long): Flowable<List<EntityCategory>> {
        return categoryCache.getCategoriesByParentId(parentId)
    }

    override fun hasChanged(date: Date): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}