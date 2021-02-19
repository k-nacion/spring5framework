package dev.knacion.spring5framework.domain.repositories;

import dev.knacion.spring5framework.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
