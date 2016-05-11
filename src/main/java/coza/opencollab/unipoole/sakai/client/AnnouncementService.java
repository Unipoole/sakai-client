package coza.opencollab.unipoole.sakai.client;

import java.util.Date;

/**
 *
 * @author OpenCollab
 */
public interface AnnouncementService {
    
    public String getAnnouncementsForSite(String sessionId, String siteId, Date fromDate) throws Exception;
}
