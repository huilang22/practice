/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitAutoNoteActionSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a CitAutoNoteActionSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class CitAutoNoteActionSequenceGetNoOpRequest extends CitAutoNoteActionSubRequestParent {
/**
 *
 * Constructor to create a   CitAutoNoteActionSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CitAutoNoteActionSequenceGetNoOpRequest(String id, CitAutoNoteActionObjectKeyData noOpIn) {
    super(id, "CitAutoNoteActionSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectKeyHelper.toMap(noOpIn, new HashMap(), "CitAutoNoteAction").get("CitAutoNoteAction"));
    }
  }
/**
 *
 * Retrieves the CitAutoNoteActionObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public CitAutoNoteActionObjectKeyData getOutput() {
    return CitAutoNoteActionObjectKeyHelper.fromMap(outputMap, "CitAutoNoteAction");
  }
}
