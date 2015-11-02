/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVanityUpdateRequest.java
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
 * Class used to create a InvsVanityUpdateRequest Udt Request
 *
 */

public class InvsVanityUpdateRequest extends InvsVanitySubRequestParent {
/**
 *
 * Constructor to create a  InvsVanityUpdateRequest
 * @param id Unique request name
 * @param InvsVanityUpdateIn InvsVanityObjectData for InvsVanityUpdateRequest
 *
 */
@JsonCreator
  public InvsVanityUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsVanity")InvsVanityObjectData InvsVanityUpdateIn) {
    super(id, "InvsVanityUpdate");
    if (InvsVanityUpdateIn != null) {
      addInput("InvsVanity", InvsVanityObjectHelper.toMap(InvsVanityUpdateIn, new HashMap(), "InvsVanity").get("InvsVanity"));
    }
  }

/**
 *
 * Retrieves the InvsVanityObjectData that results from the InvsVanityUpdateRequest call
 * @return InvsVanityObjectData resulting from udt call
 *
 */

  public InvsVanityObjectData getOutput() {
    return InvsVanityObjectHelper.fromMap(outputMap, "InvsVanity");
  }
}
