//package com.miniproject.LibraryManagementSystem;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.net.ssl.SSLEngineResult.Status;
//
//import org.aspectj.lang.annotation.Before;
//import org.assertj.core.util.Arrays;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.http.MediaType;
//import org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.miniproject.LibraryManagementSystem.controller.BookController;
//import com.miniproject.LibraryManagementSystem.mainclasses.Book;
//import com.miniproject.LibraryManagementSystem.repo.BookRepo;
//
//import ch.qos.logback.core.net.ObjectWriter;
//
//@RunWith(MockitoJUnitRunner.class)
//public class BookControllerTest {
//
//	private MockMvc mockMvc;
//
//	ObjectMapper objectMapper = new ObjectMapper();
//	ObjectWriter objectWriter = objectMapper.writer();
//
//	@Mock
//	private BookRepo bookRepo;
//
//	@InjectMocks
//	private BookController bookController;
//	// book id, name, author, release year, book version,
//	Book_1 = new Book(1,"Atomic Habits","Robert",1978,"2.0.9","2023-2-3","2023-3-3",true);
//	Book_2 = new Book(2,"Fight Club","BraddPitt",2018,"4.0.9","2023-3-3","2023-4-4",true);
//	Book_3 = new Book(3,"Wolf of Wall Street","Leonardo",1965,"7.2","2023-2-3","2023-2-2",true);
//
//	@Before
//	public void setUP() {
//		MockitoAnnotations.initMocks(this);
//		this.mockMvc = MockMvcBUilders.standaloneSetup(bookController).build();
//		
//	}
//	@Test
//	public void getAllBooksData()
//		List<Book> booksData = new ArrayList<>(Arrays.asList(Book_1,Book_2,Book_3));
//		
//		Mockito.when(bookRepo.findAll()).thenReturn(booksData);
//		
//		mockMvc.perform(MockMvcRequestBuilders
//				.get("/books")
//				.contentType(MediaType.APPLICATION_JSON)
//				.andExpect(status().isOK())
//				.andExpect(SecurityMockMvcResultMatchers.jsonPath("$",hasSize(3)));
//		
//	}
//		@Test
//		public void getBookById() {
//			Mockito.when(bookRepo.findById(Book_1.getBookById())).thenReturn(java.util.optional.of(Book_1));
//			mockMvc.perform(MockMvcRequestBuilders
//					.get("/books/1")
//					.contentType(MediaType.APPLICATION_JSON)
//					.andExpect(status().isOK())
//					.andExpect(jsonPath(expression:"$",notNullValue()))
//					.andExpect(SecurityMockMvcResultMatchers.jsonPath("$",hasSize(3)));
//}