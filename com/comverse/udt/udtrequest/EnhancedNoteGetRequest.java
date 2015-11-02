/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteGetRequest.java
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
 * Class used to create a EnhancedNoteGetRequest Udt Request
 *
 */

public class EnhancedNoteGetRequest extends EnhancedNoteSubRequestParent {
/**
 *
 * Constructor to create a  EnhancedNoteGetRequest
 * @param id Unique request name
 * @param enhancedNoteGetIn EnhancedNoteObjectKeyData for EnhancedNoteGetRequest
 *
 */
@JsonCreator
  public EnhancedNoteGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("EnhancedNote")EnhancedNoteObjectKeyData enhancedNoteGetIn) {
    super(id, "EnhancedNoteGet");
    if (enhancedNoteGetIn != null) {
      addInput("EnhancedNote", EnhancedNoteObjectKeyHelper.toMap(enhancedNoteGetIn, new HashMap(), "EnhancedNoteObjectKeyData").get("EnhancedNoteObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EnhancedNoteObjectData that results from the EnhancedNoteGetRequest call
 * @return EnhancedNoteObjectData resulting from udt call
 *
 */

  public EnhancedNoteObjectData getOutput() {
    return EnhancedNoteObjectHelper.fromMap(outputMap, "EnhancedNote");
  }
}
