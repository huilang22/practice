/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTemplateUpdateNoOpRequest.java
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
 * NoOp class used to simulate a NoteTemplateUpdateNoOpRequest Udt Request/Response
 *
 */
public class NoteTemplateUpdateNoOpRequest extends NoteTemplateSubRequestParent {
/**
 *
 * Constructor to create a   NoteTemplateUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NoteTemplateUpdateNoOpRequest(String id, NoteTemplateObjectData noOpIn) {
    super(id, "NoteTemplateUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("NoteTemplate", NoteTemplateObjectHelper.toMap(noOpIn, new HashMap(), "NoteTemplate").get("NoteTemplate"));
    }
  }
/**
 *
 * Retrieves the NoteTemplateObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTemplateObjectData getOutput() {
    return NoteTemplateObjectHelper.fromMap(outputMap, "NoteTemplate");
  }
}
