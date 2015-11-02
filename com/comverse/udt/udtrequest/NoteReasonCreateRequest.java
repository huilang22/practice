/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonCreateRequest.java
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
 * Class used to create a NoteReasonCreateRequest Udt Request
 *
 */

public class NoteReasonCreateRequest extends NoteReasonSubRequestParent {
/**
 *
 * Constructor to create a  NoteReasonCreateRequest
 * @param id Unique request name
 * @param NoteReasonCreateIn NoteReasonObjectData for NoteReasonCreateRequest
 *
 */
@JsonCreator
  public NoteReasonCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteReason")NoteReasonObjectData NoteReasonCreateIn) {
    super(id, "NoteReasonCreate");
    if (NoteReasonCreateIn != null) {
      addInput("NoteReason", NoteReasonObjectHelper.toMap(NoteReasonCreateIn, new HashMap(), "NoteReason").get("NoteReason"));
    }
  }

/**
 *
 * Retrieves the NoteReasonObjectData that results from the NoteReasonCreateRequest call
 * @return NoteReasonObjectData resulting from udt call
 *
 */

  public NoteReasonObjectData getOutput() {
    return NoteReasonObjectHelper.fromMap(outputMap, "NoteReason");
  }
}
