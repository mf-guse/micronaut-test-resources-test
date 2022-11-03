package de.mf.micronaut.resources.db.repository

import de.mf.micronaut.resources.db.model.Book
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import org.junit.jupiter.api.DisplayName

@MicronautTest
class BookRepositoryTest(
    private val bookRepository: BookRepository
):AnnotationSpec() {

    @Test
    @DisplayName("A PostgreSQL test container is required to run this test")
    fun testItWorks(){

        // given
        val book = Book(title = "Some test Book")

        // when
        val savedBook = bookRepository.save(book).block()

        // then
        savedBook shouldNotBe null
        bookRepository.findAll().collectList().block()[0] shouldBe savedBook
    }


}