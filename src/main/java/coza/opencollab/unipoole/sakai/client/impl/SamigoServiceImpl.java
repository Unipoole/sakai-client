package coza.opencollab.unipoole.sakai.client.impl;

import java.util.Date;

import javax.xml.rpc.ParameterMode;

import org.apache.axis.client.Call;
import org.apache.axis.encoding.XMLType;
import org.apache.log4j.Logger;

import coza.opencollab.unipoole.sakai.client.SamigoService;

public class SamigoServiceImpl extends AbstractServiceImpl implements SamigoService {

	 /**
     * The logger
     */
    private static final Logger LOG = Logger.getLogger(SamigoServiceImpl.class);

    /*
     * (non-Javadoc)
     * @see coza.opencollab.unipoole.sakai.client.SamigoService#getAvailableAssignments(java.lang.String, java.lang.String, java.util.Date)
     */
	@Override
	public String getAvailableAssignments(String sessionId, String username, String siteId, Date fromDate,String pageTitle) throws Exception {
		Call nc = getCall();
        nc.setOperationName("getAvailableAssignments");
        nc.addParameter("sessionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("username", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("siteId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("fromDate", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("pageTitle", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        String dateString = "";
        if (fromDate != null) {
            dateString = String.valueOf(fromDate.getTime());
        }
        LOG.info("getAvailableAssignments | studentSessionId : " + sessionId + " | moduleId : " + siteId +" | fromDate :" + dateString+" | pageTitle : " + pageTitle);
        return (String) nc.invoke(new Object[]{sessionId, username, siteId, dateString,pageTitle});
    }
}
