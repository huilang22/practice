/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementGetRequest.java
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
 * Class used to create a ProductElementGetRequest Udt Request
 *
 */

public class ProductElementGetRequest extends ProductElementSubRequestParent {
/**
 *
 * Constructor to create a  ProductElementGetRequest
 * @param id Unique request name
 * @param peGetIn ProductElementObjectKeyData for ProductElementGetRequest
 *
 */
@JsonCreator
  public ProductElementGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductElement")ProductElementObjectKeyData peGetIn) {
    super(id, "ProductElementGet");
    if (peGetIn != null) {
      addInput("ProductElement", ProductElementObjectKeyHelper.toMap(peGetIn, new HashMap(), "ProductElementObjectKeyData").get("ProductElementObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ProductElementObjectData that results from the ProductElementGetRequest call
 * @return ProductElementObjectData resulting from udt call
 *
 */

  public ProductElementObjectData getOutput() {
    return ProductElementObjectHelper.fromMap(outputMap, "ProductElement");
  }
}
