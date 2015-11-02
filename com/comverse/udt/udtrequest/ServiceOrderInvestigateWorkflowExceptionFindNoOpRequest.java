/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderInvestigateWorkflowExceptionFindNoOpRequest.java
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
 * NoOp class used to simulate a ServiceOrderInvestigateWorkflowExceptionFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderInvestigateWorkflowExceptionFindNoOpRequest extends ServiceOrderInvestigateRequest {
/**
 *
 * Constructor to create a   ServiceOrderInvestigateWorkflowExceptionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderInvestigateWorkflowExceptionFindNoOpRequest(String id, ServiceOrderInvestigateObjectDataList noOpIn) {
    super(id, "ServiceOrderInvestigateWorkflowExceptionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceOrderInvestigateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceOrderInvestigate", noOpIn);
      }
      addInput("ServiceOrderInvestigate", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceOrderInvestigateObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderInvestigateObjectDataList getOutput() {
    return ServiceOrderInvestigateObjectHelper.fromMapList(outputMap, "ServiceOrderInvestigateList");
  }
}
