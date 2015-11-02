/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineRefUpdateRequest.java
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
 * Class used to create a InvsLineRefUpdateRequest Udt Request
 *
 */

public class InvsLineRefUpdateRequest extends InvsLineRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsLineRefUpdateRequest
 * @param id Unique request name
 * @param InvsLineRefUpdateIn InvsLineRefObjectData for InvsLineRefUpdateRequest
 *
 */
@JsonCreator
  public InvsLineRefUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLineRef")InvsLineRefObjectData InvsLineRefUpdateIn) {
    super(id, "InvsLineRefUpdate");
    if (InvsLineRefUpdateIn != null) {
      addInput("InvsLineRef", InvsLineRefObjectHelper.toMap(InvsLineRefUpdateIn, new HashMap(), "InvsLineRef").get("InvsLineRef"));
    }
  }

/**
 *
 * Retrieves the InvsLineRefObjectData that results from the InvsLineRefUpdateRequest call
 * @return InvsLineRefObjectData resulting from udt call
 *
 */

  public InvsLineRefObjectData getOutput() {
    return InvsLineRefObjectHelper.fromMap(outputMap, "InvsLineRef");
  }
}
