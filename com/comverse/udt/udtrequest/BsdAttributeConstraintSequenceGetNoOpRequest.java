/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeConstraintSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeConstraintSequenceGetNoOpRequest extends BsdAttributeConstraintSubRequestParent {
/**
 *
 * Constructor to create a   BsdAttributeConstraintSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeConstraintSequenceGetNoOpRequest(String id, BsdAttributeConstraintObjectBaseKeyData noOpIn) {
    super(id, "BsdAttributeConstraintSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseKeyHelper.toMap(noOpIn, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }
/**
 *
 * Retrieves the BsdAttributeConstraintObjectBaseKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintObjectBaseKeyData getOutput() {
    return BsdAttributeConstraintObjectBaseKeyHelper.fromMap(outputMap, "BsdAttributeConstraint");
  }
}
