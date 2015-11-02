/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductFindByServiceOrderRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ProductFindByServiceOrderRequest Udt Request
 *
 */

public class ProductFindByServiceOrderRequest extends ProductRequest {
/**
 *
 * Constructor to create a  ProductFindByServiceOrderRequest
 * @param id Unique request name
 * @param ProductFindByServiceOrderIn ProductObjectBaseFilter for ProductFindByServiceOrderRequest
 * @param ServiceOrderId String for ProductFindByServiceOrderRequest
 *
 */
@JsonCreator
  public ProductFindByServiceOrderRequest(@JsonProperty("RequestId") String id, @JsonProperty("Product")ProductObjectBaseFilter ProductFindByServiceOrderIn, @JsonProperty("ServiceOrderId")String ServiceOrderId) {
    super(id, "ProductFindByServiceOrder");
    if (ProductFindByServiceOrderIn != null) {
      Integer index =  ProductFindByServiceOrderIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Product", ProductObjectBaseHelper.toMap(ProductFindByServiceOrderIn, new HashMap(), "Product").get("Product"));
    }
    if (ServiceOrderId != null) {
      addInput("ServiceOrderId", ServiceOrderId);
    }
  }

/**
 *
 * Retrieves the ProductObjectBaseDataList that results from the ProductFindByServiceOrderRequest call
 * @return ProductObjectBaseDataList resulting from udt call
 *
 */

  public ProductObjectBaseDataList getOutput() {
    return ProductObjectBaseHelper.fromMapList(outputMap, "ProductList");
  }
}
