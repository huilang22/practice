/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimStockPropConfigGetRequest.java
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
 * Class used to create a InvsSimStockPropConfigGetRequest Udt Request
 *
 */

public class InvsSimStockPropConfigGetRequest extends InvsSimStockPropConfigSubRequestParent {
/**
 *
 * Constructor to create a  InvsSimStockPropConfigGetRequest
 * @param id Unique request name
 * @param InvsSimStockPropConfigGetIn InvsSimStockPropConfigObjectKeyData for InvsSimStockPropConfigGetRequest
 *
 */
@JsonCreator
  public InvsSimStockPropConfigGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimStockPropConfig")InvsSimStockPropConfigObjectKeyData InvsSimStockPropConfigGetIn) {
    super(id, "InvsSimStockPropConfigGet");
    if (InvsSimStockPropConfigGetIn != null) {
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectKeyHelper.toMap(InvsSimStockPropConfigGetIn, new HashMap(), "InvsSimStockPropConfigObjectKeyData").get("InvsSimStockPropConfigObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsSimStockPropConfigObjectData that results from the InvsSimStockPropConfigGetRequest call
 * @return InvsSimStockPropConfigObjectData resulting from udt call
 *
 */

  public InvsSimStockPropConfigObjectData getOutput() {
    return InvsSimStockPropConfigObjectHelper.fromMap(outputMap, "InvsSimStockPropConfig");
  }
}
