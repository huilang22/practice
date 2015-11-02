/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountTargetCreateNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a DiscountTargetCreateNoOpRequest Udt Request/Response
 *
 */
public class DiscountTargetCreateNoOpRequest extends DiscountTargetSubRequestParent {
/**
 *
 * Constructor to create a   DiscountTargetCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DiscountTargetCreateNoOpRequest(String id, DTObjectData noOpIn) {
    super(id, "DiscountTargetCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("DiscountTarget", DTObjectHelper.toMap(noOpIn, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
  }
/**
 *
 * Retrieves the DTObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public DTObjectData getOutput() {
    return DTObjectHelper.fromMap(outputMap, "DiscountTarget");
  }
}
