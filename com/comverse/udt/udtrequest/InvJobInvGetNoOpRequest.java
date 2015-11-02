/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobInvGetNoOpRequest.java
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
 * NoOp class used to simulate a InvJobInvGetNoOpRequest Udt Request/Response
 *
 */
public class InvJobInvGetNoOpRequest extends InvJobInvSubRequestParent {
/**
 *
 * Constructor to create a   InvJobInvGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvJobInvGetNoOpRequest(String id, InvJobInvObjectData noOpIn) {
    super(id, "InvJobInvGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvJobInv", InvJobInvObjectHelper.toMap(noOpIn, new HashMap(), "InvJobInv").get("InvJobInv"));
    }
  }
/**
 *
 * Retrieves the InvJobInvObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobInvObjectData getOutput() {
    return InvJobInvObjectHelper.fromMap(outputMap, "InvJobInv");
  }
}
