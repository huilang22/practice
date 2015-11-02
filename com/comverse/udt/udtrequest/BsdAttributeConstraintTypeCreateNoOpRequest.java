/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeCreateNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeConstraintTypeCreateNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeConstraintTypeCreateNoOpRequest extends BsdAttributeConstraintTypeSubRequestParent {
/**
 *
 * Constructor to create a   BsdAttributeConstraintTypeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeConstraintTypeCreateNoOpRequest(String id, BsdAttributeConstraintTypeObjectData noOpIn) {
    super(id, "BsdAttributeConstraintTypeCreateNoOpRequest");
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
