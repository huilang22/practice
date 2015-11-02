/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageJurisdictionUpdateNoOpRequest.java
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
 * NoOp class used to simulate a UsageJurisdictionUpdateNoOpRequest Udt Request/Response
 *
 */
public class UsageJurisdictionUpdateNoOpRequest extends UsageJurisdictionSubRequestParent {
/**
 *
 * Constructor to create a   UsageJurisdictionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsageJurisdictionUpdateNoOpRequest(String id, UsageJurisdictionObjectData noOpIn) {
    super(id, "UsageJurisdictionUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("UsageJurisdiction", UsageJurisdictionObjectHelper.toMap(noOpIn, new HashMap(), "UsageJurisdiction").get("UsageJurisdiction"));
    }
  }
/**
 *
 * Retrieves the UsageJurisdictionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UsageJurisdictionObjectData getOutput() {
    return UsageJurisdictionObjectHelper.fromMap(outputMap, "UsageJurisdiction");
  }
}
