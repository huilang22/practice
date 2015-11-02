/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StateFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a StateFindNoOpRequest Udt Request/Response
 *
 */
public class StateFindNoOpRequest extends StateRequest {
/**
 *
 * Constructor to create a   StateFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StateFindNoOpRequest(String id, StateObjectDataList noOpIn) {
    super(id, "StateFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = StateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("State", noOpIn);
      }
      addInput("State", mapList);
    }
  }
/**
 *
 * Retrieves the StateObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public StateObjectDataList getOutput() {
    return StateObjectHelper.fromMapList(outputMap, "StateList");
  }
}
