/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationRelationalDefaultGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdApplicationRelationalDefaultGetNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationRelationalDefaultGetNoOpRequest extends BsdApplicationRelationalDefaultSubRequestParent {
/**
 *
 * Constructor to create a   BsdApplicationRelationalDefaultGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationRelationalDefaultGetNoOpRequest(String id, BsdApplicationRelationalDefaultObjectData noOpIn) {
    super(id, "BsdApplicationRelationalDefaultGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdApplicationRelationalDefault", BsdApplicationRelationalDefaultObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplicationRelationalDefault").get("BsdApplicationRelationalDefault"));
    }
  }
/**
 *
 * Retrieves the BsdApplicationRelationalDefaultObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationRelationalDefaultObjectData getOutput() {
    return BsdApplicationRelationalDefaultObjectHelper.fromMap(outputMap, "BsdApplicationRelationalDefault");
  }
}
