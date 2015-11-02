/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainGetNoOpRequest.java
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
 * NoOp class used to simulate a InvdMainGetNoOpRequest Udt Request/Response
 *
 */
public class InvdMainGetNoOpRequest extends InvdMainSubRequestParent {
/**
 *
 * Constructor to create a   InvdMainGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdMainGetNoOpRequest(String id, InvdMainObjectData noOpIn) {
    super(id, "InvdMainGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvdMain", InvdMainObjectHelper.toMap(noOpIn, new HashMap(), "InvdMain").get("InvdMain"));
    }
  }
/**
 *
 * Retrieves the InvdMainObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvdMainObjectData getOutput() {
    return InvdMainObjectHelper.fromMap(outputMap, "InvdMain");
  }
}
