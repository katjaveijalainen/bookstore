package bookstore.web;

import bookstore.domain.Book;
import bookstore.domain.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/booklist")
    public String bookList(Model model) {
        model.addAttribute("books", repository.findAll());
        return "booklist";
    }
    @GetMapping("/add")
public String addBook(Model model) {
    model.addAttribute("book", new Book());
    return "addbook";
}

@PostMapping("/save")
public String save(Book book) {
    repository.save(book);
    return "redirect:/booklist";
}

@GetMapping("/delete/{id}")
public String deleteBook(@PathVariable("id") Long id) {
    repository.deleteById(id);
    return "redirect:/booklist";
}

@GetMapping("/edit/{id}")
public String editBook(@PathVariable("id") Long id, Model model) {
    Book book = repository.findById(id).orElse(null);
    model.addAttribute("book", book);
    return "addbook";
}
}
