package xujun.tifa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import xujun.tifa.bean.AuthorSettings;

/**
 * Hello world!
 *
 */
@Controller
@SpringBootApplication
public class App {
	
	@Value("${book.name}")
	private String name;
	
	@Value("${book.author}")
	private String author;
	
	@Autowired
	private AuthorSettings authorSetting;

	@RequestMapping("/violet")
	String index() {
		return authorSetting.getAuthor() +" love "+authorSetting.getName()+" forever";
	} 
	
	@RequestMapping("/ahri")
	String violet() {
		return "violet";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(App.class,args);
	}
}
