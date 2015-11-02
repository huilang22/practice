/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvSimJobCreateNoOpRequest Udt Request/Response
 *
 */
public class InvSimJobCreateNoOpRequest extends InvSimJobSubRequestParent {
/**
 *
 * Constructor to create a   InvSimJobCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvSimJobCreateNoOpRequest(String id, InvSimJobObjectData noOpIn) {
    super(id, "InvSimJobCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvSimJob", InvSimJobObjectHelper.toMap(noOpIn, new HashMap(), "InvSimJob").get("InvSimJob"));
    }
  }
/**
 *
 * Retrieves the InvSimJobObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvSimJobObjectData getOutput() {
    return InvSimJobObjectHelper.fromMap(outputMap, "InvSimJob");
  }
}
