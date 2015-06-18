
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferChangeAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferChangeAction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}OfferAction">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferChangeAction", namespace = "http://www.travellazy.com/product/model")
@XmlSeeAlso({
    OfferUpgradeAction.class,
    OfferModifyAction.class
})
public abstract class OfferChangeAction
    extends OfferAction
{


}
