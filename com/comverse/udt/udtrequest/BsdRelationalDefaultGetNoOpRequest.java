/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdRelationalDefaultGetNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalDefaultGetNoOpRequest extends BsdRelationalDefaultSubRequestParent {
/**
 *
 * Constructor to create a   BsdRelationalDefaultGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalDefaultGetNoOpRequest(String id, BsdRelationalDefaultObjectData noOpIn) {
    super(id, "BsdRelationalDefaultGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectHelper.toMap(noOpIn, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }
/**
 *
 * Retrieves the BsdRelationalDefaultObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalDefaultObjectData getOutput() {
    return BsdRelationalDefaultObjectHelper.fromMap(outputMap, "BsdRelationalDefault");
  }
}
