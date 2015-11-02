/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointIdDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BonusPointIdDeleteNoOpRequest Udt Request/Response
 *
 */
public class BonusPointIdDeleteNoOpRequest extends BonusPointIdSubRequestParent {
/**
 *
 * Constructor to create a   BonusPointIdDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BonusPointIdDeleteNoOpRequest(String id, BPIObjectData noOpIn) {
    super(id, "BonusPointIdDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BonusPointId", BPIObjectHelper.toMap(noOpIn, new HashMap(), "BonusPointId").get("BonusPointId"));
    }
  }
/**
 *
 * Retrieves the BPIObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BPIObjectData getOutput() {
    return BPIObjectHelper.fromMap(outputMap, "BonusPointId");
  }
}
