/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeReasonCreateRequest.java
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
 * Class used to create a NoteTypeReasonCreateRequest Udt Request
 *
 */

public class NoteTypeReasonCreateRequest extends NoteTypeReasonSubRequestParent {
/**
 *
 * Constructor to create a  NoteTypeReasonCreateRequest
 * @param id Unique request name
 * @param NoteTypeReasonCreateIn NoteTypeReasonObjectData for NoteTypeReasonCreateRequest
 *
 */
@JsonCreator
  public NoteTypeReasonCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteTypeReason")NoteTypeReasonObjectData NoteTypeReasonCreateIn) {
    super(id, "NoteTypeReasonCreate");
    if (NoteTypeReasonCreateIn != null) {
      addInput("NoteTypeReason", NoteTypeReasonObjectHelper.toMap(NoteTypeReasonCreateIn, new HashMap(), "NoteTypeReason").get("NoteTypeReason"));
    }
  }

/**
 *
 * Retrieves the NoteTypeReasonObjectData that results from the NoteTypeReasonCreateRequest call
 * @return NoteTypeReasonObjectData resulting from udt call
 *
 */

  public NoteTypeReasonObjectData getOutput() {
    return NoteTypeReasonObjectHelper.fromMap(outputMap, "NoteTypeReason");
  }
}
