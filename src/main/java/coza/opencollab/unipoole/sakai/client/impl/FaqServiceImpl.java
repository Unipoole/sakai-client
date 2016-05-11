package coza.opencollab.unipoole.sakai.client.impl;

import coza.opencollab.unipoole.sakai.client.FaqService;
import java.util.Date;
import javax.xml.rpc.ParameterMode;
import org.apache.axis.client.Call;
import org.apache.axis.encoding.XMLType;
import org.apache.log4j.Logger;

/**
 *
 * @author OpenCollab
 */
public class FaqServiceImpl extends AbstractServiceImpl  implements FaqService {

    /**
     * The logger
     */
    private static final Logger LOG = Logger.getLogger(FaqServiceImpl.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public String getFaqForSite(String siteId, Date fromDate) throws Exception {
        Call nc = getCall();
        nc.setOperationName("getFaqForSite");
        nc.addParameter("siteId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("fromDate", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        String dateString = "";
        if (fromDate != null) {
            dateString = String.valueOf(fromDate.getTime());
        }
        LOG.info( "getFaqForSite | siteId : " + siteId + " | dateString : "+ dateString );
        return (String) nc.invoke(new Object[]{siteId, dateString});
    }
}
