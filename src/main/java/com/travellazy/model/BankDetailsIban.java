
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankDetailsIban complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankDetailsIban">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractBankDetailsIban">
 *       &lt;sequence>
 *         &lt;element name="uniqueMandateReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sepaStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankDetailsIban", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "uniqueMandateReference",
    "sepaStatus"
})
public class BankDetailsIban
    extends AbstractBankDetailsIban
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String uniqueMandateReference;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String sepaStatus;

    /**
     * Gets the value of the uniqueMandateReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueMandateReference() {
        return uniqueMandateReference;
    }

    /**
     * Sets the value of the uniqueMandateReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueMandateReference(String value) {
        this.uniqueMandateReference = value;
    }

    /**
     * Gets the value of the sepaStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSepaStatus() {
        return sepaStatus;
    }

    /**
     * Sets the value of the sepaStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSepaStatus(String value) {
        this.sepaStatus = value;
    }

}
