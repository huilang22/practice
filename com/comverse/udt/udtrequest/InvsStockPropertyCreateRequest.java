/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropertyCreateRequest.java
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
 * Class used to create a InvsStockPropertyCreateRequest Udt Request
 *
 */

public class InvsStockPropertyCreateRequest extends InvsStockPropertySubRequestParent {
/**
 *
 * Constructor to create a  InvsStockPropertyCreateRequest
 * @param id Unique request name
 * @param InvsStockPropertyCreateIn InvsStockPropertyObjectData for InvsStockPropertyCreateRequest
 *
 */
@JsonCreator
  public InvsStockPropertyCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsStockProperty")InvsStockPropertyObjectData InvsStockPropertyCreateIn) {
    super(id, "InvsStockPropertyCreate");
    if (InvsStockPropertyCreateIn != null) {
      addInput("InvsStockProperty", InvsStockPropertyObjectHelper.toMap(InvsStockPropertyCreateIn, new HashMap(), "InvsStockProperty").get("InvsStockProperty"));
    }
  }

/**
 *
 * Retrieves the InvsStockPropertyObjectData that results from the InvsStockPropertyCreateRequest call
 * @return InvsStockPropertyObjectData resulting from udt call
 *
 */

  public InvsStockPropertyObjectData getOutput() {
    return InvsStockPropertyObjectHelper.fromMap(outputMap, "InvsStockProperty");
  }
}
