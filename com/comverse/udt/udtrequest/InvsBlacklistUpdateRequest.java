/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsBlacklistUpdateRequest.java
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
 * Class used to create a InvsBlacklistUpdateRequest Udt Request
 *
 */

public class InvsBlacklistUpdateRequest extends InvsBlacklistSubRequestParent {
/**
 *
 * Constructor to create a  InvsBlacklistUpdateRequest
 * @param id Unique request name
 * @param InvsBlacklistUpdateIn InvsBlacklistObjectData for InvsBlacklistUpdateRequest
 *
 */
@JsonCreator
  public InvsBlacklistUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsBlacklist")InvsBlacklistObjectData InvsBlacklistUpdateIn) {
    super(id, "InvsBlacklistUpdate");
    if (InvsBlacklistUpdateIn != null) {
      addInput("InvsBlacklist", InvsBlacklistObjectHelper.toMap(InvsBlacklistUpdateIn, new HashMap(), "InvsBlacklist").get("InvsBlacklist"));
    }
  }

/**
 *
 * Retrieves the InvsBlacklistObjectData that results from the InvsBlacklistUpdateRequest call
 * @return InvsBlacklistObjectData resulting from udt call
 *
 */

  public InvsBlacklistObjectData getOutput() {
    return InvsBlacklistObjectHelper.fromMap(outputMap, "InvsBlacklist");
  }
}
