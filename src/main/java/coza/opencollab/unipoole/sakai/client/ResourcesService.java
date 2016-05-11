package coza.opencollab.unipoole.sakai.client;

import java.util.Date;

/**
 * Service to retrieve resource tool data from the Sakai LMS
 *
 * @author OpenCollab
 */
public interface ResourcesService {

    /**
     * Get all resource tool data for a module (Sakai site) given the sessionId
     * , siteId and the fromDate. If the fromDate is null all resource tool data
     * will be returned
     *
     * @param sessionId
     * @param siteId
     * @param fromDate
     * @return
     * @throws Exception
     * <?xml version="1.0" encoding="UTF-8"?>
     * <list>
     * <resource created="20120119101204781"
     * created-by="73738c53-e717-488e-b686-f2f5f7956bc6" desscription=""
     * id="/group/ACN203S-12-S1/Graphics/" is-collection="true"
     * last-changed="20120119101204781"
     * last-changed-by="73738c53-e717-488e-b686-f2f5f7956bc6" name="Graphics"
     * parent-id="ACN203S-12-S1" size="0" type="resource/collection"
     * url="http://domain.com/access/content/group/ACN203S-12-S1/Graphics/"/>
     * <resource created="20120120121303913"
     * created-by="73738c53-e717-488e-b686-f2f5f7956bc6" desscription=""
     * id="/group/ACN203S-12-S1/Graphics/Image 010.png" is-collection="false"
     * last-changed="20120120121303928"
     * last-changed-by="73738c53-e717-488e-b686-f2f5f7956bc6" name="Image
     * 010.png" parent-id="/group/ACN203S-12-S1/Graphics/" size="34827"
     * type="image/x-png"
     * url="http://domain.com/access/content/group/ACN203S-12-S1/Graphics/Image%20010.png">
     * <content/>
     * </resource>
     * <resource>
     * <content/>
     * </resource>
     * ...
     * </list>
     */
    public String getResourcesForSite(String sessionId, String siteId, Date fromDate) throws Exception;

    /**
     * Get a specifc resource tool item, when given the session Id & the
     * resource id
     *
     * @param sessionId
     * @param resourceId
     * @return
     * @throws Exception
     * <?xml version="1.0" encoding="UTF-8"?>
     * <list>
     * <resource created="20120119101204781"
     * created-by="73738c53-e717-488e-b686-f2f5f7956bc6" desscription=""
     * id="/group/ACN203S-12-S1/Graphics/" is-collection="false"
     * last-changed="20120119101204781"
     * last-changed-by="73738c53-e717-488e-b686-f2f5f7956bc6" name="Graphics"
     * parent-id="ACN203S-12-S1" size="0" type="resource/collection"
     * url="http://domain.com/access/content/group/ACN203S-12-S1/Graphics/"/>
     * <content/>
     * </resource>
     * </list>
     */
    public String getResource(String sessionId, String resourceId) throws Exception;

    /**
     * To get the actual resource data (file,link,etc) , provide the sessionId and resourceId
     * @param sessionId
     * @param resourceId
     * @return
     * @throws Exception
     * <?xml version="1.0" encoding="UTF-8"?>
     * <resource>
     * <content>aHR0cDovL3d3dy55b3V0dWJlLmNvbS93YXRjaD92PUlJQWRIRXdpQXk4</content>
     * </resource>
     */
    public String getResourceData(String sessionId, String resourceId) throws Exception;
}
