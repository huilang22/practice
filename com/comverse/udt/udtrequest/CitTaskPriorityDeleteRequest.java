/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskPriorityDeleteRequest.java
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

import com.csgsystems.cit.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CitTaskPriorityDeleteRequest Udt Request
 *
 */

public class CitTaskPriorityDeleteRequest extends CitTaskPrioritySubRequestParent {
/**
 *
 * Constructor to create a  CitTaskPriorityDeleteRequest
 * @param id Unique request name
 * @param citTaskPriorityDeleteIn CitTaskPriorityObjectKeyData for CitTaskPriorityDeleteRequest
 *
 */
@JsonCreator
  public CitTaskPriorityDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTaskPriority")CitTaskPriorityObjectKeyData citTaskPriorityDeleteIn) {
    super(id, "CitTaskPriorityDelete");
    if (citTaskPriorityDeleteIn != null) {
      addInput("CitTaskPriority", CitTaskPriorityObjectKeyHelper.toMap(citTaskPriorityDeleteIn, new HashMap(), "CitTaskPriorityObjectKeyData").get("CitTaskPriorityObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CitTaskPriorityObjectData that results from the CitTaskPriorityDeleteRequest call
 * @return CitTaskPriorityObjectData resulting from udt call
 *
 */

  public CitTaskPriorityObjectData getOutput() {
    return CitTaskPriorityObjectHelper.fromMap(outputMap, "CitTaskPriority");
  }
}
