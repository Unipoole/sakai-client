package coza.opencollab.unipoole.sakai.client.impl;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

/**
 * A abstract implementation that handle the service url and timeout.
 * 
 * @author OpenCollab
 * @since 1.0.0
 */
public class AbstractServiceImpl {
    /**
     * The call timeout.
     */
    private int timeout = 30000;
    /**
     * The full URL of the Sakai Login service wsdl.
     */
    private String serviceWSDL;
    /**
     * The Axis service to used.
     */
    private Service service = new Service();

    /**
     * Set the timeout in milli seconds.
     */
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    /**
     * The full URL of the Sakai Login service wsdl.
     */
    public void setServiceWSDL(String serviceWSDL) {
        this.serviceWSDL = serviceWSDL;
    }
    
    /**
     * Convenience method.
     * 
     * @return A call ready to take method name and parameters.
     */
    protected Call getCall() throws Exception{
        Call nc = (Call) this.service.createCall();
        nc.setTargetEndpointAddress(serviceWSDL);
        nc.setTimeout(timeout);
        nc.removeAllParameters();
        return nc;
    }
}
