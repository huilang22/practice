/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskTypeUpdateRequest.java
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
 * Class used to create a CitTaskTypeUpdateRequest Udt Request
 *
 */

public class CitTaskTypeUpdateRequest extends CitTaskTypeSubRequestParent {
/**
 *
 * Constructor to create a  CitTaskTypeUpdateRequest
 * @param id Unique request name
 * @param citTaskTypeUpdateIn CitTaskTypeObjectData for CitTaskTypeUpdateRequest
 *
 */
@JsonCreator
  public CitTaskTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTaskType")CitTaskTypeObjectData citTaskTypeUpdateIn) {
    super(id, "CitTaskTypeUpdate");
    if (citTaskTypeUpdateIn != null) {
      addInput("CitTaskType", CitTaskTypeObjectHelper.toMap(citTaskTypeUpdateIn, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }

/**
 *
 * Retrieves the CitTaskTypeObjectData that results from the CitTaskTypeUpdateRequest call
 * @return CitTaskTypeObjectData resulting from udt call
 *
 */

  public CitTaskTypeObjectData getOutput() {
    return CitTaskTypeObjectHelper.fromMap(outputMap, "CitTaskType");
  }
}
