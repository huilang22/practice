/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionGrpFindNoOpRequest.java
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
 * NoOp class used to simulate a ConditionExpressionGrpFindNoOpRequest Udt Request/Response
 *
 */
public class ConditionExpressionGrpFindNoOpRequest extends ConditionExpressionGrpRequest {
/**
 *
 * Constructor to create a   ConditionExpressionGrpFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ConditionExpressionGrpFindNoOpRequest(String id, CondExprGrpObjDataList noOpIn) {
    super(id, "ConditionExpressionGrpFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CondExprGrpObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ConditionExpressionGrp", noOpIn);
      }
      addInput("ConditionExpressionGrp", mapList);
    }
  }
/**
 *
 * Retrieves the CondExprGrpObjDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CondExprGrpObjDataList getOutput() {
    return CondExprGrpObjHelper.fromMapList(outputMap, "ConditionExpressionGrpList");
  }
}
