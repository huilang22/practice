/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceSequenceGetNoOpRequest.java
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

import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitImportanceSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class CitImportanceSequenceGetNoOpRequest extends CitImportanceSubRequestParent {
/**
 *
 * Constructor to create a   CitImportanceSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitImportanceSequenceGetNoOpRequest(String id, CitImportanceObjectKeyData noOpIn) {
    super(id, "CitImportanceSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CitImportance", CitImportanceObjectKeyHelper.toMap(noOpIn, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }
/**
 *
 * Retrieves the CitImportanceObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public CitImportanceObjectKeyData getOutput() {
    return CitImportanceObjectKeyHelper.fromMap(outputMap, "CitImportance");
  }
}
