
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

@XmlRootElement(name = "updatePatient", namespace = "http://ws.ehh.cat/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePatient", namespace = "http://ws.ehh.cat/", propOrder = {"arg0", "arg1", "arg2", "arg3", "arg4", "arg5", "arg6", "arg7", "arg8", "arg9"})

public class UpdatePatient {

    @XmlElement(name = "patientId",namespace = "http://ws.ehh.cat/")
    private int arg0;
    @XmlElement(name = "name",namespace = "http://ws.ehh.cat/")
    private java.lang.String arg1;
    @XmlElement(name = "surname",namespace = "http://ws.ehh.cat/")
    private java.lang.String arg2;
    @XmlElement(name = "idDOc",namespace = "http://ws.ehh.cat/")
    private java.lang.String arg3;
    @XmlElement(name = "phone",namespace = "http://ws.ehh.cat/")
    private java.lang.String arg4;
    @XmlElement(name = "birthdate",namespace = "http://ws.ehh.cat/")
    private java.lang.String arg5;
    @XmlElement(name = "address",namespace = "http://ws.ehh.cat/")
    private java.lang.String arg6;
    @XmlElement(name = "disease",namespace = "http://ws.ehh.cat/")
    private java.lang.String arg7;
    @XmlElement(name = "dependencyGrade",namespace = "http://ws.ehh.cat/")
    private java.lang.String arg8;
    @XmlElement(name = "langId",namespace = "http://ws.ehh.cat/")
    private java.lang.String arg9;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

    public java.lang.String getArg1() {
        return this.arg1;
    }

    public void setArg1(java.lang.String newArg1)  {
        this.arg1 = newArg1;
    }

    public java.lang.String getArg2() {
        return this.arg2;
    }

    public void setArg2(java.lang.String newArg2)  {
        this.arg2 = newArg2;
    }

    public java.lang.String getArg3() {
        return this.arg3;
    }

    public void setArg3(java.lang.String newArg3)  {
        this.arg3 = newArg3;
    }

    public java.lang.String getArg4() {
        return this.arg4;
    }

    public void setArg4(java.lang.String newArg4)  {
        this.arg4 = newArg4;
    }

    public java.lang.String getArg5() {
        return this.arg5;
    }

    public void setArg5(java.lang.String newArg5)  {
        this.arg5 = newArg5;
    }

    public java.lang.String getArg6() {
        return this.arg6;
    }

    public void setArg6(java.lang.String newArg6)  {
        this.arg6 = newArg6;
    }

    public java.lang.String getArg7() {
        return this.arg7;
    }

    public void setArg7(java.lang.String newArg7)  {
        this.arg7 = newArg7;
    }

    public java.lang.String getArg8() {
        return this.arg8;
    }

    public void setArg8(java.lang.String newArg8)  {
        this.arg8 = newArg8;
    }

    public java.lang.String getArg9() {
        return this.arg9;
    }

    public void setArg9(java.lang.String newArg9)  {
        this.arg9 = newArg9;
    }

}

