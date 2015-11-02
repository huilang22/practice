/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RevRcvCostCenterCreateRequest.java
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
 * Class used to create a RevRcvCostCenterCreateRequest Udt Request
 *
 */

public class RevRcvCostCenterCreateRequest extends RevRcvCostCenterSubRequestParent {
/**
 *
 * Constructor to create a  RevRcvCostCenterCreateRequest
 * @param id Unique request name
 * @param RRCCCreateIn RevRcvCostCenterObjectData for RevRcvCostCenterCreateRequest
 *
 */
@JsonCreator
  public RevRcvCostCenterCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RevRcvCostCenter")RevRcvCostCenterObjectData RRCCCreateIn) {
    super(id, "RevRcvCostCenterCreate");
    if (RRCCCreateIn != null) {
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectHelper.toMap(RRCCCreateIn, new HashMap(), "RevRcvCostCenter").get("RevRcvCostCenter"));
    }
  }

/**
 *
 * Retrieves the RevRcvCostCenterObjectData that results from the RevRcvCostCenterCreateRequest call
 * @return RevRcvCostCenterObjectData resulting from udt call
 *
 */

  public RevRcvCostCenterObjectData getOutput() {
    return RevRcvCostCenterObjectHelper.fromMap(outputMap, "RevRcvCostCenter");
  }
}
