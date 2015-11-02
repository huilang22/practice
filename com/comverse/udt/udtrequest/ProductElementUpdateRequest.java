/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementUpdateRequest.java
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
 * Class used to create a ProductElementUpdateRequest Udt Request
 *
 */

public class ProductElementUpdateRequest extends ProductElementSubRequestParent {
/**
 *
 * Constructor to create a  ProductElementUpdateRequest
 * @param id Unique request name
 * @param peUpdIn ProductElementObjectData for ProductElementUpdateRequest
 *
 */
@JsonCreator
  public ProductElementUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductElement")ProductElementObjectData peUpdIn) {
    super(id, "ProductElementUpdate");
    if (peUpdIn != null) {
      addInput("ProductElement", ProductElementObjectHelper.toMap(peUpdIn, new HashMap(), "ProductElement").get("ProductElement"));
    }
  }

/**
 *
 * Retrieves the ProductElementObjectData that results from the ProductElementUpdateRequest call
 * @return ProductElementObjectData resulting from udt call
 *
 */

  public ProductElementObjectData getOutput() {
    return ProductElementObjectHelper.fromMap(outputMap, "ProductElement");
  }
}
