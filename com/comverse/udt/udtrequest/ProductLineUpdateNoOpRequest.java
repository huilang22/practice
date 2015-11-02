/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductLineUpdateNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a ProductLineUpdateNoOpRequest Udt Request/Response
 *
 */
public class ProductLineUpdateNoOpRequest extends ProductLineSubRequestParent {
/**
 *
 * Constructor to create a   ProductLineUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductLineUpdateNoOpRequest(String id, ProductLineObjectData noOpIn) {
    super(id, "ProductLineUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ProductLine", ProductLineObjectHelper.toMap(noOpIn, new HashMap(), "ProductLine").get("ProductLine"));
    }
  }
/**
 *
 * Retrieves the ProductLineObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ProductLineObjectData getOutput() {
    return ProductLineObjectHelper.fromMap(outputMap, "ProductLine");
  }
}
