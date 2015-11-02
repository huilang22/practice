/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductJurisdictionCreateRequest.java
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
 * Class used to create a ProductJurisdictionCreateRequest Udt Request
 *
 */

public class ProductJurisdictionCreateRequest extends ProductJurisdictionSubRequestParent {
/**
 *
 * Constructor to create a  ProductJurisdictionCreateRequest
 * @param id Unique request name
 * @param ProductJurisdictionCreateIn ProductJurisdictionObjectData for ProductJurisdictionCreateRequest
 *
 */
@JsonCreator
  public ProductJurisdictionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductJurisdiction")ProductJurisdictionObjectData ProductJurisdictionCreateIn) {
    super(id, "ProductJurisdictionCreate");
    if (ProductJurisdictionCreateIn != null) {
      addInput("ProductJurisdiction", ProductJurisdictionObjectHelper.toMap(ProductJurisdictionCreateIn, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
  }

/**
 *
 * Retrieves the ProductJurisdictionObjectData that results from the ProductJurisdictionCreateRequest call
 * @return ProductJurisdictionObjectData resulting from udt call
 *
 */

  public ProductJurisdictionObjectData getOutput() {
    return ProductJurisdictionObjectHelper.fromMap(outputMap, "ProductJurisdiction");
  }
}
