
package com.travellazy.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationRuleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidationRuleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BEAN"/>
 *     &lt;enumeration value="REGEX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValidationRuleType", namespace = "http://www.travellazy.com/product/model")
@XmlEnum
public enum ValidationRuleType {

    BEAN,
    REGEX;

    public String value() {
        return name();
    }

    public static ValidationRuleType fromValue(String v) {
        return valueOf(v);
    }

}
