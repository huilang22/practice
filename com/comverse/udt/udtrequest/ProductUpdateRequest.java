/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductUpdateRequest.java
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
 * Class used to create a ProductUpdateRequest Udt Request
 *
 */

public class ProductUpdateRequest extends ProductSubRequestParent {
/**
 *
 * Constructor to create a  ProductUpdateRequest
 * @param id Unique request name
 * @param ProductUpdateIn ProductObjectBaseData for ProductUpdateRequest
 *
 */
@JsonCreator
  public ProductUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Product")ProductObjectBaseData ProductUpdateIn) {
    super(id, "ProductUpdate");
    if (ProductUpdateIn != null) {
      addInput("Product", ProductObjectBaseHelper.toMap(ProductUpdateIn, new HashMap(), "Product").get("Product"));
    }
  }

/**
 *
 * Retrieves the ProductObjectBaseData that results from the ProductUpdateRequest call
 * @return ProductObjectBaseData resulting from udt call
 *
 */

  public ProductObjectBaseData getOutput() {
    return ProductObjectBaseHelper.fromMap(outputMap, "Product");
  }
}
