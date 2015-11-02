/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeValidateCreateNoOpRequest.java
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
 * NoOp class used to simulate a ExternalIdTypeValidateCreateNoOpRequest Udt Request/Response
 *
 */
public class ExternalIdTypeValidateCreateNoOpRequest extends ExternalIdTypeValidateSubRequestParent {
/**
 *
 * Constructor to create a   ExternalIdTypeValidateCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExternalIdTypeValidateCreateNoOpRequest(String id, ExternalIdTypeObjectData noOpIn) {
    super(id, "ExternalIdTypeValidateCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ExternalIdTypeValidate", ExternalIdTypeObjectHelper.toMap(noOpIn, new HashMap(), "ExternalIdTypeValidate").get("ExternalIdTypeValidate"));
    }
  }
/**
 *
 * Retrieves the ExternalIdTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ExternalIdTypeObjectData getOutput() {
    return ExternalIdTypeObjectHelper.fromMap(outputMap, "ExternalIdTypeValidate");
  }
}
