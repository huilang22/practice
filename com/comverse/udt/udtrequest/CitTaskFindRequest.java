/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskFindRequest.java
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
 * Class used to create a CitTaskFindRequest Udt Request
 *
 */

public class CitTaskFindRequest extends CitTaskRequest {
/**
 *
 * Constructor to create a  CitTaskFindRequest
 * @param id Unique request name
 * @param citTaskFindIn CitTaskObjectFilter for CitTaskFindRequest
 *
 */
@JsonCreator
  public CitTaskFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTask")CitTaskObjectFilter citTaskFindIn) {
    super(id, "CitTaskFind");
    if (citTaskFindIn != null) {
      Integer index =  citTaskFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitTask", CitTaskObjectHelper.toMap(citTaskFindIn, new HashMap(), "CitTask").get("CitTask"));
    }
  }

/**
 *
 * Retrieves the CitTaskObjectDataList that results from the CitTaskFindRequest call
 * @return CitTaskObjectDataList resulting from udt call
 *
 */

  public CitTaskObjectDataList getOutput() {
    return CitTaskObjectHelper.fromMapList(outputMap, "CitTaskList");
  }
}
