/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintConditionUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BsdRelationalConstraintConditionUpdateNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalConstraintConditionUpdateNoOpRequest extends BsdRelationalConstraintConditionSubRequestParent {
/**
 *
 * Constructor to create a   BsdRelationalConstraintConditionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalConstraintConditionUpdateNoOpRequest(String id, BsdRelationalConstraintConditionObjectData noOpIn) {
    super(id, "BsdRelationalConstraintConditionUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectHelper.toMap(noOpIn, new HashMap(), "BsdRelationalConstraintCondition").get("BsdRelationalConstraintCondition"));
    }
  }
/**
 *
 * Retrieves the BsdRelationalConstraintConditionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintConditionObjectData getOutput() {
    return BsdRelationalConstraintConditionObjectHelper.fromMap(outputMap, "BsdRelationalConstraintCondition");
  }
}
