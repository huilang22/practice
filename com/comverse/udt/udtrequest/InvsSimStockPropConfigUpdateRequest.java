/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimStockPropConfigUpdateRequest.java
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
 * Class used to create a InvsSimStockPropConfigUpdateRequest Udt Request
 *
 */

public class InvsSimStockPropConfigUpdateRequest extends InvsSimStockPropConfigSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimStockPropConfigUpdateRequest
 * @param id Unique request name
 * @param InvsSimStockPropConfigUpdateIn InvsSimStockPropConfigObjectData for InvsSimStockPropConfigUpdateRequest
 *
 */
@JsonCreator
  public InvsSimStockPropConfigUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimStockPropConfig")InvsSimStockPropConfigObjectData InvsSimStockPropConfigUpdateIn) {
    super(id, "InvsSimStockPropConfigUpdate");
    if (InvsSimStockPropConfigUpdateIn != null) {
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectHelper.toMap(InvsSimStockPropConfigUpdateIn, new HashMap(), "InvsSimStockPropConfig").get("InvsSimStockPropConfig"));
    }
  }

/**
 *
 * Retrieves the InvsSimStockPropConfigObjectData that results from the InvsSimStockPropConfigUpdateRequest call
 * @return InvsSimStockPropConfigObjectData resulting from udt call
 *
 */

  public InvsSimStockPropConfigObjectData getOutput() {
    return InvsSimStockPropConfigObjectHelper.fromMap(outputMap, "InvsSimStockPropConfig");
  }
}
