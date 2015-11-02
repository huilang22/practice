/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVanityCreateRequest.java
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
 * Class used to create a InvsVanityCreateRequest Udt Request
 *
 */

public class InvsVanityCreateRequest extends InvsVanitySubRequestParent {
/**
 *
 * Constructor to create a  InvsVanityCreateRequest
 * @param id Unique request name
 * @param InvsVanityCreateIn InvsVanityObjectData for InvsVanityCreateRequest
 *
 */
@JsonCreator
  public InvsVanityCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsVanity")InvsVanityObjectData InvsVanityCreateIn) {
    super(id, "InvsVanityCreate");
    if (InvsVanityCreateIn != null) {
      addInput("InvsVanity", InvsVanityObjectHelper.toMap(InvsVanityCreateIn, new HashMap(), "InvsVanity").get("InvsVanity"));
    }
  }

/**
 *
 * Retrieves the InvsVanityObjectData that results from the InvsVanityCreateRequest call
 * @return InvsVanityObjectData resulting from udt call
 *
 */

  public InvsVanityObjectData getOutput() {
    return InvsVanityObjectHelper.fromMap(outputMap, "InvsVanity");
  }
}
