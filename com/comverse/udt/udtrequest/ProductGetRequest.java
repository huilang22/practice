/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGetRequest.java
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
 * Class used to create a ProductGetRequest Udt Request
 *
 */

public class ProductGetRequest extends ProductSubRequestParent {
/**
 *
 * Constructor to create a  ProductGetRequest
 * @param id Unique request name
 * @param ProductGetIn ProductObjectBaseKeyData for ProductGetRequest
 *
 */
@JsonCreator
  public ProductGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Product")ProductObjectBaseKeyData ProductGetIn) {
    super(id, "ProductGet");
    if (ProductGetIn != null) {
      addInput("Product", ProductObjectBaseKeyHelper.toMap(ProductGetIn, new HashMap(), "ProductObjectBaseKeyData").get("ProductObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the ProductObjectBaseData that results from the ProductGetRequest call
 * @return ProductObjectBaseData resulting from udt call
 *
 */

  public ProductObjectBaseData getOutput() {
    return ProductObjectBaseHelper.fromMap(outputMap, "Product");
  }
}
