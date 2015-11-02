/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerInvCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvContainerInvCreateNoOpRequest Udt Request/Response
 *
 */
public class InvContainerInvCreateNoOpRequest extends InvContainerInvSubRequestParent {
/**
 *
 * Constructor to create a   InvContainerInvCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvContainerInvCreateNoOpRequest(String id, InvContainerInvObjectData noOpIn) {
    super(id, "InvContainerInvCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvContainerInv", InvContainerInvObjectHelper.toMap(noOpIn, new HashMap(), "InvContainerInv").get("InvContainerInv"));
    }
  }
/**
 *
 * Retrieves the InvContainerInvObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvContainerInvObjectData getOutput() {
    return InvContainerInvObjectHelper.fromMap(outputMap, "InvContainerInv");
  }
}
