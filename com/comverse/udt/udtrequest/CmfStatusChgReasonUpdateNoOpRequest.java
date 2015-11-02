/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusChgReasonUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CmfStatusChgReasonUpdateNoOpRequest Udt Request/Response
 *
 */
public class CmfStatusChgReasonUpdateNoOpRequest extends CmfStatusChgReasonSubRequestParent {
/**
 *
 * Constructor to create a   CmfStatusChgReasonUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CmfStatusChgReasonUpdateNoOpRequest(String id, CmfStatusChgReasonObjectData noOpIn) {
    super(id, "CmfStatusChgReasonUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectHelper.toMap(noOpIn, new HashMap(), "CmfStatusChgReason").get("CmfStatusChgReason"));
    }
  }
/**
 *
 * Retrieves the CmfStatusChgReasonObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CmfStatusChgReasonObjectData getOutput() {
    return CmfStatusChgReasonObjectHelper.fromMap(outputMap, "CmfStatusChgReason");
  }
}
