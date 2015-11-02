/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvModJobCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvModJobCreateNoOpRequest Udt Request/Response
 *
 */
public class InvModJobCreateNoOpRequest extends InvModJobSubRequestParent {
/**
 *
 * Constructor to create a   InvModJobCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvModJobCreateNoOpRequest(String id, InvModJobObjectData noOpIn) {
    super(id, "InvModJobCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvModJob", InvModJobObjectHelper.toMap(noOpIn, new HashMap(), "InvModJob").get("InvModJob"));
    }
  }
/**
 *
 * Retrieves the InvModJobObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvModJobObjectData getOutput() {
    return InvModJobObjectHelper.fromMap(outputMap, "InvModJob");
  }
}
