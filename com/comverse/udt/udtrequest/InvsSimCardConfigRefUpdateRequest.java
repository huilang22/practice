/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigRefUpdateRequest.java
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
 * Class used to create a InvsSimCardConfigRefUpdateRequest Udt Request
 *
 */

public class InvsSimCardConfigRefUpdateRequest extends InvsSimCardConfigRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimCardConfigRefUpdateRequest
 * @param id Unique request name
 * @param InvsSimCardConfigRefUpdateIn InvsSimCardConfigRefObjectData for InvsSimCardConfigRefUpdateRequest
 *
 */
@JsonCreator
  public InvsSimCardConfigRefUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimCardConfigRef")InvsSimCardConfigRefObjectData InvsSimCardConfigRefUpdateIn) {
    super(id, "InvsSimCardConfigRefUpdate");
    if (InvsSimCardConfigRefUpdateIn != null) {
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectHelper.toMap(InvsSimCardConfigRefUpdateIn, new HashMap(), "InvsSimCardConfigRef").get("InvsSimCardConfigRef"));
    }
  }

/**
 *
 * Retrieves the InvsSimCardConfigRefObjectData that results from the InvsSimCardConfigRefUpdateRequest call
 * @return InvsSimCardConfigRefObjectData resulting from udt call
 *
 */

  public InvsSimCardConfigRefObjectData getOutput() {
    return InvsSimCardConfigRefObjectHelper.fromMap(outputMap, "InvsSimCardConfigRef");
  }
}
