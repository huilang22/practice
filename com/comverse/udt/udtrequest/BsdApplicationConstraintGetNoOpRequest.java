/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationConstraintGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdApplicationConstraintGetNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationConstraintGetNoOpRequest extends BsdApplicationConstraintSubRequestParent {
/**
 *
 * Constructor to create a   BsdApplicationConstraintGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationConstraintGetNoOpRequest(String id, BsdApplicationConstraintObjectData noOpIn) {
    super(id, "BsdApplicationConstraintGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplicationConstraint").get("BsdApplicationConstraint"));
    }
  }
/**
 *
 * Retrieves the BsdApplicationConstraintObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationConstraintObjectData getOutput() {
    return BsdApplicationConstraintObjectHelper.fromMap(outputMap, "BsdApplicationConstraint");
  }
}
