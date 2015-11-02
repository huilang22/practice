/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonUpdateRequest.java
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
 * Class used to create a StatusReasonUpdateRequest Udt Request
 *
 */

public class StatusReasonUpdateRequest extends StatusReasonSubRequestParent {
/**
 *
 * Constructor to create a  StatusReasonUpdateRequest
 * @param id Unique request name
 * @param StatusReasonUpdateIn StatusReasonObjectData for StatusReasonUpdateRequest
 *
 */
@JsonCreator
  public StatusReasonUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatusReason")StatusReasonObjectData StatusReasonUpdateIn) {
    super(id, "StatusReasonUpdate");
    if (StatusReasonUpdateIn != null) {
      addInput("StatusReason", StatusReasonObjectHelper.toMap(StatusReasonUpdateIn, new HashMap(), "StatusReason").get("StatusReason"));
    }
  }

/**
 *
 * Retrieves the StatusReasonObjectData that results from the StatusReasonUpdateRequest call
 * @return StatusReasonObjectData resulting from udt call
 *
 */

  public StatusReasonObjectData getOutput() {
    return StatusReasonObjectHelper.fromMap(outputMap, "StatusReason");
  }
}
