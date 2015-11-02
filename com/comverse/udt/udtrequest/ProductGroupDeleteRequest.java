/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupDeleteRequest.java
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
 * Class used to create a ProductGroupDeleteRequest Udt Request
 *
 */

public class ProductGroupDeleteRequest extends ProductGroupRequest {
/**
 *
 * Constructor to create a  ProductGroupDeleteRequest
 * @param id Unique request name
 * @param PGDeleteIn ProductGroupObjectKeyData for ProductGroupDeleteRequest
 *
 */
@JsonCreator
  public ProductGroupDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductGroup")ProductGroupObjectKeyData PGDeleteIn) {
    super(id, "ProductGroupDelete");
    if (PGDeleteIn != null) {
      addInput("ProductGroup", ProductGroupObjectKeyHelper.toMap(PGDeleteIn, new HashMap(), "ProductGroupObjectKeyData").get("ProductGroupObjectKeyData"));
    }
  }

}
