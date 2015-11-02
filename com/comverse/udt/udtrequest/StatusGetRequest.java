/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusGetRequest.java
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
 * Class used to create a StatusGetRequest Udt Request
 *
 */

public class StatusGetRequest extends StatusSubRequestParent {
/**
 *
 * Constructor to create a  StatusGetRequest
 * @param id Unique request name
 * @param StatusGetIn StatusObjectKeyData for StatusGetRequest
 *
 */
@JsonCreator
  public StatusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Status")StatusObjectKeyData StatusGetIn) {
    super(id, "StatusGet");
    if (StatusGetIn != null) {
      addInput("Status", StatusObjectKeyHelper.toMap(StatusGetIn, new HashMap(), "StatusObjectKeyData").get("StatusObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the StatusObjectData that results from the StatusGetRequest call
 * @return StatusObjectData resulting from udt call
 *
 */

  public StatusObjectData getOutput() {
    return StatusObjectHelper.fromMap(outputMap, "Status");
  }
}
