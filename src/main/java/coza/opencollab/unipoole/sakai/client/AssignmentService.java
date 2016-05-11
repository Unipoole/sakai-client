package coza.opencollab.unipoole.sakai.client;

import java.util.Date;

public interface AssignmentService {    
    
    public String getAssignmentsForContext(String sessionId, String context, Date fromDate) throws Exception;
    
    public String getUserSubmissionsForContextAssignments(String sessionId, String userId, String context, Date fromDate) throws Exception;
    
    public String editAssignmentSubmission(String sessionId, String context, String assignmentId, String userId, String submittedText, String[] attachmentNames, String[] attachmentMimeTypes, byte[][] content) throws Exception;
}
