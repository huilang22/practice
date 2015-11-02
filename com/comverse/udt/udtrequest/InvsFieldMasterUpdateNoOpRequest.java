/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsFieldMasterUpdateNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsFieldMasterUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsFieldMasterUpdateNoOpRequest extends InvsFieldMasterSubRequestParent {
/**
 *
 * Constructor to create a   InvsFieldMasterUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsFieldMasterUpdateNoOpRequest(String id, InvsFieldMasterObjectData noOpIn) {
    super(id, "InvsFieldMasterUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsFieldMaster", InvsFieldMasterObjectHelper.toMap(noOpIn, new HashMap(), "InvsFieldMaster").get("InvsFieldMaster"));
    }
  }
/**
 *
 * Retrieves the InvsFieldMasterObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsFieldMasterObjectData getOutput() {
    return InvsFieldMasterObjectHelper.fromMap(outputMap, "InvsFieldMaster");
  }
}
