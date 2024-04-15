//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package lt.eif.viko.m.nar.client.generated_classes;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Trip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Trip"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tripDuration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trip", propOrder = {
    "id",
    "organizationName",
    "name",
    "location",
    "tripDuration",
    "cost"
})
public class Trip {

    protected int id;
    @XmlElement(required = true)
    protected String organizationName;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String tripDuration;
    protected int cost;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the tripDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripDuration() {
        return tripDuration;
    }

    /**
     * Sets the value of the tripDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripDuration(String value) {
        this.tripDuration = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     */
    public int getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     */
    public void setCost(int value) {
        this.cost = value;
    }

    @Override
    public String toString() {
        return String.format("\tTrip:\n\t\t\t\t" + "Organization Name = %s\n\t\t\t\t" + "Name = %s\n\t\t\t\t" +
                        "Location = %s\n\t\t\t\t" + "Trip Duration = %s\n\t\t\t\t" + "Cost = %s\n\t\t\t\t",
                this.organizationName,
                this.name,
                this.location,
                this.tripDuration,
                this.cost);
    }

}
