import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CurrentDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		
	}

}
