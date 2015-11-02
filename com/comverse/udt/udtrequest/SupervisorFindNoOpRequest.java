/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SupervisorFindNoOpRequest.java
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

import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a SupervisorFindNoOpRequest Udt Request/Response
 *
 */
public class SupervisorFindNoOpRequest extends SupervisorRequest {
/**
 *
 * Constructor to create a   SupervisorFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SupervisorFindNoOpRequest(String id, SupervisorObjectDataList noOpIn) {
    super(id, "SupervisorFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SupervisorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Supervisor", noOpIn);
      }
      addInput("Supervisor", mapList);
    }
  }
/**
 *
 * Retrieves the SupervisorObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SupervisorObjectDataList getOutput() {
    return SupervisorObjectHelper.fromMapList(outputMap, "SupervisorList");
  }
}
