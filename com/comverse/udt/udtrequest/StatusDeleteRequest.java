/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusDeleteRequest.java
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
 * Class used to create a StatusDeleteRequest Udt Request
 *
 */

public class StatusDeleteRequest extends StatusSubRequestParent {
/**
 *
 * Constructor to create a  StatusDeleteRequest
 * @param id Unique request name
 * @param StatusDeleteIn StatusObjectKeyData for StatusDeleteRequest
 *
 */
@JsonCreator
  public StatusDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("Status")StatusObjectKeyData StatusDeleteIn) {
    super(id, "StatusDelete");
    if (StatusDeleteIn != null) {
      addInput("Status", StatusObjectKeyHelper.toMap(StatusDeleteIn, new HashMap(), "StatusObjectKeyData").get("StatusObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the StatusObjectData that results from the StatusDeleteRequest call
 * @return StatusObjectData resulting from udt call
 *
 */

  public StatusObjectData getOutput() {
    return StatusObjectHelper.fromMap(outputMap, "Status");
  }
}
