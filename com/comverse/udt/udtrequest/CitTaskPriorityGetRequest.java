/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskPriorityGetRequest.java
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
 * Class used to create a CitTaskPriorityGetRequest Udt Request
 *
 */

public class CitTaskPriorityGetRequest extends CitTaskPrioritySubRequestParent {
/**
 *
 * Constructor to create a  CitTaskPriorityGetRequest
 * @param id Unique request name
 * @param citTaskPriorityGetIn CitTaskPriorityObjectKeyData for CitTaskPriorityGetRequest
 *
 */
@JsonCreator
  public CitTaskPriorityGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTaskPriority")CitTaskPriorityObjectKeyData citTaskPriorityGetIn) {
    super(id, "CitTaskPriorityGet");
    if (citTaskPriorityGetIn != null) {
      addInput("CitTaskPriority", CitTaskPriorityObjectKeyHelper.toMap(citTaskPriorityGetIn, new HashMap(), "CitTaskPriorityObjectKeyData").get("CitTaskPriorityObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CitTaskPriorityObjectData that results from the CitTaskPriorityGetRequest call
 * @return CitTaskPriorityObjectData resulting from udt call
 *
 */

  public CitTaskPriorityObjectData getOutput() {
    return CitTaskPriorityObjectHelper.fromMap(outputMap, "CitTaskPriority");
  }
}
