package dev.knacion.spring5framework.domain.repositories;

import dev.knacion.spring5framework.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
