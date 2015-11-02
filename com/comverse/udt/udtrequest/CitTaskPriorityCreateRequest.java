/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskPriorityCreateRequest.java
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
 * Class used to create a CitTaskPriorityCreateRequest Udt Request
 *
 */

public class CitTaskPriorityCreateRequest extends CitTaskPrioritySubRequestParent {
/**
 *
 * Constructor to create a  CitTaskPriorityCreateRequest
 * @param id Unique request name
 * @param citTaskPriorityCreateIn CitTaskPriorityObjectData for CitTaskPriorityCreateRequest
 *
 */
@JsonCreator
  public CitTaskPriorityCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTaskPriority")CitTaskPriorityObjectData citTaskPriorityCreateIn) {
    super(id, "CitTaskPriorityCreate");
    if (citTaskPriorityCreateIn != null) {
      addInput("CitTaskPriority", CitTaskPriorityObjectHelper.toMap(citTaskPriorityCreateIn, new HashMap(), "CitTaskPriority").get("CitTaskPriority"));
    }
  }

/**
 *
 * Retrieves the CitTaskPriorityObjectData that results from the CitTaskPriorityCreateRequest call
 * @return CitTaskPriorityObjectData resulting from udt call
 *
 */

  public CitTaskPriorityObjectData getOutput() {
    return CitTaskPriorityObjectHelper.fromMap(outputMap, "CitTaskPriority");
  }
}
