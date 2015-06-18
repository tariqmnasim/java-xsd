
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractPagedList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPagedList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.travellazy.com/product/model}PagingAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractPagedList", namespace = "http://www.travellazy.com/product/model")
@XmlSeeAlso({
    BilledUsages.class,
    UnbilledUsages.class,
    Features.class,
    Enquiries.class,
    InvoiceList.class,
    Services.class,
    OfferList.class,
    OrderHistoryEntries.class,
    CustomizedOfferUnbilledUsages.class,
    Orders.class,
    Allowances.class,
    SubAccounts.class,
    ChannelOffers.class,
    BalanceTransactionList.class,
    CustomerSearchResults.class,
    BalanceList.class,
    SearchResults.class
})
public abstract class AbstractPagedList {

    @XmlAttribute(name = "page")
    protected Long page;
    @XmlAttribute(name = "pageSize")
    protected Long pageSize;
    @XmlAttribute(name = "totalNumberOfPages")
    protected Long totalNumberOfPages;
    @XmlAttribute(name = "totalNumberOfEntries")
    protected Long totalNumberOfEntries;

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPage(Long value) {
        this.page = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPageSize(Long value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the totalNumberOfPages property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumberOfPages() {
        return totalNumberOfPages;
    }

    /**
     * Sets the value of the totalNumberOfPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumberOfPages(Long value) {
        this.totalNumberOfPages = value;
    }

    /**
     * Gets the value of the totalNumberOfEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumberOfEntries() {
        return totalNumberOfEntries;
    }

    /**
     * Sets the value of the totalNumberOfEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumberOfEntries(Long value) {
        this.totalNumberOfEntries = value;
    }

}
