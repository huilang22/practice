/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductExtendedDataFindRequest.java
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
 * Class used to create a ProductExtendedDataFindRequest Udt Request
 *
 */

public class ProductExtendedDataFindRequest extends ProductRequest {
/**
 *
 * Constructor to create a  ProductExtendedDataFindRequest
 * @param id Unique request name
 * @param pedfIn ProductObjectBaseKeyData for ProductExtendedDataFindRequest
 *
 */
@JsonCreator
  public ProductExtendedDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Product")ProductObjectBaseKeyData pedfIn) {
    super(id, "ProductExtendedDataFind");
    if (pedfIn != null) {
      addInput("Product", ProductObjectBaseKeyHelper.toMap(pedfIn, new HashMap(), "ProductObjectBaseKeyData").get("ProductObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the ProductEDObjectDataList that results from the ProductExtendedDataFindRequest call
 * @return ProductEDObjectDataList resulting from udt call
 *
 */

  public ProductEDObjectDataList getOutput() {
    return ProductEDObjectHelper.fromMapList(outputMap, "ProductExtendedDataList");
  }
}
