package haw.bmaajp.groceriesapp.domain.usecase.readonboarding

import haw.bmaajp.groceriesapp.data.repository.Repository
import kotlinx.coroutines.flow.Flow

class ReadOnBoardingUseCase(private val repository: Repository) {

    operator fun invoke(): Flow<Boolean> = repository.readOnBoardingState()

}