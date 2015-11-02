/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChangePasswordNoOpRequest.java
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

import com.csgsystems.sec.data.*;

/**
 *
 * NoOp class used to simulate a ChangePasswordNoOpRequest Udt Request/Response
 *
 */
public class ChangePasswordNoOpRequest extends SecurityRequest {
/**
 *
 * Constructor to create a   ChangePasswordNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ChangePasswordNoOpRequest(String id, Boolean noOpIn) {
    super(id, "ChangePasswordNoOpRequest");
    if (noOpIn != null) {
      addInput("PasswordChanged", noOpIn);
    }
  }
/**
 *
 * Retrieves the Boolean passed into the constructor
 * @return Simulated response
 *
 */
  public Boolean getOutput() {
    return  (Boolean)outputMap.get("PasswordChanged");
  }
}
