/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdRelationalConstraintTypeGetNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalConstraintTypeGetNoOpRequest extends BsdRelationalConstraintTypeSubRequestParent {
/**
 *
 * Constructor to create a   BsdRelationalConstraintTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalConstraintTypeGetNoOpRequest(String id, BsdRelationalConstraintTypeObjectData noOpIn) {
    super(id, "BsdRelationalConstraintTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectHelper.toMap(noOpIn, new HashMap(), "BsdRelationalConstraintType").get("BsdRelationalConstraintType"));
    }
  }
/**
 *
 * Retrieves the BsdRelationalConstraintTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintTypeObjectData getOutput() {
    return BsdRelationalConstraintTypeObjectHelper.fromMap(outputMap, "BsdRelationalConstraintType");
  }
}
