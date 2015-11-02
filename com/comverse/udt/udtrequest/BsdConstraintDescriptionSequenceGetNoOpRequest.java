/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdConstraintDescriptionSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdConstraintDescriptionSequenceGetNoOpRequest extends BsdConstraintDescriptionSubRequestParent {
/**
 *
 * Constructor to create a   BsdConstraintDescriptionSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdConstraintDescriptionSequenceGetNoOpRequest(String id, BsdConstraintDescriptionObjectKeyData noOpIn) {
    super(id, "BsdConstraintDescriptionSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdConstraintDescription", BsdConstraintDescriptionObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdConstraintDescription").get("BsdConstraintDescription"));
    }
  }
/**
 *
 * Retrieves the BsdConstraintDescriptionObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdConstraintDescriptionObjectKeyData getOutput() {
    return BsdConstraintDescriptionObjectKeyHelper.fromMap(outputMap, "BsdConstraintDescription");
  }
}
