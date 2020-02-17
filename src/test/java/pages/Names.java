

package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageBase;

public class Names extends PageBase {

    //*********Constructor*********
    public Names(WebDriver driver) {
        super(driver);
    }
        
    
	//*********Web Elements*********
   
	//*********Page Methods*********
   String[]	Names = {"Emma",
		   "Olivia",
		   "Avai",
		   "Isabella",
		   "Sophia",
		   "Charlotte",
		   "Mia",
		   "Amelia",
		   "Harper",
		   "Evelyn",
		   "Abigail",
		   "Emily",
		   "Elizabeth",
		   "Mila",
		   "Ella",
		   "Avery",
		   "Sofia",
		   "Camila",
		   "Aria",
		   "Scarlett",
		   "Victoria",
		   "Madison",
		   "Luna",
		   "Grace",
		   "Chloe",
		   "Penelope",
		   "Layla",
		   "Riley",
		   "Zoey",
		   "Nora",
		   "Lily",
		   "Eleanor",
		   "Hannah",
		   "Lillian",
		   "Addison",
		   "Aubrey",
		   "Ellie",
		   "Stella",
		   "Natalie",
		   "Zoe",
		   "Leah",
		   "Hazel",
		   "Violet",
		   "Aurora",
		   "Savannah",
		   "Audrey",
		   "Brooklyn",
		   "Bella",
		   "Claire",
		   "Skylar",
		   "Liam",
		   "Noah",
		   "William",
		   "James",
		   "Oliver",
		   "Benjamin",
		   "Elijah",
		   "Lucas",
		   "Mason",
		   "Logan",
		   "Alexander",
		   "Ethan",
		   "Jacob",
		   "Michael",
		   "Daniel",
		   "Henry",
		   "Jackson",
		   "Sebastian",
		   "Aiden",
		   "Matthew",
		   "Samuel",
		   "David",
		   "Joseph",
		   "Carter",
		   "Owen",
		   "Wyatt",
		   "John",
		   "Jack",
		   "Luke",
		   "Jayden",
		   "Dylan",
		   "Grayson",
		   "Levi",
		   "Isaac",
		   "Gabriel",
		   "Julian",
		   "Mateo",
		   "Anthony",
		   "Jaxon",
		   "Lincoln",
		   "Joshua",
		   "Christopher",
		   "Andrew",
		   "Theodore",
		   "Caleb",
		   "Ryan",
		   "Asher",
		   "Nathan",
		   "Thomas",
		   "Leo"
   
   };

	public Names getRandomName() {
		Random rand = new Random(); 
	    int rand_int1 = rand.nextInt(100); 
        String randomName1 = Names[rand_int1];
        System.setProperty("random_name_1", randomName1);
	    int rand_int2 = rand.nextInt(100); 
        String randomName2 = Names[rand_int2];
        System.setProperty("random_name_2", randomName2);
   		return this;
	}
	public Names getRandomLastName() {
		Random rand = new Random(); 
	    int rand_int11 = rand.nextInt(100); 
        String randomLastName1 = Names[rand_int11];
        System.setProperty("random_last_name_1", randomLastName1);
	    int rand_int12 = rand.nextInt(100); 
        String randomLastName2 = Names[rand_int12];
        System.setProperty("random_last_name_2", randomLastName2);
   		return this;
   		
		
	}
}