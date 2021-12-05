
class SuperDepartment{
		
	void getdepartmentName() {
			String s1= new String("Super Department");
			System.out.println(s1);
		}
		
	void getTodaysWork() {
		 String s2 = new String("No Work as of now");
		 System.out.println(s2);
		}
		
	void  getWorkDeadline() {
		String s3 = new String("Nil");
		System.out.println(s3);
		}
		
	void isTodayAHoliday() {
		String s4= new String("Today is not a Holiday");
		System.out.println(s4);
		}
	}

 class AdminDepartment extends SuperDepartment{

	 void getDepartmentName(){
			String s5 = new String("Admin Department");
			System.out.println(s5);
		}
		
	void getTodaysWork() {
			String s6 = new String("Complete your documents Submission");
			System.out.println(s6);
		}
		
	void getWorkDeadline() {
		 String s7 = new String("Complete by EOD");
		 System.out.println(s7);
		}
	}


class HRDepartment extends SuperDepartment{

		
	void getDepartmentName(){
			String s8 = new String("Hr Department");
			System.out.println(s8);
		}
		
	void getTodaysWork() {
		String s9 = new String("Fill today's timesheet and mark your attendance");
		System.out.println(s9);
		}
		
	void getWorkDeadline() {
		String s10 = new String("Complete by EOD");
		System.out.println(s10);
		}
		
	void doActivity() {
		 String s11 = new String("team lunch");
		 System.out.println(s11);
		}
	}


class TechDepartment extends SuperDepartment{

	void getDepartmentName(){
		String s12 = new String("Tech Department");
		System.out.println(s12);
		}
		
	void getTodaysWork() {
		String s13 = new String("Complete coding of module1");
		System.out.println(s13);
		}
		
	void getWorkDeadline() {
		String s14 = new String("Complete by EOD");
		System.out.println(s14);
		}
		
	void getStackInformation() {
		String s15 = new String("core Java");
		System.out.println(s15);
		}
	}





 public class AssessmentOOPs {

	public static void main(String[]args) {
		
		SuperDepartment SD1 = new SuperDepartment(); 
		
		HRDepartment HD1 = new HRDepartment();
		
		AdminDepartment AD1 = new AdminDepartment();
		
		TechDepartment TD1 = new TechDepartment();
		
		System.out.println("Outputs of Super department");
		SD1.getdepartmentName();
		SD1.getTodaysWork();
		SD1.getWorkDeadline();
		SD1.isTodayAHoliday();		
		
		
		System.out.println("Outputs of HR department");
		HD1.getDepartmentName();
		HD1.getTodaysWork();
		HD1.getWorkDeadline();
		HD1.doActivity();
		HD1.isTodayAHoliday();
	
		
		System.out.println("Outputs of Administration  Department");
	
		AD1.getDepartmentName();
		AD1.getTodaysWork();
		AD1.getWorkDeadline();
		AD1.isTodayAHoliday();
		
		System.out.println("Outputs of Technical Department");
		
		TD1.getDepartmentName();
		TD1.getTodaysWork();
		TD1.getWorkDeadline();
		TD1.getStackInformation();
		TD1.isTodayAHoliday();
		
	}
	
}

 