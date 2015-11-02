/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelRefGetRequest.java
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
 * Class used to create a InvsSimSalesChannelRefGetRequest Udt Request
 *
 */

public class InvsSimSalesChannelRefGetRequest extends InvsSimSalesChannelRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimSalesChannelRefGetRequest
 * @param id Unique request name
 * @param InvsSimSalesChannelRefGetIn InvsSimSalesChannelRefObjectKeyData for InvsSimSalesChannelRefGetRequest
 *
 */
@JsonCreator
  public InvsSimSalesChannelRefGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimSalesChannelRef")InvsSimSalesChannelRefObjectKeyData InvsSimSalesChannelRefGetIn) {
    super(id, "InvsSimSalesChannelRefGet");
    if (InvsSimSalesChannelRefGetIn != null) {
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectKeyHelper.toMap(InvsSimSalesChannelRefGetIn, new HashMap(), "InvsSimSalesChannelRefObjectKeyData").get("InvsSimSalesChannelRefObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsSimSalesChannelRefObjectData that results from the InvsSimSalesChannelRefGetRequest call
 * @return InvsSimSalesChannelRefObjectData resulting from udt call
 *
 */

  public InvsSimSalesChannelRefObjectData getOutput() {
    return InvsSimSalesChannelRefObjectHelper.fromMap(outputMap, "InvsSimSalesChannelRef");
  }
}
