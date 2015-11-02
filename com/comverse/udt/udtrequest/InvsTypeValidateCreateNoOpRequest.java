/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeValidateCreateNoOpRequest.java
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

import com.csgsystems.cf.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a InvsTypeValidateCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsTypeValidateCreateNoOpRequest extends InvsTypeValidateSubRequestParent {
/**
 *
 * Constructor to create a   InvsTypeValidateCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsTypeValidateCreateNoOpRequest(String id, InvsTypeObjectData noOpIn) {
    super(id, "InvsTypeValidateCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsTypeValidate", InvsTypeObjectHelper.toMap(noOpIn, new HashMap(), "InvsTypeValidate").get("InvsTypeValidate"));
    }
  }
/**
 *
 * Retrieves the InvsTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypeObjectData getOutput() {
    return InvsTypeObjectHelper.fromMap(outputMap, "InvsTypeValidate");
  }
}
