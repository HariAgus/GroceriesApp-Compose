package haw.bmaajp.groceriesapp.domain.usecase.searchproductusecase

import haw.bmaajp.groceriesapp.data.repository.Repository

class SearchProductUseCase(
    private val repository: Repository
) {

    operator fun invoke(query: String) = repository.searchProduct(query)

}