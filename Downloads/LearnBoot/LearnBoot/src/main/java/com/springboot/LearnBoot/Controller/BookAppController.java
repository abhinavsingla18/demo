package com.springboot.LearnBoot.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.LearnBoot.Entity.BOOK;
import com.springboot.LearnBoot.Service.BookService;

@RestController
public class BookAppController {
	@Autowired
	BookService BS;
	
	
	@GetMapping("/books/{id}")
	public ResponseEntity<BOOK> GetBook(@PathVariable int id){
		
			BOOK Book = BS.GetBookById(id);
			//if(Book!=null)
				return (ResponseEntity<BOOK>)ResponseEntity.ok().body(Book);
			//else
			//	return ResponseEntity.notFound().build();
		}
		
	
	
	@PostMapping("/books/add")
	public ResponseEntity<BOOK> addBook(@RequestBody BOOK book){
		return (ResponseEntity<BOOK>)ResponseEntity.status(HttpStatus.CREATED).body(BS.SaveBook(book));
	}
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<String> deleteBookById(@PathVariable int id) {
        BS.DeleteBookbyID(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted");
    }
	@PutMapping("/books/update")
	public ResponseEntity<BOOK> updateBook(@RequestBody BOOK book){
		return (ResponseEntity<BOOK>)ResponseEntity.status(HttpStatus.OK).body(BS.SaveBook(book));
	}
			
		
}
