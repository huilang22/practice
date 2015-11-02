/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExchangeRateClassCreateNoOpRequest.java
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
 * NoOp class used to simulate a ExchangeRateClassCreateNoOpRequest Udt Request/Response
 *
 */
public class ExchangeRateClassCreateNoOpRequest extends ExchangeRateClassSubRequestParent {
/**
 *
 * Constructor to create a   ExchangeRateClassCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExchangeRateClassCreateNoOpRequest(String id, ExchangeRateClassObjectData noOpIn) {
    super(id, "ExchangeRateClassCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ExchangeRateClass", ExchangeRateClassObjectHelper.toMap(noOpIn, new HashMap(), "ExchangeRateClass").get("ExchangeRateClass"));
    }
  }
/**
 *
 * Retrieves the ExchangeRateClassObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ExchangeRateClassObjectData getOutput() {
    return ExchangeRateClassObjectHelper.fromMap(outputMap, "ExchangeRateClass");
  }
}
