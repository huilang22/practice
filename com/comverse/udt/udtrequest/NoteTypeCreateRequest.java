/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeCreateRequest.java
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
 * Class used to create a NoteTypeCreateRequest Udt Request
 *
 */

public class NoteTypeCreateRequest extends NoteTypeSubRequestParent {
/**
 *
 * Constructor to create a  NoteTypeCreateRequest
 * @param id Unique request name
 * @param NoteTypeCreateIn NoteTypeObjectData for NoteTypeCreateRequest
 *
 */
@JsonCreator
  public NoteTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteType")NoteTypeObjectData NoteTypeCreateIn) {
    super(id, "NoteTypeCreate");
    if (NoteTypeCreateIn != null) {
      addInput("NoteType", NoteTypeObjectHelper.toMap(NoteTypeCreateIn, new HashMap(), "NoteType").get("NoteType"));
    }
  }

/**
 *
 * Retrieves the NoteTypeObjectData that results from the NoteTypeCreateRequest call
 * @return NoteTypeObjectData resulting from udt call
 *
 */

  public NoteTypeObjectData getOutput() {
    return NoteTypeObjectHelper.fromMap(outputMap, "NoteType");
  }
}
