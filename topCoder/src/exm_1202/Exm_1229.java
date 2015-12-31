package exm_1202;
import org.json.simple.JSONObject;
public class Exm_1229 {

	   public static void main(String[] args) {
	      JSONObject obj = new JSONObject();
	      
	      obj.put("str", "javaking");
	      obj.put("num", new Integer(100));
	      obj.put("double", new Double(1000.21));
	      obj.put("is_boolean", new Boolean(true));

	      System.out.print(obj);
	   }
}
