/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchCategoryGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchCategoryGetNoOpRequest Udt Request/Response
 *
 */
public class BatchCategoryGetNoOpRequest extends BatchCategorySubRequestParent {
/**
 *
 * Constructor to create a   BatchCategoryGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchCategoryGetNoOpRequest(String id, BatchCategoryObjectData noOpIn) {
    super(id, "BatchCategoryGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchCategory", BatchCategoryObjectHelper.toMap(noOpIn, new HashMap(), "BatchCategory").get("BatchCategory"));
    }
  }
/**
 *
 * Retrieves the BatchCategoryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchCategoryObjectData getOutput() {
    return BatchCategoryObjectHelper.fromMap(outputMap, "BatchCategory");
  }
}
