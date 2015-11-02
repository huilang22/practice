/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductAlternateGetRequest.java
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
 * Class used to create a ProductAlternateGetRequest Udt Request
 *
 */

public class ProductAlternateGetRequest extends ProductSubRequestParent {
/**
 *
 * Constructor to create a  ProductAlternateGetRequest
 * @param id Unique request name
 * @param ProductAlternateGetIn ProductObjectBaseData for ProductAlternateGetRequest
 *
 */
@JsonCreator
  public ProductAlternateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Product")ProductObjectBaseData ProductAlternateGetIn) {
    super(id, "ProductAlternateGet");
    if (ProductAlternateGetIn != null) {
      addInput("Product", ProductObjectBaseHelper.toMap(ProductAlternateGetIn, new HashMap(), "Product").get("Product"));
    }
  }

/**
 *
 * Retrieves the ProductObjectBaseData that results from the ProductAlternateGetRequest call
 * @return ProductObjectBaseData resulting from udt call
 *
 */

  public ProductObjectBaseData getOutput() {
    return ProductObjectBaseHelper.fromMap(outputMap, "Product");
  }
}
