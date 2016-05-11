package coza.opencollab.unipoole.sakai.client;

import java.util.Date;

/**
 * Gets the Welcome data from Sakai
 * 
 * @author OpenCollab
 */
public interface WelcomeService {
    
    /**
     * Gets the content of the welcome message for a specific site from Sakai
     * 
     * @param siteId
     * @param fromDate
     * @return String the content of the welcome message for the site
     * @throws Exception 
     */
    public String getWelcomeForSite(String siteId, Date fromDate) throws Exception;
    
}
