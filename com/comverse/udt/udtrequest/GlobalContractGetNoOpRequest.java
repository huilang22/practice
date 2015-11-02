/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalContractGetNoOpRequest.java
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
 * NoOp class used to simulate a GlobalContractGetNoOpRequest Udt Request/Response
 *
 */
public class GlobalContractGetNoOpRequest extends GlobalContractSubRequestParent {
/**
 *
 * Constructor to create a   GlobalContractGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GlobalContractGetNoOpRequest(String id, GlobalContractObjectData noOpIn) {
    super(id, "GlobalContractGetNoOpRequest");
    if (noOpIn != null) {
      addInput("GlobalContract", GlobalContractObjectHelper.toMap(noOpIn, new HashMap(), "GlobalContract").get("GlobalContract"));
    }
  }
/**
 *
 * Retrieves the GlobalContractObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GlobalContractObjectData getOutput() {
    return GlobalContractObjectHelper.fromMap(outputMap, "GlobalContract");
  }
}
