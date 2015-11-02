/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdExceptionDeleteNoOpRequest.java
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

import com.csgsystems.sfq.data.*;

/**
 *
 * NoOp class used to simulate a BsdExceptionDeleteNoOpRequest Udt Request/Response
 *
 */
public class BsdExceptionDeleteNoOpRequest extends BsdExceptionSubRequestParent {
/**
 *
 * Constructor to create a   BsdExceptionDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdExceptionDeleteNoOpRequest(String id, BsdExceptionObjectData noOpIn) {
    super(id, "BsdExceptionDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdException", BsdExceptionObjectHelper.toMap(noOpIn, new HashMap(), "BsdException").get("BsdException"));
    }
  }
/**
 *
 * Retrieves the BsdExceptionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdExceptionObjectData getOutput() {
    return BsdExceptionObjectHelper.fromMap(outputMap, "BsdException");
  }
}
