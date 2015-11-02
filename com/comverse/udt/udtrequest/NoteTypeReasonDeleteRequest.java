/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeReasonDeleteRequest.java
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
 * Class used to create a NoteTypeReasonDeleteRequest Udt Request
 *
 */

public class NoteTypeReasonDeleteRequest extends NoteTypeReasonSubRequestParent {
/**
 *
 * Constructor to create a  NoteTypeReasonDeleteRequest
 * @param id Unique request name
 * @param NoteTypeReasonDeleteIn NoteTypeReasonObjectKeyData for NoteTypeReasonDeleteRequest
 *
 */
@JsonCreator
  public NoteTypeReasonDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteTypeReason")NoteTypeReasonObjectKeyData NoteTypeReasonDeleteIn) {
    super(id, "NoteTypeReasonDelete");
    if (NoteTypeReasonDeleteIn != null) {
      addInput("NoteTypeReason", NoteTypeReasonObjectKeyHelper.toMap(NoteTypeReasonDeleteIn, new HashMap(), "NoteTypeReasonObjectKeyData").get("NoteTypeReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NoteTypeReasonObjectData that results from the NoteTypeReasonDeleteRequest call
 * @return NoteTypeReasonObjectData resulting from udt call
 *
 */

  public NoteTypeReasonObjectData getOutput() {
    return NoteTypeReasonObjectHelper.fromMap(outputMap, "NoteTypeReason");
  }
}
