/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsNetworkDeviceCreateRequest.java
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
 * Class used to create a InvsNetworkDeviceCreateRequest Udt Request
 *
 */

public class InvsNetworkDeviceCreateRequest extends InvsNetworkDeviceSubRequestParent {
/**
 *
 * Constructor to create a  InvsNetworkDeviceCreateRequest
 * @param id Unique request name
 * @param InvsNetworkDeviceCreateIn InvsNetworkDeviceObjectData for InvsNetworkDeviceCreateRequest
 *
 */
@JsonCreator
  public InvsNetworkDeviceCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsNetworkDevice")InvsNetworkDeviceObjectData InvsNetworkDeviceCreateIn) {
    super(id, "InvsNetworkDeviceCreate");
    if (InvsNetworkDeviceCreateIn != null) {
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectHelper.toMap(InvsNetworkDeviceCreateIn, new HashMap(), "InvsNetworkDevice").get("InvsNetworkDevice"));
    }
  }

/**
 *
 * Retrieves the InvsNetworkDeviceObjectData that results from the InvsNetworkDeviceCreateRequest call
 * @return InvsNetworkDeviceObjectData resulting from udt call
 *
 */

  public InvsNetworkDeviceObjectData getOutput() {
    return InvsNetworkDeviceObjectHelper.fromMap(outputMap, "InvsNetworkDevice");
  }
}
