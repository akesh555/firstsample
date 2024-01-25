package assign;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class CurrentTime {

	public static void main(String args[]) {
		
//		LocalTime CurrentTime =LocalTime.now();
//		System.out.println(CurrentTime);
//		LocalTime customTime =LocalTime.of(12,23, 34);
//		System.out.println(customTime);
//		LocalTime parsedtime =LocalTime.parse("10:59:13");
//		System.out.println(parsedtime);
//		System.out.println(CurrentTime.getHour());
//		System.out.println(CurrentTime.getMinute());
//		System.out.println(CurrentTime.plusMinutes(30));
//		System.out.println(CurrentTime.minusHours(2));
//		System.out.println(customTime.equals(CurrentTime));
//		
//		//combination of data and time.
//		LocalDateTime Lct =LocalDateTime.now();
//		System.out.println(Lct);
//		LocalDateTime custDt=LocalDateTime.of(2023, 11, 2, 12, 23);
//		System.out.println(custDt);
//		System.out.println(custDt.getDayOfMonth());
//		
//		//zones
//		ZonedDateTime ZT =ZonedDateTime.now();
//		System.out.println(ZT);
//		//zones Id work on class.Shows all zones
//		//ZoneId.getAvailableZoneIds().forEach((n)->System.out.println(n));
//		ZonedDateTime customZt =ZonedDateTime.of(2024, 11, 22, 11, 23, 23,20, ZoneId.of("Asia/Singapore"));
//		System.out.println(customZt);
//		System.out.println(ZT.toEpochSecond());
		
//		Instant inst1=Instant.now();
//		System.out.println(inst1);
		
		//FlatMap
		List list3=Arrays.asList(22,44,68);
		List list2=Arrays.asList(44,56,34);
		List list1=Arrays.asList(23,56,67);
	List<List<Integer>> mainList=new ArrayList();
	
	mainList.add(list1);
	mainList.add(list2);
	mainList.add(list3);
	  System.out.println(mainList);
	  
	List newlist=mainList.stream()
			.flatMap((l)->l.stream())
			.filter(n ->n%2==0)
			.collect(Collectors.toList());
	   System.out.println(newlist);
	  
	   //adding values.
	   List<Integer> data=Arrays.asList(23,45,67,89);
	  Integer b= data.stream().reduce((v1,v2)->{return v1+v2;}).get();
	  System.out.println(b);
	  
	  //comparision values 
	  Integer b1= data.stream().reduce((v1,v2)->{return v1>v2?v1:v2;}).get();
	  System.out.println(b1);
	  
	  //count
	  long c=data.stream().count();
	  System.out.println(c);
	  
	}


}
