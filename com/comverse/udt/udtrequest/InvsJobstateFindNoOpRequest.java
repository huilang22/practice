/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstateFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsJobstateFindNoOpRequest Udt Request/Response
 *
 */
public class InvsJobstateFindNoOpRequest extends InvsJobstateRequest {
/**
 *
 * Constructor to create a   InvsJobstateFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsJobstateFindNoOpRequest(String id, InvsJobstateObjectDataList noOpIn) {
    super(id, "InvsJobstateFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsJobstateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsJobstate", noOpIn);
      }
      addInput("InvsJobstate", mapList);
    }
  }
/**
 *
 * Retrieves the InvsJobstateObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobstateObjectDataList getOutput() {
    return InvsJobstateObjectHelper.fromMapList(outputMap, "InvsJobstateList");
  }
}
