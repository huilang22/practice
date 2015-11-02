/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CurrencyGroupGetNoOpRequest.java
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
 * NoOp class used to simulate a CurrencyGroupGetNoOpRequest Udt Request/Response
 *
 */
public class CurrencyGroupGetNoOpRequest extends CurrencyGroupSubRequestParent {
/**
 *
 * Constructor to create a   CurrencyGroupGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CurrencyGroupGetNoOpRequest(String id, CurrencyGroupObjectData noOpIn) {
    super(id, "CurrencyGroupGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CurrencyGroup", CurrencyGroupObjectHelper.toMap(noOpIn, new HashMap(), "CurrencyGroup").get("CurrencyGroup"));
    }
  }
/**
 *
 * Retrieves the CurrencyGroupObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CurrencyGroupObjectData getOutput() {
    return CurrencyGroupObjectHelper.fromMap(outputMap, "CurrencyGroup");
  }
}
