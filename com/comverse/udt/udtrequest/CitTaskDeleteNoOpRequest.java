/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CitTaskDeleteNoOpRequest Udt Request/Response
 *
 */
public class CitTaskDeleteNoOpRequest extends CitTaskSubRequestParent {
/**
 *
 * Constructor to create a   CitTaskDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitTaskDeleteNoOpRequest(String id, CitTaskObjectBaseData noOpIn) {
    super(id, "CitTaskDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("CitTask", CitTaskObjectBaseHelper.toMap(noOpIn, new HashMap(), "CitTask").get("CitTask"));
    }
  }
/**
 *
 * Retrieves the CitTaskObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskObjectBaseData getOutput() {
    return CitTaskObjectBaseHelper.fromMap(outputMap, "CitTask");
  }
}
