/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdApplicationGetNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationGetNoOpRequest extends BsdApplicationSubRequestParent {
/**
 *
 * Constructor to create a   BsdApplicationGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationGetNoOpRequest(String id, BsdApplicationObjectData noOpIn) {
    super(id, "BsdApplicationGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdApplication", BsdApplicationObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }
/**
 *
 * Retrieves the BsdApplicationObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationObjectData getOutput() {
    return BsdApplicationObjectHelper.fromMap(outputMap, "BsdApplication");
  }
}
