/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupUpdateRequest.java
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
 * Class used to create a ProductGroupUpdateRequest Udt Request
 *
 */

public class ProductGroupUpdateRequest extends ProductGroupSubRequestParent {
/**
 *
 * Constructor to create a  ProductGroupUpdateRequest
 * @param id Unique request name
 * @param pgUpdIn ProductGroupObjectData for ProductGroupUpdateRequest
 *
 */
@JsonCreator
  public ProductGroupUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductGroup")ProductGroupObjectData pgUpdIn) {
    super(id, "ProductGroupUpdate");
    if (pgUpdIn != null) {
      addInput("ProductGroup", ProductGroupObjectHelper.toMap(pgUpdIn, new HashMap(), "ProductGroup").get("ProductGroup"));
    }
  }

/**
 *
 * Retrieves the ProductGroupObjectData that results from the ProductGroupUpdateRequest call
 * @return ProductGroupObjectData resulting from udt call
 *
 */

  public ProductGroupObjectData getOutput() {
    return ProductGroupObjectHelper.fromMap(outputMap, "ProductGroup");
  }
}
