package hashmap;
import java.util.*;


public class remove_key {

	    public boolean property(Double value) {
		        if(value<65)
			            return true;
	        return false;				
	    }

	    public void detained(Map<String, Double> obj) {
            // Define the detained() method}}
            // Create a list to store the keys of students to be removed
            List<String> keysToRemove = new ArrayList<>();

            // Iterate over the map to check the students who need to be removed
            for (Map.Entry<String, Double> entry : obj.entrySet()) {
                String studentName = entry.getKey();
                Double marks = entry.getValue();

                if (property(marks)) {
                    keysToRemove.add(studentName);
                }
            }

            // Remove the detained students from the map
            for (String key : keysToRemove) {
                obj.remove(key);
            }
            System.out.println(obj);
        }
	    public void display(Map<String, Double> obj) {
		        System.out.println(obj);
	    }

	    public static void main(String[] args) {
		        Map<String,Double> map=new TreeMap<String,Double>();
		        Scanner scanner=new Scanner(System.in); 
		        for (int i=0; i<6; i++) {
			            map.put(scanner.next(),scanner.nextDouble());
		        }
		        remove_key obj=new remove_key();
		        obj.detained(map);
                
	    
        }
    }
