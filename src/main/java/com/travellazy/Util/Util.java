package com.travellazy.Util;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Nasim on 6/18/15.
 */
public class Util {

    /**
     * Converts a date object into XMLGregorianCalendar object.
     *
     * @param date the java.util.Date object
     * @return an javax.xml.datatype.XMLGregorianCalendar object.
     */
    public static XMLGregorianCalendar convertToXMLGregorianCalendar(Date date) throws DatatypeConfigurationException {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        XMLGregorianCalendar cal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        return cal;
    }

}
