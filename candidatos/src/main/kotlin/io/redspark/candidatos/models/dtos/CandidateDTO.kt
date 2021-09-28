package io.redspark.candidatos.models.dtos

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.Id

class CandidateDTO (
    @JsonProperty("id")
    val id: UUID? = null,

    @JsonProperty("name")
    var name: String,

    @JsonProperty("email")
    var email: String,

    @JsonProperty("phone")
    var phone: String,

    @JsonProperty("linkledln")
    var linkedln: String,

    @JsonProperty("recommendation")
    var personal_recommendation: String

)
