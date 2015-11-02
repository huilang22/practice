/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchCategorySequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchCategorySequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BatchCategorySequenceGetNoOpRequest extends BatchCategorySubRequestParent {
/**
 *
 * Constructor to create a   BatchCategorySequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchCategorySequenceGetNoOpRequest(String id, BatchCategoryObjectKeyData noOpIn) {
    super(id, "BatchCategorySequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchCategory", BatchCategoryObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchCategory").get("BatchCategory"));
    }
  }
/**
 *
 * Retrieves the BatchCategoryObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchCategoryObjectKeyData getOutput() {
    return BatchCategoryObjectKeyHelper.fromMap(outputMap, "BatchCategory");
  }
}
