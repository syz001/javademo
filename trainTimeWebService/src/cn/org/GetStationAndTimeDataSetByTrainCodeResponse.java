
package cn.org;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getStationAndTimeDataSetByTrainCodeResult" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getStationAndTimeDataSetByTrainCodeResult"
})
@XmlRootElement(name = "getStationAndTimeDataSetByTrainCodeResponse")
public class GetStationAndTimeDataSetByTrainCodeResponse {

    protected GetStationAndTimeDataSetByTrainCodeResponse.GetStationAndTimeDataSetByTrainCodeResult getStationAndTimeDataSetByTrainCodeResult;

    /**
     * ��ȡgetStationAndTimeDataSetByTrainCodeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetStationAndTimeDataSetByTrainCodeResponse.GetStationAndTimeDataSetByTrainCodeResult }
     *     
     */
    public GetStationAndTimeDataSetByTrainCodeResponse.GetStationAndTimeDataSetByTrainCodeResult getGetStationAndTimeDataSetByTrainCodeResult() {
        return getStationAndTimeDataSetByTrainCodeResult;
    }

    /**
     * ����getStationAndTimeDataSetByTrainCodeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetStationAndTimeDataSetByTrainCodeResponse.GetStationAndTimeDataSetByTrainCodeResult }
     *     
     */
    public void setGetStationAndTimeDataSetByTrainCodeResult(GetStationAndTimeDataSetByTrainCodeResponse.GetStationAndTimeDataSetByTrainCodeResult value) {
        this.getStationAndTimeDataSetByTrainCodeResult = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class GetStationAndTimeDataSetByTrainCodeResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * ����any���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
