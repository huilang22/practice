/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyEventTypeDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BatchNotifyEventTypeDeleteNoOpRequest Udt Request/Response
 *
 */
public class BatchNotifyEventTypeDeleteNoOpRequest extends BatchNotifyEventTypeSubRequestParent {
/**
 *
 * Constructor to create a   BatchNotifyEventTypeDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchNotifyEventTypeDeleteNoOpRequest(String id, BatchNotifyEventTypeObjectData noOpIn) {
    super(id, "BatchNotifyEventTypeDeleteNoOpRequest");
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
