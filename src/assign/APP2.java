package assign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class APP2 {

	public static void main(String args[])

	{
		Integer[] narr = { 23, 35, 54, 45, 65 };

//		Stream<Integer> narrStream=Arrays.stream(narr);
//		narrStream.forEach((n)->System.out.println(n));

		// single line Arrays.stream(narr).forEach((p) -> System.out.println(p);
		Arrays.stream(narr).forEach((p) -> {

			if (p % 2 != 0)
				System.out.println(p);
		});

		List<String> names = new ArrayList<String>();
		names.add("Thaort");
		names.add("dsfsdf");
		names.add("dosa");
		names.add("done");
		// priniting values
		//names.stream().forEach((name) -> System.out.println(name));

		//filter contains letter
		
		// peek is used to show the data middle of the valiadation on that again u can do filer
		names.stream().filter((name)->name.contains("o"))
		.peek((name) -> System.out.println(name))
		.filter((name)->name.contains("n"))
		.forEach((name) -> System.out.println(name));
		
		
		
		
		
		
		// Stream with direct values
		Stream<Integer> anystream = Stream.of(23, 24, 25);
		anystream.forEach((e) -> System.out.println(e));

		// creating a stream from iteration
		Stream<Integer> itera = Stream.iterate(1, n -> n + 1).limit(10);

		itera.forEach((r) -> System.out.println(r));
		
		// map stream
		Integer[] narr2= {23,45,32,54,56};
		Stream<Integer> narrStream2 =Arrays.stream(narr2);
		//narrStream2.map((v)->v-2).forEach((o)-> System.out.println(o));
		
		narrStream2.map((k)->k*2).forEach((n)->System.out.println(n));

		//filter map
		
		Integer[] narr3= {23,45,32,87,78}; //{21,43,30,85,76} --after map  
		Stream<Integer> narrStream3 =Arrays.stream(narr3);
		//narrStream3.filter((v)->{return v%2==0;}).forEach((v)->System.out.println(v));
		narrStream3.map(v->v-2).filter((v)->{return v%2==0;}).map(v->v-1)
		.forEach((v)->System.out.println(v));
		
		// for colletcors stored in variable
		//List data=narrStream3.filter((n)->n%2==0).collect(colletors.toList())
		
	}

}