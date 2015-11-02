/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DescriptionUpdateNoOpRequest.java
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
 * NoOp class used to simulate a DescriptionUpdateNoOpRequest Udt Request/Response
 *
 */
public class DescriptionUpdateNoOpRequest extends DescriptionSubRequestParent {
/**
 *
 * Constructor to create a   DescriptionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DescriptionUpdateNoOpRequest(String id, DescriptionObjectData noOpIn) {
    super(id, "DescriptionUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Description", DescriptionObjectHelper.toMap(noOpIn, new HashMap(), "Description").get("Description"));
    }
  }
/**
 *
 * Retrieves the DescriptionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public DescriptionObjectData getOutput() {
    return DescriptionObjectHelper.fromMap(outputMap, "Description");
  }
}
