/**
 * 
 */
package comparator;

import java.util.Comparator;

/**
 * @author U04E112
 */
public abstract class EnhancedComparator<T> implements Comparator<T> {

	private final EnhancedComparator<T> parent;

	public EnhancedComparator() {
		parent = this;
	}

	protected EnhancedComparator<T> reversed() {
		return new EnhancedComparator<T>() {

			@Override
			public int compare(final T o1, final T o2) {
				return -parent.compare(o1, o2);
			}

		};
	}

	static <T, U extends Comparable<U>> EnhancedComparator<T> comparing(final Function<T, U> keyExtractor) {
		return new EnhancedComparator<T>() {

			@Override
			public int compare(final T o1, final T o2) {
				return keyExtractor.apply(o1).compareTo(keyExtractor.apply(o2));
			}
		};
	}
}
