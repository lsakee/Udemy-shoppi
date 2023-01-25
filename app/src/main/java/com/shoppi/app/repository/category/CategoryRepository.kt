package com.shoppi.app.repository.category

import com.shoppi.app.model.Category

class CategoryRepository(
    private val remoteDataSource: CategoryRemoteDataSource
) {

    // suspend로 코루틴스콥 실행만되게
    suspend fun getCategories():List<Category>{
//        //코루틴 쓰레드 변경 키워드
//        retrofit 안쓰면
//        withContext(Dispatchers.IO){
//            remoteDataSource.getCategories()
//        }
        return remoteDataSource.getCategories()
    }
}