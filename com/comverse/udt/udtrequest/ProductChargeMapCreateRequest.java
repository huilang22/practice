/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductChargeMapCreateRequest.java
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
 * Class used to create a ProductChargeMapCreateRequest Udt Request
 *
 */

public class ProductChargeMapCreateRequest extends ProductChargeMapSubRequestParent {
/**
 *
 * Constructor to create a  ProductChargeMapCreateRequest
 * @param id Unique request name
 * @param PCMapCreateIn ProductChargeMapObjectData for ProductChargeMapCreateRequest
 *
 */
@JsonCreator
  public ProductChargeMapCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductChargeMap")ProductChargeMapObjectData PCMapCreateIn) {
    super(id, "ProductChargeMapCreate");
    if (PCMapCreateIn != null) {
      addInput("ProductChargeMap", ProductChargeMapObjectHelper.toMap(PCMapCreateIn, new HashMap(), "ProductChargeMap").get("ProductChargeMap"));
    }
  }

/**
 *
 * Retrieves the ProductChargeMapObjectData that results from the ProductChargeMapCreateRequest call
 * @return ProductChargeMapObjectData resulting from udt call
 *
 */

  public ProductChargeMapObjectData getOutput() {
    return ProductChargeMapObjectHelper.fromMap(outputMap, "ProductChargeMap");
  }
}
