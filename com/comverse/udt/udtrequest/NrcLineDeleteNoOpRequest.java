/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcLineDeleteNoOpRequest.java
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
 * NoOp class used to simulate a NrcLineDeleteNoOpRequest Udt Request/Response
 *
 */
public class NrcLineDeleteNoOpRequest extends NrcLineSubRequestParent {
/**
 *
 * Constructor to create a   NrcLineDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcLineDeleteNoOpRequest(String id, NrcLineObjectData noOpIn) {
    super(id, "NrcLineDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("NrcLine", NrcLineObjectHelper.toMap(noOpIn, new HashMap(), "NrcLine").get("NrcLine"));
    }
  }
/**
 *
 * Retrieves the NrcLineObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public NrcLineObjectData getOutput() {
    return NrcLineObjectHelper.fromMap(outputMap, "NrcLine");
  }
}
