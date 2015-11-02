/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelRefUpdateRequest.java
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
 * Class used to create a InvsSimSalesChannelRefUpdateRequest Udt Request
 *
 */

public class InvsSimSalesChannelRefUpdateRequest extends InvsSimSalesChannelRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimSalesChannelRefUpdateRequest
 * @param id Unique request name
 * @param InvsSimSalesChannelRefUpdateIn InvsSimSalesChannelRefObjectData for InvsSimSalesChannelRefUpdateRequest
 *
 */
@JsonCreator
  public InvsSimSalesChannelRefUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimSalesChannelRef")InvsSimSalesChannelRefObjectData InvsSimSalesChannelRefUpdateIn) {
    super(id, "InvsSimSalesChannelRefUpdate");
    if (InvsSimSalesChannelRefUpdateIn != null) {
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectHelper.toMap(InvsSimSalesChannelRefUpdateIn, new HashMap(), "InvsSimSalesChannelRef").get("InvsSimSalesChannelRef"));
    }
  }

/**
 *
 * Retrieves the InvsSimSalesChannelRefObjectData that results from the InvsSimSalesChannelRefUpdateRequest call
 * @return InvsSimSalesChannelRefObjectData resulting from udt call
 *
 */

  public InvsSimSalesChannelRefObjectData getOutput() {
    return InvsSimSalesChannelRefObjectHelper.fromMap(outputMap, "InvsSimSalesChannelRef");
  }
}
