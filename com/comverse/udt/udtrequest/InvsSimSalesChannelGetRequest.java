/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelGetRequest.java
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
 * Class used to create a InvsSimSalesChannelGetRequest Udt Request
 *
 */

public class InvsSimSalesChannelGetRequest extends InvsSimSalesChannelSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimSalesChannelGetRequest
 * @param id Unique request name
 * @param InvsSimSalesChannelGetIn InvsSimSalesChannelObjectKeyData for InvsSimSalesChannelGetRequest
 *
 */
@JsonCreator
  public InvsSimSalesChannelGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimSalesChannel")InvsSimSalesChannelObjectKeyData InvsSimSalesChannelGetIn) {
    super(id, "InvsSimSalesChannelGet");
    if (InvsSimSalesChannelGetIn != null) {
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectKeyHelper.toMap(InvsSimSalesChannelGetIn, new HashMap(), "InvsSimSalesChannelObjectKeyData").get("InvsSimSalesChannelObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsSimSalesChannelObjectData that results from the InvsSimSalesChannelGetRequest call
 * @return InvsSimSalesChannelObjectData resulting from udt call
 *
 */

  public InvsSimSalesChannelObjectData getOutput() {
    return InvsSimSalesChannelObjectHelper.fromMap(outputMap, "InvsSimSalesChannel");
  }
}
