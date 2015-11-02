/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderFindWithExtendedDataNoOpRequest.java
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
 * NoOp class used to simulate a ServiceOrderFindWithExtendedDataNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderFindWithExtendedDataNoOpRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a   ServiceOrderFindWithExtendedDataNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderFindWithExtendedDataNoOpRequest(String id, ServiceOrderObjectDataList noOpIn) {
    super(id, "ServiceOrderFindWithExtendedDataNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceOrderObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceOrder", noOpIn);
      }
      addInput("ServiceOrder", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceOrderObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderObjectDataList getOutput() {
    return ServiceOrderObjectHelper.fromMapList(outputMap, "ServiceOrderList");
  }
}
