/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SalesChannelUpdateRequest.java
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
 * Class used to create a SalesChannelUpdateRequest Udt Request
 *
 */

public class SalesChannelUpdateRequest extends SalesChannelSubRequestParent {
/**
 *
 * Constructor to create a  SalesChannelUpdateRequest
 * @param id Unique request name
 * @param SCUpdateIn SalesChannelObjectData for SalesChannelUpdateRequest
 *
 */
@JsonCreator
  public SalesChannelUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("SalesChannel")SalesChannelObjectData SCUpdateIn) {
    super(id, "SalesChannelUpdate");
    if (SCUpdateIn != null) {
      addInput("SalesChannel", SalesChannelObjectHelper.toMap(SCUpdateIn, new HashMap(), "SalesChannel").get("SalesChannel"));
    }
  }

/**
 *
 * Retrieves the SalesChannelObjectData that results from the SalesChannelUpdateRequest call
 * @return SalesChannelObjectData resulting from udt call
 *
 */

  public SalesChannelObjectData getOutput() {
    return SalesChannelObjectHelper.fromMap(outputMap, "SalesChannel");
  }
}
