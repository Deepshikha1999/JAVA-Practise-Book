@FunctionalInterface
public interface Currency {
	double value();
	
	Currency dollar=()->1.0;
	Currency rupee=()->75.5;
	Currency dirham=()->0.9;
	
	static double convert(double amount,Currency source,Currency target)
	{
		amount=amount*(target.value()/source.value());
		return amount;
	}
}
