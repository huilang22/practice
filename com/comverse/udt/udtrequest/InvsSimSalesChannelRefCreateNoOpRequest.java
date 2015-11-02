/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelRefCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsSimSalesChannelRefCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsSimSalesChannelRefCreateNoOpRequest extends InvsSimSalesChannelRefSubRequestParent {
/**
 *
 * Constructor to create a   InvsSimSalesChannelRefCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSimSalesChannelRefCreateNoOpRequest(String id, InvsSimSalesChannelRefObjectData noOpIn) {
    super(id, "InvsSimSalesChannelRefCreateNoOpRequest");
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
