
package cat.ehh.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.14.redhat-1
 * Thu Dec 17 12:31:51 CET 2015
 * Generated source version: 2.7.14.redhat-1
 */

@XmlRootElement(name = "addResponsibleToPatient", namespace = "http://ws.ehh.cat/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addResponsibleToPatient", namespace = "http://ws.ehh.cat/", propOrder = {"arg0", "arg1"})

public class AddResponsibleToPatient {

    @XmlElement(name = "patientId",namespace = "http://ws.ehh.cat/")
    private int arg0;
    @XmlElement(name = "responsibleId",namespace = "http://ws.ehh.cat/")
    private int arg1;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

    public int getArg1() {
        return this.arg1;
    }

    public void setArg1(int newArg1)  {
        this.arg1 = newArg1;
    }

}

