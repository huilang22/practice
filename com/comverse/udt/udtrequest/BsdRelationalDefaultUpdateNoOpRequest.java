/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BsdRelationalDefaultUpdateNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalDefaultUpdateNoOpRequest extends BsdRelationalDefaultSubRequestParent {
/**
 *
 * Constructor to create a   BsdRelationalDefaultUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalDefaultUpdateNoOpRequest(String id, BsdRelationalDefaultObjectBaseData noOpIn) {
    super(id, "BsdRelationalDefaultUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseHelper.toMap(noOpIn, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }
/**
 *
 * Retrieves the BsdRelationalDefaultObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalDefaultObjectBaseData getOutput() {
    return BsdRelationalDefaultObjectBaseHelper.fromMap(outputMap, "BsdRelationalDefault");
  }
}
