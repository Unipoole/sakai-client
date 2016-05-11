package coza.opencollab.unipoole.sakai.client;

import java.util.Date;

/**
 *
 * @author OpenCollab
 */
public interface YaftService {
    /**
     * 
     * @param sessionId
     * @param siteId
     * @param fromDate
     * @return
     * @throws Exception 
     */
    public String getForumsForSite(String sessionId , String siteId, Date fromDate) throws Exception;
    
    /**
     * 
     * @param sessionId
     * @param siteId
     * @param userId
     * @param forumId
     * @param subject
     * @param content
     * @param createdDate
     * @return
     * @throws Exception 
     */
    public String createDiscussion(String sessionId , String siteId,String userId,String forumId, String subject,String content,Date createdDate) throws Exception; 
    
    /**
     * 
     * @param sessionId
     * @param siteId
     * @param forumId
     * @param discussionId
     * @param userId
     * @return
     * @throws Exception 
     */
    public String deleteDisucssion(String sessionId,String siteId, String forumId, String userId, String discussionId) throws  Exception;
    
    /**
     * 
     * @param sessionId
     * @param siteId
     * @param userId
     * @param forumId
     * @param discussionId
     * @param subject
     * @param content
     * @param updatedDate
     * @param start
     * @param end
     * @param status
     * @return
     * @throws Exception 
     */
    public String updateDisucssion(String sessionId, String siteId,String userId, String forumId, String discussionId, String subject, String content, Date updatedDate, String start, String end, String status) throws Exception;
    
    /**
     * 
     * @param sessionId
     * @param siteId
     * @param forumId
     * @param userId
     * @param discussionId
     * @param subject
     * @param content
     * @param createdDate
     * @return
     * @throws Exception 
     */
    public String createMessage( String sessionId, String siteId, String forumId, String userId, String discussionId, String subject, String content, Date createdDate, String parentId) throws Exception;
    
    /**
     * 
     * @param sessionId
     * @param siteId
     * @param forumId
     * @param userId
     * @param messageId
     * @param subject
     * @param content
     * @param createdDate
     * @return
     * @throws Exception 
     */
    public String updateMessage(String sessionId, String siteId, String forumId, String userId, String messageId , String subject, String content, Date createdDate, String parentId) throws Exception;
    
    /**
     * 
     * @param sessionId
     * @param siteId
     * @param forumId
     * @param userId
     * @param messageId
     * @return
     * @throws Exception 
     */
    public String deleteMessage(String sessionId, String siteId, String forumId, String userId, String messageId) throws Exception;
}
