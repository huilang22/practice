/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemFormatDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CtcItemFormatDeleteNoOpRequest Udt Request/Response
 *
 */
public class CtcItemFormatDeleteNoOpRequest extends CtcItemFormatSubRequestParent {
/**
 *
 * Constructor to create a   CtcItemFormatDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcItemFormatDeleteNoOpRequest(String id, CtcItemFormatObjectData noOpIn) {
    super(id, "CtcItemFormatDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcItemFormat", CtcItemFormatObjectHelper.toMap(noOpIn, new HashMap(), "CtcItemFormat").get("CtcItemFormat"));
    }
  }
/**
 *
 * Retrieves the CtcItemFormatObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemFormatObjectData getOutput() {
    return CtcItemFormatObjectHelper.fromMap(outputMap, "CtcItemFormat");
  }
}
