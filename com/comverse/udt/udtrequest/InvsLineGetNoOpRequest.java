/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsLineGetNoOpRequest Udt Request/Response
 *
 */
public class InvsLineGetNoOpRequest extends InvsLineSubRequestParent {
/**
 *
 * Constructor to create a   InvsLineGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLineGetNoOpRequest(String id, InvsLineObjectData noOpIn) {
    super(id, "InvsLineGetNoOpRequest");
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
