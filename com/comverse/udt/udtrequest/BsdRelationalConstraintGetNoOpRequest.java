/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdRelationalConstraintGetNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalConstraintGetNoOpRequest extends BsdRelationalConstraintSubRequestParent {
/**
 *
 * Constructor to create a   BsdRelationalConstraintGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalConstraintGetNoOpRequest(String id, BsdRelationalConstraintObjectData noOpIn) {
    super(id, "BsdRelationalConstraintGetNoOpRequest");
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
