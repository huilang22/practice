/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsNetworkDeviceGetRequest.java
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
 * Class used to create a InvsNetworkDeviceGetRequest Udt Request
 *
 */

public class InvsNetworkDeviceGetRequest extends InvsNetworkDeviceSubRequestParent {
/**
 *
 * Constructor to create a  InvsNetworkDeviceGetRequest
 * @param id Unique request name
 * @param InvsNetworkDeviceGetIn InvsNetworkDeviceObjectKeyData for InvsNetworkDeviceGetRequest
 *
 */
@JsonCreator
  public InvsNetworkDeviceGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsNetworkDevice")InvsNetworkDeviceObjectKeyData InvsNetworkDeviceGetIn) {
    super(id, "InvsNetworkDeviceGet");
    if (InvsNetworkDeviceGetIn != null) {
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectKeyHelper.toMap(InvsNetworkDeviceGetIn, new HashMap(), "InvsNetworkDeviceObjectKeyData").get("InvsNetworkDeviceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsNetworkDeviceObjectData that results from the InvsNetworkDeviceGetRequest call
 * @return InvsNetworkDeviceObjectData resulting from udt call
 *
 */

  public InvsNetworkDeviceObjectData getOutput() {
    return InvsNetworkDeviceObjectHelper.fromMap(outputMap, "InvsNetworkDevice");
  }
}
