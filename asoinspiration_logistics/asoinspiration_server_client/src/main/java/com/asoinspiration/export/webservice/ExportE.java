
package com.asoinspiration.export.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportE", propOrder = {
    "arg0"
})
public class ExportE {

    protected String arg0;

 
    public String getArg0() {
        return arg0;
    }

    public void setArg0(String value) {
        this.arg0 = value;
    }

}
