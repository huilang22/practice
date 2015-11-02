/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseUpdateNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ClearingHouseUpdateNoOpRequest Udt Request/Response
 *
 */
public class ClearingHouseUpdateNoOpRequest extends ClearingHouseSubRequestParent {
/**
 *
 * Constructor to create a   ClearingHouseUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ClearingHouseUpdateNoOpRequest(String id, ClearingHouseObjectData noOpIn) {
    super(id, "ClearingHouseUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ClearingHouse", ClearingHouseObjectHelper.toMap(noOpIn, new HashMap(), "ClearingHouse").get("ClearingHouse"));
    }
  }
/**
 *
 * Retrieves the ClearingHouseObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ClearingHouseObjectData getOutput() {
    return ClearingHouseObjectHelper.fromMap(outputMap, "ClearingHouse");
  }
}
