/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductLineFindRequest.java
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
 * Class used to create a ProductLineFindRequest Udt Request
 *
 */

public class ProductLineFindRequest extends ProductLineRequest {
/**
 *
 * Constructor to create a  ProductLineFindRequest
 * @param id Unique request name
 * @param pgFindIn ProductLineObjectFilter for ProductLineFindRequest
 *
 */
@JsonCreator
  public ProductLineFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductLine")ProductLineObjectFilter pgFindIn) {
    super(id, "ProductLineFind");
    if (pgFindIn != null) {
      Integer index =  pgFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductLine", ProductLineObjectHelper.toMap(pgFindIn, new HashMap(), "ProductLine").get("ProductLine"));
    }
  }

/**
 *
 * Retrieves the ProductLineObjectDataList that results from the ProductLineFindRequest call
 * @return ProductLineObjectDataList resulting from udt call
 *
 */

  public ProductLineObjectDataList getOutput() {
    return ProductLineObjectHelper.fromMapList(outputMap, "ProductLineList");
  }
}
