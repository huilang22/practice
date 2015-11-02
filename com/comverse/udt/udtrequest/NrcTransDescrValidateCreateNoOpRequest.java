/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrValidateCreateNoOpRequest.java
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
 * NoOp class used to simulate a NrcTransDescrValidateCreateNoOpRequest Udt Request/Response
 *
 */
public class NrcTransDescrValidateCreateNoOpRequest extends NrcTransDescrValidateSubRequestParent {
/**
 *
 * Constructor to create a   NrcTransDescrValidateCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NrcTransDescrValidateCreateNoOpRequest(String id, NrcTransDescrObjectData noOpIn) {
    super(id, "NrcTransDescrValidateCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("NrcTransDescrValidate", NrcTransDescrObjectHelper.toMap(noOpIn, new HashMap(), "NrcTransDescrValidate").get("NrcTransDescrValidate"));
    }
  }
/**
 *
 * Retrieves the NrcTransDescrObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public NrcTransDescrObjectData getOutput() {
    return NrcTransDescrObjectHelper.fromMap(outputMap, "NrcTransDescrValidate");
  }
}
