
package com.travellazy.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllowanceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllowanceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RECURRING"/>
 *     &lt;enumeration value="ONCE_ONLY"/>
 *     &lt;enumeration value="RECURRING_CARRY_OVER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllowanceType", namespace = "http://www.travellazy.com/product/model")
@XmlEnum
public enum AllowanceType {

    RECURRING,
    ONCE_ONLY,
    RECURRING_CARRY_OVER;

    public String value() {
        return name();
    }

    public static AllowanceType fromValue(String v) {
        return valueOf(v);
    }

}
