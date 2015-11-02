/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsNetworkDeviceCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsNetworkDeviceCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsNetworkDeviceCreateNoOpRequest extends InvsNetworkDeviceSubRequestParent {
/**
 *
 * Constructor to create a   InvsNetworkDeviceCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsNetworkDeviceCreateNoOpRequest(String id, InvsNetworkDeviceObjectData noOpIn) {
    super(id, "InvsNetworkDeviceCreateNoOpRequest");
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
