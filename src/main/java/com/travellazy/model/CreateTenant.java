
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateTenant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateTenant">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractCreateCustomer">
 *       &lt;sequence>
 *         &lt;element name="tenantAttributes" type="{http://www.travellazy.com/product/model}TenantAttributes"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTenant", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "tenantAttributes"
})
public class CreateTenant
    extends AbstractCreateCustomer
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected TenantAttributes tenantAttributes;

    /**
     * Gets the value of the tenantAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link TenantAttributes }
     *     
     */
    public TenantAttributes getTenantAttributes() {
        return tenantAttributes;
    }

    /**
     * Sets the value of the tenantAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenantAttributes }
     *     
     */
    public void setTenantAttributes(TenantAttributes value) {
        this.tenantAttributes = value;
    }

}
