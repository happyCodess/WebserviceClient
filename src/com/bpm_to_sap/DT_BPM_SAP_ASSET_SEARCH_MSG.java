/**
 * DT_BPM_SAP_ASSET_SEARCH_MSG.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bpm_to_sap;

public class DT_BPM_SAP_ASSET_SEARCH_MSG  implements java.io.Serializable {
    /* 资产编号 */
    private java.lang.String ANLN1;

    /* 设备编号 */
    private java.lang.String EQUNR;

    /* 公司 */
    private java.lang.String BUKRS;

    /* 资产描述 */
    private java.lang.String TXT50;

    /* 规格型号 */
    private java.lang.String SERNR;

    /* 入账日期 */
    private java.lang.String AKTIV;

    /* 资产原值 */
    private java.lang.String AFBLPE;

    /* 已提折旧 */
    private java.lang.String KANSW;

    /* 设备状态 */
    private java.lang.String ZSBZT;

    /* 资产责任人工号 */
    private java.lang.String GDLGRP;

    /* 资产责任人姓名 */
    private java.lang.String ZNAME;

    public DT_BPM_SAP_ASSET_SEARCH_MSG() {
    }

    public DT_BPM_SAP_ASSET_SEARCH_MSG(
           java.lang.String ANLN1,
           java.lang.String EQUNR,
           java.lang.String BUKRS,
           java.lang.String TXT50,
           java.lang.String SERNR,
           java.lang.String AKTIV,
           java.lang.String AFBLPE,
           java.lang.String KANSW,
           java.lang.String ZSBZT,
           java.lang.String GDLGRP,
           java.lang.String ZNAME) {
           this.ANLN1 = ANLN1;
           this.EQUNR = EQUNR;
           this.BUKRS = BUKRS;
           this.TXT50 = TXT50;
           this.SERNR = SERNR;
           this.AKTIV = AKTIV;
           this.AFBLPE = AFBLPE;
           this.KANSW = KANSW;
           this.ZSBZT = ZSBZT;
           this.GDLGRP = GDLGRP;
           this.ZNAME = ZNAME;
    }


    /**
     * Gets the ANLN1 value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @return ANLN1   * 资产编号
     */
    public java.lang.String getANLN1() {
        return ANLN1;
    }


    /**
     * Sets the ANLN1 value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @param ANLN1   * 资产编号
     */
    public void setANLN1(java.lang.String ANLN1) {
        this.ANLN1 = ANLN1;
    }


    /**
     * Gets the EQUNR value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @return EQUNR   * 设备编号
     */
    public java.lang.String getEQUNR() {
        return EQUNR;
    }


    /**
     * Sets the EQUNR value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @param EQUNR   * 设备编号
     */
    public void setEQUNR(java.lang.String EQUNR) {
        this.EQUNR = EQUNR;
    }


    /**
     * Gets the BUKRS value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @return BUKRS   * 公司
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @param BUKRS   * 公司
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the TXT50 value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @return TXT50   * 资产描述
     */
    public java.lang.String getTXT50() {
        return TXT50;
    }


    /**
     * Sets the TXT50 value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @param TXT50   * 资产描述
     */
    public void setTXT50(java.lang.String TXT50) {
        this.TXT50 = TXT50;
    }


    /**
     * Gets the SERNR value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @return SERNR   * 规格型号
     */
    public java.lang.String getSERNR() {
        return SERNR;
    }


    /**
     * Sets the SERNR value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @param SERNR   * 规格型号
     */
    public void setSERNR(java.lang.String SERNR) {
        this.SERNR = SERNR;
    }


    /**
     * Gets the AKTIV value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @return AKTIV   * 入账日期
     */
    public java.lang.String getAKTIV() {
        return AKTIV;
    }


    /**
     * Sets the AKTIV value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @param AKTIV   * 入账日期
     */
    public void setAKTIV(java.lang.String AKTIV) {
        this.AKTIV = AKTIV;
    }


    /**
     * Gets the AFBLPE value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @return AFBLPE   * 资产原值
     */
    public java.lang.String getAFBLPE() {
        return AFBLPE;
    }


    /**
     * Sets the AFBLPE value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @param AFBLPE   * 资产原值
     */
    public void setAFBLPE(java.lang.String AFBLPE) {
        this.AFBLPE = AFBLPE;
    }


    /**
     * Gets the KANSW value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @return KANSW   * 已提折旧
     */
    public java.lang.String getKANSW() {
        return KANSW;
    }


    /**
     * Sets the KANSW value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @param KANSW   * 已提折旧
     */
    public void setKANSW(java.lang.String KANSW) {
        this.KANSW = KANSW;
    }


    /**
     * Gets the ZSBZT value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @return ZSBZT   * 设备状态
     */
    public java.lang.String getZSBZT() {
        return ZSBZT;
    }


    /**
     * Sets the ZSBZT value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @param ZSBZT   * 设备状态
     */
    public void setZSBZT(java.lang.String ZSBZT) {
        this.ZSBZT = ZSBZT;
    }


    /**
     * Gets the GDLGRP value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @return GDLGRP   * 资产责任人工号
     */
    public java.lang.String getGDLGRP() {
        return GDLGRP;
    }


    /**
     * Sets the GDLGRP value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @param GDLGRP   * 资产责任人工号
     */
    public void setGDLGRP(java.lang.String GDLGRP) {
        this.GDLGRP = GDLGRP;
    }


    /**
     * Gets the ZNAME value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @return ZNAME   * 资产责任人姓名
     */
    public java.lang.String getZNAME() {
        return ZNAME;
    }


    /**
     * Sets the ZNAME value for this DT_BPM_SAP_ASSET_SEARCH_MSG.
     * 
     * @param ZNAME   * 资产责任人姓名
     */
    public void setZNAME(java.lang.String ZNAME) {
        this.ZNAME = ZNAME;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_BPM_SAP_ASSET_SEARCH_MSG)) return false;
        DT_BPM_SAP_ASSET_SEARCH_MSG other = (DT_BPM_SAP_ASSET_SEARCH_MSG) obj;
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
              this.EQUNR.equals(other.getEQUNR()))) &&
            ((this.BUKRS==null && other.getBUKRS()==null) || 
             (this.BUKRS!=null &&
              this.BUKRS.equals(other.getBUKRS()))) &&
            ((this.TXT50==null && other.getTXT50()==null) || 
             (this.TXT50!=null &&
              this.TXT50.equals(other.getTXT50()))) &&
            ((this.SERNR==null && other.getSERNR()==null) || 
             (this.SERNR!=null &&
              this.SERNR.equals(other.getSERNR()))) &&
            ((this.AKTIV==null && other.getAKTIV()==null) || 
             (this.AKTIV!=null &&
              this.AKTIV.equals(other.getAKTIV()))) &&
            ((this.AFBLPE==null && other.getAFBLPE()==null) || 
             (this.AFBLPE!=null &&
              this.AFBLPE.equals(other.getAFBLPE()))) &&
            ((this.KANSW==null && other.getKANSW()==null) || 
             (this.KANSW!=null &&
              this.KANSW.equals(other.getKANSW()))) &&
            ((this.ZSBZT==null && other.getZSBZT()==null) || 
             (this.ZSBZT!=null &&
              this.ZSBZT.equals(other.getZSBZT()))) &&
            ((this.GDLGRP==null && other.getGDLGRP()==null) || 
             (this.GDLGRP!=null &&
              this.GDLGRP.equals(other.getGDLGRP()))) &&
            ((this.ZNAME==null && other.getZNAME()==null) || 
             (this.ZNAME!=null &&
              this.ZNAME.equals(other.getZNAME())));
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
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        if (getTXT50() != null) {
            _hashCode += getTXT50().hashCode();
        }
        if (getSERNR() != null) {
            _hashCode += getSERNR().hashCode();
        }
        if (getAKTIV() != null) {
            _hashCode += getAKTIV().hashCode();
        }
        if (getAFBLPE() != null) {
            _hashCode += getAFBLPE().hashCode();
        }
        if (getKANSW() != null) {
            _hashCode += getKANSW().hashCode();
        }
        if (getZSBZT() != null) {
            _hashCode += getZSBZT().hashCode();
        }
        if (getGDLGRP() != null) {
            _hashCode += getGDLGRP().hashCode();
        }
        if (getZNAME() != null) {
            _hashCode += getZNAME().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_BPM_SAP_ASSET_SEARCH_MSG.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bpm_to_sap.com", "DT_BPM_SAP_ASSET_SEARCH_MSG"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TXT50");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TXT50"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SERNR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SERNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AKTIV");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AKTIV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AFBLPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AFBLPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KANSW");
        elemField.setXmlName(new javax.xml.namespace.QName("", "KANSW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZSBZT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZSBZT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GDLGRP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GDLGRP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZNAME"));
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
