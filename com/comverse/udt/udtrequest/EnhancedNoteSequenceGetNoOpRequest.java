/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a EnhancedNoteSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class EnhancedNoteSequenceGetNoOpRequest extends EnhancedNoteSubRequestParent {
/**
 *
 * Constructor to create a   EnhancedNoteSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EnhancedNoteSequenceGetNoOpRequest(String id, EnhancedNoteObjectKeyData noOpIn) {
    super(id, "EnhancedNoteSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("EnhancedNote", EnhancedNoteObjectKeyHelper.toMap(noOpIn, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }
/**
 *
 * Retrieves the EnhancedNoteObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public EnhancedNoteObjectKeyData getOutput() {
    return EnhancedNoteObjectKeyHelper.fromMap(outputMap, "EnhancedNote");
  }
}
