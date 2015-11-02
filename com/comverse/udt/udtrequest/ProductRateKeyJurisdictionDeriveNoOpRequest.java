/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyJurisdictionDeriveNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ProductRateKeyJurisdictionDeriveNoOpRequest Udt Request/Response
 *
 */
public class ProductRateKeyJurisdictionDeriveNoOpRequest extends ProductRateKeyRequest {
/**
 *
 * Constructor to create a   ProductRateKeyJurisdictionDeriveNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProductRateKeyJurisdictionDeriveNoOpRequest(String id, Integer noOpIn) {
    super(id, "ProductRateKeyJurisdictionDeriveNoOpRequest");
    if (noOpIn != null) {
      addInput("JurisdictionCode", noOpIn);
    }
  }
/**
 *
 * Retrieves the Integer passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getOutput() {
    return  (Integer)outputMap.get("JurisdictionCode");
  }
}
