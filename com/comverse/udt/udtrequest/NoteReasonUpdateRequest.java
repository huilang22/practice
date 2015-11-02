/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonUpdateRequest.java
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
 * Class used to create a NoteReasonUpdateRequest Udt Request
 *
 */

public class NoteReasonUpdateRequest extends NoteReasonSubRequestParent {
/**
 *
 * Constructor to create a  NoteReasonUpdateRequest
 * @param id Unique request name
 * @param NoteReasonUpdateIn NoteReasonObjectData for NoteReasonUpdateRequest
 *
 */
@JsonCreator
  public NoteReasonUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteReason")NoteReasonObjectData NoteReasonUpdateIn) {
    super(id, "NoteReasonUpdate");
    if (NoteReasonUpdateIn != null) {
      addInput("NoteReason", NoteReasonObjectHelper.toMap(NoteReasonUpdateIn, new HashMap(), "NoteReason").get("NoteReason"));
    }
  }

/**
 *
 * Retrieves the NoteReasonObjectData that results from the NoteReasonUpdateRequest call
 * @return NoteReasonObjectData resulting from udt call
 *
 */

  public NoteReasonObjectData getOutput() {
    return NoteReasonObjectHelper.fromMap(outputMap, "NoteReason");
  }
}
