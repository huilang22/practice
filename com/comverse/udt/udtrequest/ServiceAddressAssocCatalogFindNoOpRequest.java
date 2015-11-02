/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCatalogFindNoOpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ServiceAddressAssocCatalogFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceAddressAssocCatalogFindNoOpRequest extends ServiceAddressAssocCatalogRequest {
/**
 *
 * Constructor to create a   ServiceAddressAssocCatalogFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceAddressAssocCatalogFindNoOpRequest(String id, ServiceAddressAssocCatalogObjDataList noOpIn) {
    super(id, "ServiceAddressAssocCatalogFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceAddressAssocCatalogObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceAddressAssocCatalog", noOpIn);
      }
      addInput("ServiceAddressAssocCatalog", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceAddressAssocCatalogObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceAddressAssocCatalogObjDataList getOutput() {
    return ServiceAddressAssocCatalogObjHelper.fromMapList(outputMap, "ServiceAddressAssocCatalogList");
  }
}
