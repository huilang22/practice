/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationConstraintDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BsdApplicationConstraintDeleteNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationConstraintDeleteNoOpRequest extends BsdApplicationConstraintSubRequestParent {
/**
 *
 * Constructor to create a   BsdApplicationConstraintDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationConstraintDeleteNoOpRequest(String id, BsdApplicationConstraintObjectData noOpIn) {
    super(id, "BsdApplicationConstraintDeleteNoOpRequest");
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
