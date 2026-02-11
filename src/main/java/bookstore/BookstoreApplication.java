package bookstore;

import bookstore.domain.Book;
import bookstore.domain.BookRepository;
import bookstore.domain.Category;
import bookstore.domain.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(BookRepository bookRepo, CategoryRepository catRepo) {
    return (args) -> {
        
        Category c1 = catRepo.save(new Category("Fantasy"));
        Category c2 = catRepo.save(new Category("Classic"));
            repo.save(new Book("Humiseva Harju", "Emily Bronte", 2008, "12345", 25.60));
            repo.save(new Book("Harry Potter ja Viisasten kivi", "J.K.Rowling", 2018, "67890", 15.70));
        };
    }
}




