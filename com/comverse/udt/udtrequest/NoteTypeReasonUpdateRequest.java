/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeReasonUpdateRequest.java
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
 * Class used to create a NoteTypeReasonUpdateRequest Udt Request
 *
 */

public class NoteTypeReasonUpdateRequest extends NoteTypeReasonSubRequestParent {
/**
 *
 * Constructor to create a  NoteTypeReasonUpdateRequest
 * @param id Unique request name
 * @param NoteTypeReasonUpdateIn NoteTypeReasonObjectData for NoteTypeReasonUpdateRequest
 *
 */
@JsonCreator
  public NoteTypeReasonUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteTypeReason")NoteTypeReasonObjectData NoteTypeReasonUpdateIn) {
    super(id, "NoteTypeReasonUpdate");
    if (NoteTypeReasonUpdateIn != null) {
      addInput("NoteTypeReason", NoteTypeReasonObjectHelper.toMap(NoteTypeReasonUpdateIn, new HashMap(), "NoteTypeReason").get("NoteTypeReason"));
    }
  }

/**
 *
 * Retrieves the NoteTypeReasonObjectData that results from the NoteTypeReasonUpdateRequest call
 * @return NoteTypeReasonObjectData resulting from udt call
 *
 */

  public NoteTypeReasonObjectData getOutput() {
    return NoteTypeReasonObjectHelper.fromMap(outputMap, "NoteTypeReason");
  }
}
