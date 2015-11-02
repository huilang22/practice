/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelCreateRequest.java
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
 * Class used to create a InvsSimSalesChannelCreateRequest Udt Request
 *
 */

public class InvsSimSalesChannelCreateRequest extends InvsSimSalesChannelSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimSalesChannelCreateRequest
 * @param id Unique request name
 * @param InvsSimSalesChannelCreateIn InvsSimSalesChannelObjectData for InvsSimSalesChannelCreateRequest
 *
 */
@JsonCreator
  public InvsSimSalesChannelCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimSalesChannel")InvsSimSalesChannelObjectData InvsSimSalesChannelCreateIn) {
    super(id, "InvsSimSalesChannelCreate");
    if (InvsSimSalesChannelCreateIn != null) {
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectHelper.toMap(InvsSimSalesChannelCreateIn, new HashMap(), "InvsSimSalesChannel").get("InvsSimSalesChannel"));
    }
  }

/**
 *
 * Retrieves the InvsSimSalesChannelObjectData that results from the InvsSimSalesChannelCreateRequest call
 * @return InvsSimSalesChannelObjectData resulting from udt call
 *
 */

  public InvsSimSalesChannelObjectData getOutput() {
    return InvsSimSalesChannelObjectHelper.fromMap(outputMap, "InvsSimSalesChannel");
  }
}
