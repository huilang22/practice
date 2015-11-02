/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonGetRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NoteReasonGetRequest Udt Request
 *
 */

public class NoteReasonGetRequest extends NoteReasonSubRequestParent {
/**
 *
 * Constructor to create a  NoteReasonGetRequest
 * @param id Unique request name
 * @param NoteReasonGetIn NoteReasonObjectKeyData for NoteReasonGetRequest
 *
 */
@JsonCreator
  public NoteReasonGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteReason")NoteReasonObjectKeyData NoteReasonGetIn) {
    super(id, "NoteReasonGet");
    if (NoteReasonGetIn != null) {
      addInput("NoteReason", NoteReasonObjectKeyHelper.toMap(NoteReasonGetIn, new HashMap(), "NoteReasonObjectKeyData").get("NoteReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NoteReasonObjectData that results from the NoteReasonGetRequest call
 * @return NoteReasonObjectData resulting from udt call
 *
 */

  public NoteReasonObjectData getOutput() {
    return NoteReasonObjectHelper.fromMap(outputMap, "NoteReason");
  }
}
