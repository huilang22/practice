/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonDeleteRequest.java
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
 * Class used to create a StatusReasonDeleteRequest Udt Request
 *
 */

public class StatusReasonDeleteRequest extends StatusReasonSubRequestParent {
/**
 *
 * Constructor to create a  StatusReasonDeleteRequest
 * @param id Unique request name
 * @param StatusReasonDeleteIn StatusReasonObjectKeyData for StatusReasonDeleteRequest
 *
 */
@JsonCreator
  public StatusReasonDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatusReason")StatusReasonObjectKeyData StatusReasonDeleteIn) {
    super(id, "StatusReasonDelete");
    if (StatusReasonDeleteIn != null) {
      addInput("StatusReason", StatusReasonObjectKeyHelper.toMap(StatusReasonDeleteIn, new HashMap(), "StatusReasonObjectKeyData").get("StatusReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the StatusReasonObjectData that results from the StatusReasonDeleteRequest call
 * @return StatusReasonObjectData resulting from udt call
 *
 */

  public StatusReasonObjectData getOutput() {
    return StatusReasonObjectHelper.fromMap(outputMap, "StatusReason");
  }
}
