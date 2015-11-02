/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonDeleteRequest.java
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
 * Class used to create a NoteReasonDeleteRequest Udt Request
 *
 */

public class NoteReasonDeleteRequest extends NoteReasonSubRequestParent {
/**
 *
 * Constructor to create a  NoteReasonDeleteRequest
 * @param id Unique request name
 * @param NoteReasonDeleteIn NoteReasonObjectKeyData for NoteReasonDeleteRequest
 *
 */
@JsonCreator
  public NoteReasonDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteReason")NoteReasonObjectKeyData NoteReasonDeleteIn) {
    super(id, "NoteReasonDelete");
    if (NoteReasonDeleteIn != null) {
      addInput("NoteReason", NoteReasonObjectKeyHelper.toMap(NoteReasonDeleteIn, new HashMap(), "NoteReasonObjectKeyData").get("NoteReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NoteReasonObjectData that results from the NoteReasonDeleteRequest call
 * @return NoteReasonObjectData resulting from udt call
 *
 */

  public NoteReasonObjectData getOutput() {
    return NoteReasonObjectHelper.fromMap(outputMap, "NoteReason");
  }
}
