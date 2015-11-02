/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcLineCreateNoOpRequest.java
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
 * NoOp class used to simulate a NrcLineCreateNoOpRequest Udt Request/Response
 *
 */
public class NrcLineCreateNoOpRequest extends NrcLineSubRequestParent {
/**
 *
 * Constructor to create a   NrcLineCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcLineCreateNoOpRequest(String id, NrcLineObjectData noOpIn) {
    super(id, "NrcLineCreateNoOpRequest");
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
