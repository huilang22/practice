/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusTypeCreateRequest.java
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
 * Class used to create a StatusTypeCreateRequest Udt Request
 *
 */

public class StatusTypeCreateRequest extends StatusTypeSubRequestParent {
/**
 *
 * Constructor to create a  StatusTypeCreateRequest
 * @param id Unique request name
 * @param StatusTypeCreateIn StatusTypeObjectData for StatusTypeCreateRequest
 *
 */
@JsonCreator
  public StatusTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatusType")StatusTypeObjectData StatusTypeCreateIn) {
    super(id, "StatusTypeCreate");
    if (StatusTypeCreateIn != null) {
      addInput("StatusType", StatusTypeObjectHelper.toMap(StatusTypeCreateIn, new HashMap(), "StatusType").get("StatusType"));
    }
  }

/**
 *
 * Retrieves the StatusTypeObjectData that results from the StatusTypeCreateRequest call
 * @return StatusTypeObjectData resulting from udt call
 *
 */

  public StatusTypeObjectData getOutput() {
    return StatusTypeObjectHelper.fromMap(outputMap, "StatusType");
  }
}
