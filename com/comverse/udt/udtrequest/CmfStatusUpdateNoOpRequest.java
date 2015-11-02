/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CmfStatusUpdateNoOpRequest Udt Request/Response
 *
 */
public class CmfStatusUpdateNoOpRequest extends CmfStatusSubRequestParent {
/**
 *
 * Constructor to create a   CmfStatusUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CmfStatusUpdateNoOpRequest(String id, CmfStatusObjectData noOpIn) {
    super(id, "CmfStatusUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("CmfStatus", CmfStatusObjectHelper.toMap(noOpIn, new HashMap(), "CmfStatus").get("CmfStatus"));
    }
  }
/**
 *
 * Retrieves the CmfStatusObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CmfStatusObjectData getOutput() {
    return CmfStatusObjectHelper.fromMap(outputMap, "CmfStatus");
  }
}
