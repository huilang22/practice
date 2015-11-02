/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementFindRequest.java
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
 * Class used to create a ProductElementFindRequest Udt Request
 *
 */

public class ProductElementFindRequest extends ProductElementRequest {
/**
 *
 * Constructor to create a  ProductElementFindRequest
 * @param id Unique request name
 * @param peFindIn ProductElementObjectFilter for ProductElementFindRequest
 *
 */
@JsonCreator
  public ProductElementFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductElement")ProductElementObjectFilter peFindIn) {
    super(id, "ProductElementFind");
    if (peFindIn != null) {
      Integer index =  peFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductElement", ProductElementObjectHelper.toMap(peFindIn, new HashMap(), "ProductElement").get("ProductElement"));
    }
  }

/**
 *
 * Retrieves the ProductElementObjectDataList that results from the ProductElementFindRequest call
 * @return ProductElementObjectDataList resulting from udt call
 *
 */

  public ProductElementObjectDataList getOutput() {
    return ProductElementObjectHelper.fromMapList(outputMap, "ProductElementList");
  }
}
