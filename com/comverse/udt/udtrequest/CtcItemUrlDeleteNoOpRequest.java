/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUrlDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CtcItemUrlDeleteNoOpRequest Udt Request/Response
 *
 */
public class CtcItemUrlDeleteNoOpRequest extends CtcItemUrlSubRequestParent {
/**
 *
 * Constructor to create a   CtcItemUrlDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcItemUrlDeleteNoOpRequest(String id, CtcItemUrlObjectData noOpIn) {
    super(id, "CtcItemUrlDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcItemUrl", CtcItemUrlObjectHelper.toMap(noOpIn, new HashMap(), "CtcItemUrl").get("CtcItemUrl"));
    }
  }
/**
 *
 * Retrieves the CtcItemUrlObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemUrlObjectData getOutput() {
    return CtcItemUrlObjectHelper.fromMap(outputMap, "CtcItemUrl");
  }
}
