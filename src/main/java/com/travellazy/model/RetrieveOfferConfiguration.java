
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveOfferConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveOfferConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.travellazy.com/product/model}CreateCustomizedBaseOffer">
 *       &lt;sequence>
 *         &lt;element name="offerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveOfferConfiguration", namespace = "http://www.travellazy.com/product/model")
public class RetrieveOfferConfiguration
    extends CreateCustomizedBaseOffer
{


}
