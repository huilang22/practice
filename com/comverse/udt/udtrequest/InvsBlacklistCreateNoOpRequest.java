/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsBlacklistCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsBlacklistCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsBlacklistCreateNoOpRequest extends InvsBlacklistSubRequestParent {
/**
 *
 * Constructor to create a   InvsBlacklistCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsBlacklistCreateNoOpRequest(String id, InvsBlacklistObjectData noOpIn) {
    super(id, "InvsBlacklistCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsBlacklist", InvsBlacklistObjectHelper.toMap(noOpIn, new HashMap(), "InvsBlacklist").get("InvsBlacklist"));
    }
  }
/**
 *
 * Retrieves the InvsBlacklistObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsBlacklistObjectData getOutput() {
    return InvsBlacklistObjectHelper.fromMap(outputMap, "InvsBlacklist");
  }
}
