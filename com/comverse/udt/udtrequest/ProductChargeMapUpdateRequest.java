/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductChargeMapUpdateRequest.java
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
 * Class used to create a ProductChargeMapUpdateRequest Udt Request
 *
 */

public class ProductChargeMapUpdateRequest extends ProductChargeMapSubRequestParent {
/**
 *
 * Constructor to create a  ProductChargeMapUpdateRequest
 * @param id Unique request name
 * @param PCMapUpdateIn ProductChargeMapObjectData for ProductChargeMapUpdateRequest
 *
 */
@JsonCreator
  public ProductChargeMapUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductChargeMap")ProductChargeMapObjectData PCMapUpdateIn) {
    super(id, "ProductChargeMapUpdate");
    if (PCMapUpdateIn != null) {
      addInput("ProductChargeMap", ProductChargeMapObjectHelper.toMap(PCMapUpdateIn, new HashMap(), "ProductChargeMap").get("ProductChargeMap"));
    }
  }

/**
 *
 * Retrieves the ProductChargeMapObjectData that results from the ProductChargeMapUpdateRequest call
 * @return ProductChargeMapObjectData resulting from udt call
 *
 */

  public ProductChargeMapObjectData getOutput() {
    return ProductChargeMapObjectHelper.fromMap(outputMap, "ProductChargeMap");
  }
}
