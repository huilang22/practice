/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointTransTypeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BonusPointTransTypeUpdateNoOpRequest Udt Request/Response
 *
 */
public class BonusPointTransTypeUpdateNoOpRequest extends BonusPointTransTypeSubRequestParent {
/**
 *
 * Constructor to create a   BonusPointTransTypeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BonusPointTransTypeUpdateNoOpRequest(String id, BonusPointTransTypeObjectData noOpIn) {
    super(id, "BonusPointTransTypeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BonusPointTransType", BonusPointTransTypeObjectHelper.toMap(noOpIn, new HashMap(), "BonusPointTransType").get("BonusPointTransType"));
    }
  }
/**
 *
 * Retrieves the BonusPointTransTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BonusPointTransTypeObjectData getOutput() {
    return BonusPointTransTypeObjectHelper.fromMap(outputMap, "BonusPointTransType");
  }
}
