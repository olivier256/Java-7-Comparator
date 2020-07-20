/**
 * 
 */
package comparator;

/**
 * @author U04E112
 */
public class Assure {
	public static Function<Assure, Integer> _getCoTypeTache = new Function<Assure, Integer>() {

		@Override
		public Integer apply(final Assure t) {
			return t.getCoTypeTache();
		}
	};

	private Integer coTypeTache;

	public Integer getCoTypeTache() {
		return coTypeTache;
	}

	public void setCoTypeTache(final Integer coTypeTache) {
		this.coTypeTache = coTypeTache;
	}

	@Override
	public String toString() {
		return "Assure [coTypeTache=" + coTypeTache + "]";
	}

}
