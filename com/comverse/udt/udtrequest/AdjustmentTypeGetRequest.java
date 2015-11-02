/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeGetRequest.java
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
 * Class used to create a AdjustmentTypeGetRequest Udt Request
 *
 */

public class AdjustmentTypeGetRequest extends AdjustmentTypeSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentTypeGetRequest
 * @param id Unique request name
 * @param atdGetIn AdjustmentTypeObjectKeyData for AdjustmentTypeGetRequest
 *
 */
@JsonCreator
  public AdjustmentTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjustmentType")AdjustmentTypeObjectKeyData atdGetIn) {
    super(id, "AdjustmentTypeGet");
    if (atdGetIn != null) {
      addInput("AdjustmentType", AdjustmentTypeObjectKeyHelper.toMap(atdGetIn, new HashMap(), "AdjustmentTypeObjectKeyData").get("AdjustmentTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AdjustmentTypeObjectData that results from the AdjustmentTypeGetRequest call
 * @return AdjustmentTypeObjectData resulting from udt call
 *
 */

  public AdjustmentTypeObjectData getOutput() {
    return AdjustmentTypeObjectHelper.fromMap(outputMap, "AdjustmentType");
  }
}
