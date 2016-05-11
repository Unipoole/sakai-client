package coza.opencollab.unipoole.sakai.client.impl;

import coza.opencollab.unipoole.sakai.client.ResourcesService;
import java.util.Date;
import javax.xml.rpc.ParameterMode;
import org.apache.axis.client.Call;
import org.apache.axis.components.logger.LogFactory;
import org.apache.axis.encoding.XMLType;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;

public class ResourcesServiceImpl extends AbstractServiceImpl  implements ResourcesService {
        /**
     * The logger
     */
    private static final Logger LOG = Logger.getLogger(ResourcesServiceImpl.class);
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String getResourcesForSite(String sessionId, String siteId, Date fromDate) throws Exception {
        Call nc = getCall();
        nc.setOperationName("getResourcesForSite");
        nc.addParameter("sessionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("siteId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("fromDate", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        String dateString = "";
        if (fromDate != null) {
            dateString = String.valueOf(fromDate.getTime());
        }
        return (String) nc.invoke(new Object[]{sessionId, siteId, dateString});
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getResource(String sessionId, String resourceId) throws Exception {
        Call nc = getCall();
        nc.setOperationName("getResource");
        nc.addParameter("sessionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("resourceId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        return (String) nc.invoke(new Object[]{sessionId, resourceId});
    }

    @Override
    public String getResourceData(String sessionId, String resourceId) throws Exception {
        Call nc = getCall();
        nc.setOperationName("getResourceData");
        nc.addParameter("sessionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("resourceId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        return (String) nc.invoke(new Object[]{sessionId, resourceId});
    }
}
