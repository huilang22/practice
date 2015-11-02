/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceWithPendingFindNoOpRequest.java
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
 * NoOp class used to simulate a ServiceWithPendingFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceWithPendingFindNoOpRequest extends ServiceRequest {
/**
 *
 * Constructor to create a   ServiceWithPendingFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceWithPendingFindNoOpRequest(String id, ServiceObjectDataList noOpIn) {
    super(id, "ServiceWithPendingFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Service", noOpIn);
      }
      addInput("Service", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceObjectDataList getOutput() {
    return ServiceObjectHelper.fromMapList(outputMap, "ServiceList");
  }
}
