/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonGetRequest.java
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
 * Class used to create a StatusReasonGetRequest Udt Request
 *
 */

public class StatusReasonGetRequest extends StatusReasonSubRequestParent {
/**
 *
 * Constructor to create a  StatusReasonGetRequest
 * @param id Unique request name
 * @param StatusReasonGetIn StatusReasonObjectKeyData for StatusReasonGetRequest
 *
 */
@JsonCreator
  public StatusReasonGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatusReason")StatusReasonObjectKeyData StatusReasonGetIn) {
    super(id, "StatusReasonGet");
    if (StatusReasonGetIn != null) {
      addInput("StatusReason", StatusReasonObjectKeyHelper.toMap(StatusReasonGetIn, new HashMap(), "StatusReasonObjectKeyData").get("StatusReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the StatusReasonObjectData that results from the StatusReasonGetRequest call
 * @return StatusReasonObjectData resulting from udt call
 *
 */

  public StatusReasonObjectData getOutput() {
    return StatusReasonObjectHelper.fromMap(outputMap, "StatusReason");
  }
}
