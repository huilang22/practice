/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationRelationalConstraintGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdApplicationRelationalConstraintGetNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationRelationalConstraintGetNoOpRequest extends BsdApplicationRelationalConstraintSubRequestParent {
/**
 *
 * Constructor to create a   BsdApplicationRelationalConstraintGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationRelationalConstraintGetNoOpRequest(String id, BsdApplicationRelationalConstraintObjectData noOpIn) {
    super(id, "BsdApplicationRelationalConstraintGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdApplicationRelationalConstraint", BsdApplicationRelationalConstraintObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplicationRelationalConstraint").get("BsdApplicationRelationalConstraint"));
    }
  }
/**
 *
 * Retrieves the BsdApplicationRelationalConstraintObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationRelationalConstraintObjectData getOutput() {
    return BsdApplicationRelationalConstraintObjectHelper.fromMap(outputMap, "BsdApplicationRelationalConstraint");
  }
}
