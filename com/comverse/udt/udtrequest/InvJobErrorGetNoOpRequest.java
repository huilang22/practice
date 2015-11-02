/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobErrorGetNoOpRequest.java
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
 * NoOp class used to simulate a InvJobErrorGetNoOpRequest Udt Request/Response
 *
 */
public class InvJobErrorGetNoOpRequest extends InvJobErrorSubRequestParent {
/**
 *
 * Constructor to create a   InvJobErrorGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvJobErrorGetNoOpRequest(String id, InvJobErrorObjectData noOpIn) {
    super(id, "InvJobErrorGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvJobError", InvJobErrorObjectHelper.toMap(noOpIn, new HashMap(), "InvJobError").get("InvJobError"));
    }
  }
/**
 *
 * Retrieves the InvJobErrorObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobErrorObjectData getOutput() {
    return InvJobErrorObjectHelper.fromMap(outputMap, "InvJobError");
  }
}
