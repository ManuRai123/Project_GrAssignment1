
import com.gl.department.*;

public class DriverMain {

	public static void main(String[] args) {
		// Admin Department
		SuperDepartment obj1 = new AdminDepartment();
		System.out.println(obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());

	}

}
