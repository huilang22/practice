/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NetworkStatusNoOpRequest.java
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
 * NoOp class used to simulate a NetworkStatusNoOpRequest Udt Request/Response
 *
 */
public class NetworkStatusNoOpRequest extends AccountSubRequestParent {
/**
 *
 * Constructor to create a   NetworkStatusNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NetworkStatusNoOpRequest(String id, NetworkStatusOutputData noOpIn) {
    super(id, "NetworkStatusNoOpRequest");
    if (noOpIn != null) {
      addInput("NetworkStatusOutputData", NetworkStatusOutputHelper.toMap(noOpIn).get("NetworkStatusOutputData"));
    }
  }
/**
 *
 * Retrieves the NetworkStatusOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public NetworkStatusOutputData getOutput() {
    return NetworkStatusOutputHelper.fromMap(outputMap);
  }
}
