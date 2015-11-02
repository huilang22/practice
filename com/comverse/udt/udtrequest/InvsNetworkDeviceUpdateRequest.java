/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsNetworkDeviceUpdateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsNetworkDeviceUpdateRequest Udt Request
 *
 */

public class InvsNetworkDeviceUpdateRequest extends InvsNetworkDeviceSubRequestParent {
/**
 *
 * Constructor to create a  InvsNetworkDeviceUpdateRequest
 * @param id Unique request name
 * @param InvsNetworkDeviceUpdateIn InvsNetworkDeviceObjectData for InvsNetworkDeviceUpdateRequest
 *
 */
@JsonCreator
  public InvsNetworkDeviceUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsNetworkDevice")InvsNetworkDeviceObjectData InvsNetworkDeviceUpdateIn) {
    super(id, "InvsNetworkDeviceUpdate");
    if (InvsNetworkDeviceUpdateIn != null) {
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectHelper.toMap(InvsNetworkDeviceUpdateIn, new HashMap(), "InvsNetworkDevice").get("InvsNetworkDevice"));
    }
  }

/**
 *
 * Retrieves the InvsNetworkDeviceObjectData that results from the InvsNetworkDeviceUpdateRequest call
 * @return InvsNetworkDeviceObjectData resulting from udt call
 *
 */

  public InvsNetworkDeviceObjectData getOutput() {
    return InvsNetworkDeviceObjectHelper.fromMap(outputMap, "InvsNetworkDevice");
  }
}
