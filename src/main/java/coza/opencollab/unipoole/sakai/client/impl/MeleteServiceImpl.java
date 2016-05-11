package coza.opencollab.unipoole.sakai.client.impl;

import coza.opencollab.unipoole.sakai.client.MeleteService;
import java.util.Date;
import javax.xml.rpc.ParameterMode;
import org.apache.axis.client.Call;
import org.apache.axis.encoding.XMLType;
import org.apache.log4j.Logger;

/**
 *
 * @author OpenCollab
 */
public class MeleteServiceImpl extends AbstractServiceImpl implements MeleteService {

    /**
     * The logger
     */
    private static final Logger LOG = Logger.getLogger(MeleteServiceImpl.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLearningModuleForSite(String sessionId, String siteId, Date fromDate) throws Exception {
        Call nc = getCall();
        nc.setOperationName("getMeleteCourseModule");
        nc.addParameter("sessionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("siteId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("fromDate", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        String dateString = "";
        if (fromDate != null) {
            dateString = String.valueOf(fromDate.getTime());
        }
        LOG.info("getMeleteCourseModule | sessionId : " + sessionId + " | siteId : " + siteId + " | dateString : " + dateString);
        return (String) nc.invoke(new Object[]{sessionId, siteId, dateString});
    }
}
