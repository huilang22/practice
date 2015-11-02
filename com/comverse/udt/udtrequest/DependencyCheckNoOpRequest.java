/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyCheckNoOpRequest.java
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
 * NoOp class used to simulate a DependencyCheckNoOpRequest Udt Request/Response
 *
 */
public class DependencyCheckNoOpRequest extends DependencySubRequestParent {
/**
 *
 * Constructor to create a   DependencyCheckNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DependencyCheckNoOpRequest(String id, DependencyCheckOutputData noOpIn) {
    super(id, "DependencyCheckNoOpRequest");
    if (noOpIn != null) {
      addInput("DependencyCheckOutputData", DependencyCheckOutputHelper.toMap(noOpIn).get("DependencyCheckOutputData"));
    }
  }
/**
 *
 * Retrieves the DependencyCheckOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public DependencyCheckOutputData getOutput() {
    return DependencyCheckOutputHelper.fromMap(outputMap);
  }
}
