package coza.opencollab.unipoole.sakai.client;

import java.util.Date;

/**
 *
 */
public interface SamigoService {
	
	/**
	 * Gets the available assignments for a student for a specific site which has been changed after 
	 * the from Date
	 * @param sessionId Session ID for the admin user
	 * @param username Username of the user to get the available assignments of
	 * @param siteId Site ID to get assignments from
	 * @param fromDate Date to get assignments after
                   * @param pageTitle the tool title , this value is set in sakai and can be changed by the sakai admin so cannot be hardcoded.  
	 * @return
	 * @throws Exception
	 */
	public String getAvailableAssignments(String sessionId, String username, String siteId, Date fromDate, String pageTitle) throws Exception;

}
