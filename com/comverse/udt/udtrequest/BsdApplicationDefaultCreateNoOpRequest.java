/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationDefaultCreateNoOpRequest.java
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
 * NoOp class used to simulate a BsdApplicationDefaultCreateNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationDefaultCreateNoOpRequest extends BsdApplicationDefaultSubRequestParent {
/**
 *
 * Constructor to create a   BsdApplicationDefaultCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationDefaultCreateNoOpRequest(String id, BsdApplicationDefaultObjectData noOpIn) {
    super(id, "BsdApplicationDefaultCreateNoOpRequest");
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
