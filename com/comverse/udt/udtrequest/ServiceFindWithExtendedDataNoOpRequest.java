/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceFindWithExtendedDataNoOpRequest.java
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
 * NoOp class used to simulate a ServiceFindWithExtendedDataNoOpRequest Udt Request/Response
 *
 */
public class ServiceFindWithExtendedDataNoOpRequest extends ServiceRequest {
/**
 *
 * Constructor to create a   ServiceFindWithExtendedDataNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceFindWithExtendedDataNoOpRequest(String id, ServiceObjectDataList noOpIn) {
    super(id, "ServiceFindWithExtendedDataNoOpRequest");
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
