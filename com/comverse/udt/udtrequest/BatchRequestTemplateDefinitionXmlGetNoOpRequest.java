/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestTemplateDefinitionXmlGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchRequestTemplateDefinitionXmlGetNoOpRequest Udt Request/Response
 *
 */
public class BatchRequestTemplateDefinitionXmlGetNoOpRequest extends BatchRequestTemplateDefinitionRequest {
/**
 *
 * Constructor to create a   BatchRequestTemplateDefinitionXmlGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchRequestTemplateDefinitionXmlGetNoOpRequest(String id, String noOpIn) {
    super(id, "BatchRequestTemplateDefinitionXmlGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchRequestTemplateDefinitionXmlGetOutXmlFile", noOpIn);
    }
  }
/**
 *
 * Retrieves the String passed into the constructor
 * @return Simulated response
 *
 */
  public String getOutput() {
    return  (String)outputMap.get("BatchRequestTemplateDefinitionXmlGetOutXmlFile");
  }
}
