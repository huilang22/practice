/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SalesChannelCreateRequest.java
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
 * Class used to create a SalesChannelCreateRequest Udt Request
 *
 */

public class SalesChannelCreateRequest extends SalesChannelSubRequestParent {
/**
 *
 * Constructor to create a  SalesChannelCreateRequest
 * @param id Unique request name
 * @param SCCreateIn SalesChannelObjectData for SalesChannelCreateRequest
 *
 */
@JsonCreator
  public SalesChannelCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("SalesChannel")SalesChannelObjectData SCCreateIn) {
    super(id, "SalesChannelCreate");
    if (SCCreateIn != null) {
      addInput("SalesChannel", SalesChannelObjectHelper.toMap(SCCreateIn, new HashMap(), "SalesChannel").get("SalesChannel"));
    }
  }

/**
 *
 * Retrieves the SalesChannelObjectData that results from the SalesChannelCreateRequest call
 * @return SalesChannelObjectData resulting from udt call
 *
 */

  public SalesChannelObjectData getOutput() {
    return SalesChannelObjectHelper.fromMap(outputMap, "SalesChannel");
  }
}
