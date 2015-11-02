/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementCreateRequest.java
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
 * Class used to create a ProductElementCreateRequest Udt Request
 *
 */

public class ProductElementCreateRequest extends ProductElementSubRequestParent {
/**
 *
 * Constructor to create a  ProductElementCreateRequest
 * @param id Unique request name
 * @param peCrIn ProductElementObjectData for ProductElementCreateRequest
 *
 */
@JsonCreator
  public ProductElementCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductElement")ProductElementObjectData peCrIn) {
    super(id, "ProductElementCreate");
    if (peCrIn != null) {
      addInput("ProductElement", ProductElementObjectHelper.toMap(peCrIn, new HashMap(), "ProductElement").get("ProductElement"));
    }
  }

/**
 *
 * Retrieves the ProductElementObjectData that results from the ProductElementCreateRequest call
 * @return ProductElementObjectData resulting from udt call
 *
 */

  public ProductElementObjectData getOutput() {
    return ProductElementObjectHelper.fromMap(outputMap, "ProductElement");
  }
}
