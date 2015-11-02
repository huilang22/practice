/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsBlacklistGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsBlacklistGetNoOpRequest Udt Request/Response
 *
 */
public class InvsBlacklistGetNoOpRequest extends InvsBlacklistSubRequestParent {
/**
 *
 * Constructor to create a   InvsBlacklistGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsBlacklistGetNoOpRequest(String id, InvsBlacklistObjectData noOpIn) {
    super(id, "InvsBlacklistGetNoOpRequest");
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
