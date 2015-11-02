/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderWorkflowMapFindNoOpRequest.java
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
 * NoOp class used to simulate a ServiceOrderWorkflowMapFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderWorkflowMapFindNoOpRequest extends ServiceOrderWorkflowMapRequest {
/**
 *
 * Constructor to create a   ServiceOrderWorkflowMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderWorkflowMapFindNoOpRequest(String id, ServiceOrderWorkflowMapObjectDataList noOpIn) {
    super(id, "ServiceOrderWorkflowMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceOrderWorkflowMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceOrderWorkflowMap", noOpIn);
      }
      addInput("ServiceOrderWorkflowMap", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceOrderWorkflowMapObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderWorkflowMapObjectDataList getOutput() {
    return ServiceOrderWorkflowMapObjectHelper.fromMapList(outputMap, "ServiceOrderWorkflowMapList");
  }
}
