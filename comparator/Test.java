/**
 * 
 */
package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author U04E112
 */
public class Test {

	public void test() {
		Assure a1 = new Assure();
		a1.setCoTypeTache(1);
		Assure a2 = new Assure();
		a2.setCoTypeTache(2);
		List<Assure> primes = Arrays.asList(a1, a2);

		EnhancedComparator<Assure> comparing = EnhancedComparator.comparing(Assure._getCoTypeTache).reversed();
		Collections.sort(primes, comparing);
		assert primes.get(0) == a2;

		comparing = EnhancedComparator.comparing(Assure._getCoTypeTache);
		Collections.sort(primes, comparing);
		assert primes.get(0) == a1;

	}

	public static void main(final String[] args) {
		boolean enabledAssert = false;
		assert enabledAssert = true;
		if (!enabledAssert) {
			throw new AssertionError();
		}
		new Test().test();
	}

}
