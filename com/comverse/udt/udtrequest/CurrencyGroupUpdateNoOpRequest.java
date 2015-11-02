/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CurrencyGroupUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CurrencyGroupUpdateNoOpRequest Udt Request/Response
 *
 */
public class CurrencyGroupUpdateNoOpRequest extends CurrencyGroupSubRequestParent {
/**
 *
 * Constructor to create a   CurrencyGroupUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CurrencyGroupUpdateNoOpRequest(String id, CurrencyGroupObjectData noOpIn) {
    super(id, "CurrencyGroupUpdateNoOpRequest");
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
