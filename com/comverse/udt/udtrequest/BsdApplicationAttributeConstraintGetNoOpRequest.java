/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeConstraintGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdApplicationAttributeConstraintGetNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationAttributeConstraintGetNoOpRequest extends BsdApplicationAttributeConstraintSubRequestParent {
/**
 *
 * Constructor to create a   BsdApplicationAttributeConstraintGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationAttributeConstraintGetNoOpRequest(String id, BsdApplicationAttributeConstraintObjectData noOpIn) {
    super(id, "BsdApplicationAttributeConstraintGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdApplicationAttributeConstraint", BsdApplicationAttributeConstraintObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplicationAttributeConstraint").get("BsdApplicationAttributeConstraint"));
    }
  }
/**
 *
 * Retrieves the BsdApplicationAttributeConstraintObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationAttributeConstraintObjectData getOutput() {
    return BsdApplicationAttributeConstraintObjectHelper.fromMap(outputMap, "BsdApplicationAttributeConstraint");
  }
}
