/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductJurisdictionCreateNoOpRequest.java
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
 * NoOp class used to simulate a ProductJurisdictionCreateNoOpRequest Udt Request/Response
 *
 */
public class ProductJurisdictionCreateNoOpRequest extends ProductJurisdictionSubRequestParent {
/**
 *
 * Constructor to create a   ProductJurisdictionCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductJurisdictionCreateNoOpRequest(String id, ProductJurisdictionObjectData noOpIn) {
    super(id, "ProductJurisdictionCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ProductJurisdiction", ProductJurisdictionObjectHelper.toMap(noOpIn, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
  }
/**
 *
 * Retrieves the ProductJurisdictionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ProductJurisdictionObjectData getOutput() {
    return ProductJurisdictionObjectHelper.fromMap(outputMap, "ProductJurisdiction");
  }
}
