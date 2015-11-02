/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillModeOverrideUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BillModeOverrideUpdateNoOpRequest Udt Request/Response
 *
 */
public class BillModeOverrideUpdateNoOpRequest extends BillModeOverrideSubRequestParent {
/**
 *
 * Constructor to create a   BillModeOverrideUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillModeOverrideUpdateNoOpRequest(String id, BMOObjectData noOpIn) {
    super(id, "BillModeOverrideUpdateNoOpRequest");
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
