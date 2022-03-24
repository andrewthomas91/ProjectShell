package com.projectshell.network.model

import com.projectshell.domain.model.DomainModel
import com.projectshell.domain.util.DomainMapper

class DtoMapper: DomainMapper<DtoModel, DomainModel> {

    override fun mapToDomainModel(model: DtoModel): DomainModel {
        return DomainModel(
            name = model.name
        )
    }

    override fun mapFromDomainModel(domainModel: DomainModel): DtoModel {
        return DtoModel(
            name = domainModel.name
        )
    }
}