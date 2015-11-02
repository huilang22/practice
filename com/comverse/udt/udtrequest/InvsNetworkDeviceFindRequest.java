/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsNetworkDeviceFindRequest.java
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
 * Class used to create a InvsNetworkDeviceFindRequest Udt Request
 *
 */

public class InvsNetworkDeviceFindRequest extends InvsNetworkDeviceRequest {
/**
 *
 * Constructor to create a  InvsNetworkDeviceFindRequest
 * @param id Unique request name
 * @param InvsNetworkDeviceFindIn InvsNetworkDeviceObjectFilter for InvsNetworkDeviceFindRequest
 *
 */
@JsonCreator
  public InvsNetworkDeviceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsNetworkDevice")InvsNetworkDeviceObjectFilter InvsNetworkDeviceFindIn) {
    super(id, "InvsNetworkDeviceFind");
    if (InvsNetworkDeviceFindIn != null) {
      Integer index =  InvsNetworkDeviceFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectHelper.toMap(InvsNetworkDeviceFindIn, new HashMap(), "InvsNetworkDevice").get("InvsNetworkDevice"));
    }
  }

/**
 *
 * Retrieves the InvsNetworkDeviceObjectDataList that results from the InvsNetworkDeviceFindRequest call
 * @return InvsNetworkDeviceObjectDataList resulting from udt call
 *
 */

  public InvsNetworkDeviceObjectDataList getOutput() {
    return InvsNetworkDeviceObjectHelper.fromMapList(outputMap, "InvsNetworkDeviceList");
  }
}
