/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSalesChannelCreateRequest.java
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
 * Class used to create a InvsSalesChannelCreateRequest Udt Request
 *
 */

public class InvsSalesChannelCreateRequest extends InvsSalesChannelSubRequestParent {
/**
 *
 * Constructor to create a  InvsSalesChannelCreateRequest
 * @param id Unique request name
 * @param InvsSalesChannelCreateIn InvsSalesChannelObjectData for InvsSalesChannelCreateRequest
 *
 */
@JsonCreator
  public InvsSalesChannelCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSalesChannel")InvsSalesChannelObjectData InvsSalesChannelCreateIn) {
    super(id, "InvsSalesChannelCreate");
    if (InvsSalesChannelCreateIn != null) {
      addInput("InvsSalesChannel", InvsSalesChannelObjectHelper.toMap(InvsSalesChannelCreateIn, new HashMap(), "InvsSalesChannel").get("InvsSalesChannel"));
    }
  }

/**
 *
 * Retrieves the InvsSalesChannelObjectData that results from the InvsSalesChannelCreateRequest call
 * @return InvsSalesChannelObjectData resulting from udt call
 *
 */

  public InvsSalesChannelObjectData getOutput() {
    return InvsSalesChannelObjectHelper.fromMap(outputMap, "InvsSalesChannel");
  }
}
