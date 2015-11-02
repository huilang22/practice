/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderDependencyFindDependentNoOpRequest.java
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
 * NoOp class used to simulate a ServiceOrderDependencyFindDependentNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderDependencyFindDependentNoOpRequest extends ServiceOrderDependencyRequest {
/**
 *
 * Constructor to create a   ServiceOrderDependencyFindDependentNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderDependencyFindDependentNoOpRequest(String id, ServiceOrderDependencyObjectDataList noOpIn) {
    super(id, "ServiceOrderDependencyFindDependentNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceOrderDependencyObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceOrderDependency", noOpIn);
      }
      addInput("ServiceOrderDependency", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceOrderDependencyObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderDependencyObjectDataList getOutput() {
    return ServiceOrderDependencyObjectHelper.fromMapList(outputMap, "ServiceOrderDependencyList");
  }
}
