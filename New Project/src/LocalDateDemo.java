import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {

	public static void main(String[] args) {
		
		LocalDate d1=LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2=LocalDate.of(2022, 12, 1);
		System.out.println(d2);
		
		LocalDate d3=LocalDate.parse("2021-10-10");
		System.out.println(d3);
		
		System.out.println(d1.plusDays(10));
		System.out.println(d2.plus(2,ChronoUnit.WEEKS));
		
		System.out.println(d2.plus(2,ChronoUnit.MONTHS));
		System.out.println(d3.minus(1,ChronoUnit.YEARS));
		
		System.out.println(d2.getDayOfWeek());
		System.out.println(d1.isLeapYear());
		
		//Birthday calculator
		LocalDate bd=LocalDate.parse("2003-12-14");
		LocalDate td=LocalDate.now();
		int year=td.getYear();
		
		
		System.out.println(td);
		System.out.println(bd);
		
		int i=0;
		while(year!=bd.getYear()+1)
		{
			year=td.minus(i,ChronoUnit.YEARS).getYear();
			i++;
		}
		System.out.println(i);
		
	}

}
