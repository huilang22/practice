/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStatusCreateRequest.java
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
 * Class used to create a InvsStatusCreateRequest Udt Request
 *
 */

public class InvsStatusCreateRequest extends InvsStatusSubRequestParent {
/**
 *
 * Constructor to create a  InvsStatusCreateRequest
 * @param id Unique request name
 * @param InvsStatusCreateIn InvsStatusObjectData for InvsStatusCreateRequest
 *
 */
@JsonCreator
  public InvsStatusCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsStatus")InvsStatusObjectData InvsStatusCreateIn) {
    super(id, "InvsStatusCreate");
    if (InvsStatusCreateIn != null) {
      addInput("InvsStatus", InvsStatusObjectHelper.toMap(InvsStatusCreateIn, new HashMap(), "InvsStatus").get("InvsStatus"));
    }
  }

/**
 *
 * Retrieves the InvsStatusObjectData that results from the InvsStatusCreateRequest call
 * @return InvsStatusObjectData resulting from udt call
 *
 */

  public InvsStatusObjectData getOutput() {
    return InvsStatusObjectHelper.fromMap(outputMap, "InvsStatus");
  }
}
