/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a NoteTypeGetNoOpRequest Udt Request/Response
 *
 */
public class NoteTypeGetNoOpRequest extends NoteTypeSubRequestParent {
/**
 *
 * Constructor to create a   NoteTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NoteTypeGetNoOpRequest(String id, NoteTypeObjectData noOpIn) {
    super(id, "NoteTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("NoteType", NoteTypeObjectHelper.toMap(noOpIn, new HashMap(), "NoteType").get("NoteType"));
    }
  }
/**
 *
 * Retrieves the NoteTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTypeObjectData getOutput() {
    return NoteTypeObjectHelper.fromMap(outputMap, "NoteType");
  }
}
