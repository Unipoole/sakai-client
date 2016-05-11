package coza.opencollab.unipoole.sakai.client.impl;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Ignore;

/**
 *
 * @author Jaques
 */
@Ignore
public class MeleteTest {
    private static final LoginServiceImpl login = new LoginServiceImpl();
    private static final MeleteServiceImpl service = new MeleteServiceImpl();
    
    @BeforeClass
    public static void setup(){
        login.setServiceWSDL("http://unipoole.opencollab.co.za:8080/sakai-axis/SakaiLogin.jws?wsdl");
        service.setServiceWSDL("http://unipoole.opencollab.co.za:8080/sakai-axis/MeleteTool.jws?wsdl");
    }
    
    public MeleteTest() {
    }
    
    @Test
    public void testMelete() throws Exception{
        String sessionId = login.login("oc_admin", "SpringCl@w");
        System.out.println(sessionId);
        String xml = service.getLearningModuleForSite(sessionId, "AFL1501-13-S1-43T", null);
        System.out.println(xml);
        xml = service.getLearningModuleForSite(sessionId, "AFL1501-13-S1-43T", new Date());
        System.out.println(xml);
        System.out.println(new Date(1359471683000L));
        System.out.println(new Date(1354917855000L));
    }
}