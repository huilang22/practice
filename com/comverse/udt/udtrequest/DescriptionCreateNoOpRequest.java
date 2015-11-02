/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DescriptionCreateNoOpRequest.java
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
 * NoOp class used to simulate a DescriptionCreateNoOpRequest Udt Request/Response
 *
 */
public class DescriptionCreateNoOpRequest extends DescriptionSubRequestParent {
/**
 *
 * Constructor to create a   DescriptionCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DescriptionCreateNoOpRequest(String id, DescriptionObjectData noOpIn) {
    super(id, "DescriptionCreateNoOpRequest");
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
