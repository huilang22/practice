/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineCreateNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsLineCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsLineCreateNoOpRequest extends InvsLineSubRequestParent {
/**
 *
 * Constructor to create a   InvsLineCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLineCreateNoOpRequest(String id, InvsLineObjectData noOpIn) {
    super(id, "InvsLineCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsLine", InvsLineObjectHelper.toMap(noOpIn, new HashMap(), "InvsLine").get("InvsLine"));
    }
  }
/**
 *
 * Retrieves the InvsLineObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLineObjectData getOutput() {
    return InvsLineObjectHelper.fromMap(outputMap, "InvsLine");
  }
}
