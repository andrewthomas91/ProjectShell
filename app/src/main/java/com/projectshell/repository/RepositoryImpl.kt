package com.projectshell.repository

import com.projectshell.domain.model.DomainModel
import com.projectshell.network.RetrofitService
import com.projectshell.network.model.DtoMapper

class RepositoryImpl(
    private val retrofitService: RetrofitService,
    private val mapper: DtoMapper,
) : Repository {

    override suspend fun get(id: Int): DomainModel {
        return mapper.mapToDomainModel(retrofitService.get(token = "", id = 0))
    }
}