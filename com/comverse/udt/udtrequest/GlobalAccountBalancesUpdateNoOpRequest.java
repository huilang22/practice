/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalAccountBalancesUpdateNoOpRequest.java
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
 * NoOp class used to simulate a GlobalAccountBalancesUpdateNoOpRequest Udt Request/Response
 *
 */
public class GlobalAccountBalancesUpdateNoOpRequest extends GlobalAccountBalancesSubRequestParent {
/**
 *
 * Constructor to create a   GlobalAccountBalancesUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GlobalAccountBalancesUpdateNoOpRequest(String id, GlobalAccountBalancesObjectData noOpIn) {
    super(id, "GlobalAccountBalancesUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectHelper.toMap(noOpIn, new HashMap(), "GlobalAccountBalances").get("GlobalAccountBalances"));
    }
  }
/**
 *
 * Retrieves the GlobalAccountBalancesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GlobalAccountBalancesObjectData getOutput() {
    return GlobalAccountBalancesObjectHelper.fromMap(outputMap, "GlobalAccountBalances");
  }
}
