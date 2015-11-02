/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionFindNoOpRequest.java
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
 * NoOp class used to simulate a ConditionExpressionFindNoOpRequest Udt Request/Response
 *
 */
public class ConditionExpressionFindNoOpRequest extends ConditionExpressionRequest {
/**
 *
 * Constructor to create a   ConditionExpressionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ConditionExpressionFindNoOpRequest(String id, CondExprObjDataList noOpIn) {
    super(id, "ConditionExpressionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CondExprObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ConditionExpression", noOpIn);
      }
      addInput("ConditionExpression", mapList);
    }
  }
/**
 *
 * Retrieves the CondExprObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CondExprObjDataList getOutput() {
    return CondExprObjHelper.fromMapList(outputMap, "ConditionExpressionList");
  }
}
