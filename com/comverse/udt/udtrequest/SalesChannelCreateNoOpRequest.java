/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SalesChannelCreateNoOpRequest.java
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
 * NoOp class used to simulate a SalesChannelCreateNoOpRequest Udt Request/Response
 *
 */
public class SalesChannelCreateNoOpRequest extends SalesChannelSubRequestParent {
/**
 *
 * Constructor to create a   SalesChannelCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SalesChannelCreateNoOpRequest(String id, SalesChannelObjectData noOpIn) {
    super(id, "SalesChannelCreateNoOpRequest");
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
