/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeGroupsFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AdjustmentTypeGroupsFindRequest Udt Request
 *
 */

public class AdjustmentTypeGroupsFindRequest extends AdjustmentTypeGroupsRequest {
/**
 *
 * Constructor to create a  AdjustmentTypeGroupsFindRequest
 * @param id Unique request name
 * @param AdjustmentTypeGroupsFindIn AdjustmentTypeGroupsObjectFilter for AdjustmentTypeGroupsFindRequest
 *
 */
@JsonCreator
  public AdjustmentTypeGroupsFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjustmentTypeGroups")AdjustmentTypeGroupsObjectFilter AdjustmentTypeGroupsFindIn) {
    super(id, "AdjustmentTypeGroupsFind");
    if (AdjustmentTypeGroupsFindIn != null) {
      Integer index =  AdjustmentTypeGroupsFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectHelper.toMap(AdjustmentTypeGroupsFindIn, new HashMap(), "AdjustmentTypeGroups").get("AdjustmentTypeGroups"));
    }
  }

/**
 *
 * Retrieves the AdjustmentTypeGroupsObjectDataList that results from the AdjustmentTypeGroupsFindRequest call
 * @return AdjustmentTypeGroupsObjectDataList resulting from udt call
 *
 */

  public AdjustmentTypeGroupsObjectDataList getOutput() {
    return AdjustmentTypeGroupsObjectHelper.fromMapList(outputMap, "AdjustmentTypeGroupsList");
  }
}
