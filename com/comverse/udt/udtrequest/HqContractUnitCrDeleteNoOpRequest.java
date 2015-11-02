/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqContractUnitCrDeleteNoOpRequest.java
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
 * NoOp class used to simulate a HqContractUnitCrDeleteNoOpRequest Udt Request/Response
 *
 */
public class HqContractUnitCrDeleteNoOpRequest extends HqContractUnitCrSubRequestParent {
/**
 *
 * Constructor to create a   HqContractUnitCrDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqContractUnitCrDeleteNoOpRequest(String id, HqContractUnitCrObjectData noOpIn) {
    super(id, "HqContractUnitCrDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("HqContractUnitCr", HqContractUnitCrObjectHelper.toMap(noOpIn, new HashMap(), "HqContractUnitCr").get("HqContractUnitCr"));
    }
  }
/**
 *
 * Retrieves the HqContractUnitCrObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public HqContractUnitCrObjectData getOutput() {
    return HqContractUnitCrObjectHelper.fromMap(outputMap, "HqContractUnitCr");
  }
}
