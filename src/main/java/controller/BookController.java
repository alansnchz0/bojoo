package controller;

import model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@RequestMapping("/book")
	public Book book(@RequestParam(value="name", defaultValue="Charlie") String name) {
		
		return new Book(0, name, 0);
	}
}
