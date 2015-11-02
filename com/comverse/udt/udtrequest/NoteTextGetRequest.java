/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTextGetRequest.java
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
 * Class used to create a NoteTextGetRequest Udt Request
 *
 */

public class NoteTextGetRequest extends NoteTextSubRequestParent {
/**
 *
 * Constructor to create a  NoteTextGetRequest
 * @param id Unique request name
 * @param NoteTextGetIn NoteTextObjectKeyData for NoteTextGetRequest
 *
 */
@JsonCreator
  public NoteTextGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteText")NoteTextObjectKeyData NoteTextGetIn) {
    super(id, "NoteTextGet");
    if (NoteTextGetIn != null) {
      addInput("NoteText", NoteTextObjectKeyHelper.toMap(NoteTextGetIn, new HashMap(), "NoteTextObjectKeyData").get("NoteTextObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NoteTextObjectData that results from the NoteTextGetRequest call
 * @return NoteTextObjectData resulting from udt call
 *
 */

  public NoteTextObjectData getOutput() {
    return NoteTextObjectHelper.fromMap(outputMap, "NoteText");
  }
}
