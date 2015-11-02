/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupGetRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ProductGroupGetRequest Udt Request
 *
 */

public class ProductGroupGetRequest extends ProductGroupSubRequestParent {
/**
 *
 * Constructor to create a  ProductGroupGetRequest
 * @param id Unique request name
 * @param pgGetIn ProductGroupObjectKeyData for ProductGroupGetRequest
 *
 */
@JsonCreator
  public ProductGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductGroup")ProductGroupObjectKeyData pgGetIn) {
    super(id, "ProductGroupGet");
    if (pgGetIn != null) {
      addInput("ProductGroup", ProductGroupObjectKeyHelper.toMap(pgGetIn, new HashMap(), "ProductGroupObjectKeyData").get("ProductGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ProductGroupObjectData that results from the ProductGroupGetRequest call
 * @return ProductGroupObjectData resulting from udt call
 *
 */

  public ProductGroupObjectData getOutput() {
    return ProductGroupObjectHelper.fromMap(outputMap, "ProductGroup");
  }
}
