/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdBusinessUnitDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BsdBusinessUnitDeleteNoOpRequest Udt Request/Response
 *
 */
public class BsdBusinessUnitDeleteNoOpRequest extends BsdBusinessUnitSubRequestParent {
/**
 *
 * Constructor to create a   BsdBusinessUnitDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdBusinessUnitDeleteNoOpRequest(String id, BsdBusinessUnitObjectData noOpIn) {
    super(id, "BsdBusinessUnitDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectHelper.toMap(noOpIn, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }
/**
 *
 * Retrieves the BsdBusinessUnitObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdBusinessUnitObjectData getOutput() {
    return BsdBusinessUnitObjectHelper.fromMap(outputMap, "BsdBusinessUnit");
  }
}
