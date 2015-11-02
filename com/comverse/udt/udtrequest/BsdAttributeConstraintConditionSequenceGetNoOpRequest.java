/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeConstraintConditionSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeConstraintConditionSequenceGetNoOpRequest extends BsdAttributeConstraintConditionSubRequestParent {
/**
 *
 * Constructor to create a   BsdAttributeConstraintConditionSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeConstraintConditionSequenceGetNoOpRequest(String id, BsdAttributeConstraintConditionObjectKeyData noOpIn) {
    super(id, "BsdAttributeConstraintConditionSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdAttributeConstraintCondition").get("BsdAttributeConstraintCondition"));
    }
  }
/**
 *
 * Retrieves the BsdAttributeConstraintConditionObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintConditionObjectKeyData getOutput() {
    return BsdAttributeConstraintConditionObjectKeyHelper.fromMap(outputMap, "BsdAttributeConstraintCondition");
  }
}
