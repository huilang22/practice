/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionFindNoOpRequest.java
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
 * NoOp class used to simulate a ConditionFindNoOpRequest Udt Request/Response
 *
 */
public class ConditionFindNoOpRequest extends ConditionRequest {
/**
 *
 * Constructor to create a   ConditionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ConditionFindNoOpRequest(String id, CondObjDataList noOpIn) {
    super(id, "ConditionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CondObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Condition", noOpIn);
      }
      addInput("Condition", mapList);
    }
  }
/**
 *
 * Retrieves the CondObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CondObjDataList getOutput() {
    return CondObjHelper.fromMapList(outputMap, "ConditionList");
  }
}
