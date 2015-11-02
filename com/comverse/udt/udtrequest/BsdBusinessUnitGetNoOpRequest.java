/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdBusinessUnitGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdBusinessUnitGetNoOpRequest Udt Request/Response
 *
 */
public class BsdBusinessUnitGetNoOpRequest extends BsdBusinessUnitSubRequestParent {
/**
 *
 * Constructor to create a   BsdBusinessUnitGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdBusinessUnitGetNoOpRequest(String id, BsdBusinessUnitObjectData noOpIn) {
    super(id, "BsdBusinessUnitGetNoOpRequest");
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
