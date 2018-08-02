/**
 * DT_BPM_SAP_ASSET_SEARCH.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bpm_to_sap;

public class DT_BPM_SAP_ASSET_SEARCH  implements java.io.Serializable {
    /* 资产编号 */
    private java.lang.String ANLN1;

    /* 设备编号 */
    private java.lang.String EQUNR;

    public DT_BPM_SAP_ASSET_SEARCH() {
    }

    public DT_BPM_SAP_ASSET_SEARCH(
           java.lang.String ANLN1,
           java.lang.String EQUNR) {
           this.ANLN1 = ANLN1;
           this.EQUNR = EQUNR;
    }


    /**
     * Gets the ANLN1 value for this DT_BPM_SAP_ASSET_SEARCH.
     * 
     * @return ANLN1   * 资产编号
     */
    public java.lang.String getANLN1() {
        return ANLN1;
    }


    /**
     * Sets the ANLN1 value for this DT_BPM_SAP_ASSET_SEARCH.
     * 
     * @param ANLN1   * 资产编号
     */
    public void setANLN1(java.lang.String ANLN1) {
        this.ANLN1 = ANLN1;
    }


    /**
     * Gets the EQUNR value for this DT_BPM_SAP_ASSET_SEARCH.
     * 
     * @return EQUNR   * 设备编号
     */
    public java.lang.String getEQUNR() {
        return EQUNR;
    }


    /**
     * Sets the EQUNR value for this DT_BPM_SAP_ASSET_SEARCH.
     * 
     * @param EQUNR   * 设备编号
     */
    public void setEQUNR(java.lang.String EQUNR) {
        this.EQUNR = EQUNR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_BPM_SAP_ASSET_SEARCH)) return false;
        DT_BPM_SAP_ASSET_SEARCH other = (DT_BPM_SAP_ASSET_SEARCH) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ANLN1==null && other.getANLN1()==null) || 
             (this.ANLN1!=null &&
              this.ANLN1.equals(other.getANLN1()))) &&
            ((this.EQUNR==null && other.getEQUNR()==null) || 
             (this.EQUNR!=null &&
              this.EQUNR.equals(other.getEQUNR())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getANLN1() != null) {
            _hashCode += getANLN1().hashCode();
        }
        if (getEQUNR() != null) {
            _hashCode += getEQUNR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_BPM_SAP_ASSET_SEARCH.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bpm_to_sap.com", "DT_BPM_SAP_ASSET_SEARCH"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ANLN1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ANLN1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EQUNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EQUNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
