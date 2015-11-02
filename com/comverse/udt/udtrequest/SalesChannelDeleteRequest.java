/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SalesChannelDeleteRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SalesChannelDeleteRequest Udt Request
 *
 */

public class SalesChannelDeleteRequest extends SalesChannelSubRequestParent {
/**
 *
 * Constructor to create a  SalesChannelDeleteRequest
 * @param id Unique request name
 * @param SCDeleteIn SalesChannelObjectKeyData for SalesChannelDeleteRequest
 *
 */
@JsonCreator
  public SalesChannelDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("SalesChannel")SalesChannelObjectKeyData SCDeleteIn) {
    super(id, "SalesChannelDelete");
    if (SCDeleteIn != null) {
      addInput("SalesChannel", SalesChannelObjectKeyHelper.toMap(SCDeleteIn, new HashMap(), "SalesChannelObjectKeyData").get("SalesChannelObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the SalesChannelObjectData that results from the SalesChannelDeleteRequest call
 * @return SalesChannelObjectData resulting from udt call
 *
 */

  public SalesChannelObjectData getOutput() {
    return SalesChannelObjectHelper.fromMap(outputMap, "SalesChannel");
  }
}
