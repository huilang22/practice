/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupFindRequest.java
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
 * Class used to create a ProductGroupFindRequest Udt Request
 *
 */

public class ProductGroupFindRequest extends ProductGroupRequest {
/**
 *
 * Constructor to create a  ProductGroupFindRequest
 * @param id Unique request name
 * @param pgFindIn ProductGroupObjectFilter for ProductGroupFindRequest
 *
 */
@JsonCreator
  public ProductGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductGroup")ProductGroupObjectFilter pgFindIn) {
    super(id, "ProductGroupFind");
    if (pgFindIn != null) {
      Integer index =  pgFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductGroup", ProductGroupObjectHelper.toMap(pgFindIn, new HashMap(), "ProductGroup").get("ProductGroup"));
    }
  }

/**
 *
 * Retrieves the ProductGroupObjectDataList that results from the ProductGroupFindRequest call
 * @return ProductGroupObjectDataList resulting from udt call
 *
 */

  public ProductGroupObjectDataList getOutput() {
    return ProductGroupObjectHelper.fromMapList(outputMap, "ProductGroupList");
  }
}
