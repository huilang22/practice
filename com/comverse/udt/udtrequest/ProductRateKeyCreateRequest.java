/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyCreateRequest.java
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
 * Class used to create a ProductRateKeyCreateRequest Udt Request
 *
 */

public class ProductRateKeyCreateRequest extends ProductRateKeySubRequestParent {
/**
 *
 * Constructor to create a  ProductRateKeyCreateRequest
 * @param id Unique request name
 * @param PRKCreateIn ProductRateKeyObjectData for ProductRateKeyCreateRequest
 *
 */
@JsonCreator
  public ProductRateKeyCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductRateKey")ProductRateKeyObjectData PRKCreateIn) {
    super(id, "ProductRateKeyCreate");
    if (PRKCreateIn != null) {
      addInput("ProductRateKey", ProductRateKeyObjectHelper.toMap(PRKCreateIn, new HashMap(), "ProductRateKey").get("ProductRateKey"));
    }
  }

/**
 *
 * Retrieves the ProductRateKeyObjectData that results from the ProductRateKeyCreateRequest call
 * @return ProductRateKeyObjectData resulting from udt call
 *
 */

  public ProductRateKeyObjectData getOutput() {
    return ProductRateKeyObjectHelper.fromMap(outputMap, "ProductRateKey");
  }
}
