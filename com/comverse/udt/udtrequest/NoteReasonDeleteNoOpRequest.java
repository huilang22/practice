/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonDeleteNoOpRequest.java
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
 * NoOp class used to simulate a NoteReasonDeleteNoOpRequest Udt Request/Response
 *
 */
public class NoteReasonDeleteNoOpRequest extends NoteReasonSubRequestParent {
/**
 *
 * Constructor to create a   NoteReasonDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NoteReasonDeleteNoOpRequest(String id, NoteReasonObjectData noOpIn) {
    super(id, "NoteReasonDeleteNoOpRequest");
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
