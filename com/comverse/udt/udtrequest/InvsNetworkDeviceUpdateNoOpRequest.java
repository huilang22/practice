/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsNetworkDeviceUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsNetworkDeviceUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsNetworkDeviceUpdateNoOpRequest extends InvsNetworkDeviceSubRequestParent {
/**
 *
 * Constructor to create a   InvsNetworkDeviceUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsNetworkDeviceUpdateNoOpRequest(String id, InvsNetworkDeviceObjectData noOpIn) {
    super(id, "InvsNetworkDeviceUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectHelper.toMap(noOpIn, new HashMap(), "InvsNetworkDevice").get("InvsNetworkDevice"));
    }
  }
/**
 *
 * Retrieves the InvsNetworkDeviceObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsNetworkDeviceObjectData getOutput() {
    return InvsNetworkDeviceObjectHelper.fromMap(outputMap, "InvsNetworkDevice");
  }
}
