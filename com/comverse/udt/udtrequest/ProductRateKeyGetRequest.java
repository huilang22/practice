/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyGetRequest.java
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
 * Class used to create a ProductRateKeyGetRequest Udt Request
 *
 */

public class ProductRateKeyGetRequest extends ProductRateKeySubRequestParent {
/**
 *
 * Constructor to create a  ProductRateKeyGetRequest
 * @param id Unique request name
 * @param PRKGetIn ProductRateKeyObjectKeyData for ProductRateKeyGetRequest
 *
 */
@JsonCreator
  public ProductRateKeyGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductRateKey")ProductRateKeyObjectKeyData PRKGetIn) {
    super(id, "ProductRateKeyGet");
    if (PRKGetIn != null) {
      addInput("ProductRateKey", ProductRateKeyObjectKeyHelper.toMap(PRKGetIn, new HashMap(), "ProductRateKeyObjectKeyData").get("ProductRateKeyObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ProductRateKeyObjectData that results from the ProductRateKeyGetRequest call
 * @return ProductRateKeyObjectData resulting from udt call
 *
 */

  public ProductRateKeyObjectData getOutput() {
    return ProductRateKeyObjectHelper.fromMap(outputMap, "ProductRateKey");
  }
}
