/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintConditionSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdRelationalConstraintConditionSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalConstraintConditionSequenceGetNoOpRequest extends BsdRelationalConstraintConditionSubRequestParent {
/**
 *
 * Constructor to create a   BsdRelationalConstraintConditionSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalConstraintConditionSequenceGetNoOpRequest(String id, BsdRelationalConstraintConditionObjectKeyData noOpIn) {
    super(id, "BsdRelationalConstraintConditionSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdRelationalConstraintCondition").get("BsdRelationalConstraintCondition"));
    }
  }
/**
 *
 * Retrieves the BsdRelationalConstraintConditionObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintConditionObjectKeyData getOutput() {
    return BsdRelationalConstraintConditionObjectKeyHelper.fromMap(outputMap, "BsdRelationalConstraintCondition");
  }
}
