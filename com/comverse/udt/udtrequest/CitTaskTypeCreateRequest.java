/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskTypeCreateRequest.java
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
 * Class used to create a CitTaskTypeCreateRequest Udt Request
 *
 */

public class CitTaskTypeCreateRequest extends CitTaskTypeSubRequestParent {
/**
 *
 * Constructor to create a  CitTaskTypeCreateRequest
 * @param id Unique request name
 * @param citTaskTypeCreateIn CitTaskTypeObjectData for CitTaskTypeCreateRequest
 *
 */
@JsonCreator
  public CitTaskTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTaskType")CitTaskTypeObjectData citTaskTypeCreateIn) {
    super(id, "CitTaskTypeCreate");
    if (citTaskTypeCreateIn != null) {
      addInput("CitTaskType", CitTaskTypeObjectHelper.toMap(citTaskTypeCreateIn, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }

/**
 *
 * Retrieves the CitTaskTypeObjectData that results from the CitTaskTypeCreateRequest call
 * @return CitTaskTypeObjectData resulting from udt call
 *
 */

  public CitTaskTypeObjectData getOutput() {
    return CitTaskTypeObjectHelper.fromMap(outputMap, "CitTaskType");
  }
}
