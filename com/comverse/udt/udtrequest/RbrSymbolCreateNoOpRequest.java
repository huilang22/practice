/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrSymbolCreateNoOpRequest.java
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
 * NoOp class used to simulate a RbrSymbolCreateNoOpRequest Udt Request/Response
 *
 */
public class RbrSymbolCreateNoOpRequest extends RbrSymbolSubRequestParent {
/**
 *
 * Constructor to create a   RbrSymbolCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrSymbolCreateNoOpRequest(String id, RbrSymbolObjectData noOpIn) {
    super(id, "RbrSymbolCreateNoOpRequest");
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
