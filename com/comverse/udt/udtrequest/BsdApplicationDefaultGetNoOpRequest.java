/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationDefaultGetNoOpRequest.java
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

import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdApplicationDefaultGetNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationDefaultGetNoOpRequest extends BsdApplicationDefaultSubRequestParent {
/**
 *
 * Constructor to create a   BsdApplicationDefaultGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationDefaultGetNoOpRequest(String id, BsdApplicationDefaultObjectData noOpIn) {
    super(id, "BsdApplicationDefaultGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdApplicationDefault", BsdApplicationDefaultObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplicationDefault").get("BsdApplicationDefault"));
    }
  }
/**
 *
 * Retrieves the BsdApplicationDefaultObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationDefaultObjectData getOutput() {
    return BsdApplicationDefaultObjectHelper.fromMap(outputMap, "BsdApplicationDefault");
  }
}
