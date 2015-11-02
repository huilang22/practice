/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxTypeCommGetNoOpRequest.java
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
 * NoOp class used to simulate a TaxTypeCommGetNoOpRequest Udt Request/Response
 *
 */
public class TaxTypeCommGetNoOpRequest extends TaxTypeCommSubRequestParent {
/**
 *
 * Constructor to create a   TaxTypeCommGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TaxTypeCommGetNoOpRequest(String id, TTCObjectData noOpIn) {
    super(id, "TaxTypeCommGetNoOpRequest");
    if (noOpIn != null) {
      addInput("TaxTypeComm", TTCObjectHelper.toMap(noOpIn, new HashMap(), "TaxTypeComm").get("TaxTypeComm"));
    }
  }
/**
 *
 * Retrieves the TTCObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public TTCObjectData getOutput() {
    return TTCObjectHelper.fromMap(outputMap, "TaxTypeComm");
  }
}
