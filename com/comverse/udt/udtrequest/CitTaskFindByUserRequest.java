/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskFindByUserRequest.java
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
 * Class used to create a CitTaskFindByUserRequest Udt Request
 *
 */

public class CitTaskFindByUserRequest extends CitTaskRequest {
/**
 *
 * Constructor to create a  CitTaskFindByUserRequest
 * @param id Unique request name
 * @param citTaskFindByUserIn CitTaskObjectFilter for CitTaskFindByUserRequest
 * @param loginId String for CitTaskFindByUserRequest
 *
 */
@JsonCreator
  public CitTaskFindByUserRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTask")CitTaskObjectFilter citTaskFindByUserIn, @JsonProperty("LoginId")String loginId) {
    super(id, "CitTaskFindByUser");
    if (citTaskFindByUserIn != null) {
      Integer index =  citTaskFindByUserIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitTask", CitTaskObjectHelper.toMap(citTaskFindByUserIn, new HashMap(), "CitTask").get("CitTask"));
    }
    if (loginId != null) {
      addInput("LoginId", loginId);
    }
  }

/**
 *
 * Retrieves the CitTaskObjectDataList that results from the CitTaskFindByUserRequest call
 * @return CitTaskObjectDataList resulting from udt call
 *
 */

  public CitTaskObjectDataList getOutput() {
    return CitTaskObjectHelper.fromMapList(outputMap, "CitTaskList");
  }
}
