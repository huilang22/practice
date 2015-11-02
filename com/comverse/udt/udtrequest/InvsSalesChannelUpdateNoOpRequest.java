/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSalesChannelUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsSalesChannelUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsSalesChannelUpdateNoOpRequest extends InvsSalesChannelSubRequestParent {
/**
 *
 * Constructor to create a   InvsSalesChannelUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSalesChannelUpdateNoOpRequest(String id, InvsSalesChannelObjectData noOpIn) {
    super(id, "InvsSalesChannelUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsSalesChannel", InvsSalesChannelObjectHelper.toMap(noOpIn, new HashMap(), "InvsSalesChannel").get("InvsSalesChannel"));
    }
  }
/**
 *
 * Retrieves the InvsSalesChannelObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSalesChannelObjectData getOutput() {
    return InvsSalesChannelObjectHelper.fromMap(outputMap, "InvsSalesChannel");
  }
}
