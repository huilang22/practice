/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonCreateRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a StatusReasonCreateRequest Udt Request
 *
 */

public class StatusReasonCreateRequest extends StatusReasonSubRequestParent {
/**
 *
 * Constructor to create a  StatusReasonCreateRequest
 * @param id Unique request name
 * @param StatusReasonCreateIn StatusReasonObjectData for StatusReasonCreateRequest
 *
 */
@JsonCreator
  public StatusReasonCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatusReason")StatusReasonObjectData StatusReasonCreateIn) {
    super(id, "StatusReasonCreate");
    if (StatusReasonCreateIn != null) {
      addInput("StatusReason", StatusReasonObjectHelper.toMap(StatusReasonCreateIn, new HashMap(), "StatusReason").get("StatusReason"));
    }
  }

/**
 *
 * Retrieves the StatusReasonObjectData that results from the StatusReasonCreateRequest call
 * @return StatusReasonObjectData resulting from udt call
 *
 */

  public StatusReasonObjectData getOutput() {
    return StatusReasonObjectHelper.fromMap(outputMap, "StatusReason");
  }
}
