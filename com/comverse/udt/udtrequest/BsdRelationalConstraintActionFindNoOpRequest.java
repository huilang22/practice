/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintActionFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdRelationalConstraintActionFindNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalConstraintActionFindNoOpRequest extends BsdRelationalConstraintRequest {
/**
 *
 * Constructor to create a   BsdRelationalConstraintActionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalConstraintActionFindNoOpRequest(String id, BsdRelationalConstraintObjectDataList noOpIn) {
    super(id, "BsdRelationalConstraintActionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdRelationalConstraintObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdRelationalConstraint", noOpIn);
      }
      addInput("BsdRelationalConstraint", mapList);
    }
  }
/**
 *
 * Retrieves the BsdRelationalConstraintObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintObjectDataList getOutput() {
    return BsdRelationalConstraintObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintList");
  }
}
