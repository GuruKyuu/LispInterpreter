import java.util.HashMap;
import java.util.Map;

public class Environment {
	public Map<String, SimpleNode> idList;
	
	public Environment() {
		idList = new HashMap<String, SimpleNode>();
	}
	
	public void put(String s, SimpleNode n) {
		idList.put(s, n);
	}

	public void print() {
		System.out.println("Environment: ");
		for (Map.Entry<String, SimpleNode> e : idList.entrySet())
			System.out.println(e.getKey() + " " + e.getValue().name);
	}
	
	public SimpleNode get(String s) {
		return idList.get(s);
	}
}
