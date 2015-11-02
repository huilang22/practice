/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillModeOverrideGetNoOpRequest.java
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
 * NoOp class used to simulate a BillModeOverrideGetNoOpRequest Udt Request/Response
 *
 */
public class BillModeOverrideGetNoOpRequest extends BillModeOverrideSubRequestParent {
/**
 *
 * Constructor to create a   BillModeOverrideGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillModeOverrideGetNoOpRequest(String id, BMOObjectData noOpIn) {
    super(id, "BillModeOverrideGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BillModeOverride", BMOObjectHelper.toMap(noOpIn, new HashMap(), "BillModeOverride").get("BillModeOverride"));
    }
  }
/**
 *
 * Retrieves the BMOObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BMOObjectData getOutput() {
    return BMOObjectHelper.fromMap(outputMap, "BillModeOverride");
  }
}
