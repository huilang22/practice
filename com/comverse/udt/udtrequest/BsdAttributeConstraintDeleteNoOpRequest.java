/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeConstraintDeleteNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeConstraintDeleteNoOpRequest extends BsdAttributeConstraintSubRequestParent {
/**
 *
 * Constructor to create a   BsdAttributeConstraintDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeConstraintDeleteNoOpRequest(String id, BsdAttributeConstraintObjectBaseData noOpIn) {
    super(id, "BsdAttributeConstraintDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdAttributeConstraint", BsdAttributeConstraintObjectBaseHelper.toMap(noOpIn, new HashMap(), "BsdAttributeConstraint").get("BsdAttributeConstraint"));
    }
  }
/**
 *
 * Retrieves the BsdAttributeConstraintObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintObjectBaseData getOutput() {
    return BsdAttributeConstraintObjectBaseHelper.fromMap(outputMap, "BsdAttributeConstraint");
  }
}
