/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerRefUpdateRequest.java
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
 * Class used to create a InvsSimResellerRefUpdateRequest Udt Request
 *
 */

public class InvsSimResellerRefUpdateRequest extends InvsSimResellerRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimResellerRefUpdateRequest
 * @param id Unique request name
 * @param InvsSimResellerRefUpdateIn InvsSimResellerRefObjectData for InvsSimResellerRefUpdateRequest
 *
 */
@JsonCreator
  public InvsSimResellerRefUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimResellerRef")InvsSimResellerRefObjectData InvsSimResellerRefUpdateIn) {
    super(id, "InvsSimResellerRefUpdate");
    if (InvsSimResellerRefUpdateIn != null) {
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectHelper.toMap(InvsSimResellerRefUpdateIn, new HashMap(), "InvsSimResellerRef").get("InvsSimResellerRef"));
    }
  }

/**
 *
 * Retrieves the InvsSimResellerRefObjectData that results from the InvsSimResellerRefUpdateRequest call
 * @return InvsSimResellerRefObjectData resulting from udt call
 *
 */

  public InvsSimResellerRefObjectData getOutput() {
    return InvsSimResellerRefObjectHelper.fromMap(outputMap, "InvsSimResellerRef");
  }
}
