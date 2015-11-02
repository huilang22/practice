/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductLineGetRequest.java
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
 * Class used to create a ProductLineGetRequest Udt Request
 *
 */

public class ProductLineGetRequest extends ProductLineSubRequestParent {
/**
 *
 * Constructor to create a  ProductLineGetRequest
 * @param id Unique request name
 * @param pgGetIn ProductLineObjectKeyData for ProductLineGetRequest
 *
 */
@JsonCreator
  public ProductLineGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductLine")ProductLineObjectKeyData pgGetIn) {
    super(id, "ProductLineGet");
    if (pgGetIn != null) {
      addInput("ProductLine", ProductLineObjectKeyHelper.toMap(pgGetIn, new HashMap(), "ProductLineObjectKeyData").get("ProductLineObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ProductLineObjectData that results from the ProductLineGetRequest call
 * @return ProductLineObjectData resulting from udt call
 *
 */

  public ProductLineObjectData getOutput() {
    return ProductLineObjectHelper.fromMap(outputMap, "ProductLine");
  }
}
