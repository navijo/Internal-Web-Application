
package cat.ehh.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.14.redhat-1
 * Fri Jan 15 17:07:08 CET 2016
 * Generated source version: 2.7.14.redhat-1
 */

@XmlRootElement(name = "updatePatientGeofence", namespace = "http://ws.ehh.cat/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePatientGeofence", namespace = "http://ws.ehh.cat/", propOrder = {"arg0", "arg1", "arg2", "arg3", "arg4"})

public class UpdatePatientGeofence {

    @XmlElement(name = "patientId")
    private int arg0;
    @XmlElement(name = "geofenceId")
    private long arg1;
    @XmlElement(name = "radius")
    private int arg2;
    @XmlElement(name = "geofenceLatitude")
    private double arg3;
    @XmlElement(name = "geofenceLongitude")
    private double arg4;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

    public long getArg1() {
        return this.arg1;
    }

    public void setArg1(long newArg1)  {
        this.arg1 = newArg1;
    }

    public int getArg2() {
        return this.arg2;
    }

    public void setArg2(int newArg2)  {
        this.arg2 = newArg2;
    }

    public double getArg3() {
        return this.arg3;
    }

    public void setArg3(double newArg3)  {
        this.arg3 = newArg3;
    }

    public double getArg4() {
        return this.arg4;
    }

    public void setArg4(double newArg4)  {
        this.arg4 = newArg4;
    }

}
