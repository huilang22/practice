/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentGetRequest.java
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
 * Class used to create a AdjustmentGetRequest Udt Request
 *
 */

public class AdjustmentGetRequest extends AdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentGetRequest
 * @param id Unique request name
 * @param getIn AdjustmentObjectKeyData for AdjustmentGetRequest
 *
 */
@JsonCreator
  public AdjustmentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Adjustment")AdjustmentObjectKeyData getIn) {
    super(id, "AdjustmentGet");
    if (getIn != null) {
      addInput("Adjustment", AdjustmentObjectKeyHelper.toMap(getIn, new HashMap(), "AdjustmentObjectKeyData").get("AdjustmentObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AdjustmentObjectData that results from the AdjustmentGetRequest call
 * @return AdjustmentObjectData resulting from udt call
 *
 */

  public AdjustmentObjectData getOutput() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
}
