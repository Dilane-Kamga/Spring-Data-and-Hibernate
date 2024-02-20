package tech.kam.springdatajpaintro.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import tech.kam.springdatajpaintro.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
