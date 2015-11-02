/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceStatusFindNoOpRequest.java
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
 * NoOp class used to simulate a ServiceStatusFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceStatusFindNoOpRequest extends ServiceStatusRequest {
/**
 *
 * Constructor to create a   ServiceStatusFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceStatusFindNoOpRequest(String id, ServiceStatusObjectDataList noOpIn) {
    super(id, "ServiceStatusFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceStatus", noOpIn);
      }
      addInput("ServiceStatus", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceStatusObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceStatusObjectDataList getOutput() {
    return ServiceStatusObjectHelper.fromMapList(outputMap, "ServiceStatusList");
  }
}
