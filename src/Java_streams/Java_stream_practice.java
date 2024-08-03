package Java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Java_stream_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adithya");
		names.add("Ram");
		names.add("Guru");
		//names.add("Akilesh");
		//names.add("Adam");
		
		int count=0;
		for(String i:names) {
			
			if(i.startsWith("A")) {
				count++;
			}
			
		} 
		System.out.println("normal code result "+count);
		
		// using Stream filter
		Long streamedlist1 = names.stream().filter(s-> s.startsWith("A")).count();
		System.out.println("number of names starting with A1 "+streamedlist1);
		
		//creation of stream
		long c = Stream.of("Don","Abhijith","Kiran","Adam","Harish").filter(s->s.startsWith("A")).count();
		System.out.println("number of names starting with A2 "+c);
		
		//print all values of the arrayList
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		System.out.println("");
		names.stream().filter(s->s.length()>=4).limit(1).forEach(s->System.out.println(s));
		System.out.println("");
		
		//Print names endswith a and convert into upper case
		Stream.of("Don","Abhijith","Kirana","Adam","Harisha").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("");
		
		//Print the names starts with a in upper case in sorted
		List<String> name = Arrays.asList("Don","Azbhijith","Kirana","Adam","Harisha","Akileash");
		name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("");
		
		//merging 2 lists
		Stream<String> newstream = Stream.concat(names.stream(), name.stream());
		//newstream.sorted().forEach(s->System.out.println(s));
		System.out.println("");
		
		//finding match in the list
		boolean b = newstream.anyMatch(s->s.equalsIgnoreCase("adam"));
		System.out.println(b);
		Assert.assertTrue(b);
		System.out.println("");
		
		// converting streams back to list
		List<String> ls = names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(1));
		System.out.println("");
		
		//Print the unique numbers and and sort the array
		List<Integer> name1 = Arrays.asList(1,1,3,3,5,7,2,2,3,4,10,0);
		name1.stream().distinct().sorted().forEach(s->System.out.println(s));
		List<Integer> ls2 = name1.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("");
		System.out.println(ls2.get(3));
		
		}

	}


