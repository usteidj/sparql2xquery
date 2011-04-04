package com.marklogic.sparql2xquery.example;

import java.net.URI;
import java.net.URISyntaxException;

import com.marklogic.xcc.exceptions.RequestException;
import com.marklogic.xcc.exceptions.XccConfigException;

public class Test {
    public static void main(String [] args){
    	String connectionUri = "xcc://admin:admin@localhost:8005/bakesale";
    	ToolMarkLogicQueryRunner cq;
		try {
			cq = new ToolMarkLogicQueryRunner(new URI(connectionUri));
	    	String ret = cq.executeToSingleString("count(/t)","\n");
	    	System.out.println(ret);
		} catch (XccConfigException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RequestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
