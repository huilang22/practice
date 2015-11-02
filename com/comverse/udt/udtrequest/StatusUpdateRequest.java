/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusUpdateRequest.java
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
 * Class used to create a StatusUpdateRequest Udt Request
 *
 */

public class StatusUpdateRequest extends StatusSubRequestParent {
/**
 *
 * Constructor to create a  StatusUpdateRequest
 * @param id Unique request name
 * @param StatusUpdateIn StatusObjectData for StatusUpdateRequest
 *
 */
@JsonCreator
  public StatusUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Status")StatusObjectData StatusUpdateIn) {
    super(id, "StatusUpdate");
    if (StatusUpdateIn != null) {
      addInput("Status", StatusObjectHelper.toMap(StatusUpdateIn, new HashMap(), "Status").get("Status"));
    }
  }

/**
 *
 * Retrieves the StatusObjectData that results from the StatusUpdateRequest call
 * @return StatusObjectData resulting from udt call
 *
 */

  public StatusObjectData getOutput() {
    return StatusObjectHelper.fromMap(outputMap, "Status");
  }
}
