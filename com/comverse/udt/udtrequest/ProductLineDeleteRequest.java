/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductLineDeleteRequest.java
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
 * Class used to create a ProductLineDeleteRequest Udt Request
 *
 */

public class ProductLineDeleteRequest extends ProductLineRequest {
/**
 *
 * Constructor to create a  ProductLineDeleteRequest
 * @param id Unique request name
 * @param PLDeleteIn ProductLineObjectKeyData for ProductLineDeleteRequest
 *
 */
@JsonCreator
  public ProductLineDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductLine")ProductLineObjectKeyData PLDeleteIn) {
    super(id, "ProductLineDelete");
    if (PLDeleteIn != null) {
      addInput("ProductLine", ProductLineObjectKeyHelper.toMap(PLDeleteIn, new HashMap(), "ProductLineObjectKeyData").get("ProductLineObjectKeyData"));
    }
  }

}
