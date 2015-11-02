/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RevRcvCostCenterUpdateRequest.java
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
 * Class used to create a RevRcvCostCenterUpdateRequest Udt Request
 *
 */

public class RevRcvCostCenterUpdateRequest extends RevRcvCostCenterSubRequestParent {
/**
 *
 * Constructor to create a  RevRcvCostCenterUpdateRequest
 * @param id Unique request name
 * @param RRCCUpdateIn RevRcvCostCenterObjectData for RevRcvCostCenterUpdateRequest
 *
 */
@JsonCreator
  public RevRcvCostCenterUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RevRcvCostCenter")RevRcvCostCenterObjectData RRCCUpdateIn) {
    super(id, "RevRcvCostCenterUpdate");
    if (RRCCUpdateIn != null) {
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectHelper.toMap(RRCCUpdateIn, new HashMap(), "RevRcvCostCenter").get("RevRcvCostCenter"));
    }
  }

/**
 *
 * Retrieves the RevRcvCostCenterObjectData that results from the RevRcvCostCenterUpdateRequest call
 * @return RevRcvCostCenterObjectData resulting from udt call
 *
 */

  public RevRcvCostCenterObjectData getOutput() {
    return RevRcvCostCenterObjectHelper.fromMap(outputMap, "RevRcvCostCenter");
  }
}
