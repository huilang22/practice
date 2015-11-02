/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDisconnectChargeAmountGetNoOpRequest.java
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
 * NoOp class used to simulate a ComponentDisconnectChargeAmountGetNoOpRequest Udt Request/Response
 *
 */
public class ComponentDisconnectChargeAmountGetNoOpRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a   ComponentDisconnectChargeAmountGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ComponentDisconnectChargeAmountGetNoOpRequest(String id, ComponentDisconnectChargeAmountGetOutputData noOpIn) {
    super(id, "ComponentDisconnectChargeAmountGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ComponentDisconnectChargeAmountGetOutputData", ComponentDisconnectChargeAmountGetOutputHelper.toMap(noOpIn).get("ComponentDisconnectChargeAmountGetOutputData"));
    }
  }
/**
 *
 * Retrieves the ComponentDisconnectChargeAmountGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentDisconnectChargeAmountGetOutputData getOutput() {
    return ComponentDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
}
