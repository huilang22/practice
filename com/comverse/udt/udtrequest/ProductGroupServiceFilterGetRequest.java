/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupServiceFilterGetRequest.java
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
 * Class used to create a ProductGroupServiceFilterGetRequest Udt Request
 *
 */

public class ProductGroupServiceFilterGetRequest extends ProductGroupServiceFilterSubRequestParent {
/**
 *
 * Constructor to create a  ProductGroupServiceFilterGetRequest
 * @param id Unique request name
 * @param PGSFget_In PGSFObjectKeyData for ProductGroupServiceFilterGetRequest
 *
 */
@JsonCreator
  public ProductGroupServiceFilterGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductGroupServiceFilter")PGSFObjectKeyData PGSFget_In) {
    super(id, "ProductGroupServiceFilterGet");
    if (PGSFget_In != null) {
      addInput("ProductGroupServiceFilter", PGSFObjectKeyHelper.toMap(PGSFget_In, new HashMap(), "PGSFObjectKeyData").get("PGSFObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PGSFObjectData that results from the ProductGroupServiceFilterGetRequest call
 * @return PGSFObjectData resulting from udt call
 *
 */

  public PGSFObjectData getOutput() {
    return PGSFObjectHelper.fromMap(outputMap, "ProductGroupServiceFilter");
  }
}
