package io.redspark.candidatos.modules.login.service

import io.redspark.candidatos.database.entities.Candidate
import io.redspark.candidatos.database.repository.CandidateRepository
import io.redspark.candidatos.database.repository.UserRepository
import io.redspark.candidatos.models.dtos.*
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(
    private val userRepository: UserRepository,
    private val createCandidateDTO: CreateCandidateDTO,
    private val candidateRepository: CandidateRepository
): UserService{

    override fun getUser(user: UserDTO): String {
        TODO("Not yet implemented")
    }

    override fun getUserList(): List<UserListDTO> {
        return userRepository.findAll()
            .map { UserListDTO(it) }
    }

    override fun createUser(createUserDto: CreateUserDTO): UserDTO {
        TODO("Not yet implemented")
        //val candidateDTO = CandidateDTO(createCandidateDTO)

        //val candidate = Candidate(CandidateDTO)
        //val savedCandidate = candidateRepository.save(candidate)
        //return Candidate(savedCandidate)
    }

}
