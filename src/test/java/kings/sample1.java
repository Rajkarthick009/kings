package kings;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class sample1 {
public static void main(String[] args) throws IOException, ParseException {
FileReader r= new FileReader("C:\\Users\\karthiabi\\kings\\src\\test\\resources\\json\\sample.json");
JSONParser p= new JSONParser();
Object o=p.parse(r);
JSONObject j= (JSONObject)o;
Object o2=j.get("firstname");
Object o24=j.get("lastname");
Object o3=j.get("Address");
Object o4=j.get("Email");
Object o5=j.get("phonenumber");
Object o6=j.get("Gender");
Object o7=j.get("Hobbies");
Object o8=j.get("Language");
Object o9=j.get("Skills");
Object o10=j.get("Select country");
Object o11=j.get("Month");
Object o12=j.get("Day");
Object o13=j.get("year");
Object o14=j.get("password");
Object o15=j.get("confirm password");
 System.out.println(o2);
 System.out.println(o24); 
 System.out.println(o3);
System.out.println(o4);
System.out.println(o5);
System.out.println(o6);
System.out.println(o7);
System.out.println(o8);
System.out.println(o9);
System.out.println(o10);
System.out.println(o11);
System.out.println(o12);
System.out.println(o13);
System.out.println(o14);
System.out.println(o15);
	}
}


