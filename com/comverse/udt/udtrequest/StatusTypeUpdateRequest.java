/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusTypeUpdateRequest.java
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
 * Class used to create a StatusTypeUpdateRequest Udt Request
 *
 */

public class StatusTypeUpdateRequest extends StatusTypeSubRequestParent {
/**
 *
 * Constructor to create a  StatusTypeUpdateRequest
 * @param id Unique request name
 * @param StatusTypeUpdateIn StatusTypeObjectData for StatusTypeUpdateRequest
 *
 */
@JsonCreator
  public StatusTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatusType")StatusTypeObjectData StatusTypeUpdateIn) {
    super(id, "StatusTypeUpdate");
    if (StatusTypeUpdateIn != null) {
      addInput("StatusType", StatusTypeObjectHelper.toMap(StatusTypeUpdateIn, new HashMap(), "StatusType").get("StatusType"));
    }
  }

/**
 *
 * Retrieves the StatusTypeObjectData that results from the StatusTypeUpdateRequest call
 * @return StatusTypeObjectData resulting from udt call
 *
 */

  public StatusTypeObjectData getOutput() {
    return StatusTypeObjectHelper.fromMap(outputMap, "StatusType");
  }
}
