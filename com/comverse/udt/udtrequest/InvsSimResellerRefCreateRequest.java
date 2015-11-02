/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerRefCreateRequest.java
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
 * Class used to create a InvsSimResellerRefCreateRequest Udt Request
 *
 */

public class InvsSimResellerRefCreateRequest extends InvsSimResellerRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimResellerRefCreateRequest
 * @param id Unique request name
 * @param InvsSimResellerRefCreateIn InvsSimResellerRefObjectData for InvsSimResellerRefCreateRequest
 *
 */
@JsonCreator
  public InvsSimResellerRefCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimResellerRef")InvsSimResellerRefObjectData InvsSimResellerRefCreateIn) {
    super(id, "InvsSimResellerRefCreate");
    if (InvsSimResellerRefCreateIn != null) {
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectHelper.toMap(InvsSimResellerRefCreateIn, new HashMap(), "InvsSimResellerRef").get("InvsSimResellerRef"));
    }
  }

/**
 *
 * Retrieves the InvsSimResellerRefObjectData that results from the InvsSimResellerRefCreateRequest call
 * @return InvsSimResellerRefObjectData resulting from udt call
 *
 */

  public InvsSimResellerRefObjectData getOutput() {
    return InvsSimResellerRefObjectHelper.fromMap(outputMap, "InvsSimResellerRef");
  }
}
