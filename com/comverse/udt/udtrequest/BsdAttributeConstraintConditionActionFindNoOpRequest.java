/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionActionFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeConstraintConditionActionFindNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeConstraintConditionActionFindNoOpRequest extends BsdAttributeConstraintConditionRequest {
/**
 *
 * Constructor to create a   BsdAttributeConstraintConditionActionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeConstraintConditionActionFindNoOpRequest(String id, BsdAttributeConstraintConditionDescObjectDataList noOpIn) {
    super(id, "BsdAttributeConstraintConditionActionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdAttributeConstraintConditionDescObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdAttributeConstraintCondition", noOpIn);
      }
      addInput("BsdAttributeConstraintCondition", mapList);
    }
  }
/**
 *
 * Retrieves the BsdAttributeConstraintConditionDescObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintConditionDescObjectDataList getOutput() {
    return BsdAttributeConstraintConditionDescObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintConditionList");
  }
}
