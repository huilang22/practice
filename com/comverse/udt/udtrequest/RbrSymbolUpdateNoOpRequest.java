/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrSymbolUpdateNoOpRequest.java
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
 * NoOp class used to simulate a RbrSymbolUpdateNoOpRequest Udt Request/Response
 *
 */
public class RbrSymbolUpdateNoOpRequest extends RbrSymbolSubRequestParent {
/**
 *
 * Constructor to create a   RbrSymbolUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrSymbolUpdateNoOpRequest(String id, RbrSymbolObjectData noOpIn) {
    super(id, "RbrSymbolUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("RbrSymbol", RbrSymbolObjectHelper.toMap(noOpIn, new HashMap(), "RbrSymbol").get("RbrSymbol"));
    }
  }
/**
 *
 * Retrieves the RbrSymbolObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RbrSymbolObjectData getOutput() {
    return RbrSymbolObjectHelper.fromMap(outputMap, "RbrSymbol");
  }
}
