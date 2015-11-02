/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BsdRelationalConstraintUpdateNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalConstraintUpdateNoOpRequest extends BsdRelationalConstraintSubRequestParent {
/**
 *
 * Constructor to create a   BsdRelationalConstraintUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalConstraintUpdateNoOpRequest(String id, BsdRelationalConstraintObjectData noOpIn) {
    super(id, "BsdRelationalConstraintUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectHelper.toMap(noOpIn, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }
/**
 *
 * Retrieves the BsdRelationalConstraintObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintObjectData getOutput() {
    return BsdRelationalConstraintObjectHelper.fromMap(outputMap, "BsdRelationalConstraint");
  }
}
