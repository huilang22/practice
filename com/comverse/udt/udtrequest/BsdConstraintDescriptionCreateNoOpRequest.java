/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionCreateNoOpRequest.java
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

import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdConstraintDescriptionCreateNoOpRequest Udt Request/Response
 *
 */
public class BsdConstraintDescriptionCreateNoOpRequest extends BsdConstraintDescriptionSubRequestParent {
/**
 *
 * Constructor to create a   BsdConstraintDescriptionCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdConstraintDescriptionCreateNoOpRequest(String id, BsdConstraintDescriptionObjectData noOpIn) {
    super(id, "BsdConstraintDescriptionCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectHelper.toMap(noOpIn, new HashMap(), "BsdConstraintDescription").get("BsdConstraintDescription"));
    }
  }
/**
 *
 * Retrieves the BsdConstraintDescriptionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdConstraintDescriptionObjectData getOutput() {
    return BsdConstraintDescriptionObjectHelper.fromMap(outputMap, "BsdConstraintDescription");
  }
}
