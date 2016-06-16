package Assignment5;

public class EnumExample {

		public enum Month {January,February,March,April,May,june,July,August,September,October,
			November,December};
			public static void main(String[] args) {
			for (Month m: Month.values()){
					System.out.println(m);
				}



	}

}
