
package org.w3._2001.xmlschema;

import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2 extends XmlAdapter<String, Date> {

	@Override
	public String marshal(final Date value) {
		return (org.dakhani.learn.jaxb.adapter.DateAdapter.printDate(value));
	}

	@Override
	public Date unmarshal(final String value) {
		return (org.dakhani.learn.jaxb.adapter.DateAdapter.parseDate(value));
	}

}
