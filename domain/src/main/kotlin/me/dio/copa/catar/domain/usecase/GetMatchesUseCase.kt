package me.dio.copa.catar.domain.usecase

import kotlinx.coroutines.flow.Flow
import me.dio.copa.catar.domain.model.Match
import me.dio.copa.catar.domain.repositories.MatchesRepository
import javax.inject.Inject

class GetMatchesUseCase @Inject constructor (
    private val matchesRepository: MatchesRepository
    ){
    suspend operator fun invoke(): Flow<List<Match>> = matchesRepository.getMatches()
}