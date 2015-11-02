/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteCodeGetRequest.java
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
 * Class used to create a NoteCodeGetRequest Udt Request
 *
 */

public class NoteCodeGetRequest extends NoteCodeSubRequestParent {
/**
 *
 * Constructor to create a  NoteCodeGetRequest
 * @param id Unique request name
 * @param NoteCodeGetIn NoteCodeObjectKeyData for NoteCodeGetRequest
 *
 */
@JsonCreator
  public NoteCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteCode")NoteCodeObjectKeyData NoteCodeGetIn) {
    super(id, "NoteCodeGet");
    if (NoteCodeGetIn != null) {
      addInput("NoteCode", NoteCodeObjectKeyHelper.toMap(NoteCodeGetIn, new HashMap(), "NoteCodeObjectKeyData").get("NoteCodeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NoteCodeObjectData that results from the NoteCodeGetRequest call
 * @return NoteCodeObjectData resulting from udt call
 *
 */

  public NoteCodeObjectData getOutput() {
    return NoteCodeObjectHelper.fromMap(outputMap, "NoteCode");
  }
}
