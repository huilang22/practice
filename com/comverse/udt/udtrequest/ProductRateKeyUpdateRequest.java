/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyUpdateRequest.java
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
 * Class used to create a ProductRateKeyUpdateRequest Udt Request
 *
 */

public class ProductRateKeyUpdateRequest extends ProductRateKeySubRequestParent {
/**
 *
 * Constructor to create a  ProductRateKeyUpdateRequest
 * @param id Unique request name
 * @param PRKUpdateIn ProductRateKeyObjectData for ProductRateKeyUpdateRequest
 *
 */
@JsonCreator
  public ProductRateKeyUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductRateKey")ProductRateKeyObjectData PRKUpdateIn) {
    super(id, "ProductRateKeyUpdate");
    if (PRKUpdateIn != null) {
      addInput("ProductRateKey", ProductRateKeyObjectHelper.toMap(PRKUpdateIn, new HashMap(), "ProductRateKey").get("ProductRateKey"));
    }
  }

/**
 *
 * Retrieves the ProductRateKeyObjectData that results from the ProductRateKeyUpdateRequest call
 * @return ProductRateKeyObjectData resulting from udt call
 *
 */

  public ProductRateKeyObjectData getOutput() {
    return ProductRateKeyObjectHelper.fromMap(outputMap, "ProductRateKey");
  }
}
