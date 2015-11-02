/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelRefGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimSalesChannelRefGetNoOpRequest Udt Request/Response
 *
 */
public class InvsSimSalesChannelRefGetNoOpRequest extends InvsSimSalesChannelRefSubRequestParent {
/**
 *
 * Constructor to create a   InvsSimSalesChannelRefGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimSalesChannelRefGetNoOpRequest(String id, InvsSimSalesChannelRefObjectData noOpIn) {
    super(id, "InvsSimSalesChannelRefGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsSimSalesChannelRef").get("InvsSimSalesChannelRef"));
    }
  }
/**
 *
 * Retrieves the InvsSimSalesChannelRefObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimSalesChannelRefObjectData getOutput() {
    return InvsSimSalesChannelRefObjectHelper.fromMap(outputMap, "InvsSimSalesChannelRef");
  }
}
