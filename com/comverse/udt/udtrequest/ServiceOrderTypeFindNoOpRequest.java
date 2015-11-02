/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a ServiceOrderTypeFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderTypeFindNoOpRequest extends ServiceOrderTypeRequest {
/**
 *
 * Constructor to create a   ServiceOrderTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderTypeFindNoOpRequest(String id, ServiceOrderTypeObjectDataList noOpIn) {
    super(id, "ServiceOrderTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceOrderTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceOrderType", noOpIn);
      }
      addInput("ServiceOrderType", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceOrderTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderTypeObjectDataList getOutput() {
    return ServiceOrderTypeObjectHelper.fromMapList(outputMap, "ServiceOrderTypeList");
  }
}
