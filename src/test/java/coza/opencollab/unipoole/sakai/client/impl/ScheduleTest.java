package coza.opencollab.unipoole.sakai.client.impl;

import java.util.Date;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

/**
 *
 * @author OpenCollab
 */
@Ignore
public class ScheduleTest {
    private static final LoginServiceImpl login = new LoginServiceImpl();
    private static final ScheduleServiceImpl service = new ScheduleServiceImpl();
    
    @BeforeClass
    public static void setup(){
        login.setServiceWSDL("http://unipoole.opencollab.co.za:8080/sakai-axis/SakaiLogin.jws?wsdl");
        service.setServiceWSDL("http://unipoole.opencollab.co.za:8080/sakai-axis/ScheduleTool.jws?wsdl");
    }
    
    public ScheduleTest() {
    }
    
    @Test
    public void testSchedules() throws Exception{
        String sessionId = login.login("oc_admin", "SpringCl@w");
        System.out.println(sessionId);
        String xml = service.getScheduleForSite(sessionId, "AFL1501-13-S1-43T", null);
        System.out.println(xml);
        xml = service.getScheduleForSite(sessionId, "AFL1501-13-S1-43T", new Date());
        System.out.println(xml);
        System.out.println(new Date(1359685503000L));
        System.out.println(new Date(1360613563000L));
    }
}