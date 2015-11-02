/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineRefCreateRequest.java
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
 * Class used to create a InvsLineRefCreateRequest Udt Request
 *
 */

public class InvsLineRefCreateRequest extends InvsLineRefSubRequestParent {
/**
 *
 * Constructor to create a  InvsLineRefCreateRequest
 * @param id Unique request name
 * @param InvsLineRefCreateIn InvsLineRefObjectData for InvsLineRefCreateRequest
 *
 */
@JsonCreator
  public InvsLineRefCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLineRef")InvsLineRefObjectData InvsLineRefCreateIn) {
    super(id, "InvsLineRefCreate");
    if (InvsLineRefCreateIn != null) {
      addInput("InvsLineRef", InvsLineRefObjectHelper.toMap(InvsLineRefCreateIn, new HashMap(), "InvsLineRef").get("InvsLineRef"));
    }
  }

/**
 *
 * Retrieves the InvsLineRefObjectData that results from the InvsLineRefCreateRequest call
 * @return InvsLineRefObjectData resulting from udt call
 *
 */

  public InvsLineRefObjectData getOutput() {
    return InvsLineRefObjectHelper.fromMap(outputMap, "InvsLineRef");
  }
}
