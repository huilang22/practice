/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropConfigUpdateRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsStockPropConfigUpdateRequest Udt Request
 *
 */

public class InvsStockPropConfigUpdateRequest extends InvsStockPropConfigSubRequestParent {
/**
 *
 * Constructor to create a  InvsStockPropConfigUpdateRequest
 * @param id Unique request name
 * @param InvsStockPropConfigUpdateIn InvsStockPropConfigObjectData for InvsStockPropConfigUpdateRequest
 *
 */
@JsonCreator
  public InvsStockPropConfigUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsStockPropConfig")InvsStockPropConfigObjectData InvsStockPropConfigUpdateIn) {
    super(id, "InvsStockPropConfigUpdate");
    if (InvsStockPropConfigUpdateIn != null) {
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectHelper.toMap(InvsStockPropConfigUpdateIn, new HashMap(), "InvsStockPropConfig").get("InvsStockPropConfig"));
    }
  }

/**
 *
 * Retrieves the InvsStockPropConfigObjectData that results from the InvsStockPropConfigUpdateRequest call
 * @return InvsStockPropConfigObjectData resulting from udt call
 *
 */

  public InvsStockPropConfigObjectData getOutput() {
    return InvsStockPropConfigObjectHelper.fromMap(outputMap, "InvsStockPropConfig");
  }
}
