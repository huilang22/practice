/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalContractUpdateNoOpRequest.java
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
 * NoOp class used to simulate a GlobalContractUpdateNoOpRequest Udt Request/Response
 *
 */
public class GlobalContractUpdateNoOpRequest extends GlobalContractSubRequestParent {
/**
 *
 * Constructor to create a   GlobalContractUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GlobalContractUpdateNoOpRequest(String id, GlobalContractObjectData noOpIn) {
    super(id, "GlobalContractUpdateNoOpRequest");
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
