/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductFindRequest.java
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
 * Class used to create a ProductFindRequest Udt Request
 *
 */

public class ProductFindRequest extends ProductRequest {
/**
 *
 * Constructor to create a  ProductFindRequest
 * @param id Unique request name
 * @param ProductFindIn ProductObjectBaseFilter for ProductFindRequest
 *
 */
@JsonCreator
  public ProductFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Product")ProductObjectBaseFilter ProductFindIn) {
    super(id, "ProductFind");
    if (ProductFindIn != null) {
      Integer index =  ProductFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Product", ProductObjectBaseHelper.toMap(ProductFindIn, new HashMap(), "Product").get("Product"));
    }
  }

/**
 *
 * Retrieves the ProductObjectBaseDataList that results from the ProductFindRequest call
 * @return ProductObjectBaseDataList resulting from udt call
 *
 */

  public ProductObjectBaseDataList getOutput() {
    return ProductObjectBaseHelper.fromMapList(outputMap, "ProductList");
  }
}
