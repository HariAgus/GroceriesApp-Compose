package haw.bmaajp.groceriesapp.domain.usecase.saveonboarding

import haw.bmaajp.groceriesapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(isCompleted: Boolean) {
        repository.saveOnBoardingState(isCompleted = isCompleted)
    }

}