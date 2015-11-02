/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductExternalFindRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ProductExternalFindRequest Udt Request
 *
 */

public class ProductExternalFindRequest extends ProductRequest {
/**
 *
 * Constructor to create a  ProductExternalFindRequest
 * @param id Unique request name
 * @param PSEXFindIn ProductObjectFilter for ProductExternalFindRequest
 *
 */
@JsonCreator
  public ProductExternalFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Product")ProductObjectFilter PSEXFindIn) {
    super(id, "ProductExternalFind");
    if (PSEXFindIn != null) {
      Integer index =  PSEXFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Product", ProductObjectHelper.toMap(PSEXFindIn, new HashMap(), "Product").get("Product"));
    }
  }

/**
 *
 * Retrieves the ProductObjectDataList that results from the ProductExternalFindRequest call
 * @return ProductObjectDataList resulting from udt call
 *
 */

  public ProductObjectDataList getOutput() {
    return ProductObjectHelper.fromMapList(outputMap, "ProductList");
  }
}
