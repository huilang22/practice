/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsBlacklistCreateRequest.java
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
 * Class used to create a InvsBlacklistCreateRequest Udt Request
 *
 */

public class InvsBlacklistCreateRequest extends InvsBlacklistSubRequestParent {
/**
 *
 * Constructor to create a  InvsBlacklistCreateRequest
 * @param id Unique request name
 * @param InvsBlacklistCreateIn InvsBlacklistObjectData for InvsBlacklistCreateRequest
 *
 */
@JsonCreator
  public InvsBlacklistCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsBlacklist")InvsBlacklistObjectData InvsBlacklistCreateIn) {
    super(id, "InvsBlacklistCreate");
    if (InvsBlacklistCreateIn != null) {
      addInput("InvsBlacklist", InvsBlacklistObjectHelper.toMap(InvsBlacklistCreateIn, new HashMap(), "InvsBlacklist").get("InvsBlacklist"));
    }
  }

/**
 *
 * Retrieves the InvsBlacklistObjectData that results from the InvsBlacklistCreateRequest call
 * @return InvsBlacklistObjectData resulting from udt call
 *
 */

  public InvsBlacklistObjectData getOutput() {
    return InvsBlacklistObjectHelper.fromMap(outputMap, "InvsBlacklist");
  }
}
