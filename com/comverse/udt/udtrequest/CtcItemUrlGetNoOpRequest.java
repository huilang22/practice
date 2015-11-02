/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUrlGetNoOpRequest.java
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
 * NoOp class used to simulate a CtcItemUrlGetNoOpRequest Udt Request/Response
 *
 */
public class CtcItemUrlGetNoOpRequest extends CtcItemUrlSubRequestParent {
/**
 *
 * Constructor to create a   CtcItemUrlGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcItemUrlGetNoOpRequest(String id, CtcItemUrlObjectData noOpIn) {
    super(id, "CtcItemUrlGetNoOpRequest");
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
