package xyz.blueplane.events;

import bp.Event;

/**
 * An event that is requested (with high priority) whenever backoffice_db saves an application
 */
@SuppressWarnings("serial")
public class CoreApplicationSave extends Event {
	
	/**
	 * Name of the application
	 */
	public String application_name;
	
	/**
	 * State of the application
	 */
	public String application_state;


	/**
	 * Constructor.
	 * 
	 * @param application_name
	 *            Name of the application saved
	 * @param application_state
	 *            State of the application
	 */
	public CoreApplicationSave(String application_name, String application_state) {
		super();
		this.application_name = application_name;
		this.application_state = application_state;
		this.setName("CoreApplicationSave(" + application_name+ "," + application_state + ")");
	}

	/**
	 * @see java.lang.Object#toString()
	 */


}
