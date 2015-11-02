/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVanityGetRequest.java
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
 * Class used to create a InvsVanityGetRequest Udt Request
 *
 */

public class InvsVanityGetRequest extends InvsVanitySubRequestParent {
/**
 *
 * Constructor to create a  InvsVanityGetRequest
 * @param id Unique request name
 * @param InvsVanityGetIn InvsVanityObjectKeyData for InvsVanityGetRequest
 *
 */
@JsonCreator
  public InvsVanityGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsVanity")InvsVanityObjectKeyData InvsVanityGetIn) {
    super(id, "InvsVanityGet");
    if (InvsVanityGetIn != null) {
      addInput("InvsVanity", InvsVanityObjectKeyHelper.toMap(InvsVanityGetIn, new HashMap(), "InvsVanityObjectKeyData").get("InvsVanityObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsVanityObjectData that results from the InvsVanityGetRequest call
 * @return InvsVanityObjectData resulting from udt call
 *
 */

  public InvsVanityObjectData getOutput() {
    return InvsVanityObjectHelper.fromMap(outputMap, "InvsVanity");
  }
}
