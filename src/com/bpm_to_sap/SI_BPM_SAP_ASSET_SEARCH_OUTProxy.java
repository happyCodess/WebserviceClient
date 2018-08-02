package com.bpm_to_sap;

public class SI_BPM_SAP_ASSET_SEARCH_OUTProxy implements com.bpm_to_sap.SI_BPM_SAP_ASSET_SEARCH_OUT {
  private String _endpoint = null;
  private com.bpm_to_sap.SI_BPM_SAP_ASSET_SEARCH_OUT sI_BPM_SAP_ASSET_SEARCH_OUT = null;
  
  public SI_BPM_SAP_ASSET_SEARCH_OUTProxy() {
    _initSI_BPM_SAP_ASSET_SEARCH_OUTProxy();
  }
  
  public SI_BPM_SAP_ASSET_SEARCH_OUTProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_BPM_SAP_ASSET_SEARCH_OUTProxy();
  }
  
  private void _initSI_BPM_SAP_ASSET_SEARCH_OUTProxy() {
    try {
      sI_BPM_SAP_ASSET_SEARCH_OUT = (new com.bpm_to_sap.SI_BPM_SAP_ASSET_SEARCH_OUTServiceLocator()).getHTTPS_Port();
      if (sI_BPM_SAP_ASSET_SEARCH_OUT != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_BPM_SAP_ASSET_SEARCH_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_BPM_SAP_ASSET_SEARCH_OUT)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_BPM_SAP_ASSET_SEARCH_OUT != null)
      ((javax.xml.rpc.Stub)sI_BPM_SAP_ASSET_SEARCH_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bpm_to_sap.SI_BPM_SAP_ASSET_SEARCH_OUT getSI_BPM_SAP_ASSET_SEARCH_OUT() {
    if (sI_BPM_SAP_ASSET_SEARCH_OUT == null)
      _initSI_BPM_SAP_ASSET_SEARCH_OUTProxy();
    return sI_BPM_SAP_ASSET_SEARCH_OUT;
  }
  
  public com.bpm_to_sap.DT_BPM_SAP_ASSET_SEARCH_MSG[] SI_BPM_SAP_ASSET_SEARCH_OUT(com.bpm_to_sap.DT_BPM_SAP_ASSET_SEARCH MT_BPM_SAP_ASSET_SEARCH) throws java.rmi.RemoteException{
    if (sI_BPM_SAP_ASSET_SEARCH_OUT == null)
      _initSI_BPM_SAP_ASSET_SEARCH_OUTProxy();
    return sI_BPM_SAP_ASSET_SEARCH_OUT.SI_BPM_SAP_ASSET_SEARCH_OUT(MT_BPM_SAP_ASSET_SEARCH);
  }
  
  
}