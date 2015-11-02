/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeConstraintConditionUpdateNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeConstraintConditionUpdateNoOpRequest extends BsdAttributeConstraintConditionSubRequestParent {
/**
 *
 * Constructor to create a   BsdAttributeConstraintConditionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeConstraintConditionUpdateNoOpRequest(String id, BsdAttributeConstraintConditionObjectData noOpIn) {
    super(id, "BsdAttributeConstraintConditionUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectHelper.toMap(noOpIn, new HashMap(), "BsdAttributeConstraintCondition").get("BsdAttributeConstraintCondition"));
    }
  }
/**
 *
 * Retrieves the BsdAttributeConstraintConditionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintConditionObjectData getOutput() {
    return BsdAttributeConstraintConditionObjectHelper.fromMap(outputMap, "BsdAttributeConstraintCondition");
  }
}
