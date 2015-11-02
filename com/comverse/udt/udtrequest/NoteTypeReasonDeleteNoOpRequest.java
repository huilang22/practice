/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeReasonDeleteNoOpRequest.java
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
 * NoOp class used to simulate a NoteTypeReasonDeleteNoOpRequest Udt Request/Response
 *
 */
public class NoteTypeReasonDeleteNoOpRequest extends NoteTypeReasonSubRequestParent {
/**
 *
 * Constructor to create a   NoteTypeReasonDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NoteTypeReasonDeleteNoOpRequest(String id, NoteTypeReasonObjectData noOpIn) {
    super(id, "NoteTypeReasonDeleteNoOpRequest");
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
