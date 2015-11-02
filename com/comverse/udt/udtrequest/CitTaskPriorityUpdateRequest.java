/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskPriorityUpdateRequest.java
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
 * Class used to create a CitTaskPriorityUpdateRequest Udt Request
 *
 */

public class CitTaskPriorityUpdateRequest extends CitTaskPrioritySubRequestParent {
/**
 *
 * Constructor to create a  CitTaskPriorityUpdateRequest
 * @param id Unique request name
 * @param citTaskPriorityUpdateIn CitTaskPriorityObjectData for CitTaskPriorityUpdateRequest
 *
 */
@JsonCreator
  public CitTaskPriorityUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTaskPriority")CitTaskPriorityObjectData citTaskPriorityUpdateIn) {
    super(id, "CitTaskPriorityUpdate");
    if (citTaskPriorityUpdateIn != null) {
      addInput("CitTaskPriority", CitTaskPriorityObjectHelper.toMap(citTaskPriorityUpdateIn, new HashMap(), "CitTaskPriority").get("CitTaskPriority"));
    }
  }

/**
 *
 * Retrieves the CitTaskPriorityObjectData that results from the CitTaskPriorityUpdateRequest call
 * @return CitTaskPriorityObjectData resulting from udt call
 *
 */

  public CitTaskPriorityObjectData getOutput() {
    return CitTaskPriorityObjectHelper.fromMap(outputMap, "CitTaskPriority");
  }
}
