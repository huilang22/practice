/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonCreateNoOpRequest.java
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
 * NoOp class used to simulate a NoteReasonCreateNoOpRequest Udt Request/Response
 *
 */
public class NoteReasonCreateNoOpRequest extends NoteReasonSubRequestParent {
/**
 *
 * Constructor to create a   NoteReasonCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NoteReasonCreateNoOpRequest(String id, NoteReasonObjectData noOpIn) {
    super(id, "NoteReasonCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("NoteReason", NoteReasonObjectHelper.toMap(noOpIn, new HashMap(), "NoteReason").get("NoteReason"));
    }
  }
/**
 *
 * Retrieves the NoteReasonObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public NoteReasonObjectData getOutput() {
    return NoteReasonObjectHelper.fromMap(outputMap, "NoteReason");
  }
}
