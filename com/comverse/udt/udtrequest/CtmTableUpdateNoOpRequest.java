/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmTableUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CtmTableUpdateNoOpRequest Udt Request/Response
 *
 */
public class CtmTableUpdateNoOpRequest extends CtmTableSubRequestParent {
/**
 *
 * Constructor to create a   CtmTableUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtmTableUpdateNoOpRequest(String id, CtmTableObjectData noOpIn) {
    super(id, "CtmTableUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtmTable", CtmTableObjectHelper.toMap(noOpIn, new HashMap(), "CtmTable").get("CtmTable"));
    }
  }
/**
 *
 * Retrieves the CtmTableObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtmTableObjectData getOutput() {
    return CtmTableObjectHelper.fromMap(outputMap, "CtmTable");
  }
}
