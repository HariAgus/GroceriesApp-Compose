package haw.bmaajp.groceriesapp.domain.usecase

import haw.bmaajp.groceriesapp.domain.usecase.getallproduct.GetAllProductUseCase
import haw.bmaajp.groceriesapp.domain.usecase.getselectedproduct.GetSelectedProductUseCase
import haw.bmaajp.groceriesapp.domain.usecase.readonboarding.ReadOnBoardingUseCase
import haw.bmaajp.groceriesapp.domain.usecase.saveonboarding.SaveOnBoardingUseCase
import haw.bmaajp.groceriesapp.domain.usecase.saveproductusecase.InsertProductsUseCase

data class UseCases(
    val getAllProductUseCase: GetAllProductUseCase,
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val insertProductsUseCase: InsertProductsUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getSelectedProductUseCase: GetSelectedProductUseCase
)