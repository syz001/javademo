
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
 *         &lt;element name="getStationAndTimeDataSetByLikeTrainCodeResult" minOccurs="0"&gt;
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
    "getStationAndTimeDataSetByLikeTrainCodeResult"
})
@XmlRootElement(name = "getStationAndTimeDataSetByLikeTrainCodeResponse")
public class GetStationAndTimeDataSetByLikeTrainCodeResponse {

    protected GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult getStationAndTimeDataSetByLikeTrainCodeResult;

    /**
     * ��ȡgetStationAndTimeDataSetByLikeTrainCodeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult }
     *     
     */
    public GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult getGetStationAndTimeDataSetByLikeTrainCodeResult() {
        return getStationAndTimeDataSetByLikeTrainCodeResult;
    }

    /**
     * ����getStationAndTimeDataSetByLikeTrainCodeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult }
     *     
     */
    public void setGetStationAndTimeDataSetByLikeTrainCodeResult(GetStationAndTimeDataSetByLikeTrainCodeResponse.GetStationAndTimeDataSetByLikeTrainCodeResult value) {
        this.getStationAndTimeDataSetByLikeTrainCodeResult = value;
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
    public static class GetStationAndTimeDataSetByLikeTrainCodeResult {

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
