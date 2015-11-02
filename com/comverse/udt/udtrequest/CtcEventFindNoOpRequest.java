/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcEventFindNoOpRequest.java
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

import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcEventFindNoOpRequest Udt Request/Response
 *
 */
public class CtcEventFindNoOpRequest extends CtcEventRequest {
/**
 *
 * Constructor to create a   CtcEventFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcEventFindNoOpRequest(String id, CtcEventObjectDataList noOpIn) {
    super(id, "CtcEventFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcEventObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcEvent", noOpIn);
      }
      addInput("CtcEvent", mapList);
    }
  }
/**
 *
 * Retrieves the CtcEventObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcEventObjectDataList getOutput() {
    return CtcEventObjectHelper.fromMapList(outputMap, "CtcEventList");
  }
}
