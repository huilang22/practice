/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteUpdateRequest.java
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
 * Class used to create a EnhancedNoteUpdateRequest Udt Request
 *
 */

public class EnhancedNoteUpdateRequest extends EnhancedNoteSubRequestParent {
/**
 *
 * Constructor to create a  EnhancedNoteUpdateRequest
 * @param id Unique request name
 * @param enhancedNoteUpdateIn EnhancedNoteObjectData for EnhancedNoteUpdateRequest
 *
 */
@JsonCreator
  public EnhancedNoteUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EnhancedNote")EnhancedNoteObjectData enhancedNoteUpdateIn) {
    super(id, "EnhancedNoteUpdate");
    if (enhancedNoteUpdateIn != null) {
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(enhancedNoteUpdateIn, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }

/**
 *
 * Retrieves the EnhancedNoteObjectData that results from the EnhancedNoteUpdateRequest call
 * @return EnhancedNoteObjectData resulting from udt call
 *
 */

  public EnhancedNoteObjectData getOutput() {
    return EnhancedNoteObjectHelper.fromMap(outputMap, "EnhancedNote");
  }
}
