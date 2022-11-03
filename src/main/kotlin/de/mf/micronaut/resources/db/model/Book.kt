package de.mf.micronaut.resources.db.model


import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Book(

    @Id
    @GeneratedValue
    var id: Long? = null,

    val title: String
)
