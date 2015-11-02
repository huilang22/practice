/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterTypeFindNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ServiceCenterTypeFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceCenterTypeFindNoOpRequest extends ServiceCenterTypeRequest {
/**
 *
 * Constructor to create a   ServiceCenterTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceCenterTypeFindNoOpRequest(String id, ServiceCenterTypeObjectDataList noOpIn) {
    super(id, "ServiceCenterTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceCenterTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceCenterType", noOpIn);
      }
      addInput("ServiceCenterType", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceCenterTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceCenterTypeObjectDataList getOutput() {
    return ServiceCenterTypeObjectHelper.fromMapList(outputMap, "ServiceCenterTypeList");
  }
}
