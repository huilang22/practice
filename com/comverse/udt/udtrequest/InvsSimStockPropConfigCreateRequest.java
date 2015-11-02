/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimStockPropConfigCreateRequest.java
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
 * Class used to create a InvsSimStockPropConfigCreateRequest Udt Request
 *
 */

public class InvsSimStockPropConfigCreateRequest extends InvsSimStockPropConfigSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimStockPropConfigCreateRequest
 * @param id Unique request name
 * @param InvsSimStockPropConfigCreateIn InvsSimStockPropConfigObjectData for InvsSimStockPropConfigCreateRequest
 *
 */
@JsonCreator
  public InvsSimStockPropConfigCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimStockPropConfig")InvsSimStockPropConfigObjectData InvsSimStockPropConfigCreateIn) {
    super(id, "InvsSimStockPropConfigCreate");
    if (InvsSimStockPropConfigCreateIn != null) {
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectHelper.toMap(InvsSimStockPropConfigCreateIn, new HashMap(), "InvsSimStockPropConfig").get("InvsSimStockPropConfig"));
    }
  }

/**
 *
 * Retrieves the InvsSimStockPropConfigObjectData that results from the InvsSimStockPropConfigCreateRequest call
 * @return InvsSimStockPropConfigObjectData resulting from udt call
 *
 */

  public InvsSimStockPropConfigObjectData getOutput() {
    return InvsSimStockPropConfigObjectHelper.fromMap(outputMap, "InvsSimStockPropConfig");
  }
}
