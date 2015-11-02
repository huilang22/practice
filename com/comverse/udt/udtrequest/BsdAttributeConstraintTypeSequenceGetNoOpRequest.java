/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeConstraintTypeSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeConstraintTypeSequenceGetNoOpRequest extends BsdAttributeConstraintTypeSubRequestParent {
/**
 *
 * Constructor to create a   BsdAttributeConstraintTypeSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeConstraintTypeSequenceGetNoOpRequest(String id, BsdAttributeConstraintTypeObjectKeyData noOpIn) {
    super(id, "BsdAttributeConstraintTypeSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }
/**
 *
 * Retrieves the BsdAttributeConstraintTypeObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintTypeObjectKeyData getOutput() {
    return BsdAttributeConstraintTypeObjectKeyHelper.fromMap(outputMap, "BsdAttributeConstraintType");
  }
}
