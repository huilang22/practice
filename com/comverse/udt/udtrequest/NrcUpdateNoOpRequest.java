/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcUpdateNoOpRequest.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a NrcUpdateNoOpRequest Udt Request/Response
 *
 */
public class NrcUpdateNoOpRequest extends NrcSubRequestParent {
/**
 *
 * Constructor to create a   NrcUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcUpdateNoOpRequest(String id, NrcObjectBaseData noOpIn) {
    super(id, "NrcUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(noOpIn, new HashMap(), "Nrc").get("Nrc"));
    }
  }
/**
 *
 * Retrieves the NrcObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public NrcObjectBaseData getOutput() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
  }
}
