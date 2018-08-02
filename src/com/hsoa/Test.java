package com.hsoa;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import com.bpm_to_sap.DT_BPM_SAP_ASSET_SEARCH;
import com.bpm_to_sap.DT_BPM_SAP_ASSET_SEARCH_MSG;
import com.bpm_to_sap.SI_BPM_SAP_ASSET_SEARCH_OUTServiceLocator;

public class Test {
	

	public static void main(String[] args) throws RemoteException, ServiceException, MalformedURLException {
	        DT_BPM_SAP_ASSET_SEARCH assetSearch=new DT_BPM_SAP_ASSET_SEARCH();
	        assetSearch.setANLN1("10000050");
	        assetSearch.setEQUNR("");
	        //主要看以proxy和bindingstub以及serviceLocator结尾的Java源文件，里面有服务端发布的需要调用的方法
	        SI_BPM_SAP_ASSET_SEARCH_OUTServiceLocator service=new SI_BPM_SAP_ASSET_SEARCH_OUTServiceLocator();
	        DT_BPM_SAP_ASSET_SEARCH_MSG[] ddt=  service.getHTTP_Port().SI_BPM_SAP_ASSET_SEARCH_OUT(assetSearch);
	        for(int i=0;i<ddt.length;i++){
	        	System.out.println(ddt[i].getEQUNR());
	        	System.out.println(ddt[i].getKANSW());
	        	System.out.println(ddt[i].getBUKRS());
	        }
	        System.out.println(123);
		
	}
}
