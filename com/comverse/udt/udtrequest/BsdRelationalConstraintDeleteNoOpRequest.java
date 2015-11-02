/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BsdRelationalConstraintDeleteNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalConstraintDeleteNoOpRequest extends BsdRelationalConstraintSubRequestParent {
/**
 *
 * Constructor to create a   BsdRelationalConstraintDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalConstraintDeleteNoOpRequest(String id, BsdRelationalConstraintObjectBaseData noOpIn) {
    super(id, "BsdRelationalConstraintDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseHelper.toMap(noOpIn, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }
/**
 *
 * Retrieves the BsdRelationalConstraintObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintObjectBaseData getOutput() {
    return BsdRelationalConstraintObjectBaseHelper.fromMap(outputMap, "BsdRelationalConstraint");
  }
}
