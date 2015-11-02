/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskFindForInvalidUserRequest.java
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
 * Class used to create a CitTaskFindForInvalidUserRequest Udt Request
 *
 */

public class CitTaskFindForInvalidUserRequest extends CitTaskRequest {
/**
 *
 * Constructor to create a  CitTaskFindForInvalidUserRequest
 * @param id Unique request name
 * @param citTaskFindForInvalidUserIn CitTaskObjectFilter for CitTaskFindForInvalidUserRequest
 *
 */
@JsonCreator
  public CitTaskFindForInvalidUserRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTask")CitTaskObjectFilter citTaskFindForInvalidUserIn) {
    super(id, "CitTaskFindForInvalidUser");
    if (citTaskFindForInvalidUserIn != null) {
      Integer index =  citTaskFindForInvalidUserIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitTask", CitTaskObjectHelper.toMap(citTaskFindForInvalidUserIn, new HashMap(), "CitTask").get("CitTask"));
    }
  }

/**
 *
 * Retrieves the CitTaskObjectDataList that results from the CitTaskFindForInvalidUserRequest call
 * @return CitTaskObjectDataList resulting from udt call
 *
 */

  public CitTaskObjectDataList getOutput() {
    return CitTaskObjectHelper.fromMapList(outputMap, "CitTaskList");
  }
}
