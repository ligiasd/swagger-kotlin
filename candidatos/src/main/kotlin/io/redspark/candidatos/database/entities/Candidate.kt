package io.redspark.candidatos.database.entities

import io.redspark.candidatos.models.dtos.CandidateDTO
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@Table(name = "tb_candidatos")
data class Candidate (
    @Id
    @Column(name = "user_id")
    @GeneratedValue
    val id: UUID? = null,

    @Column(name = "name")
    var name: String,

    @Column(name = "email")
    var email: String,

    @Column(name = "phone")
    var phone: String,

    @Column(name = "linkedln")
    var linkedln: String,

    @Column(name = "recommendation")
    var personal_recommendation: String,

){
    constructor(candidateDTO: CandidateDTO): this(
        id = candidateDTO.id,
        name = candidateDTO.name,
        email = candidateDTO.email,
        phone = candidateDTO.phone,
        linkedln = candidateDTO.linkedln,
        personal_recommendation = candidateDTO.personal_recommendation


    )
}