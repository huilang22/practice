/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductChargeMapGetRequest.java
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
 * Class used to create a ProductChargeMapGetRequest Udt Request
 *
 */

public class ProductChargeMapGetRequest extends ProductChargeMapSubRequestParent {
/**
 *
 * Constructor to create a  ProductChargeMapGetRequest
 * @param id Unique request name
 * @param PCMapGetIn ProductChargeMapObjectKeyData for ProductChargeMapGetRequest
 *
 */
@JsonCreator
  public ProductChargeMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductChargeMap")ProductChargeMapObjectKeyData PCMapGetIn) {
    super(id, "ProductChargeMapGet");
    if (PCMapGetIn != null) {
      addInput("ProductChargeMap", ProductChargeMapObjectKeyHelper.toMap(PCMapGetIn, new HashMap(), "ProductChargeMapObjectKeyData").get("ProductChargeMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ProductChargeMapObjectData that results from the ProductChargeMapGetRequest call
 * @return ProductChargeMapObjectData resulting from udt call
 *
 */

  public ProductChargeMapObjectData getOutput() {
    return ProductChargeMapObjectHelper.fromMap(outputMap, "ProductChargeMap");
  }
}
