package parking.accounting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import jakarta.annotation.PreDestroy;

@SpringBootApplication
@ComponentScan(basePackages= {"parking"})
public class AccountingManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountingManagementApplication.class, args);
	}
	
	@PreDestroy
	void preDestroy() {
		System.out.println("AccountingManagmentAppl - shutdown has been performed");
	}

}
