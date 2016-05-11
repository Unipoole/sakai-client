package coza.opencollab.unipoole.sakai.client.impl;

import coza.opencollab.unipoole.sakai.client.WelcomeService;
import java.util.Date;
import javax.xml.rpc.ParameterMode;
import org.apache.axis.client.Call;
import org.apache.axis.encoding.XMLType;

/**
 *
 * @author OpenCollab
 */
public class WelcomeServiceImpl extends AbstractServiceImpl  implements WelcomeService {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getWelcomeForSite(String siteId, Date fromDate) throws Exception {
        Call nc = getCall();
        nc.setOperationName("getWelcomeForSite");
        nc.addParameter("siteId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("fromDate", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        String dateString = "";
        if (fromDate != null) {
            dateString = String.valueOf(fromDate.getTime());
        }
        return (String) nc.invoke(new Object[]{siteId, dateString});
    }
}
