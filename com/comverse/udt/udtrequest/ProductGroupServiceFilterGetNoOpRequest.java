/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupServiceFilterGetNoOpRequest.java
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
 * NoOp class used to simulate a ProductGroupServiceFilterGetNoOpRequest Udt Request/Response
 *
 */
public class ProductGroupServiceFilterGetNoOpRequest extends ProductGroupServiceFilterSubRequestParent {
/**
 *
 * Constructor to create a   ProductGroupServiceFilterGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductGroupServiceFilterGetNoOpRequest(String id, PGSFObjectData noOpIn) {
    super(id, "ProductGroupServiceFilterGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ProductGroupServiceFilter", PGSFObjectHelper.toMap(noOpIn, new HashMap(), "ProductGroupServiceFilter").get("ProductGroupServiceFilter"));
    }
  }
/**
 *
 * Retrieves the PGSFObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PGSFObjectData getOutput() {
    return PGSFObjectHelper.fromMap(outputMap, "ProductGroupServiceFilter");
  }
}
