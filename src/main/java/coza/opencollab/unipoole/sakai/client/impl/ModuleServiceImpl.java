package coza.opencollab.unipoole.sakai.client.impl;

import coza.opencollab.unipoole.sakai.client.ModuleService;
import javax.xml.rpc.ParameterMode;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

/**
 * Implements the Module Service to retrieve module data from Sakai.
 *
 * @author OpenCollab
 * @since 1.0.0
 */
public class ModuleServiceImpl extends AbstractServiceImpl  implements ModuleService {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSitesForCriteria(String sessionId, String siteTypes, String criteria) throws Exception {
        Call nc = getCall();
        nc.setOperationName("getSitesForCriteria");
        nc.addParameter("sessionid", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("siteTypes", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("moduleCode", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        return (String) nc.invoke(new Object[]{sessionId, siteTypes, criteria});
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSitesUserCanAccess(String sessionId, String userId, String siteTypes) throws Exception {
        Call nc = getCall();
        nc.setOperationName("getSitesUserCanAccess");
        nc.addParameter("sessionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("userId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("siteTypes", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        return (String) nc.invoke(new Object[]{sessionId, userId, siteTypes});
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSitesUserCanAccess(String sessionId, String siteTypes) throws Exception {
        Call nc = getCall();
        nc.setOperationName("getSitesUserCanAccess");
        nc.addParameter("sessionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("siteTypes", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        return (String) nc.invoke(new Object[]{sessionId, siteTypes});
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSitePagesAndTools(String sessionId, String moduleId) throws Exception {
        Call nc = getCall();
        nc.setOperationName("getPagesAndToolsForSite");
        nc.addParameter("sessionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("siteid", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        return (String) nc.invoke(new Object[]{sessionId, moduleId});
    }
}
