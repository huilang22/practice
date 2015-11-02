/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RevRcvCostCenterFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a RevRcvCostCenterFindRequest Udt Request
 *
 */

public class RevRcvCostCenterFindRequest extends RevRcvCostCenterRequest {
/**
 *
 * Constructor to create a  RevRcvCostCenterFindRequest
 * @param id Unique request name
 * @param RRCCFindIn RevRcvCostCenterObjectFilter for RevRcvCostCenterFindRequest
 *
 */
@JsonCreator
  public RevRcvCostCenterFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RevRcvCostCenter")RevRcvCostCenterObjectFilter RRCCFindIn) {
    super(id, "RevRcvCostCenterFind");
    if (RRCCFindIn != null) {
      Integer index =  RRCCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectHelper.toMap(RRCCFindIn, new HashMap(), "RevRcvCostCenter").get("RevRcvCostCenter"));
    }
  }

/**
 *
 * Retrieves the RevRcvCostCenterObjectDataList that results from the RevRcvCostCenterFindRequest call
 * @return RevRcvCostCenterObjectDataList resulting from udt call
 *
 */

  public RevRcvCostCenterObjectDataList getOutput() {
    return RevRcvCostCenterObjectHelper.fromMapList(outputMap, "RevRcvCostCenterList");
  }
}
