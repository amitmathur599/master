import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class JavaHungry {
    public static void main(String args[]) {
            //String input = "Java Hungry Blog Alive is Awesome";
    	      String input = "avA";
    	      Character result= input.chars()
    	    		  .mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
    	    		  .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
    	    		  .entrySet()
    	    		  .stream()
    	    		  .filter(entry->entry.getValue()==1L)
    	    		  .map(entry->entry.getKey())
    	    		  .findFirst()
    	    		  .get();

            System.out.println(result); 
            
            List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,2,3,4,5);
            Set<Integer> set=new HashSet<>();
            list.stream().
            filter(s->!set.add(s))
            .forEach(System.out::println);
            
            
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
            int max =  myList.stream()
                             .max(Integer::compare)
                             .get();
            System.out.println(max);       
    }
}