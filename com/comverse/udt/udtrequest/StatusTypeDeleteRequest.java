/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusTypeDeleteRequest.java
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
 * Class used to create a StatusTypeDeleteRequest Udt Request
 *
 */

public class StatusTypeDeleteRequest extends StatusTypeSubRequestParent {
/**
 *
 * Constructor to create a  StatusTypeDeleteRequest
 * @param id Unique request name
 * @param StatusTypeDeleteIn StatusTypeObjectKeyData for StatusTypeDeleteRequest
 *
 */
@JsonCreator
  public StatusTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatusType")StatusTypeObjectKeyData StatusTypeDeleteIn) {
    super(id, "StatusTypeDelete");
    if (StatusTypeDeleteIn != null) {
      addInput("StatusType", StatusTypeObjectKeyHelper.toMap(StatusTypeDeleteIn, new HashMap(), "StatusTypeObjectKeyData").get("StatusTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the StatusTypeObjectData that results from the StatusTypeDeleteRequest call
 * @return StatusTypeObjectData resulting from udt call
 *
 */

  public StatusTypeObjectData getOutput() {
    return StatusTypeObjectHelper.fromMap(outputMap, "StatusType");
  }
}
