package exceptions;

public class ThrowDomainException {
	public static void main(String[] args) throws DomainException {
		int x = 2;
		if(x < 2) {
			throw new DomainException("X is smaller than 2");
		} else if(x == 2) {
			throw new DomainException("X is equals to 2");
		} else {
			throw new DomainException("X is bigger than 2");
		}
	}
}
