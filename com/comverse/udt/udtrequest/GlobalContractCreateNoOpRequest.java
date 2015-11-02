/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalContractCreateNoOpRequest.java
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
 * NoOp class used to simulate a GlobalContractCreateNoOpRequest Udt Request/Response
 *
 */
public class GlobalContractCreateNoOpRequest extends GlobalContractSubRequestParent {
/**
 *
 * Constructor to create a   GlobalContractCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GlobalContractCreateNoOpRequest(String id, GlobalContractObjectData noOpIn) {
    super(id, "GlobalContractCreateNoOpRequest");
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
