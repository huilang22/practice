/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstatusFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsJobstatusFindNoOpRequest Udt Request/Response
 *
 */
public class InvsJobstatusFindNoOpRequest extends InvsJobstatusRequest {
/**
 *
 * Constructor to create a   InvsJobstatusFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsJobstatusFindNoOpRequest(String id, InvsJobstatusObjectDataList noOpIn) {
    super(id, "InvsJobstatusFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsJobstatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsJobstatus", noOpIn);
      }
      addInput("InvsJobstatus", mapList);
    }
  }
/**
 *
 * Retrieves the InvsJobstatusObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobstatusObjectDataList getOutput() {
    return InvsJobstatusObjectHelper.fromMapList(outputMap, "InvsJobstatusList");
  }
}
