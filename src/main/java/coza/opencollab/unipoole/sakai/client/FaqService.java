package coza.opencollab.unipoole.sakai.client;

import java.util.Date;

/**
 *
 * @author OpenCollab
 */
public interface FaqService {
    /**
     * Gets the content of the faq tool for a specific site from Sakai
     * 
     * @param siteId
     * @param fromDate
     * @return String the content faq tool in xml format
     * @throws Exception 
     */
    public String getFaqForSite(String siteId, Date fromDate) throws Exception;
}
