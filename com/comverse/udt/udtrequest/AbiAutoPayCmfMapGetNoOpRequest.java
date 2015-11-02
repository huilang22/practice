/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiAutoPayCmfMapGetNoOpRequest.java
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
 * NoOp class used to simulate a AbiAutoPayCmfMapGetNoOpRequest Udt Request/Response
 *
 */
public class AbiAutoPayCmfMapGetNoOpRequest extends AbiAutoPayCmfMapSubRequestParent {
/**
 *
 * Constructor to create a   AbiAutoPayCmfMapGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AbiAutoPayCmfMapGetNoOpRequest(String id, AbiAutoPayCmfMapObjectData noOpIn) {
    super(id, "AbiAutoPayCmfMapGetNoOpRequest");
    if (noOpIn != null) {
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectHelper.toMap(noOpIn, new HashMap(), "AbiAutoPayCmfMap").get("AbiAutoPayCmfMap"));
    }
  }
/**
 *
 * Retrieves the AbiAutoPayCmfMapObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public AbiAutoPayCmfMapObjectData getOutput() {
    return AbiAutoPayCmfMapObjectHelper.fromMap(outputMap, "AbiAutoPayCmfMap");
  }
}
