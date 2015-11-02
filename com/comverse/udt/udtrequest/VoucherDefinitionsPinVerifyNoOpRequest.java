/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsPinVerifyNoOpRequest.java
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
 * NoOp class used to simulate a VoucherDefinitionsPinVerifyNoOpRequest Udt Request/Response
 *
 */
public class VoucherDefinitionsPinVerifyNoOpRequest extends VoucherDefinitionsRequest {
/**
 *
 * Constructor to create a   VoucherDefinitionsPinVerifyNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherDefinitionsPinVerifyNoOpRequest(String id, BigInteger noOpIn) {
    super(id, "VoucherDefinitionsPinVerifyNoOpRequest");
    if (noOpIn != null) {
      addInput("Ret", noOpIn);
    }
  }
/**
 *
 * Retrieves the BigInteger passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getOutput() {
    return  (BigInteger)outputMap.get("Ret");
  }
}
