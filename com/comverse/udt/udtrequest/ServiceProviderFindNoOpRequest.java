/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceProviderFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ServiceProviderFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceProviderFindNoOpRequest extends ServiceProviderRequest {
/**
 *
 * Constructor to create a   ServiceProviderFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceProviderFindNoOpRequest(String id, ServiceProviderObjectDataList noOpIn) {
    super(id, "ServiceProviderFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceProviderObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceProvider", noOpIn);
      }
      addInput("ServiceProvider", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceProviderObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceProviderObjectDataList getOutput() {
    return ServiceProviderObjectHelper.fromMapList(outputMap, "ServiceProviderList");
  }
}
