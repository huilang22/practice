/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderInvestigateExceptionFindNoOpRequest.java
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
 * NoOp class used to simulate a ServiceOrderInvestigateExceptionFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderInvestigateExceptionFindNoOpRequest extends ServiceOrderInvestigateRequest {
/**
 *
 * Constructor to create a   ServiceOrderInvestigateExceptionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderInvestigateExceptionFindNoOpRequest(String id, ServiceOrderInvestigateObjectDataList noOpIn) {
    super(id, "ServiceOrderInvestigateExceptionFindNoOpRequest");
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
