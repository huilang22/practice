/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskPriorityFindRequest.java
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
 * Class used to create a CitTaskPriorityFindRequest Udt Request
 *
 */

public class CitTaskPriorityFindRequest extends CitTaskPriorityRequest {
/**
 *
 * Constructor to create a  CitTaskPriorityFindRequest
 * @param id Unique request name
 * @param citTaskPriorityFindIn CitTaskPriorityObjectFilter for CitTaskPriorityFindRequest
 *
 */
@JsonCreator
  public CitTaskPriorityFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTaskPriority")CitTaskPriorityObjectFilter citTaskPriorityFindIn) {
    super(id, "CitTaskPriorityFind");
    if (citTaskPriorityFindIn != null) {
      Integer index =  citTaskPriorityFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitTaskPriority", CitTaskPriorityObjectHelper.toMap(citTaskPriorityFindIn, new HashMap(), "CitTaskPriority").get("CitTaskPriority"));
    }
  }

/**
 *
 * Retrieves the CitTaskPriorityObjectDataList that results from the CitTaskPriorityFindRequest call
 * @return CitTaskPriorityObjectDataList resulting from udt call
 *
 */

  public CitTaskPriorityObjectDataList getOutput() {
    return CitTaskPriorityObjectHelper.fromMapList(outputMap, "CitTaskPriorityList");
  }
}
