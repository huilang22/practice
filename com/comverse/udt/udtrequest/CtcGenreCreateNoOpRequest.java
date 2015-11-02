/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGenreCreateNoOpRequest.java
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
 * NoOp class used to simulate a CtcGenreCreateNoOpRequest Udt Request/Response
 *
 */
public class CtcGenreCreateNoOpRequest extends CtcGenreSubRequestParent {
/**
 *
 * Constructor to create a   CtcGenreCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcGenreCreateNoOpRequest(String id, CtcGenreObjectData noOpIn) {
    super(id, "CtcGenreCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcGenre", CtcGenreObjectHelper.toMap(noOpIn, new HashMap(), "CtcGenre").get("CtcGenre"));
    }
  }
/**
 *
 * Retrieves the CtcGenreObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcGenreObjectData getOutput() {
    return CtcGenreObjectHelper.fromMap(outputMap, "CtcGenre");
  }
}
