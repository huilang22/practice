/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WriteoffGetNoOpRequest.java
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
 * NoOp class used to simulate a WriteoffGetNoOpRequest Udt Request/Response
 *
 */
public class WriteoffGetNoOpRequest extends WriteoffSubRequestParent {
/**
 *
 * Constructor to create a   WriteoffGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public WriteoffGetNoOpRequest(String id, WriteoffObjectData noOpIn) {
    super(id, "WriteoffGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Writeoff", WriteoffObjectHelper.toMap(noOpIn, new HashMap(), "Writeoff").get("Writeoff"));
    }
  }
/**
 *
 * Retrieves the WriteoffObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public WriteoffObjectData getOutput() {
    return WriteoffObjectHelper.fromMap(outputMap, "Writeoff");
  }
}
