/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupServiceFilterCreateRequest.java
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
 * Class used to create a ProductGroupServiceFilterCreateRequest Udt Request
 *
 */

public class ProductGroupServiceFilterCreateRequest extends ProductGroupServiceFilterSubRequestParent {
/**
 *
 * Constructor to create a  ProductGroupServiceFilterCreateRequest
 * @param id Unique request name
 * @param PSGFcreate_In PGSFObjectData for ProductGroupServiceFilterCreateRequest
 *
 */
@JsonCreator
  public ProductGroupServiceFilterCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductGroupServiceFilter")PGSFObjectData PSGFcreate_In) {
    super(id, "ProductGroupServiceFilterCreate");
    if (PSGFcreate_In != null) {
      addInput("ProductGroupServiceFilter", PGSFObjectHelper.toMap(PSGFcreate_In, new HashMap(), "ProductGroupServiceFilter").get("ProductGroupServiceFilter"));
    }
  }

/**
 *
 * Retrieves the PGSFObjectData that results from the ProductGroupServiceFilterCreateRequest call
 * @return PGSFObjectData resulting from udt call
 *
 */

  public PGSFObjectData getOutput() {
    return PGSFObjectHelper.fromMap(outputMap, "ProductGroupServiceFilter");
  }
}
