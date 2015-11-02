/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcContentTypeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CtcContentTypeUpdateNoOpRequest Udt Request/Response
 *
 */
public class CtcContentTypeUpdateNoOpRequest extends CtcContentTypeSubRequestParent {
/**
 *
 * Constructor to create a   CtcContentTypeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcContentTypeUpdateNoOpRequest(String id, CtcContentTypeObjectData noOpIn) {
    super(id, "CtcContentTypeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcContentType", CtcContentTypeObjectHelper.toMap(noOpIn, new HashMap(), "CtcContentType").get("CtcContentType"));
    }
  }
/**
 *
 * Retrieves the CtcContentTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcContentTypeObjectData getOutput() {
    return CtcContentTypeObjectHelper.fromMap(outputMap, "CtcContentType");
  }
}
