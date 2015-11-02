/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SalesChannelGetNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a SalesChannelGetNoOpRequest Udt Request/Response
 *
 */
public class SalesChannelGetNoOpRequest extends SalesChannelSubRequestParent {
/**
 *
 * Constructor to create a   SalesChannelGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SalesChannelGetNoOpRequest(String id, SalesChannelObjectData noOpIn) {
    super(id, "SalesChannelGetNoOpRequest");
    if (noOpIn != null) {
      addInput("SalesChannel", SalesChannelObjectHelper.toMap(noOpIn, new HashMap(), "SalesChannel").get("SalesChannel"));
    }
  }
/**
 *
 * Retrieves the SalesChannelObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public SalesChannelObjectData getOutput() {
    return SalesChannelObjectHelper.fromMap(outputMap, "SalesChannel");
  }
}
