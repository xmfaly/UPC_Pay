
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>queryRepairReportParam complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryRepairReportParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromReportTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="offSet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reserved0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toReportTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryRepairReportParam", propOrder = {
    "fromReportTime",
    "limit",
    "offSet",
    "reserved0",
    "reserved1",
    "reserved2",
    "reserved3",
    "reserved4",
    "reserved5",
    "reserved6",
    "reserved7",
    "reserved8",
    "reserved9",
    "telephone",
    "toReportTime",
    "userId"
})
public class QueryRepairReportParam {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromReportTime;
    protected int limit;
    protected int offSet;
    protected String reserved0;
    protected String reserved1;
    protected String reserved2;
    protected String reserved3;
    protected String reserved4;
    protected String reserved5;
    protected String reserved6;
    protected String reserved7;
    protected String reserved8;
    protected String reserved9;
    protected String telephone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toReportTime;
    protected String userId;

    /**
     * 获取fromReportTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromReportTime() {
        return fromReportTime;
    }

    /**
     * 设置fromReportTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromReportTime(XMLGregorianCalendar value) {
        this.fromReportTime = value;
    }

    /**
     * 获取limit属性的值。
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * 设置limit属性的值。
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

    /**
     * 获取offSet属性的值。
     * 
     */
    public int getOffSet() {
        return offSet;
    }

    /**
     * 设置offSet属性的值。
     * 
     */
    public void setOffSet(int value) {
        this.offSet = value;
    }

    /**
     * 获取reserved0属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved0() {
        return reserved0;
    }

    /**
     * 设置reserved0属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved0(String value) {
        this.reserved0 = value;
    }

    /**
     * 获取reserved1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * 设置reserved1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved1(String value) {
        this.reserved1 = value;
    }

    /**
     * 获取reserved2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
     * 设置reserved2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved2(String value) {
        this.reserved2 = value;
    }

    /**
     * 获取reserved3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved3() {
        return reserved3;
    }

    /**
     * 设置reserved3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved3(String value) {
        this.reserved3 = value;
    }

    /**
     * 获取reserved4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved4() {
        return reserved4;
    }

    /**
     * 设置reserved4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved4(String value) {
        this.reserved4 = value;
    }

    /**
     * 获取reserved5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved5() {
        return reserved5;
    }

    /**
     * 设置reserved5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved5(String value) {
        this.reserved5 = value;
    }

    /**
     * 获取reserved6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved6() {
        return reserved6;
    }

    /**
     * 设置reserved6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved6(String value) {
        this.reserved6 = value;
    }

    /**
     * 获取reserved7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved7() {
        return reserved7;
    }

    /**
     * 设置reserved7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved7(String value) {
        this.reserved7 = value;
    }

    /**
     * 获取reserved8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved8() {
        return reserved8;
    }

    /**
     * 设置reserved8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved8(String value) {
        this.reserved8 = value;
    }

    /**
     * 获取reserved9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved9() {
        return reserved9;
    }

    /**
     * 设置reserved9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved9(String value) {
        this.reserved9 = value;
    }

    /**
     * 获取telephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置telephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * 获取toReportTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToReportTime() {
        return toReportTime;
    }

    /**
     * 设置toReportTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToReportTime(XMLGregorianCalendar value) {
        this.toReportTime = value;
    }

    /**
     * 获取userId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置userId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
