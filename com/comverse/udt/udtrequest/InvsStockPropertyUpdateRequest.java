/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropertyUpdateRequest.java
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
 * Class used to create a InvsStockPropertyUpdateRequest Udt Request
 *
 */

public class InvsStockPropertyUpdateRequest extends InvsStockPropertySubRequestParent {
/**
 *
 * Constructor to create a  InvsStockPropertyUpdateRequest
 * @param id Unique request name
 * @param InvsStockPropertyUpdateIn InvsStockPropertyObjectData for InvsStockPropertyUpdateRequest
 *
 */
@JsonCreator
  public InvsStockPropertyUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsStockProperty")InvsStockPropertyObjectData InvsStockPropertyUpdateIn) {
    super(id, "InvsStockPropertyUpdate");
    if (InvsStockPropertyUpdateIn != null) {
      addInput("InvsStockProperty", InvsStockPropertyObjectHelper.toMap(InvsStockPropertyUpdateIn, new HashMap(), "InvsStockProperty").get("InvsStockProperty"));
    }
  }

/**
 *
 * Retrieves the InvsStockPropertyObjectData that results from the InvsStockPropertyUpdateRequest call
 * @return InvsStockPropertyObjectData resulting from udt call
 *
 */

  public InvsStockPropertyObjectData getOutput() {
    return InvsStockPropertyObjectHelper.fromMap(outputMap, "InvsStockProperty");
  }
}
