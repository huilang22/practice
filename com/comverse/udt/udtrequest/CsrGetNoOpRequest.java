/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGetNoOpRequest.java
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
 * NoOp class used to simulate a CsrGetNoOpRequest Udt Request/Response
 *
 */
public class CsrGetNoOpRequest extends CsrSubRequestParent {
/**
 *
 * Constructor to create a   CsrGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CsrGetNoOpRequest(String id, CsrObjectData noOpIn) {
    super(id, "CsrGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Csr", CsrObjectHelper.toMap(noOpIn, new HashMap(), "Csr").get("Csr"));
    }
  }
/**
 *
 * Retrieves the CsrObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CsrObjectData getOutput() {
    return CsrObjectHelper.fromMap(outputMap, "Csr");
  }
}
