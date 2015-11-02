/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdRelationalConstraintSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalConstraintSequenceGetNoOpRequest extends BsdRelationalConstraintSubRequestParent {
/**
 *
 * Constructor to create a   BsdRelationalConstraintSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalConstraintSequenceGetNoOpRequest(String id, BsdRelationalConstraintObjectBaseKeyData noOpIn) {
    super(id, "BsdRelationalConstraintSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseKeyHelper.toMap(noOpIn, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }
/**
 *
 * Retrieves the BsdRelationalConstraintObjectBaseKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintObjectBaseKeyData getOutput() {
    return BsdRelationalConstraintObjectBaseKeyHelper.fromMap(outputMap, "BsdRelationalConstraint");
  }
}
