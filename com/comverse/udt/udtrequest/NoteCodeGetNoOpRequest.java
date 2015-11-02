/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteCodeGetNoOpRequest.java
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
 * NoOp class used to simulate a NoteCodeGetNoOpRequest Udt Request/Response
 *
 */
public class NoteCodeGetNoOpRequest extends NoteCodeSubRequestParent {
/**
 *
 * Constructor to create a   NoteCodeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public NoteCodeGetNoOpRequest(String id, NoteCodeObjectData noOpIn) {
    super(id, "NoteCodeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("NoteCode", NoteCodeObjectHelper.toMap(noOpIn, new HashMap(), "NoteCode").get("NoteCode"));
    }
  }
/**
 *
 * Retrieves the NoteCodeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public NoteCodeObjectData getOutput() {
    return NoteCodeObjectHelper.fromMap(outputMap, "NoteCode");
  }
}
