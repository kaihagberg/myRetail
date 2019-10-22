package com.target.myretail;

import com.target.myretail.model.Price;
import com.target.myretail.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyRetailApplication implements CommandLineRunner {

	@Autowired
	private PriceRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MyRetailApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		//save all pricing information for example Id's
		repository.save(new Price("13860428", "$14.99", "USD"));
		repository.save(new Price("13918060","$11.99", "USD"));
		repository.save(new Price("12945940", "$4.89", "USD"));
		repository.save(new Price("76695868","$1199.99", "USD"));
		repository.save(new Price("13959206","$4.99","USD"));
	}
}
