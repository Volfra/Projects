
package data.msa.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "testService", namespace = "http://msa.data.compbio/01/12/2010/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testService", namespace = "http://msa.data.compbio/01/12/2010/")
public class TestService {

    @XmlElement(name = "arg0", namespace = "")
    private ws.client.Services arg0;

    /**
     * 
     * @return
     *     returns Services
     */
    public ws.client.Services getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(ws.client.Services arg0) {
        this.arg0 = arg0;
    }

}
