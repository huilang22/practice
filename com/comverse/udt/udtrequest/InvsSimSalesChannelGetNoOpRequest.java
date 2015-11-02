/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimSalesChannelGetNoOpRequest Udt Request/Response
 *
 */
public class InvsSimSalesChannelGetNoOpRequest extends InvsSimSalesChannelSubRequestParent {
/**
 *
 * Constructor to create a   InvsSimSalesChannelGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimSalesChannelGetNoOpRequest(String id, InvsSimSalesChannelObjectData noOpIn) {
    super(id, "InvsSimSalesChannelGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectHelper.toMap(noOpIn, new HashMap(), "InvsSimSalesChannel").get("InvsSimSalesChannel"));
    }
  }
/**
 *
 * Retrieves the InvsSimSalesChannelObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimSalesChannelObjectData getOutput() {
    return InvsSimSalesChannelObjectHelper.fromMap(outputMap, "InvsSimSalesChannel");
  }
}
