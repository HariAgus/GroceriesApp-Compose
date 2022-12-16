package haw.bmaajp.groceriesapp.domain.usecase

import haw.bmaajp.groceriesapp.domain.usecase.getselectedproduct.GetSelectedProductUseCase
import haw.bmaajp.groceriesapp.domain.usecase.readonboarding.ReadOnBoardingUseCase
import haw.bmaajp.groceriesapp.domain.usecase.saveonboarding.SaveOnBoardingUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getSelectedProductUseCase: GetSelectedProductUseCase
)