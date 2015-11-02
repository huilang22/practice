/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterFindNoOpRequest.java
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
 * NoOp class used to simulate a ServiceCenterFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceCenterFindNoOpRequest extends ServiceCenterRequest {
/**
 *
 * Constructor to create a   ServiceCenterFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceCenterFindNoOpRequest(String id, ServiceCenterObjectDataList noOpIn) {
    super(id, "ServiceCenterFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceCenterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceCenter", noOpIn);
      }
      addInput("ServiceCenter", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceCenterObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceCenterObjectDataList getOutput() {
    return ServiceCenterObjectHelper.fromMapList(outputMap, "ServiceCenterList");
  }
}
