/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigCreateRequest.java
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
 * Class used to create a InvsSimCardConfigCreateRequest Udt Request
 *
 */

public class InvsSimCardConfigCreateRequest extends InvsSimCardConfigSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimCardConfigCreateRequest
 * @param id Unique request name
 * @param InvsSimCardConfigCreateIn InvsSimCardConfigObjectData for InvsSimCardConfigCreateRequest
 *
 */
@JsonCreator
  public InvsSimCardConfigCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimCardConfig")InvsSimCardConfigObjectData InvsSimCardConfigCreateIn) {
    super(id, "InvsSimCardConfigCreate");
    if (InvsSimCardConfigCreateIn != null) {
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectHelper.toMap(InvsSimCardConfigCreateIn, new HashMap(), "InvsSimCardConfig").get("InvsSimCardConfig"));
    }
  }

/**
 *
 * Retrieves the InvsSimCardConfigObjectData that results from the InvsSimCardConfigCreateRequest call
 * @return InvsSimCardConfigObjectData resulting from udt call
 *
 */

  public InvsSimCardConfigObjectData getOutput() {
    return InvsSimCardConfigObjectHelper.fromMap(outputMap, "InvsSimCardConfig");
  }
}
