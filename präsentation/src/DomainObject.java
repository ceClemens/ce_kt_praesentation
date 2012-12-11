

import java.util.UUID;

public class DomainObject {

	private String uuid = UUID.randomUUID().toString();
	private String name;
	private String comment;

	/**
	 * Default constructor
	 */
	protected DomainObject() {
		super();
	}

	protected DomainObject(String name, String comment) {
		super();
	}


	public String getName() {
		return name;
	}

}
