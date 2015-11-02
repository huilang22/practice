/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionUdtGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestTemplateDefinitionUdtGetNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestTemplateDefinitionUdtGetNoOpRequest extends BatchRequestTemplateDefinitionRequest {
/**
 *
 * Constructor to create a   BatchRequestTemplateDefinitionUdtGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestTemplateDefinitionUdtGetNoOpRequest(String id, BulkUdtTemplateRootRequest noOpIn) {
    super(id, "BatchRequestTemplateDefinitionUdtGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestTemplateDefinitionUdtGetOutUdtTemplateData", noOpIn);
    }
  }
/**
 *
 * Retrieves the BulkUdtTemplateRootRequest passed into the constructor
 * @return Simulated response
 *
 */
  public BulkUdtTemplateRootRequest getOutput() {
    return  (BulkUdtTemplateRootRequest)outputMap.get("BatchRequestTemplateDefinitionUdtGetOutUdtTemplateData");
  }
}
