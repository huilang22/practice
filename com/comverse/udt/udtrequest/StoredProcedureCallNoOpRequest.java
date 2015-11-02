/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StoredProcedureCallNoOpRequest.java
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

import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a StoredProcedureCallNoOpRequest Udt Request/Response
 *
 */
public class StoredProcedureCallNoOpRequest extends StoredProcedureRequest {
/**
 *
 * Constructor to create a   StoredProcedureCallNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StoredProcedureCallNoOpRequest(String id, Map[] noOpIn) {
    super(id, "StoredProcedureCallNoOpRequest");
    if (noOpIn != null) {
      addInput("StoredProcedureResult", noOpIn);
    }
  }
/**
 *
 * Retrieves the Map[] passed into the constructor
 * @return Simulated response
 *
 */
  public Map[] getOutput() {
    return  (Map[])outputMap.get("StoredProcedureResult");
  }
}
