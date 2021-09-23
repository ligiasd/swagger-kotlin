package io.redspark.candidatos.database.entities

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
    constructor(user: User) : this(
        id = user.id,
        email = user.email,

        )

}