/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdConstraintDescriptionGetNoOpRequest Udt Request/Response
 *
 */
public class BsdConstraintDescriptionGetNoOpRequest extends BsdConstraintDescriptionSubRequestParent {
/**
 *
 * Constructor to create a   BsdConstraintDescriptionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdConstraintDescriptionGetNoOpRequest(String id, BsdConstraintDescriptionObjectData noOpIn) {
    super(id, "BsdConstraintDescriptionGetNoOpRequest");
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
