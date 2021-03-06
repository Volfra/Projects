
package data.msa.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getLimitResponse", namespace = "http://msa.data.compbio/01/12/2010/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLimitResponse", namespace = "http://msa.data.compbio/01/12/2010/")
public class GetLimitResponse {

    @XmlElement(name = "return", namespace = "")
    private metadata.Limit _return;

    /**
     * 
     * @return
     *     returns Limit
     */
    public metadata.Limit getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(metadata.Limit _return) {
        this._return = _return;
    }

}
