/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductLineCreateRequest.java
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
 * Class used to create a ProductLineCreateRequest Udt Request
 *
 */

public class ProductLineCreateRequest extends ProductLineSubRequestParent {
/**
 *
 * Constructor to create a  ProductLineCreateRequest
 * @param id Unique request name
 * @param plCrIn ProductLineObjectData for ProductLineCreateRequest
 *
 */
@JsonCreator
  public ProductLineCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductLine")ProductLineObjectData plCrIn) {
    super(id, "ProductLineCreate");
    if (plCrIn != null) {
      addInput("ProductLine", ProductLineObjectHelper.toMap(plCrIn, new HashMap(), "ProductLine").get("ProductLine"));
    }
  }

/**
 *
 * Retrieves the ProductLineObjectData that results from the ProductLineCreateRequest call
 * @return ProductLineObjectData resulting from udt call
 *
 */

  public ProductLineObjectData getOutput() {
    return ProductLineObjectHelper.fromMap(outputMap, "ProductLine");
  }
}
