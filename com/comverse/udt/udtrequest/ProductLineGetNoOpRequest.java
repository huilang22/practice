/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductLineGetNoOpRequest.java
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
 * NoOp class used to simulate a ProductLineGetNoOpRequest Udt Request/Response
 *
 */
public class ProductLineGetNoOpRequest extends ProductLineSubRequestParent {
/**
 *
 * Constructor to create a   ProductLineGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductLineGetNoOpRequest(String id, ProductLineObjectData noOpIn) {
    super(id, "ProductLineGetNoOpRequest");
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
