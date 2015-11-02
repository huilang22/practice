/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductChargeMapFindRequest.java
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
 * Class used to create a ProductChargeMapFindRequest Udt Request
 *
 */

public class ProductChargeMapFindRequest extends ProductChargeMapRequest {
/**
 *
 * Constructor to create a  ProductChargeMapFindRequest
 * @param id Unique request name
 * @param PCMapFindIn ProductChargeMapObjectFilter for ProductChargeMapFindRequest
 *
 */
@JsonCreator
  public ProductChargeMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductChargeMap")ProductChargeMapObjectFilter PCMapFindIn) {
    super(id, "ProductChargeMapFind");
    if (PCMapFindIn != null) {
      Integer index =  PCMapFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductChargeMap", ProductChargeMapObjectHelper.toMap(PCMapFindIn, new HashMap(), "ProductChargeMap").get("ProductChargeMap"));
    }
  }

/**
 *
 * Retrieves the ProductChargeMapObjectDataList that results from the ProductChargeMapFindRequest call
 * @return ProductChargeMapObjectDataList resulting from udt call
 *
 */

  public ProductChargeMapObjectDataList getOutput() {
    return ProductChargeMapObjectHelper.fromMapList(outputMap, "ProductChargeMapList");
  }
}
