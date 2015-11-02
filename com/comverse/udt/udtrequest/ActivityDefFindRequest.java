/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ActivityDefFindRequest.java
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

import com.csgsystems.we.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ActivityDefFindRequest Udt Request
 *
 */

public class ActivityDefFindRequest extends ActivityDefRequest {
/**
 *
 * Constructor to create a  ActivityDefFindRequest
 * @param id Unique request name
 * @param ActivityDefFindIn ActivityDefObjectFilter for ActivityDefFindRequest
 *
 */
@JsonCreator
  public ActivityDefFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ActivityDef")ActivityDefObjectFilter ActivityDefFindIn) {
    super(id, "ActivityDefFind");
    if (ActivityDefFindIn != null) {
      Integer index =  ActivityDefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ActivityDef", ActivityDefObjectHelper.toMap(ActivityDefFindIn, new HashMap(), "ActivityDef").get("ActivityDef"));
    }
  }

/**
 *
 * Retrieves the ActivityDefObjectDataList that results from the ActivityDefFindRequest call
 * @return ActivityDefObjectDataList resulting from udt call
 *
 */

  public ActivityDefObjectDataList getOutput() {
    return ActivityDefObjectHelper.fromMapList(outputMap, "ActivityDefList");
  }
}
