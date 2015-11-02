/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationRelationalConstraintActionFindNoOpRequest.java
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
 * NoOp class used to simulate a BsdApplicationRelationalConstraintActionFindNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationRelationalConstraintActionFindNoOpRequest extends BsdApplicationRelationalConstraintRequest {
/**
 *
 * Constructor to create a   BsdApplicationRelationalConstraintActionFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationRelationalConstraintActionFindNoOpRequest(String id, BsdApplicationRelationalConstraintObjectDataList noOpIn) {
    super(id, "BsdApplicationRelationalConstraintActionFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BsdApplicationRelationalConstraintObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdApplicationRelationalConstraint", noOpIn);
      }
      addInput("BsdApplicationRelationalConstraint", mapList);
    }
  }
/**
 *
 * Retrieves the BsdApplicationRelationalConstraintObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationRelationalConstraintObjectDataList getOutput() {
    return BsdApplicationRelationalConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationRelationalConstraintList");
  }
}
