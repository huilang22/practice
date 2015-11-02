/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementDeleteRequest.java
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
 * Class used to create a ProductElementDeleteRequest Udt Request
 *
 */

public class ProductElementDeleteRequest extends ProductElementRequest {
/**
 *
 * Constructor to create a  ProductElementDeleteRequest
 * @param id Unique request name
 * @param PEDeleteIn ProductElementObjectKeyData for ProductElementDeleteRequest
 *
 */
@JsonCreator
  public ProductElementDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductElement")ProductElementObjectKeyData PEDeleteIn) {
    super(id, "ProductElementDelete");
    if (PEDeleteIn != null) {
      addInput("ProductElement", ProductElementObjectKeyHelper.toMap(PEDeleteIn, new HashMap(), "ProductElementObjectKeyData").get("ProductElementObjectKeyData"));
    }
  }

}
