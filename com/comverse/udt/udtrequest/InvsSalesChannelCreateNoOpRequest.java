/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSalesChannelCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsSalesChannelCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsSalesChannelCreateNoOpRequest extends InvsSalesChannelSubRequestParent {
/**
 *
 * Constructor to create a   InvsSalesChannelCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSalesChannelCreateNoOpRequest(String id, InvsSalesChannelObjectData noOpIn) {
    super(id, "InvsSalesChannelCreateNoOpRequest");
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
