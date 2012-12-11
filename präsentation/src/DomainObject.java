

import java.util.UUID;

public class DomainObject {

	protected String uuid = "testString";
	private String name;
	private String comment;

	/**
	 * Default constructor
	 */
	protected DomainObject() {
		super();
	}

	/**
	 * Not default constructor
	 * @param name
	 * @param comment
	 */
	protected DomainObject(String name, String comment) {
		super();
	}


	/**
	 * getName function
	 * @return
	 */
	public String getName() {
		return name;
	}

}
