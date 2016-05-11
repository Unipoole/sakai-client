package coza.opencollab.unipoole.sakai.client;

import java.util.Date;

/**
 * Get all schedule events for a Site.
 * @author OpenCollab
 */
public interface ScheduleService {
    /**
     * Get all schedule events for a site given the siteId
     * @param sessionId
     * @param siteId
     * @return
     * @throws Exception 
     */
    public String getScheduleForSite(String sessionId, String siteId, Date fromDate) throws Exception;
}
