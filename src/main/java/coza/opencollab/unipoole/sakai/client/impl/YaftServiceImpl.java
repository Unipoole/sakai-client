package coza.opencollab.unipoole.sakai.client.impl;

import coza.opencollab.unipoole.sakai.client.YaftService;
import java.util.Date;
import javax.xml.rpc.ParameterMode;
import org.apache.axis.client.Call;
import org.apache.axis.encoding.XMLType;
import org.apache.log4j.Logger;

/**
 *
 * @author OpenCollab
 */
public class YaftServiceImpl extends AbstractServiceImpl implements YaftService {

    /**
     * The logger
     */
    private static final Logger LOG = Logger.getLogger(YaftServiceImpl.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public String getForumsForSite(String sessionId, String siteId, Date fromDate) throws Exception {
        Call nc = getCall();
        nc.setOperationName("getForumsForSiteById");
        nc.addParameter("sessionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("siteId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("fromDate", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        String dateString = "";
        if (fromDate != null) {
            dateString = String.valueOf(fromDate.getTime());
        }
        LOG.info("getForumsForSiteById | sessionId : " + sessionId + " | siteId : " + siteId + " | dateString : " + dateString);
        return (String) nc.invoke(new Object[]{sessionId, siteId, dateString});
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String createDiscussion(String sessionId, String siteId, String userId, String forumId, String subject, String content, Date createdDate) throws Exception {
        Call nc = getCall();
        nc.setOperationName("createDiscussion");
        nc.addParameter("sessionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("siteId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("userId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("forumId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("subject", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("content", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("createdDate", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        String dateString = "";
        if (createdDate != null) {
            dateString = String.valueOf(createdDate.getTime());
        }
        return (String) nc.invoke(new Object[]{sessionId, siteId, userId, forumId, subject, content, dateString});
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String deleteDisucssion(String sessionId, String siteId, String forumId, String userId, String discussionId) throws Exception {
        Call nc = getCall();
        nc.setOperationName("deleteDisucssion");
        nc.addParameter("sessionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("siteId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("forumId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("userId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("discussionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        return (String) nc.invoke(new Object[]{sessionId, siteId, forumId, userId, discussionId});
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String updateDisucssion(String sessionId, String siteId, String userId, String forumId, String discussionId, String subject, String content, Date updatedDate, String start, String end, String status) throws Exception {
        Call nc = getCall();
        nc.setOperationName("updateDisucssion");
        nc.addParameter("sessionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("siteId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("userId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("forumId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("discussionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("subject", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("content", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("updatedDate", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("start", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("end", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("status", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        String dateString = "";
        if (updatedDate != null) {
            dateString = String.valueOf(updatedDate.getTime());
        }
        return (String) nc.invoke(new Object[]{sessionId, siteId, userId, forumId, discussionId, subject, content, dateString, start, end, status});
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String createMessage(String sessionId, String siteId, String forumId, String userId, String discussionId, String subject, String content, Date createdDate, String parentId) throws Exception {
        Call nc = getCall();
        nc.setOperationName("createMessage");
        nc.addParameter("sessionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("siteId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("forumId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("userId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("discussionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("subject", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("content", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("createdDate", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("parentId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        String dateString = "";
        if (createdDate != null) {
            dateString = String.valueOf(createdDate.getTime());
        }
        return (String) nc.invoke(new Object[]{sessionId, siteId, userId, forumId, discussionId, subject, content, dateString, parentId});
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String updateMessage(String sessionId, String siteId, String forumId, String userId, String messageId, String subject, String content, Date createdDate, String parentId) throws Exception {
        Call nc = getCall();
        nc.setOperationName("updateMessage");
        nc.addParameter("sessionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("siteId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("forumId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("userId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("messageId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("subject", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("content", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("createdDate", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("parentId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        String dateString = "";
        if (createdDate != null) {
            dateString = String.valueOf(createdDate.getTime());
        }
        return (String) nc.invoke(new Object[]{sessionId, siteId, userId, forumId, messageId, subject, content, dateString,parentId});
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String deleteMessage(String sessionId, String siteId, String forumId, String userId, String messageId) throws Exception {
        Call nc = getCall();
        nc.setOperationName("updateMessage");
        nc.addParameter("sessionId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("siteId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("forumId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("userId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("messageId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        return (String) nc.invoke(new Object[]{sessionId, siteId, userId, forumId, messageId});
    }
}
