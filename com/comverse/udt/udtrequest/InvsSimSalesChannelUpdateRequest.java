/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelUpdateRequest.java
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
 * Class used to create a InvsSimSalesChannelUpdateRequest Udt Request
 *
 */

public class InvsSimSalesChannelUpdateRequest extends InvsSimSalesChannelSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimSalesChannelUpdateRequest
 * @param id Unique request name
 * @param InvsSimSalesChannelUpdateIn InvsSimSalesChannelObjectData for InvsSimSalesChannelUpdateRequest
 *
 */
@JsonCreator
  public InvsSimSalesChannelUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimSalesChannel")InvsSimSalesChannelObjectData InvsSimSalesChannelUpdateIn) {
    super(id, "InvsSimSalesChannelUpdate");
    if (InvsSimSalesChannelUpdateIn != null) {
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectHelper.toMap(InvsSimSalesChannelUpdateIn, new HashMap(), "InvsSimSalesChannel").get("InvsSimSalesChannel"));
    }
  }

/**
 *
 * Retrieves the InvsSimSalesChannelObjectData that results from the InvsSimSalesChannelUpdateRequest call
 * @return InvsSimSalesChannelObjectData resulting from udt call
 *
 */

  public InvsSimSalesChannelObjectData getOutput() {
    return InvsSimSalesChannelObjectHelper.fromMap(outputMap, "InvsSimSalesChannel");
  }
}
