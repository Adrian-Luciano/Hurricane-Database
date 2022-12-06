package com.HurricaneDatabase.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired; 

import com.HurricaneDatabase.demo.model.User;
import com.HurricaneDatabase.demo.model.Basin;
import com.HurricaneDatabase.demo.model.Cyclone;
import com.HurricaneDatabase.demo.model.Damage;
import com.HurricaneDatabase.demo.model.Metrics;
import com.HurricaneDatabase.demo.model.Classification;
import com.HurricaneDatabase.demo.model.States;
import com.HurricaneDatabase.demo.service.userService;

import com.HurricaneDatabase.demo.controller.runQueries;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private userService sev;
	@Autowired
	private runQueries run;


	public int askUser(User user){
		Scanner userInput = new Scanner(System.in);
		
		int choice = -1;
		while(choice != 0 ){
		System.out.println("-------------------------");
		System.out.println("Select the following choices: ");
		System.out.println("0-Exit App");
		System.out.println("1-Get Cyclone List ");
		System.out.println("2-Insert Cyclone ");	
		System.out.println("3- Get Hurricane Information");
		System.out.println("-------------------------");
			choice = userInput.nextInt();
			switch(choice){
				case 0: 
				System.out.println("EXITING APP");
				break;
				case 1:
				List<Cyclone> list = run.getCyclones();
				if(list.isEmpty()){
					System.out.println("No cyclones are in database");
					choice = 0;
					break;
				}
				else{
					for(int i = 0; i < list.size(); i++){
						if(i % 7 == 0){
							System.out.println("");
						}
						System.out.print(list.get(i).getName() + " ");
					}
					System.out.println("");
				}
				break;
				case 2:
				if(user.getIsAdmin()== 1){
					System.out.print("Enter cyclone name: ");
					String name = userInput.next();
					System.out.print("Enter cyclone year: ");
					int year = userInput.nextInt();
					run.saveCyclone(name, year);
					List<Cyclone> getID = run.getCycID(name);
					int num = getID.get(0).getId();
					System.out.print("Enter longitude");
					//int lat = userInput.nextInt();
					System.out.print("Enter Latitude");
					break;
				}
				else{
					System.out.println("USER NEEDS ADMIN RIGHTS, SELECT ANOTHER OPTION");
					break;
				}
				case 3:
				System.out.println("Specifiy cyclone name you want to search");
				String name = userInput.next();
				run.getCycInfo(name);
				break;
			}
		}
		userInput.close();
		return 0;
	}
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
				stop = askUser(check.get(0));
				}

		}
		userInput.close();
    }	
	
}


