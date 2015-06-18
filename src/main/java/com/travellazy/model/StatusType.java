
package com.travellazy.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="PENDING_DISCONNECT"/>
 *     &lt;enumeration value="DISCONNECTED"/>
 *     &lt;enumeration value="CLOSED"/>
 *     &lt;enumeration value="PENDING_ACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusType", namespace = "http://www.travellazy.com/product/model")
@XmlEnum
public enum StatusType {

    NEW,
    ACTIVE,
    PENDING_DISCONNECT,
    DISCONNECTED,
    CLOSED,
    PENDING_ACTIVE;

    public String value() {
        return name();
    }

    public static StatusType fromValue(String v) {
        return valueOf(v);
    }

}
