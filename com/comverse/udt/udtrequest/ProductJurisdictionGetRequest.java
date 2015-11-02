/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductJurisdictionGetRequest.java
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
 * Class used to create a ProductJurisdictionGetRequest Udt Request
 *
 */

public class ProductJurisdictionGetRequest extends ProductJurisdictionSubRequestParent {
/**
 *
 * Constructor to create a  ProductJurisdictionGetRequest
 * @param id Unique request name
 * @param ProductJurisdictionGetIn ProductJurisdictionObjectKeyData for ProductJurisdictionGetRequest
 *
 */
@JsonCreator
  public ProductJurisdictionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductJurisdiction")ProductJurisdictionObjectKeyData ProductJurisdictionGetIn) {
    super(id, "ProductJurisdictionGet");
    if (ProductJurisdictionGetIn != null) {
      addInput("ProductJurisdiction", ProductJurisdictionObjectKeyHelper.toMap(ProductJurisdictionGetIn, new HashMap(), "ProductJurisdictionObjectKeyData").get("ProductJurisdictionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ProductJurisdictionObjectData that results from the ProductJurisdictionGetRequest call
 * @return ProductJurisdictionObjectData resulting from udt call
 *
 */

  public ProductJurisdictionObjectData getOutput() {
    return ProductJurisdictionObjectHelper.fromMap(outputMap, "ProductJurisdiction");
  }
}
