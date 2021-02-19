package dev.knacion.spring5framework.domain.repositories;

import dev.knacion.spring5framework.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
