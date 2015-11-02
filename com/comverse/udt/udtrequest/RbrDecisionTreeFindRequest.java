/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrDecisionTreeFindRequest.java
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
 * Class used to create a RbrDecisionTreeFindRequest Udt Request
 *
 */

public class RbrDecisionTreeFindRequest extends RbrDecisionTreeRequest {
/**
 *
 * Constructor to create a  RbrDecisionTreeFindRequest
 * @param id Unique request name
 * @param RbrDecTreeFindIn RbrDecTreeObjectFilter for RbrDecisionTreeFindRequest
 *
 */
@JsonCreator
  public RbrDecisionTreeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrDecisionTree")RbrDecTreeObjectFilter RbrDecTreeFindIn) {
    super(id, "RbrDecisionTreeFind");
    if (RbrDecTreeFindIn != null) {
      Integer index =  RbrDecTreeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrDecisionTree", RbrDecTreeObjectHelper.toMap(RbrDecTreeFindIn, new HashMap(), "RbrDecisionTree").get("RbrDecisionTree"));
    }
  }

/**
 *
 * Retrieves the RbrDecTreeObjectDataList that results from the RbrDecisionTreeFindRequest call
 * @return RbrDecTreeObjectDataList resulting from udt call
 *
 */

  public RbrDecTreeObjectDataList getOutput() {
    return RbrDecTreeObjectHelper.fromMapList(outputMap, "RbrDecisionTreeList");
  }
}
