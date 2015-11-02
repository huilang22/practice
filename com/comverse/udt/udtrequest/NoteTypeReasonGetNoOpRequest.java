/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeReasonGetNoOpRequest.java
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
 * NoOp class used to simulate a NoteTypeReasonGetNoOpRequest Udt Request/Response
 *
 */
public class NoteTypeReasonGetNoOpRequest extends NoteTypeReasonSubRequestParent {
/**
 *
 * Constructor to create a   NoteTypeReasonGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NoteTypeReasonGetNoOpRequest(String id, NoteTypeReasonObjectData noOpIn) {
    super(id, "NoteTypeReasonGetNoOpRequest");
    if (noOpIn != null) {
      addInput("NoteTypeReason", NoteTypeReasonObjectHelper.toMap(noOpIn, new HashMap(), "NoteTypeReason").get("NoteTypeReason"));
    }
  }
/**
 *
 * Retrieves the NoteTypeReasonObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTypeReasonObjectData getOutput() {
    return NoteTypeReasonObjectHelper.fromMap(outputMap, "NoteTypeReason");
  }
}
