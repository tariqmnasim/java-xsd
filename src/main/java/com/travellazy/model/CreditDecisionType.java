
package com.travellazy.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditDecisionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditDecisionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCEPTED"/>
 *     &lt;enumeration value="REFERRED"/>
 *     &lt;enumeration value="DECLINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditDecisionType", namespace = "http://www.travellazy.com/product/model")
@XmlEnum
public enum CreditDecisionType {

    ACCEPTED,
    REFERRED,
    DECLINED;

    public String value() {
        return name();
    }

    public static CreditDecisionType fromValue(String v) {
        return valueOf(v);
    }

}
