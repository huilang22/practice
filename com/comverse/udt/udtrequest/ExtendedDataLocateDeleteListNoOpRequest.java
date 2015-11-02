/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataLocateDeleteListNoOpRequest.java
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
 * NoOp class used to simulate a ExtendedDataLocateDeleteListNoOpRequest Udt Request/Response
 *
 */
public class ExtendedDataLocateDeleteListNoOpRequest extends ExtendedDataLocateSubRequestParent {
/**
 *
 * Constructor to create a   ExtendedDataLocateDeleteListNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExtendedDataLocateDeleteListNoOpRequest(String id, ExtendedDataLocateObjectData noOpIn) {
    super(id, "ExtendedDataLocateDeleteListNoOpRequest");
    if (noOpIn != null) {
      addInput("ExtendedDataLocate", ExtendedDataLocateObjectHelper.toMap(noOpIn, new HashMap(), "ExtendedDataLocate").get("ExtendedDataLocate"));
    }
  }
/**
 *
 * Retrieves the ExtendedDataLocateObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ExtendedDataLocateObjectData getOutput() {
    return ExtendedDataLocateObjectHelper.fromMap(outputMap, "ExtendedDataLocate");
  }
}
