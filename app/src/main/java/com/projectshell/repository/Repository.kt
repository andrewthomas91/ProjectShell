package com.projectshell.repository

import com.projectshell.domain.model.DomainModel

interface Repository {

    suspend fun get(id: Int): DomainModel
}