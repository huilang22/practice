/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchNotifyTypeGetNoOpRequest Udt Request/Response
 *
 */
public class BatchNotifyTypeGetNoOpRequest extends BatchNotifyTypeSubRequestParent {
/**
 *
 * Constructor to create a   BatchNotifyTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchNotifyTypeGetNoOpRequest(String id, BatchNotifyTypeObjectData noOpIn) {
    super(id, "BatchNotifyTypeGetNoOpRequest");
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
