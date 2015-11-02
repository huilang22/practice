/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupServiceFilterDeleteRequest.java
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
 * Class used to create a ProductGroupServiceFilterDeleteRequest Udt Request
 *
 */

public class ProductGroupServiceFilterDeleteRequest extends ProductGroupServiceFilterSubRequestParent {
/**
 *
 * Constructor to create a  ProductGroupServiceFilterDeleteRequest
 * @param id Unique request name
 * @param PSGFdelete_In PGSFObjectKeyData for ProductGroupServiceFilterDeleteRequest
 *
 */
@JsonCreator
  public ProductGroupServiceFilterDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductGroupServiceFilter")PGSFObjectKeyData PSGFdelete_In) {
    super(id, "ProductGroupServiceFilterDelete");
    if (PSGFdelete_In != null) {
      addInput("ProductGroupServiceFilter", PGSFObjectKeyHelper.toMap(PSGFdelete_In, new HashMap(), "PGSFObjectKeyData").get("PGSFObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PGSFObjectData that results from the ProductGroupServiceFilterDeleteRequest call
 * @return PGSFObjectData resulting from udt call
 *
 */

  public PGSFObjectData getOutput() {
    return PGSFObjectHelper.fromMap(outputMap, "ProductGroupServiceFilter");
  }
}
