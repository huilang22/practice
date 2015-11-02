/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteCreateRequest.java
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
 * Class used to create a EnhancedNoteCreateRequest Udt Request
 *
 */

public class EnhancedNoteCreateRequest extends EnhancedNoteSubRequestParent {
/**
 *
 * Constructor to create a  EnhancedNoteCreateRequest
 * @param id Unique request name
 * @param enhancedNoteCreateIn EnhancedNoteObjectData for EnhancedNoteCreateRequest
 *
 */
@JsonCreator
  public EnhancedNoteCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EnhancedNote")EnhancedNoteObjectData enhancedNoteCreateIn) {
    super(id, "EnhancedNoteCreate");
    if (enhancedNoteCreateIn != null) {
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(enhancedNoteCreateIn, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }

/**
 *
 * Retrieves the EnhancedNoteObjectData that results from the EnhancedNoteCreateRequest call
 * @return EnhancedNoteObjectData resulting from udt call
 *
 */

  public EnhancedNoteObjectData getOutput() {
    return EnhancedNoteObjectHelper.fromMap(outputMap, "EnhancedNote");
  }
}
