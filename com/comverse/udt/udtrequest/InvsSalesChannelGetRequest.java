/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSalesChannelGetRequest.java
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
 * Class used to create a InvsSalesChannelGetRequest Udt Request
 *
 */

public class InvsSalesChannelGetRequest extends InvsSalesChannelSubRequestParent {
/**
 *
 * Constructor to create a  InvsSalesChannelGetRequest
 * @param id Unique request name
 * @param InvsSalesChannelGetIn InvsSalesChannelObjectKeyData for InvsSalesChannelGetRequest
 *
 */
@JsonCreator
  public InvsSalesChannelGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSalesChannel")InvsSalesChannelObjectKeyData InvsSalesChannelGetIn) {
    super(id, "InvsSalesChannelGet");
    if (InvsSalesChannelGetIn != null) {
      addInput("InvsSalesChannel", InvsSalesChannelObjectKeyHelper.toMap(InvsSalesChannelGetIn, new HashMap(), "InvsSalesChannelObjectKeyData").get("InvsSalesChannelObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsSalesChannelObjectData that results from the InvsSalesChannelGetRequest call
 * @return InvsSalesChannelObjectData resulting from udt call
 *
 */

  public InvsSalesChannelObjectData getOutput() {
    return InvsSalesChannelObjectHelper.fromMap(outputMap, "InvsSalesChannel");
  }
}
