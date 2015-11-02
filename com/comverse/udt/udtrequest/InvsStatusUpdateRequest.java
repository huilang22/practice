/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStatusUpdateRequest.java
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
 * Class used to create a InvsStatusUpdateRequest Udt Request
 *
 */

public class InvsStatusUpdateRequest extends InvsStatusSubRequestParent {
/**
 *
 * Constructor to create a  InvsStatusUpdateRequest
 * @param id Unique request name
 * @param InvsStatusUpdateIn InvsStatusObjectData for InvsStatusUpdateRequest
 *
 */
@JsonCreator
  public InvsStatusUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsStatus")InvsStatusObjectData InvsStatusUpdateIn) {
    super(id, "InvsStatusUpdate");
    if (InvsStatusUpdateIn != null) {
      addInput("InvsStatus", InvsStatusObjectHelper.toMap(InvsStatusUpdateIn, new HashMap(), "InvsStatus").get("InvsStatus"));
    }
  }

/**
 *
 * Retrieves the InvsStatusObjectData that results from the InvsStatusUpdateRequest call
 * @return InvsStatusObjectData resulting from udt call
 *
 */

  public InvsStatusObjectData getOutput() {
    return InvsStatusObjectHelper.fromMap(outputMap, "InvsStatus");
  }
}
