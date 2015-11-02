/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeDeleteRequest.java
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
 * Class used to create a NoteTypeDeleteRequest Udt Request
 *
 */

public class NoteTypeDeleteRequest extends NoteTypeSubRequestParent {
/**
 *
 * Constructor to create a  NoteTypeDeleteRequest
 * @param id Unique request name
 * @param NoteTypeDeleteIn NoteTypeObjectKeyData for NoteTypeDeleteRequest
 *
 */
@JsonCreator
  public NoteTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteType")NoteTypeObjectKeyData NoteTypeDeleteIn) {
    super(id, "NoteTypeDelete");
    if (NoteTypeDeleteIn != null) {
      addInput("NoteType", NoteTypeObjectKeyHelper.toMap(NoteTypeDeleteIn, new HashMap(), "NoteTypeObjectKeyData").get("NoteTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NoteTypeObjectData that results from the NoteTypeDeleteRequest call
 * @return NoteTypeObjectData resulting from udt call
 *
 */

  public NoteTypeObjectData getOutput() {
    return NoteTypeObjectHelper.fromMap(outputMap, "NoteType");
  }
}
