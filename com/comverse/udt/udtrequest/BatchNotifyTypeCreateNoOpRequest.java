/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyTypeCreateNoOpRequest.java
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
 * NoOp class used to simulate a BatchNotifyTypeCreateNoOpRequest Udt Request/Response
 *
 */
public class BatchNotifyTypeCreateNoOpRequest extends BatchNotifyTypeSubRequestParent {
/**
 *
 * Constructor to create a   BatchNotifyTypeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchNotifyTypeCreateNoOpRequest(String id, BatchNotifyTypeObjectData noOpIn) {
    super(id, "BatchNotifyTypeCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchNotifyType", BatchNotifyTypeObjectHelper.toMap(noOpIn, new HashMap(), "BatchNotifyType").get("BatchNotifyType"));
    }
  }
/**
 *
 * Retrieves the BatchNotifyTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchNotifyTypeObjectData getOutput() {
    return BatchNotifyTypeObjectHelper.fromMap(outputMap, "BatchNotifyType");
  }
}
