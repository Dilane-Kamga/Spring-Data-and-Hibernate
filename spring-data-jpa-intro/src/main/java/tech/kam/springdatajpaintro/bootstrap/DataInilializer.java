package tech.kam.springdatajpaintro.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tech.kam.springdatajpaintro.domain.Book;
import tech.kam.springdatajpaintro.repositories.BookRepository;

@Component
public class DataInilializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInilializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book bookDDD = new Book("DDD", "123", "Publishman");
        Book savedDDD = bookRepository.save(bookDDD);

        Book springBootInAction = new Book("Spring Boot in Action", "2345", "Manning");
        Book savedSBIA = bookRepository.save(springBootInAction);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book Id: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
        });
    }
}
