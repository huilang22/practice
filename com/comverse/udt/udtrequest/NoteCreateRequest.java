/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteCreateRequest.java
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
 * Class used to create a NoteCreateRequest Udt Request
 *
 */

public class NoteCreateRequest extends NoteRequest {
/**
 *
 * Constructor to create a  NoteCreateRequest
 * @param id Unique request name
 * @param NoteCreateIn NoteObjectData for NoteCreateRequest
 *
 */
@JsonCreator
  public NoteCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Note")NoteObjectData NoteCreateIn) {
    super(id, "NoteCreate");
    if (NoteCreateIn != null) {
      addInput("Note", NoteObjectHelper.toMap(NoteCreateIn, new HashMap(), "Void").get("Void"));
    }
  }

}
