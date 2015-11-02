/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductLineUpdateRequest.java
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
 * Class used to create a ProductLineUpdateRequest Udt Request
 *
 */

public class ProductLineUpdateRequest extends ProductLineSubRequestParent {
/**
 *
 * Constructor to create a  ProductLineUpdateRequest
 * @param id Unique request name
 * @param plUpdIn ProductLineObjectData for ProductLineUpdateRequest
 *
 */
@JsonCreator
  public ProductLineUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductLine")ProductLineObjectData plUpdIn) {
    super(id, "ProductLineUpdate");
    if (plUpdIn != null) {
      addInput("ProductLine", ProductLineObjectHelper.toMap(plUpdIn, new HashMap(), "ProductLine").get("ProductLine"));
    }
  }

/**
 *
 * Retrieves the ProductLineObjectData that results from the ProductLineUpdateRequest call
 * @return ProductLineObjectData resulting from udt call
 *
 */

  public ProductLineObjectData getOutput() {
    return ProductLineObjectHelper.fromMap(outputMap, "ProductLine");
  }
}
