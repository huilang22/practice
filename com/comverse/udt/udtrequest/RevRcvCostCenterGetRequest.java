/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RevRcvCostCenterGetRequest.java
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
 * Class used to create a RevRcvCostCenterGetRequest Udt Request
 *
 */

public class RevRcvCostCenterGetRequest extends RevRcvCostCenterSubRequestParent {
/**
 *
 * Constructor to create a  RevRcvCostCenterGetRequest
 * @param id Unique request name
 * @param RRCCGetIn RevRcvCostCenterObjectKeyData for RevRcvCostCenterGetRequest
 *
 */
@JsonCreator
  public RevRcvCostCenterGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RevRcvCostCenter")RevRcvCostCenterObjectKeyData RRCCGetIn) {
    super(id, "RevRcvCostCenterGet");
    if (RRCCGetIn != null) {
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectKeyHelper.toMap(RRCCGetIn, new HashMap(), "RevRcvCostCenterObjectKeyData").get("RevRcvCostCenterObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RevRcvCostCenterObjectData that results from the RevRcvCostCenterGetRequest call
 * @return RevRcvCostCenterObjectData resulting from udt call
 *
 */

  public RevRcvCostCenterObjectData getOutput() {
    return RevRcvCostCenterObjectHelper.fromMap(outputMap, "RevRcvCostCenter");
  }
}
