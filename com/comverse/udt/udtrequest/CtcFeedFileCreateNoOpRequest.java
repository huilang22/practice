/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFeedFileCreateNoOpRequest.java
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

import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcFeedFileCreateNoOpRequest Udt Request/Response
 *
 */
public class CtcFeedFileCreateNoOpRequest extends CtcFeedFileSubRequestParent {
/**
 *
 * Constructor to create a   CtcFeedFileCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcFeedFileCreateNoOpRequest(String id, CtcFeedFileObjectData noOpIn) {
    super(id, "CtcFeedFileCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcFeedFile", CtcFeedFileObjectHelper.toMap(noOpIn, new HashMap(), "CtcFeedFile").get("CtcFeedFile"));
    }
  }
/**
 *
 * Retrieves the CtcFeedFileObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcFeedFileObjectData getOutput() {
    return CtcFeedFileObjectHelper.fromMap(outputMap, "CtcFeedFile");
  }
}
