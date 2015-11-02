/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropertyGetRequest.java
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
 * Class used to create a InvsStockPropertyGetRequest Udt Request
 *
 */

public class InvsStockPropertyGetRequest extends InvsStockPropertySubRequestParent {
/**
 *
 * Constructor to create a  InvsStockPropertyGetRequest
 * @param id Unique request name
 * @param InvsStockPropertyGetIn InvsStockPropertyObjectKeyData for InvsStockPropertyGetRequest
 *
 */
@JsonCreator
  public InvsStockPropertyGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsStockProperty")InvsStockPropertyObjectKeyData InvsStockPropertyGetIn) {
    super(id, "InvsStockPropertyGet");
    if (InvsStockPropertyGetIn != null) {
      addInput("InvsStockProperty", InvsStockPropertyObjectKeyHelper.toMap(InvsStockPropertyGetIn, new HashMap(), "InvsStockPropertyObjectKeyData").get("InvsStockPropertyObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsStockPropertyObjectData that results from the InvsStockPropertyGetRequest call
 * @return InvsStockPropertyObjectData resulting from udt call
 *
 */

  public InvsStockPropertyObjectData getOutput() {
    return InvsStockPropertyObjectHelper.fromMap(outputMap, "InvsStockProperty");
  }
}
