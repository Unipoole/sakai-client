
package coza.opencollab.unipoole.sakai.client;

/**
 * The API for the Sakai login service.
 * 
 * @author OpenCollab
 * @since 1.0.0
 */
public interface LoginService {
    /**
     * Log in to Sakai using the credentials.
     * 
     * @return The session id.
     * @throws Exception If there was a problem logging in.
     */
    public String login(String username, String password) throws Exception;
    /**
     * Log a user out of Sakai.
     * 
     * @param sessionId The session id.
     * @return true if the user was logged out, meaning the session was still valid, false otherwise.
     */
    public boolean logout(String sessionId) throws Exception;
    /**
     * Retrieve the user details.
     * 
     * @param sessionId The session id.
     * @param username The username.
     * @return The user details.
     */
    public String getUserDetails(String sessionId, String username) throws Exception;
}
