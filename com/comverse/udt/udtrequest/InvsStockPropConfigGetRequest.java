/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropConfigGetRequest.java
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
 * Class used to create a InvsStockPropConfigGetRequest Udt Request
 *
 */

public class InvsStockPropConfigGetRequest extends InvsStockPropConfigSubRequestParent {
/**
 *
 * Constructor to create a  InvsStockPropConfigGetRequest
 * @param id Unique request name
 * @param InvsStockPropConfigGetIn InvsStockPropConfigObjectKeyData for InvsStockPropConfigGetRequest
 *
 */
@JsonCreator
  public InvsStockPropConfigGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsStockPropConfig")InvsStockPropConfigObjectKeyData InvsStockPropConfigGetIn) {
    super(id, "InvsStockPropConfigGet");
    if (InvsStockPropConfigGetIn != null) {
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectKeyHelper.toMap(InvsStockPropConfigGetIn, new HashMap(), "InvsStockPropConfigObjectKeyData").get("InvsStockPropConfigObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsStockPropConfigObjectData that results from the InvsStockPropConfigGetRequest call
 * @return InvsStockPropConfigObjectData resulting from udt call
 *
 */

  public InvsStockPropConfigObjectData getOutput() {
    return InvsStockPropConfigObjectHelper.fromMap(outputMap, "InvsStockPropConfig");
  }
}
