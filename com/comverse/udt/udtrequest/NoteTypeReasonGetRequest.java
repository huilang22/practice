/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeReasonGetRequest.java
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
 * Class used to create a NoteTypeReasonGetRequest Udt Request
 *
 */

public class NoteTypeReasonGetRequest extends NoteTypeReasonSubRequestParent {
/**
 *
 * Constructor to create a  NoteTypeReasonGetRequest
 * @param id Unique request name
 * @param NoteTypeReasonGetIn NoteTypeReasonObjectKeyData for NoteTypeReasonGetRequest
 *
 */
@JsonCreator
  public NoteTypeReasonGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteTypeReason")NoteTypeReasonObjectKeyData NoteTypeReasonGetIn) {
    super(id, "NoteTypeReasonGet");
    if (NoteTypeReasonGetIn != null) {
      addInput("NoteTypeReason", NoteTypeReasonObjectKeyHelper.toMap(NoteTypeReasonGetIn, new HashMap(), "NoteTypeReasonObjectKeyData").get("NoteTypeReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NoteTypeReasonObjectData that results from the NoteTypeReasonGetRequest call
 * @return NoteTypeReasonObjectData resulting from udt call
 *
 */

  public NoteTypeReasonObjectData getOutput() {
    return NoteTypeReasonObjectHelper.fromMap(outputMap, "NoteTypeReason");
  }
}
