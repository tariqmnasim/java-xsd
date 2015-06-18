
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractFeatureValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractFeatureValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureValue", namespace = "http://www.travellazy.com/product/model")
@XmlSeeAlso({
    FeatureValueNumber.class,
    FeatureValueList.class,
    FeatureValuePhoneNumber.class,
    FeatureValueDate.class,
    FeatureValueString.class,
    FeatureValueNone.class,
    FeatureValueAddress.class,
    FeatureValueBoolean.class,
    FeatureValueSelect.class
})
public abstract class AbstractFeatureValue {


}
