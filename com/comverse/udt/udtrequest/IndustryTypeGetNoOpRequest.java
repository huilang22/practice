/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * IndustryTypeGetNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a IndustryTypeGetNoOpRequest Udt Request/Response
 *
 */
public class IndustryTypeGetNoOpRequest extends IndustryTypeSubRequestParent {
/**
 *
 * Constructor to create a   IndustryTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public IndustryTypeGetNoOpRequest(String id, IndustryTypeObjectData noOpIn) {
    super(id, "IndustryTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("IndustryType", IndustryTypeObjectHelper.toMap(noOpIn, new HashMap(), "IndustryType").get("IndustryType"));
    }
  }
/**
 *
 * Retrieves the IndustryTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public IndustryTypeObjectData getOutput() {
    return IndustryTypeObjectHelper.fromMap(outputMap, "IndustryType");
  }
}
