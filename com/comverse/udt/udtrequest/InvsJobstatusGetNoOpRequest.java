/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstatusGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsJobstatusGetNoOpRequest Udt Request/Response
 *
 */
public class InvsJobstatusGetNoOpRequest extends InvsJobstatusSubRequestParent {
/**
 *
 * Constructor to create a   InvsJobstatusGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsJobstatusGetNoOpRequest(String id, InvsJobstatusObjectData noOpIn) {
    super(id, "InvsJobstatusGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsJobstatus", InvsJobstatusObjectHelper.toMap(noOpIn, new HashMap(), "InvsJobstatus").get("InvsJobstatus"));
    }
  }
/**
 *
 * Retrieves the InvsJobstatusObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobstatusObjectData getOutput() {
    return InvsJobstatusObjectHelper.fromMap(outputMap, "InvsJobstatus");
  }
}
