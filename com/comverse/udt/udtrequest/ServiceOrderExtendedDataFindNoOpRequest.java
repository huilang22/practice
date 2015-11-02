/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderExtendedDataFindNoOpRequest.java
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
 * NoOp class used to simulate a ServiceOrderExtendedDataFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderExtendedDataFindNoOpRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a   ServiceOrderExtendedDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderExtendedDataFindNoOpRequest(String id, ServiceOrderEDObjectDataList noOpIn) {
    super(id, "ServiceOrderExtendedDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceOrderEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceOrderExtendedData", noOpIn);
      }
      addInput("ServiceOrderExtendedData", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceOrderEDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderEDObjectDataList getOutput() {
    return ServiceOrderEDObjectHelper.fromMapList(outputMap, "ServiceOrderExtendedDataList");
  }
}
