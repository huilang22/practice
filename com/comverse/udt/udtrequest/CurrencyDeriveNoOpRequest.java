/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CurrencyDeriveNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a CurrencyDeriveNoOpRequest Udt Request/Response
 *
 */
public class CurrencyDeriveNoOpRequest extends ProductRequest {
/**
 *
 * Constructor to create a   CurrencyDeriveNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CurrencyDeriveNoOpRequest(String id, Integer noOpIn) {
    super(id, "CurrencyDeriveNoOpRequest");
    if (noOpIn != null) {
      addInput("CurrencyCode", noOpIn);
    }
  }
/**
 *
 * Retrieves the Integer passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getOutput() {
    return  (Integer)outputMap.get("CurrencyCode");
  }
}
