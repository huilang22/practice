/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobInvGetNoOpRequest.java
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
 * NoOp class used to simulate a InvSimJobInvGetNoOpRequest Udt Request/Response
 *
 */
public class InvSimJobInvGetNoOpRequest extends InvSimJobInvSubRequestParent {
/**
 *
 * Constructor to create a   InvSimJobInvGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvSimJobInvGetNoOpRequest(String id, InvSimJobInvObjectData noOpIn) {
    super(id, "InvSimJobInvGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvSimJobInv", InvSimJobInvObjectHelper.toMap(noOpIn, new HashMap(), "InvSimJobInv").get("InvSimJobInv"));
    }
  }
/**
 *
 * Retrieves the InvSimJobInvObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvSimJobInvObjectData getOutput() {
    return InvSimJobInvObjectHelper.fromMap(outputMap, "InvSimJobInv");
  }
}
