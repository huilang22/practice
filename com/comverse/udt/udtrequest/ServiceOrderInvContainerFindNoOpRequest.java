/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderInvContainerFindNoOpRequest.java
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
 * NoOp class used to simulate a ServiceOrderInvContainerFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceOrderInvContainerFindNoOpRequest extends ServiceOrderRequest {
/**
 *
 * Constructor to create a   ServiceOrderInvContainerFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceOrderInvContainerFindNoOpRequest(String id, InvContainerIdObjectDataList noOpIn) {
    super(id, "ServiceOrderInvContainerFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvContainerIdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvContainer", noOpIn);
      }
      addInput("InvContainer", mapList);
    }
  }
/**
 *
 * Retrieves the InvContainerIdObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvContainerIdObjectDataList getOutput() {
    return InvContainerIdObjectHelper.fromMapList(outputMap, "InvContainerList");
  }
}
