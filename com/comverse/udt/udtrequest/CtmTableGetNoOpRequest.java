/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmTableGetNoOpRequest.java
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
 * NoOp class used to simulate a CtmTableGetNoOpRequest Udt Request/Response
 *
 */
public class CtmTableGetNoOpRequest extends CtmTableSubRequestParent {
/**
 *
 * Constructor to create a   CtmTableGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtmTableGetNoOpRequest(String id, CtmTableObjectData noOpIn) {
    super(id, "CtmTableGetNoOpRequest");
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
