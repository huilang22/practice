/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyEventTypeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BatchNotifyEventTypeUpdateNoOpRequest Udt Request/Response
 *
 */
public class BatchNotifyEventTypeUpdateNoOpRequest extends BatchNotifyEventTypeSubRequestParent {
/**
 *
 * Constructor to create a   BatchNotifyEventTypeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchNotifyEventTypeUpdateNoOpRequest(String id, BatchNotifyEventTypeObjectData noOpIn) {
    super(id, "BatchNotifyEventTypeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectHelper.toMap(noOpIn, new HashMap(), "BatchNotifyEventType").get("BatchNotifyEventType"));
    }
  }
/**
 *
 * Retrieves the BatchNotifyEventTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchNotifyEventTypeObjectData getOutput() {
    return BatchNotifyEventTypeObjectHelper.fromMap(outputMap, "BatchNotifyEventType");
  }
}
