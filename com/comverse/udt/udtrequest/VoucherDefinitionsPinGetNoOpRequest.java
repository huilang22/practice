/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsPinGetNoOpRequest.java
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
 * NoOp class used to simulate a VoucherDefinitionsPinGetNoOpRequest Udt Request/Response
 *
 */
public class VoucherDefinitionsPinGetNoOpRequest extends VoucherDefinitionsSubRequestParent {
/**
 *
 * Constructor to create a   VoucherDefinitionsPinGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherDefinitionsPinGetNoOpRequest(String id, VoucherDefinitionsPinGetOutputData noOpIn) {
    super(id, "VoucherDefinitionsPinGetNoOpRequest");
    if (noOpIn != null) {
      addInput("VoucherDefinitionsPinGetOutputData", VoucherDefinitionsPinGetOutputHelper.toMap(noOpIn).get("VoucherDefinitionsPinGetOutputData"));
    }
  }
/**
 *
 * Retrieves the VoucherDefinitionsPinGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherDefinitionsPinGetOutputData getOutput() {
    return VoucherDefinitionsPinGetOutputHelper.fromMap(outputMap);
  }
}
