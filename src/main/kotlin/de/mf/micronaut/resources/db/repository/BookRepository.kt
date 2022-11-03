package de.mf.micronaut.resources.db.repository

import de.mf.micronaut.resources.db.model.Book
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.reactive.ReactorCrudRepository
import reactor.core.publisher.Flux

@Repository
interface BookRepository : ReactorCrudRepository<Book, Long>{

    override fun findAll(): Flux<Book>

}