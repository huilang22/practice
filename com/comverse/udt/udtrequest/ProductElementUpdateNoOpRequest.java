/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ProductElementUpdateNoOpRequest Udt Request/Response
 *
 */
public class ProductElementUpdateNoOpRequest extends ProductElementSubRequestParent {
/**
 *
 * Constructor to create a   ProductElementUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductElementUpdateNoOpRequest(String id, ProductElementObjectData noOpIn) {
    super(id, "ProductElementUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ProductElement", ProductElementObjectHelper.toMap(noOpIn, new HashMap(), "ProductElement").get("ProductElement"));
    }
  }
/**
 *
 * Retrieves the ProductElementObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ProductElementObjectData getOutput() {
    return ProductElementObjectHelper.fromMap(outputMap, "ProductElement");
  }
}
