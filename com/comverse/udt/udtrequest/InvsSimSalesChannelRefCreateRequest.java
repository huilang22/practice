/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelRefCreateRequest.java
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
 * Class used to create a InvsSimSalesChannelRefCreateRequest Udt Request
 *
 */

public class InvsSimSalesChannelRefCreateRequest extends InvsSimSalesChannelRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimSalesChannelRefCreateRequest
 * @param id Unique request name
 * @param InvsSimSalesChannelRefCreateIn InvsSimSalesChannelRefObjectData for InvsSimSalesChannelRefCreateRequest
 *
 */
@JsonCreator
  public InvsSimSalesChannelRefCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimSalesChannelRef")InvsSimSalesChannelRefObjectData InvsSimSalesChannelRefCreateIn) {
    super(id, "InvsSimSalesChannelRefCreate");
    if (InvsSimSalesChannelRefCreateIn != null) {
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectHelper.toMap(InvsSimSalesChannelRefCreateIn, new HashMap(), "InvsSimSalesChannelRef").get("InvsSimSalesChannelRef"));
    }
  }

/**
 *
 * Retrieves the InvsSimSalesChannelRefObjectData that results from the InvsSimSalesChannelRefCreateRequest call
 * @return InvsSimSalesChannelRefObjectData resulting from udt call
 *
 */

  public InvsSimSalesChannelRefObjectData getOutput() {
    return InvsSimSalesChannelRefObjectHelper.fromMap(outputMap, "InvsSimSalesChannelRef");
  }
}
