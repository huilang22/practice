/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeConstraintGetNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeConstraintGetNoOpRequest extends BsdAttributeConstraintSubRequestParent {
/**
 *
 * Constructor to create a   BsdAttributeConstraintGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeConstraintGetNoOpRequest(String id, BsdAttributeConstraintObjectData noOpIn) {
    super(id, "BsdAttributeConstraintGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectHelper.toMap(noOpIn, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }
/**
 *
 * Retrieves the BsdAttributeConstraintObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintObjectData getOutput() {
    return BsdAttributeConstraintObjectHelper.fromMap(outputMap, "BsdAttributeConstraint");
  }
}
