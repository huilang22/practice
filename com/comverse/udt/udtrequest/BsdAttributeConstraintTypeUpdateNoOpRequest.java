/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeConstraintTypeUpdateNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeConstraintTypeUpdateNoOpRequest extends BsdAttributeConstraintTypeSubRequestParent {
/**
 *
 * Constructor to create a   BsdAttributeConstraintTypeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeConstraintTypeUpdateNoOpRequest(String id, BsdAttributeConstraintTypeObjectData noOpIn) {
    super(id, "BsdAttributeConstraintTypeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectHelper.toMap(noOpIn, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }
/**
 *
 * Retrieves the BsdAttributeConstraintTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintTypeObjectData getOutput() {
    return BsdAttributeConstraintTypeObjectHelper.fromMap(outputMap, "BsdAttributeConstraintType");
  }
}
