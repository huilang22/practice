/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyFindRequest.java
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
 * Class used to create a ProductRateKeyFindRequest Udt Request
 *
 */

public class ProductRateKeyFindRequest extends ProductRateKeyRequest {
/**
 *
 * Constructor to create a  ProductRateKeyFindRequest
 * @param id Unique request name
 * @param PRKFindIn ProductRateKeyObjectFilter for ProductRateKeyFindRequest
 *
 */
@JsonCreator
  public ProductRateKeyFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductRateKey")ProductRateKeyObjectFilter PRKFindIn) {
    super(id, "ProductRateKeyFind");
    if (PRKFindIn != null) {
      Integer index =  PRKFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductRateKey", ProductRateKeyObjectHelper.toMap(PRKFindIn, new HashMap(), "ProductRateKey").get("ProductRateKey"));
    }
  }

/**
 *
 * Retrieves the ProductRateKeyObjectDataList that results from the ProductRateKeyFindRequest call
 * @return ProductRateKeyObjectDataList resulting from udt call
 *
 */

  public ProductRateKeyObjectDataList getOutput() {
    return ProductRateKeyObjectHelper.fromMapList(outputMap, "ProductRateKeyList");
  }
}
