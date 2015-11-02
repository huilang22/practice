/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteDeleteRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a EnhancedNoteDeleteRequest Udt Request
 *
 */

public class EnhancedNoteDeleteRequest extends EnhancedNoteSubRequestParent {
/**
 *
 * Constructor to create a  EnhancedNoteDeleteRequest
 * @param id Unique request name
 * @param enhancedNoteDeleteIn EnhancedNoteObjectKeyData for EnhancedNoteDeleteRequest
 *
 */
@JsonCreator
  public EnhancedNoteDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("EnhancedNote")EnhancedNoteObjectKeyData enhancedNoteDeleteIn) {
    super(id, "EnhancedNoteDelete");
    if (enhancedNoteDeleteIn != null) {
      addInput("EnhancedNote", EnhancedNoteObjectKeyHelper.toMap(enhancedNoteDeleteIn, new HashMap(), "EnhancedNoteObjectKeyData").get("EnhancedNoteObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EnhancedNoteObjectData that results from the EnhancedNoteDeleteRequest call
 * @return EnhancedNoteObjectData resulting from udt call
 *
 */

  public EnhancedNoteObjectData getOutput() {
    return EnhancedNoteObjectHelper.fromMap(outputMap, "EnhancedNote");
  }
}
