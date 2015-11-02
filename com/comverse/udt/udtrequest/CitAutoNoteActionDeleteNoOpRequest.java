/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitAutoNoteActionDeleteNoOpRequest.java
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

import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitAutoNoteActionDeleteNoOpRequest Udt Request/Response
 *
 */
public class CitAutoNoteActionDeleteNoOpRequest extends CitAutoNoteActionSubRequestParent {
/**
 *
 * Constructor to create a   CitAutoNoteActionDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitAutoNoteActionDeleteNoOpRequest(String id, CitAutoNoteActionObjectData noOpIn) {
    super(id, "CitAutoNoteActionDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectHelper.toMap(noOpIn, new HashMap(), "CitAutoNoteAction").get("CitAutoNoteAction"));
    }
  }
/**
 *
 * Retrieves the CitAutoNoteActionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CitAutoNoteActionObjectData getOutput() {
    return CitAutoNoteActionObjectHelper.fromMap(outputMap, "CitAutoNoteAction");
  }
}
