/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointRateCreateNoOpRequest.java
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
 * NoOp class used to simulate a BonusPointRateCreateNoOpRequest Udt Request/Response
 *
 */
public class BonusPointRateCreateNoOpRequest extends BonusPointRateSubRequestParent {
/**
 *
 * Constructor to create a   BonusPointRateCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BonusPointRateCreateNoOpRequest(String id, BonusPointRateObjectData noOpIn) {
    super(id, "BonusPointRateCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("BonusPointRate", BonusPointRateObjectHelper.toMap(noOpIn, new HashMap(), "BonusPointRate").get("BonusPointRate"));
    }
  }
/**
 *
 * Retrieves the BonusPointRateObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BonusPointRateObjectData getOutput() {
    return BonusPointRateObjectHelper.fromMap(outputMap, "BonusPointRate");
  }
}
