/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigUpdateRequest.java
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
 * Class used to create a InvsSimCardConfigUpdateRequest Udt Request
 *
 */

public class InvsSimCardConfigUpdateRequest extends InvsSimCardConfigSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimCardConfigUpdateRequest
 * @param id Unique request name
 * @param InvsSimCardConfigUpdateIn InvsSimCardConfigObjectData for InvsSimCardConfigUpdateRequest
 *
 */
@JsonCreator
  public InvsSimCardConfigUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimCardConfig")InvsSimCardConfigObjectData InvsSimCardConfigUpdateIn) {
    super(id, "InvsSimCardConfigUpdate");
    if (InvsSimCardConfigUpdateIn != null) {
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectHelper.toMap(InvsSimCardConfigUpdateIn, new HashMap(), "InvsSimCardConfig").get("InvsSimCardConfig"));
    }
  }

/**
 *
 * Retrieves the InvsSimCardConfigObjectData that results from the InvsSimCardConfigUpdateRequest call
 * @return InvsSimCardConfigObjectData resulting from udt call
 *
 */

  public InvsSimCardConfigObjectData getOutput() {
    return InvsSimCardConfigObjectHelper.fromMap(outputMap, "InvsSimCardConfig");
  }
}
