/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerRefGetRequest.java
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
 * Class used to create a InvsSimResellerRefGetRequest Udt Request
 *
 */

public class InvsSimResellerRefGetRequest extends InvsSimResellerRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimResellerRefGetRequest
 * @param id Unique request name
 * @param InvsSimResellerRefGetIn InvsSimResellerRefObjectKeyData for InvsSimResellerRefGetRequest
 *
 */
@JsonCreator
  public InvsSimResellerRefGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimResellerRef")InvsSimResellerRefObjectKeyData InvsSimResellerRefGetIn) {
    super(id, "InvsSimResellerRefGet");
    if (InvsSimResellerRefGetIn != null) {
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectKeyHelper.toMap(InvsSimResellerRefGetIn, new HashMap(), "InvsSimResellerRefObjectKeyData").get("InvsSimResellerRefObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsSimResellerRefObjectData that results from the InvsSimResellerRefGetRequest call
 * @return InvsSimResellerRefObjectData resulting from udt call
 *
 */

  public InvsSimResellerRefObjectData getOutput() {
    return InvsSimResellerRefObjectHelper.fromMap(outputMap, "InvsSimResellerRef");
  }
}
