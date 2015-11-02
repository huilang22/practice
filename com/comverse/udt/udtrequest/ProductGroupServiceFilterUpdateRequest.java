/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupServiceFilterUpdateRequest.java
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
 * Class used to create a ProductGroupServiceFilterUpdateRequest Udt Request
 *
 */

public class ProductGroupServiceFilterUpdateRequest extends ProductGroupServiceFilterSubRequestParent {
/**
 *
 * Constructor to create a  ProductGroupServiceFilterUpdateRequest
 * @param id Unique request name
 * @param PSGFupdate_In PGSFObjectData for ProductGroupServiceFilterUpdateRequest
 *
 */
@JsonCreator
  public ProductGroupServiceFilterUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductGroupServiceFilter")PGSFObjectData PSGFupdate_In) {
    super(id, "ProductGroupServiceFilterUpdate");
    if (PSGFupdate_In != null) {
      addInput("ProductGroupServiceFilter", PGSFObjectHelper.toMap(PSGFupdate_In, new HashMap(), "ProductGroupServiceFilter").get("ProductGroupServiceFilter"));
    }
  }

/**
 *
 * Retrieves the PGSFObjectData that results from the ProductGroupServiceFilterUpdateRequest call
 * @return PGSFObjectData resulting from udt call
 *
 */

  public PGSFObjectData getOutput() {
    return PGSFObjectHelper.fromMap(outputMap, "ProductGroupServiceFilter");
  }
}
