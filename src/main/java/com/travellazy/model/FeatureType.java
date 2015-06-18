
package com.travellazy.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeatureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MANDATORY"/>
 *     &lt;enumeration value="PROVISIONED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeatureType", namespace = "http://www.travellazy.com/product/model")
@XmlEnum
public enum FeatureType {

    MANDATORY,
    PROVISIONED;

    public String value() {
        return name();
    }

    public static FeatureType fromValue(String v) {
        return valueOf(v);
    }

}
