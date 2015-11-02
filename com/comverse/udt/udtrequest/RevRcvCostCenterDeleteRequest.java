/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RevRcvCostCenterDeleteRequest.java
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
 * Class used to create a RevRcvCostCenterDeleteRequest Udt Request
 *
 */

public class RevRcvCostCenterDeleteRequest extends RevRcvCostCenterSubRequestParent {
/**
 *
 * Constructor to create a  RevRcvCostCenterDeleteRequest
 * @param id Unique request name
 * @param RRCCDeleteIn RevRcvCostCenterObjectKeyData for RevRcvCostCenterDeleteRequest
 *
 */
@JsonCreator
  public RevRcvCostCenterDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RevRcvCostCenter")RevRcvCostCenterObjectKeyData RRCCDeleteIn) {
    super(id, "RevRcvCostCenterDelete");
    if (RRCCDeleteIn != null) {
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectKeyHelper.toMap(RRCCDeleteIn, new HashMap(), "RevRcvCostCenterObjectKeyData").get("RevRcvCostCenterObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RevRcvCostCenterObjectData that results from the RevRcvCostCenterDeleteRequest call
 * @return RevRcvCostCenterObjectData resulting from udt call
 *
 */

  public RevRcvCostCenterObjectData getOutput() {
    return RevRcvCostCenterObjectHelper.fromMap(outputMap, "RevRcvCostCenter");
  }
}
