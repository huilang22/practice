/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeConstraintConditionGetNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeConstraintConditionGetNoOpRequest extends BsdAttributeConstraintConditionSubRequestParent {
/**
 *
 * Constructor to create a   BsdAttributeConstraintConditionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeConstraintConditionGetNoOpRequest(String id, BsdAttributeConstraintConditionObjectData noOpIn) {
    super(id, "BsdAttributeConstraintConditionGetNoOpRequest");
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
