/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGenreGetNoOpRequest.java
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
 * NoOp class used to simulate a CtcGenreGetNoOpRequest Udt Request/Response
 *
 */
public class CtcGenreGetNoOpRequest extends CtcGenreSubRequestParent {
/**
 *
 * Constructor to create a   CtcGenreGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcGenreGetNoOpRequest(String id, CtcGenreObjectData noOpIn) {
    super(id, "CtcGenreGetNoOpRequest");
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
