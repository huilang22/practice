/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGenreDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CtcGenreDeleteNoOpRequest Udt Request/Response
 *
 */
public class CtcGenreDeleteNoOpRequest extends CtcGenreSubRequestParent {
/**
 *
 * Constructor to create a   CtcGenreDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcGenreDeleteNoOpRequest(String id, CtcGenreObjectData noOpIn) {
    super(id, "CtcGenreDeleteNoOpRequest");
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
