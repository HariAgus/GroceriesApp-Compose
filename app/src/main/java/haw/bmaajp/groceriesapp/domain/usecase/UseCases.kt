package haw.bmaajp.groceriesapp.domain.usecase

import haw.bmaajp.groceriesapp.domain.usecase.addcartusecase.AddCartUseCase
import haw.bmaajp.groceriesapp.domain.usecase.deletecartusecase.DeleteCartUseCase
import haw.bmaajp.groceriesapp.domain.usecase.getallcartusecase.GetAllCartUseCase
import haw.bmaajp.groceriesapp.domain.usecase.getallproduct.GetAllProductUseCase
import haw.bmaajp.groceriesapp.domain.usecase.getselectedproduct.GetSelectedProductUseCase
import haw.bmaajp.groceriesapp.domain.usecase.readonboarding.ReadOnBoardingUseCase
import haw.bmaajp.groceriesapp.domain.usecase.saveonboarding.SaveOnBoardingUseCase
import haw.bmaajp.groceriesapp.domain.usecase.saveproductusecase.InsertProductsUseCase
import haw.bmaajp.groceriesapp.domain.usecase.searchproductusecase.SearchProductUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val insertProductsUseCase: InsertProductsUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getSelectedProductUseCase: GetSelectedProductUseCase,
    val getAllProductUseCase: GetAllProductUseCase,
    val getAllCartUseCase: GetAllCartUseCase,
    val addCartUseCase: AddCartUseCase,
    val deleteCart: DeleteCartUseCase,
    val searchProductUseCase: SearchProductUseCase
)