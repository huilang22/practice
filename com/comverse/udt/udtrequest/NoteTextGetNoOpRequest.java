/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTextGetNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a NoteTextGetNoOpRequest Udt Request/Response
 *
 */
public class NoteTextGetNoOpRequest extends NoteTextSubRequestParent {
/**
 *
 * Constructor to create a   NoteTextGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NoteTextGetNoOpRequest(String id, NoteTextObjectData noOpIn) {
    super(id, "NoteTextGetNoOpRequest");
    if (noOpIn != null) {
      addInput("NoteText", NoteTextObjectHelper.toMap(noOpIn, new HashMap(), "NoteText").get("NoteText"));
    }
  }
/**
 *
 * Retrieves the NoteTextObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTextObjectData getOutput() {
    return NoteTextObjectHelper.fromMap(outputMap, "NoteText");
  }
}
