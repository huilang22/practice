/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderWithLogicalFindNoOpRequest.java
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
 * NoOp class used to simulate a ServiceOrderWithLogicalFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderWithLogicalFindNoOpRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a   ServiceOrderWithLogicalFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderWithLogicalFindNoOpRequest(String id, ServiceOrderObjectBaseDataList noOpIn) {
    super(id, "ServiceOrderWithLogicalFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceOrderObjectBaseHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceOrder", noOpIn);
      }
      addInput("ServiceOrder", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceOrderObjectBaseDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderObjectBaseDataList getOutput() {
    return ServiceOrderObjectBaseHelper.fromMapList(outputMap, "ServiceOrderList");
  }
}
