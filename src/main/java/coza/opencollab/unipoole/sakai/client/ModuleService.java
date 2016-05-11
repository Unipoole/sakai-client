package coza.opencollab.unipoole.sakai.client;

/**
 * The Module Service API to retrieve module data from Sakai.
 * 
 * @author OpenCollab
 * @since 1.0.0
 */
public interface ModuleService {
    /**
     * Retrieve all the sites that contains this module code.
     * 
     * @param sessionId the session id of a admin user
     * @param siteTypes The site type in a comma delimited list, could be null.
     * @param criteria The criteria, ex. module code to check
     * @return The return XML format is below:
     * <sites>
     * <status>SUCCESS/ERROR</status>
     * <message>If there was a error</message>
     * <site>
     * <id>!admin</id>
     * <title>Administration Workspace</title>
     * <description>Administration Workspace</description>
     * <shortDescription>Administration Workspace</shortDescription>
     * </site>
     * <site>
     * ...
     * </site>
     * ...
     * </sites>
     * @throws Exception 
     */
    public String getSitesForCriteria(String sessionId, String siteTypes, String criteria) throws Exception;
    /**
     * Return XML document listing all sites the given user has read access to.
     *
     * @param sessionId The session id of a super user
     * @param userId eid (eg jsmith26) if the user you want the list for
     * @param siteTypes all the site types to search, could be null. This is a comma delimited list.
     * @return See getSitesUserCanAccess(sessionId)
     * @throws AxisFault If not super user or any other error occurs from main method
     */
    public String getSitesUserCanAccess(String sessionId, String userId, String siteTypes) throws Exception;
    /**
     * Return XML document listing all sites user has read access based on their session id.
     *
     * @param sessionId The session id of a user who's list of sites you want to retrieve
     * @param siteTypes all the site types to search, could be null. This is a comma delimited list.
     * @return	xml or an empty list <list/>. The return XML format is below:
     * <sites>
     * <site>
     * <id>!admin</id>
     * <title>Administration Workspace</title>
     * <description>Administration Workspace</description>
     * <shortDescription>Administration Workspace</shortDescription>
     * </site>
     * <site>
     * ...
     * </site>
     * ...
     * </sites>
     */
    public String getSitesUserCanAccess(String sessionId, String siteTypes) throws Exception;
    /**
     * Return XML document listing all pages and tools in those pages for a
     * given site. The session id must be of a valid, active user in that site,
     * or a super user, or it will throw an exception. If a page is hidden in a
     * site, the page and all tools in that page will be skipped from the
     * returned document, as they are in the portal. Super user's can request
     * any site to retrieve the full list.
     *
     * @param sessionId the session id of a user in a site, or a super user
     * @param siteId the site to retrieve the information for
     * @return	xml or an empty list <site/>. The return XML format is below:
     * <site id="9ec48d9e-b690-4090-a300-10a44ed7656e">
     * <pages>
     * <page id="ec1b0ab8-90e8-4d4d-bf64-1e586035f08f">
     * <page-title>Home</page-title>
     * <tools>
     * <tool id="dafd2a4d-8d3f-4f4c-8e12-171968b259cd">
     * <tool-id>sakai.iframe.site</tool-id>
     * <tool-title>Site Information Display</tool-title>
     * </tool>
     * ...
     * </tools>
     * </page>
     * <page>
     * ...
     * </page>
     * ...
     * </pages>
     * </site>
     *
     * @throws	AxisFault	if not a super user and the user attached to the
     * session is not in the site, if site does not exist
     *
     */
    public String getSitePagesAndTools(String sessionId, String moduleId) throws Exception;
}
