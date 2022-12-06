package com.HurricaneDatabase.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired; 

import com.HurricaneDatabase.demo.model.User;
import com.HurricaneDatabase.demo.service.userService;

import com.HurricaneDatabase.demo.controller.runQueries;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private userService sev;
	@Autowired
	private runQueries run;

   public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
		Scanner userInput = new Scanner(System.in);
    	int stop = -1;

        while(stop != 0){
			System.out.print("ENTER USERNAME: ");
			String user = userInput.next();
			System.out.print("ENTER PASSWORD: ");
			String pass = userInput.next();
			List<User> check = sev.checkUser(user,pass);
			if(check.isEmpty()){
				System.out.println("Username/Password is incorrect try again");
				continue;
			}
			else{
				List<User> check2 = run.getUsers(user,pass);
				System.out.println("isAdmin : " + check2.get(1).getIsAdmin());
				System.out.print("Select the following choices: 1,2,3 0 to stop: ");
				stop = userInput.nextInt();
				}

		}
		userInput.close();
    }	
	
}


