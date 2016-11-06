
package org.w3._2001.xmlschema;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (org.dakhani.learn.jaxb.adapter.DateAdapter.parseDate(value));
    }

    public String marshal(Date value) {
        return (org.dakhani.learn.jaxb.adapter.DateAdapter.printDate(value));
    }

}
