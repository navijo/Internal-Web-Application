
package cat.ehh.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.14.redhat-1
 * Wed Dec 16 11:44:00 CET 2015
 * Generated source version: 2.7.14.redhat-1
 */

@XmlRootElement(name = "createPatient", namespace = "http://ws.ehh.cat/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPatient", namespace = "http://ws.ehh.cat/", propOrder = {"arg0", "arg1", "arg2", "arg3", "arg4", "arg5", "arg6", "arg7", "arg8"})

public class CreatePatient {

    @XmlElement(name = "name")
    private java.lang.String arg0;
    @XmlElement(name = "surname")
    private java.lang.String arg1;
    @XmlElement(name = "idDoc")
    private java.lang.String arg2;
    @XmlElement(name = "phone")
    private java.lang.String arg3;
    @XmlElement(name = "birthdate")
    private java.lang.String arg4;
    @XmlElement(name = "address")
    private java.lang.String arg5;
    @XmlElement(name = "disease")
    private java.lang.String arg6;
    @XmlElement(name = "dependencyGrade")
    private java.lang.String arg7;
    @XmlElement(name = "langId")
    private java.lang.String arg8;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
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

}

