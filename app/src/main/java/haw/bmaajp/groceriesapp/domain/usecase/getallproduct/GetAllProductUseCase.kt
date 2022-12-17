package haw.bmaajp.groceriesapp.domain.usecase.getallproduct

import haw.bmaajp.groceriesapp.data.repository.Repository
import haw.bmaajp.groceriesapp.domain.model.ProductItem

class GetAllProductUseCase(
    private val repository: Repository
) {

    operator fun invoke(): List<ProductItem> = repository.getAllProduct()

}