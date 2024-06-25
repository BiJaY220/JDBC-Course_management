package Info;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.course.manage.Connectionn;
import com.course.manage.CourseDao;
import com.course.manage.Courses;

public class Information {
	/*JDBC-> api for database connection
	 * java prog(classes) -> JDBC -> database
	 * my-sql-connector
	 * 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("our course management!!");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		br.readLine();
//		
		
		while(true) {
			System.out.println("1.Enter the details of course you want to add : PRESS 1");
//		String cname = br.readLine();
			System.out.println("2.UPDATE : PRESS 2");
			System.out.println("3.DELETE the course details PRESS 3");
			System.out.println("4.DETAILS of the courses PRESS 4");
			//System.out.println("5. the course");
			System.out.println("5.EXIT");
			int choice = Integer.parseInt(br.readLine());
			
			if(choice == 1) {
				// add course 
			System.out.println("Enter the details of the course you want to add: ");
			
			System.out.println("Enter the name of the course: ");
			String cname = br.readLine();
			
			System.out.println("Enter the duration of the course:");
			String duration = br.readLine();
			
			System.out.println("Enter the price of the course:");
			String price = br.readLine();
			
			Courses cr = new Courses(cname,duration , price);
			boolean res = CourseDao.insertIntoDB(cr);
			if(res) {
				System.out.println("the data is added to the database!!");
				
			}else {
				System.out.println("the data could not be added !");
			}
				
			}
			else if(choice == 2){
				// update
			}else if (choice == 3 ) {
				System.out.println("Enter the courseid :");
				int crid = Integer.parseInt(br.readLine());
				boolean bre = CourseDao.deleteData(crid);
				if (bre) {
					System.out.println("the data is deleted!");
					
				} else {
					System.out.println("errorrrr");
				}
				
				
			}else if(choice == 4) {
				//details of the course
				Boolean bcrBoolean = CourseDao.showDetails();
				if (bcrBoolean) {
					System.out.println("the required data:");
					
					
				} else {
					System.out.println("vayena hajur!!");
				}
			}else if (choice ==5  ) {
				//exit
				break;
			}else {
				break;
			}
			
			
			
			
			
		}
		
		
	}
	// java core(rochak) , collection framework(Smriti) , oops(Ellis) , spring core (DI , lifecycle , autowiring )(omkar)
	// spring ORM(rikesh) , JDBC (Sunil) , servlet(nilson) , hibernate(darsan)
	
	

}
