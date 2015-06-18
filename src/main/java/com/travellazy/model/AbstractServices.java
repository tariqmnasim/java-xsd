
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="createService" type="{http://www.travellazy.com/product/model}CreateService"/>
 *         &lt;element name="updateService" type="{http://www.travellazy.com/product/model}UpdateService"/>
 *         &lt;element name="deleteService" type="{http://www.travellazy.com/product/model}DeleteService"/>
 *         &lt;element name="service" type="{http://www.travellazy.com/product/model}AbstractService"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractServices", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "createServiceOrUpdateServiceOrDeleteService"
})
public class AbstractServices {

    @XmlElements({
        @XmlElement(name = "createService", namespace = "http://www.travellazy.com/product/model", type = CreateService.class),
        @XmlElement(name = "updateService", namespace = "http://www.travellazy.com/product/model", type = UpdateService.class),
        @XmlElement(name = "deleteService", namespace = "http://www.travellazy.com/product/model", type = DeleteService.class),
        @XmlElement(name = "service", namespace = "http://www.travellazy.com/product/model")
    })
    protected List<AbstractService> createServiceOrUpdateServiceOrDeleteService;

    /**
     * Gets the value of the createServiceOrUpdateServiceOrDeleteService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createServiceOrUpdateServiceOrDeleteService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateServiceOrUpdateServiceOrDeleteService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateService }
     * {@link UpdateService }
     * {@link DeleteService }
     * {@link AbstractService }
     * 
     * 
     */
    public List<AbstractService> getCreateServiceOrUpdateServiceOrDeleteService() {
        if (createServiceOrUpdateServiceOrDeleteService == null) {
            createServiceOrUpdateServiceOrDeleteService = new ArrayList<AbstractService>();
        }
        return this.createServiceOrUpdateServiceOrDeleteService;
    }

}
