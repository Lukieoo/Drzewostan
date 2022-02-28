package com.anioncode.drzewostan.features.domain

import com.anioncode.drzewostan.core.base.UseCase
import com.anioncode.drzewostan.features.TreesDataRepository
import com.anioncode.drzewostan.features.domain.model.TreesData

class GetTreesDataUseCase(private val treesDataRepository: TreesDataRepository) :
    UseCase<List<TreesData>, Int>() {
    override suspend fun action(params: Int): List<TreesData> = treesDataRepository.getTreesData(params)
}