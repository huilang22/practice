/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusCreateRequest.java
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
 * Class used to create a StatusCreateRequest Udt Request
 *
 */

public class StatusCreateRequest extends StatusSubRequestParent {
/**
 *
 * Constructor to create a  StatusCreateRequest
 * @param id Unique request name
 * @param StatusCreateIn StatusObjectData for StatusCreateRequest
 *
 */
@JsonCreator
  public StatusCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Status")StatusObjectData StatusCreateIn) {
    super(id, "StatusCreate");
    if (StatusCreateIn != null) {
      addInput("Status", StatusObjectHelper.toMap(StatusCreateIn, new HashMap(), "Status").get("Status"));
    }
  }

/**
 *
 * Retrieves the StatusObjectData that results from the StatusCreateRequest call
 * @return StatusObjectData resulting from udt call
 *
 */

  public StatusObjectData getOutput() {
    return StatusObjectHelper.fromMap(outputMap, "Status");
  }
}
