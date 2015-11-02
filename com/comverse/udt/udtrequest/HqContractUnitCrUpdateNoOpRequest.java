/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqContractUnitCrUpdateNoOpRequest.java
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
 * NoOp class used to simulate a HqContractUnitCrUpdateNoOpRequest Udt Request/Response
 *
 */
public class HqContractUnitCrUpdateNoOpRequest extends HqContractUnitCrSubRequestParent {
/**
 *
 * Constructor to create a   HqContractUnitCrUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqContractUnitCrUpdateNoOpRequest(String id, HqContractUnitCrObjectData noOpIn) {
    super(id, "HqContractUnitCrUpdateNoOpRequest");
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
