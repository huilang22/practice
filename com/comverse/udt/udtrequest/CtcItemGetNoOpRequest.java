/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemGetNoOpRequest.java
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

import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcItemGetNoOpRequest Udt Request/Response
 *
 */
public class CtcItemGetNoOpRequest extends CtcItemSubRequestParent {
/**
 *
 * Constructor to create a   CtcItemGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcItemGetNoOpRequest(String id, CtcItemObjectData noOpIn) {
    super(id, "CtcItemGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcItem", CtcItemObjectHelper.toMap(noOpIn, new HashMap(), "CtcItem").get("CtcItem"));
    }
  }
/**
 *
 * Retrieves the CtcItemObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemObjectData getOutput() {
    return CtcItemObjectHelper.fromMap(outputMap, "CtcItem");
  }
}
