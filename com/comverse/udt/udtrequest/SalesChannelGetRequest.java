/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SalesChannelGetRequest.java
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
 * Class used to create a SalesChannelGetRequest Udt Request
 *
 */

public class SalesChannelGetRequest extends SalesChannelSubRequestParent {
/**
 *
 * Constructor to create a  SalesChannelGetRequest
 * @param id Unique request name
 * @param SCGetIn SalesChannelObjectKeyData for SalesChannelGetRequest
 *
 */
@JsonCreator
  public SalesChannelGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("SalesChannel")SalesChannelObjectKeyData SCGetIn) {
    super(id, "SalesChannelGet");
    if (SCGetIn != null) {
      addInput("SalesChannel", SalesChannelObjectKeyHelper.toMap(SCGetIn, new HashMap(), "SalesChannelObjectKeyData").get("SalesChannelObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the SalesChannelObjectData that results from the SalesChannelGetRequest call
 * @return SalesChannelObjectData resulting from udt call
 *
 */

  public SalesChannelObjectData getOutput() {
    return SalesChannelObjectHelper.fromMap(outputMap, "SalesChannel");
  }
}
