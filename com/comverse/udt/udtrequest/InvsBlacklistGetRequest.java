/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsBlacklistGetRequest.java
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
 * Class used to create a InvsBlacklistGetRequest Udt Request
 *
 */

public class InvsBlacklistGetRequest extends InvsBlacklistSubRequestParent {
/**
 *
 * Constructor to create a  InvsBlacklistGetRequest
 * @param id Unique request name
 * @param InvsBlacklistGetIn InvsBlacklistObjectKeyData for InvsBlacklistGetRequest
 *
 */
@JsonCreator
  public InvsBlacklistGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsBlacklist")InvsBlacklistObjectKeyData InvsBlacklistGetIn) {
    super(id, "InvsBlacklistGet");
    if (InvsBlacklistGetIn != null) {
      addInput("InvsBlacklist", InvsBlacklistObjectKeyHelper.toMap(InvsBlacklistGetIn, new HashMap(), "InvsBlacklistObjectKeyData").get("InvsBlacklistObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsBlacklistObjectData that results from the InvsBlacklistGetRequest call
 * @return InvsBlacklistObjectData resulting from udt call
 *
 */

  public InvsBlacklistObjectData getOutput() {
    return InvsBlacklistObjectHelper.fromMap(outputMap, "InvsBlacklist");
  }
}
