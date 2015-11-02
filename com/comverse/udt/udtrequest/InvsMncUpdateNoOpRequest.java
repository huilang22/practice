/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMncUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsMncUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsMncUpdateNoOpRequest extends InvsMncSubRequestParent {
/**
 *
 * Constructor to create a   InvsMncUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsMncUpdateNoOpRequest(String id, InvsMncObjectData noOpIn) {
    super(id, "InvsMncUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsMnc", InvsMncObjectHelper.toMap(noOpIn, new HashMap(), "InvsMnc").get("InvsMnc"));
    }
  }
/**
 *
 * Retrieves the InvsMncObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsMncObjectData getOutput() {
    return InvsMncObjectHelper.fromMap(outputMap, "InvsMnc");
  }
}
