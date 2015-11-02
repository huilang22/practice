/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DescriptionGetNoOpRequest.java
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
 * NoOp class used to simulate a DescriptionGetNoOpRequest Udt Request/Response
 *
 */
public class DescriptionGetNoOpRequest extends DescriptionSubRequestParent {
/**
 *
 * Constructor to create a   DescriptionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DescriptionGetNoOpRequest(String id, DescriptionObjectData noOpIn) {
    super(id, "DescriptionGetNoOpRequest");
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
