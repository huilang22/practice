/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteCreateNoOpRequest.java
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
 * NoOp class used to simulate a EnhancedNoteCreateNoOpRequest Udt Request/Response
 *
 */
public class EnhancedNoteCreateNoOpRequest extends EnhancedNoteSubRequestParent {
/**
 *
 * Constructor to create a   EnhancedNoteCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EnhancedNoteCreateNoOpRequest(String id, EnhancedNoteObjectData noOpIn) {
    super(id, "EnhancedNoteCreateNoOpRequest");
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
