/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSalesChannelUpdateRequest.java
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
 * Class used to create a InvsSalesChannelUpdateRequest Udt Request
 *
 */

public class InvsSalesChannelUpdateRequest extends InvsSalesChannelSubRequestParent {
/**
 *
 * Constructor to create a  InvsSalesChannelUpdateRequest
 * @param id Unique request name
 * @param InvsSalesChannelUpdateIn InvsSalesChannelObjectData for InvsSalesChannelUpdateRequest
 *
 */
@JsonCreator
  public InvsSalesChannelUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSalesChannel")InvsSalesChannelObjectData InvsSalesChannelUpdateIn) {
    super(id, "InvsSalesChannelUpdate");
    if (InvsSalesChannelUpdateIn != null) {
      addInput("InvsSalesChannel", InvsSalesChannelObjectHelper.toMap(InvsSalesChannelUpdateIn, new HashMap(), "InvsSalesChannel").get("InvsSalesChannel"));
    }
  }

/**
 *
 * Retrieves the InvsSalesChannelObjectData that results from the InvsSalesChannelUpdateRequest call
 * @return InvsSalesChannelObjectData resulting from udt call
 *
 */

  public InvsSalesChannelObjectData getOutput() {
    return InvsSalesChannelObjectHelper.fromMap(outputMap, "InvsSalesChannel");
  }
}
