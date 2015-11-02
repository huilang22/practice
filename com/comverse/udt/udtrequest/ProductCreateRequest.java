/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductCreateRequest.java
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
 * Class used to create a ProductCreateRequest Udt Request
 *
 */

public class ProductCreateRequest extends ProductSubRequestParent {
/**
 *
 * Constructor to create a  ProductCreateRequest
 * @param id Unique request name
 * @param ProductCreate2In ProductObjectBaseData for ProductCreateRequest
 *
 */
@JsonCreator
  public ProductCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Product")ProductObjectBaseData ProductCreate2In) {
    super(id, "ProductCreate");
    if (ProductCreate2In != null) {
      addInput("Product", ProductObjectBaseHelper.toMap(ProductCreate2In, new HashMap(), "Product").get("Product"));
    }
  }

/**
 *
 * Retrieves the ProductObjectBaseData that results from the ProductCreateRequest call
 * @return ProductObjectBaseData resulting from udt call
 *
 */

  public ProductObjectBaseData getOutput() {
    return ProductObjectBaseHelper.fromMap(outputMap, "Product");
  }
}
