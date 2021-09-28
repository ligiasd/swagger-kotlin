package io.redspark.candidatos.database.entities

import io.redspark.candidatos.models.dtos.UserDTO
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@Table(name = "TB_LOGIN")
data class User(

    @Id
    @GeneratedValue
    @Column(name = "login_id")
    val id: UUID? = null,

    @Column(name = "email")
    val email: String,


) {
    constructor(userDTO: UserDTO) : this(
        id = userDTO.id,
        email = userDTO.email,

        )

}