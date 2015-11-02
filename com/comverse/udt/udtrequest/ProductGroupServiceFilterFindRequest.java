/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupServiceFilterFindRequest.java
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
 * Class used to create a ProductGroupServiceFilterFindRequest Udt Request
 *
 */

public class ProductGroupServiceFilterFindRequest extends ProductGroupServiceFilterRequest {
/**
 *
 * Constructor to create a  ProductGroupServiceFilterFindRequest
 * @param id Unique request name
 * @param PSGFfind_In PGSFObjectFilter for ProductGroupServiceFilterFindRequest
 *
 */
@JsonCreator
  public ProductGroupServiceFilterFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductGroupServiceFilter")PGSFObjectFilter PSGFfind_In) {
    super(id, "ProductGroupServiceFilterFind");
    if (PSGFfind_In != null) {
      Integer index =  PSGFfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductGroupServiceFilter", PGSFObjectHelper.toMap(PSGFfind_In, new HashMap(), "ProductGroupServiceFilter").get("ProductGroupServiceFilter"));
    }
  }

/**
 *
 * Retrieves the PGSFObjectDataList that results from the ProductGroupServiceFilterFindRequest call
 * @return PGSFObjectDataList resulting from udt call
 *
 */

  public PGSFObjectDataList getOutput() {
    return PGSFObjectHelper.fromMapList(outputMap, "ProductGroupServiceFilterList");
  }
}
