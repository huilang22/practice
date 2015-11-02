/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeUpdateRequest.java
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
 * Class used to create a NoteTypeUpdateRequest Udt Request
 *
 */

public class NoteTypeUpdateRequest extends NoteTypeSubRequestParent {
/**
 *
 * Constructor to create a  NoteTypeUpdateRequest
 * @param id Unique request name
 * @param NoteTypeUpdateIn NoteTypeObjectData for NoteTypeUpdateRequest
 *
 */
@JsonCreator
  public NoteTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteType")NoteTypeObjectData NoteTypeUpdateIn) {
    super(id, "NoteTypeUpdate");
    if (NoteTypeUpdateIn != null) {
      addInput("NoteType", NoteTypeObjectHelper.toMap(NoteTypeUpdateIn, new HashMap(), "NoteType").get("NoteType"));
    }
  }

/**
 *
 * Retrieves the NoteTypeObjectData that results from the NoteTypeUpdateRequest call
 * @return NoteTypeObjectData resulting from udt call
 *
 */

  public NoteTypeObjectData getOutput() {
    return NoteTypeObjectHelper.fromMap(outputMap, "NoteType");
  }
}
