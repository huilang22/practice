/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintTypeSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdRelationalConstraintTypeSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalConstraintTypeSequenceGetNoOpRequest extends BsdRelationalConstraintTypeSubRequestParent {
/**
 *
 * Constructor to create a   BsdRelationalConstraintTypeSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalConstraintTypeSequenceGetNoOpRequest(String id, BsdRelationalConstraintTypeObjectKeyData noOpIn) {
    super(id, "BsdRelationalConstraintTypeSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdRelationalConstraintType").get("BsdRelationalConstraintType"));
    }
  }
/**
 *
 * Retrieves the BsdRelationalConstraintTypeObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintTypeObjectKeyData getOutput() {
    return BsdRelationalConstraintTypeObjectKeyHelper.fromMap(outputMap, "BsdRelationalConstraintType");
  }
}
