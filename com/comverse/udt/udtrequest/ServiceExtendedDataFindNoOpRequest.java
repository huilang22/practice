/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceExtendedDataFindNoOpRequest.java
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
 * NoOp class used to simulate a ServiceExtendedDataFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceExtendedDataFindNoOpRequest extends ServiceRequest {
/**
 *
 * Constructor to create a   ServiceExtendedDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceExtendedDataFindNoOpRequest(String id, ServiceEDObjectDataList noOpIn) {
    super(id, "ServiceExtendedDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceExtendedData", noOpIn);
      }
      addInput("ServiceExtendedData", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceEDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceEDObjectDataList getOutput() {
    return ServiceEDObjectHelper.fromMapList(outputMap, "ServiceExtendedDataList");
  }
}
