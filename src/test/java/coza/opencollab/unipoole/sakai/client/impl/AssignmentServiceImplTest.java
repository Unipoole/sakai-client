package coza.opencollab.unipoole.sakai.client.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author OpenCollab
 */
public class AssignmentServiceImplTest {
    private static final LoginServiceImpl login = new LoginServiceImpl();
    private static final AssignmentServiceImpl service = new AssignmentServiceImpl();
    
    public AssignmentServiceImplTest() {
    }
    
    @BeforeClass
    public static void setup(){
        login.setServiceWSDL("http://localhost:8080/sakai-axis/SakaiLogin.jws?wsdl");
        service.setServiceWSDL("http://localhost:8080/sakai-axis/AssignmentTool.jws?wsdl");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    @Ignore
    public void testGetAssignmentsForContext() throws Exception {
        SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yyyy");
        Date fromDate = f.parse("12-December-2014");
        
        String sessionId = login.login("sagat", "sagat");
        String context = "1959bfb1-8274-454f-b7d1-0244c184de54";
        System.out.println(sessionId);
        String xml = service.getAssignmentsForContext(sessionId, "1959bfb1-8274-454f-b7d1-0244c184de54", null);
        System.out.println(xml);
        xml = service.getAssignmentsForContext(sessionId, context, fromDate);
        System.out.println(xml);
    }

    @Test
    @Ignore
    public void testGetUserSubmissionsForContextAssignments() throws Exception {
        String sessionId = login.login("kabelo", "kabelo");
        String context = "1959bfb1-8274-454f-b7d1-0244c184de54";
        String userId = "sagat";
        SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yyyy");
        Date fromDate = f.parse("12-December-2011");
        String xml = service.getUserSubmissionsForContextAssignments(sessionId, userId, context, fromDate);
        System.out.println(xml);
    }
    
    @Test
    @Ignore
    public void testEditAssignmentSubmission() throws Exception {
        String sessionId = login.login("kabelo", "kabelo");
        String assignmentId = "2e7f3edc-bac4-4b29-921a-f87aecf189f0";
        String context = "1959bfb1-8274-454f-b7d1-0244c184de54";
        String userId = "sagat";
        String submittedText = "Assingment service test. ";
        String[] attachmentNames = {"weather", "assignment", "submission"};
        String[] attachmentMimeTypes = {"application/json", "application/json", "application/xml"};
        String filePath1 = "/home/kabelo/Desktop/misc/weather.json";
        String filePath2 = "/home/kabelo/Desktop/misc/assignment.json";
        String filePath3 = "/home/kabelo/Desktop/misc/submissions_sagat.xml";

        File file1 = new File(filePath1);
        byte[] c1 = new byte[(int) file1.length()];
        InputStream fis1 = new FileInputStream(file1);
        fis1.read(c1);
        fis1.close();
        
        File file2 = new File(filePath2);
        byte[] c2 = new byte[(int) file2.length()];
        InputStream fis2 = new FileInputStream(file2);
        fis2.read(c2);
        fis2.close();
        
        File file3 = new File(filePath3);
        byte[] c3 = new byte[(int) file3.length()];
        InputStream fis3 = new FileInputStream(file3);
        fis3.read(c3);
        fis3.close();

        byte[][] content = new byte[3][1];
        content[0] = c1;
        content[1] = c2;
        content[2] = c3;
        
        String response = service.editAssignmentSubmission(sessionId, context, assignmentId, userId, submittedText, attachmentNames, attachmentMimeTypes, content);

        System.out.println(response);
    }
    
}
