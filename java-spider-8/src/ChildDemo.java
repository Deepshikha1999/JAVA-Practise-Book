
public class ChildDemo<X,S> extends Demo<X> {
	private S temp;

	public ChildDemo(X demo,S temp) {
		super(demo);
		this.temp=temp;
		// TODO Auto-generated constructor stub
	}

	public S getTemp() {
		return temp;
	}

	public void setTemp(S temp) {
		this.temp = temp;
	}
}
