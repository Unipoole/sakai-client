package coza.opencollab.unipoole.sakai.client;

import java.util.Date;

/**
 *
 * @author OpenCollab
 */
public interface MeleteService {
    /**
     * Retrieve modules for site given sessionId and siteId
     * @param sessionId  sakai generated sessionId
     * @param siteId sakai site identifier.
     * @return a sting of sakai produced XML content
     */
    public String getLearningModuleForSite(String sessionId , String siteId, Date fromDate) throws Exception;

}
