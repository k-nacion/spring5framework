package dev.knacion.spring5framework.bootstrap;

import dev.knacion.spring5framework.domain.Author;
import dev.knacion.spring5framework.domain.Book;
import dev.knacion.spring5framework.domain.Publisher;
import dev.knacion.spring5framework.domain.model.Address;
import dev.knacion.spring5framework.domain.repositories.AuthorRepository;
import dev.knacion.spring5framework.domain.repositories.BookRepository;
import dev.knacion.spring5framework.domain.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book domainDrivenDesign = new Book("Domain Driven Design", "12312312");
        Publisher publisher = new Publisher("Sample Publisher", new Address("Line 1 ", "Taguig", "US", 1630));

        eric.getBooks().add(domainDrivenDesign);
        domainDrivenDesign.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(domainDrivenDesign);

        System.out.println("Spring boot application Starter");
        System.out.println("number of books: " + bookRepository.count());
    }


}














