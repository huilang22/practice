/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionRetrieveNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestTemplateDefinitionRetrieveNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestTemplateDefinitionRetrieveNoOpRequest extends BatchRequestTemplateDefinitionRequest {
/**
 *
 * Constructor to create a   BatchRequestTemplateDefinitionRetrieveNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestTemplateDefinitionRetrieveNoOpRequest(String id, Object noOpIn) {
    super(id, "BatchRequestTemplateDefinitionRetrieveNoOpRequest");
    if (noOpIn != null) {
      addInput("Template", noOpIn);
    }
  }
/**
 *
 * Retrieves the Object passed into the constructor
 * @return Simulated response
 *
 */
  public Object getOutput() {
    return  (Object)outputMap.get("Template");
  }
}
