package coza.opencollab.unipoole.sakai.client;

/**
 * The Event Service API to post events to Sakai.
 * 
 * @author OpenCollab
 * @since 1.0.0
 */
public interface EventService {
    
    /**
     * Create a event in Sakai for the user.
     * The context will be null and modify will be false.
     * 
     * @param sessionId A admin session id.
     * @param username A username to log the event to.
     * @param eventName The event name.
     * @param resource The resource.
     */
    public void postEvent(String sessionId, String username, String eventName, String resource) throws Exception;
    
    /**
     * Create a event in Sakai for the user.
     * 
     * @param sessionId A admin session id.
     * @param eventName The event name.
     * @param resource The resource.
     * @param context The context.
     * @param modify true if the event cause something to be modified.
     */
    public void postEvent(String sessionId, String eventName, String resource, String context, boolean modify) throws Exception;
    
    /**
     * Create a event in Sakai for the user.
     * 
     * @param sessionId A admin session id.
     * @param username A username to log the event to.
     * @param eventName The event name.
     * @param resource The resource.
     * @param context The context.
     * @param modify true if the event cause something to be modified.
     */
    public void postEvent(String sessionId, String username, String eventName, String resource, String context, boolean modify) throws Exception;
}
