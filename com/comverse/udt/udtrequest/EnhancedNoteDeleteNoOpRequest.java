/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteDeleteNoOpRequest.java
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
 * NoOp class used to simulate a EnhancedNoteDeleteNoOpRequest Udt Request/Response
 *
 */
public class EnhancedNoteDeleteNoOpRequest extends EnhancedNoteSubRequestParent {
/**
 *
 * Constructor to create a   EnhancedNoteDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EnhancedNoteDeleteNoOpRequest(String id, EnhancedNoteObjectData noOpIn) {
    super(id, "EnhancedNoteDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(noOpIn, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }
/**
 *
 * Retrieves the EnhancedNoteObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public EnhancedNoteObjectData getOutput() {
    return EnhancedNoteObjectHelper.fromMap(outputMap, "EnhancedNote");
  }
}
