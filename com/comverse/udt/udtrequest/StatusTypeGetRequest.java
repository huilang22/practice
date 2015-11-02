/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusTypeGetRequest.java
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
 * Class used to create a StatusTypeGetRequest Udt Request
 *
 */

public class StatusTypeGetRequest extends StatusTypeSubRequestParent {
/**
 *
 * Constructor to create a  StatusTypeGetRequest
 * @param id Unique request name
 * @param StatusTypeGetIn StatusTypeObjectKeyData for StatusTypeGetRequest
 *
 */
@JsonCreator
  public StatusTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("StatusType")StatusTypeObjectKeyData StatusTypeGetIn) {
    super(id, "StatusTypeGet");
    if (StatusTypeGetIn != null) {
      addInput("StatusType", StatusTypeObjectKeyHelper.toMap(StatusTypeGetIn, new HashMap(), "StatusTypeObjectKeyData").get("StatusTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the StatusTypeObjectData that results from the StatusTypeGetRequest call
 * @return StatusTypeObjectData resulting from udt call
 *
 */

  public StatusTypeObjectData getOutput() {
    return StatusTypeObjectHelper.fromMap(outputMap, "StatusType");
  }
}
