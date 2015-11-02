/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropConfigCreateRequest.java
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
 * Class used to create a InvsStockPropConfigCreateRequest Udt Request
 *
 */

public class InvsStockPropConfigCreateRequest extends InvsStockPropConfigSubRequestParent {
/**
 *
 * Constructor to create a  InvsStockPropConfigCreateRequest
 * @param id Unique request name
 * @param InvsStockPropConfigCreateIn InvsStockPropConfigObjectData for InvsStockPropConfigCreateRequest
 *
 */
@JsonCreator
  public InvsStockPropConfigCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsStockPropConfig")InvsStockPropConfigObjectData InvsStockPropConfigCreateIn) {
    super(id, "InvsStockPropConfigCreate");
    if (InvsStockPropConfigCreateIn != null) {
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectHelper.toMap(InvsStockPropConfigCreateIn, new HashMap(), "InvsStockPropConfig").get("InvsStockPropConfig"));
    }
  }

/**
 *
 * Retrieves the InvsStockPropConfigObjectData that results from the InvsStockPropConfigCreateRequest call
 * @return InvsStockPropConfigObjectData resulting from udt call
 *
 */

  public InvsStockPropConfigObjectData getOutput() {
    return InvsStockPropConfigObjectHelper.fromMap(outputMap, "InvsStockPropConfig");
  }
}
