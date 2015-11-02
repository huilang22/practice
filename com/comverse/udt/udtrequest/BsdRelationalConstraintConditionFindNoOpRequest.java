/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintConditionFindNoOpRequest.java
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

import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdRelationalConstraintConditionFindNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalConstraintConditionFindNoOpRequest extends BsdRelationalConstraintConditionRequest {
/**
 *
 * Constructor to create a   BsdRelationalConstraintConditionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalConstraintConditionFindNoOpRequest(String id, BsdRelationalConstraintConditionObjectDataList noOpIn) {
    super(id, "BsdRelationalConstraintConditionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdRelationalConstraintConditionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdRelationalConstraintCondition", noOpIn);
      }
      addInput("BsdRelationalConstraintCondition", mapList);
    }
  }
/**
 *
 * Retrieves the BsdRelationalConstraintConditionObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintConditionObjectDataList getOutput() {
    return BsdRelationalConstraintConditionObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintConditionList");
  }
}
