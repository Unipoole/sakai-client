package coza.opencollab.unipoole.sakai.client.impl;

import coza.opencollab.unipoole.sakai.client.AssignmentService;
import java.util.Date;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.encoding.XMLType;
import org.apache.axis.client.Call;

/**
 *
 * @author OpenCollab
 */
public class AssignmentServiceImpl extends AbstractServiceImpl implements AssignmentService{

    @Override
    public String getAssignmentsForContext(String sessionId, String context, Date fromDate) throws Exception {
        Call nc = getCall();
        nc.setOperationName("getAssignmentsForContext");
        nc.addParameter("sessionid", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("context", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("fromDate", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        String dateString = "";
        if(fromDate != null){
            dateString = String.valueOf(fromDate.getTime());
        }
        return (String) nc.invoke(new Object[]{sessionId, context, dateString});
    }
    
    @Override
    public String getUserSubmissionsForContextAssignments(String sessionId, String userId, String context, Date fromDate) throws Exception {
        Call nc = getCall();
        nc.setOperationName("getUserSubmissionsForContextAssignments");
        nc.addParameter("sessionid", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("userId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("context", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("filterDate", XMLType.XSD_STRING, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        String dateString = "";
        if(fromDate != null){
            dateString = String.valueOf(fromDate.getTime());
        }
        return (String) nc.invoke(new Object[]{sessionId, userId, context, dateString});
    }

    @Override
    public String editAssignmentSubmission(String sessionId, String context, String assignmentId, String userId, String submittedText, String[] attachmentNames, String[] attachmentMimeTypes, byte[][] content) throws Exception {
        Call nc = getCall();
        nc.setOperationName("editAssignmentSubmission");
        nc.addParameter("sessionid", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("context", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("assignmentId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("userId", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("submittedText", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("attachmentNames", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("attachmentMimeTypes", XMLType.XSD_STRING, ParameterMode.IN);
        nc.addParameter("content", XMLType.XSD_BYTE, ParameterMode.IN);
        nc.setReturnType(XMLType.XSD_STRING);
        return (String) nc.invoke(new Object[]{sessionId, context, assignmentId, userId, submittedText, attachmentNames, attachmentMimeTypes, content});
    }
}
