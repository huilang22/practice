/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintConditionActionFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdRelationalConstraintConditionActionFindNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalConstraintConditionActionFindNoOpRequest extends BsdRelationalConstraintConditionRequest {
/**
 *
 * Constructor to create a   BsdRelationalConstraintConditionActionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalConstraintConditionActionFindNoOpRequest(String id, BsdRelationalConstraintConditionDescObjectDataList noOpIn) {
    super(id, "BsdRelationalConstraintConditionActionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdRelationalConstraintConditionDescObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdRelationalConstraintCondition", noOpIn);
      }
      addInput("BsdRelationalConstraintCondition", mapList);
    }
  }
/**
 *
 * Retrieves the BsdRelationalConstraintConditionDescObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintConditionDescObjectDataList getOutput() {
    return BsdRelationalConstraintConditionDescObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintConditionList");
  }
}
