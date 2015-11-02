/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigRefCreateRequest.java
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
 * Class used to create a InvsSimCardConfigRefCreateRequest Udt Request
 *
 */

public class InvsSimCardConfigRefCreateRequest extends InvsSimCardConfigRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimCardConfigRefCreateRequest
 * @param id Unique request name
 * @param InvsSimCardConfigRefCreateIn InvsSimCardConfigRefObjectData for InvsSimCardConfigRefCreateRequest
 *
 */
@JsonCreator
  public InvsSimCardConfigRefCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimCardConfigRef")InvsSimCardConfigRefObjectData InvsSimCardConfigRefCreateIn) {
    super(id, "InvsSimCardConfigRefCreate");
    if (InvsSimCardConfigRefCreateIn != null) {
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectHelper.toMap(InvsSimCardConfigRefCreateIn, new HashMap(), "InvsSimCardConfigRef").get("InvsSimCardConfigRef"));
    }
  }

/**
 *
 * Retrieves the InvsSimCardConfigRefObjectData that results from the InvsSimCardConfigRefCreateRequest call
 * @return InvsSimCardConfigRefObjectData resulting from udt call
 *
 */

  public InvsSimCardConfigRefObjectData getOutput() {
    return InvsSimCardConfigRefObjectHelper.fromMap(outputMap, "InvsSimCardConfigRef");
  }
}
