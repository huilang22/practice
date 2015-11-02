/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductJurisdictionFindRequest.java
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
 * Class used to create a ProductJurisdictionFindRequest Udt Request
 *
 */

public class ProductJurisdictionFindRequest extends ProductJurisdictionRequest {
/**
 *
 * Constructor to create a  ProductJurisdictionFindRequest
 * @param id Unique request name
 * @param ProductJurisdictionFindIn ProductJurisdictionObjectFilter for ProductJurisdictionFindRequest
 *
 */
@JsonCreator
  public ProductJurisdictionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductJurisdiction")ProductJurisdictionObjectFilter ProductJurisdictionFindIn) {
    super(id, "ProductJurisdictionFind");
    if (ProductJurisdictionFindIn != null) {
      Integer index =  ProductJurisdictionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductJurisdiction", ProductJurisdictionObjectHelper.toMap(ProductJurisdictionFindIn, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
  }

/**
 *
 * Retrieves the ProductJurisdictionObjectDataList that results from the ProductJurisdictionFindRequest call
 * @return ProductJurisdictionObjectDataList resulting from udt call
 *
 */

  public ProductJurisdictionObjectDataList getOutput() {
    return ProductJurisdictionObjectHelper.fromMapList(outputMap, "ProductJurisdictionList");
  }
}
