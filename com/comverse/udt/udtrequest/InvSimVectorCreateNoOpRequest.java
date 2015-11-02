/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimVectorCreateNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvSimVectorCreateNoOpRequest Udt Request/Response
 *
 */
public class InvSimVectorCreateNoOpRequest extends InvSimVectorSubRequestParent {
/**
 *
 * Constructor to create a   InvSimVectorCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvSimVectorCreateNoOpRequest(String id, InvSimVectorCreateOutputData noOpIn) {
    super(id, "InvSimVectorCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvSimVectorCreateOutputData", InvSimVectorCreateOutputHelper.toMap(noOpIn).get("InvSimVectorCreateOutputData"));
    }
  }
/**
 *
 * Retrieves the InvSimVectorCreateOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvSimVectorCreateOutputData getOutput() {
    return InvSimVectorCreateOutputHelper.fromMap(outputMap);
  }
}
