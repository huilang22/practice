/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupCreateRequest.java
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
 * Class used to create a ProductGroupCreateRequest Udt Request
 *
 */

public class ProductGroupCreateRequest extends ProductGroupSubRequestParent {
/**
 *
 * Constructor to create a  ProductGroupCreateRequest
 * @param id Unique request name
 * @param pgCrIn ProductGroupObjectData for ProductGroupCreateRequest
 *
 */
@JsonCreator
  public ProductGroupCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductGroup")ProductGroupObjectData pgCrIn) {
    super(id, "ProductGroupCreate");
    if (pgCrIn != null) {
      addInput("ProductGroup", ProductGroupObjectHelper.toMap(pgCrIn, new HashMap(), "ProductGroup").get("ProductGroup"));
    }
  }

/**
 *
 * Retrieves the ProductGroupObjectData that results from the ProductGroupCreateRequest call
 * @return ProductGroupObjectData resulting from udt call
 *
 */

  public ProductGroupObjectData getOutput() {
    return ProductGroupObjectHelper.fromMap(outputMap, "ProductGroup");
  }
}
