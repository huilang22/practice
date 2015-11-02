/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTemplateTypeGetNoOpRequest.java
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

import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchTemplateTypeGetNoOpRequest Udt Request/Response
 *
 */
public class BatchTemplateTypeGetNoOpRequest extends BatchTemplateTypeSubRequestParent {
/**
 *
 * Constructor to create a   BatchTemplateTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchTemplateTypeGetNoOpRequest(String id, BatchTemplateTypeObjectData noOpIn) {
    super(id, "BatchTemplateTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchTemplateType", BatchTemplateTypeObjectHelper.toMap(noOpIn, new HashMap(), "BatchTemplateType").get("BatchTemplateType"));
    }
  }
/**
 *
 * Retrieves the BatchTemplateTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTemplateTypeObjectData getOutput() {
    return BatchTemplateTypeObjectHelper.fromMap(outputMap, "BatchTemplateType");
  }
}
