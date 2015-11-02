/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeGetRequest.java
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
 * Class used to create a NoteTypeGetRequest Udt Request
 *
 */

public class NoteTypeGetRequest extends NoteTypeSubRequestParent {
/**
 *
 * Constructor to create a  NoteTypeGetRequest
 * @param id Unique request name
 * @param NoteTypeGetIn NoteTypeObjectKeyData for NoteTypeGetRequest
 *
 */
@JsonCreator
  public NoteTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteType")NoteTypeObjectKeyData NoteTypeGetIn) {
    super(id, "NoteTypeGet");
    if (NoteTypeGetIn != null) {
      addInput("NoteType", NoteTypeObjectKeyHelper.toMap(NoteTypeGetIn, new HashMap(), "NoteTypeObjectKeyData").get("NoteTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NoteTypeObjectData that results from the NoteTypeGetRequest call
 * @return NoteTypeObjectData resulting from udt call
 *
 */

  public NoteTypeObjectData getOutput() {
    return NoteTypeObjectHelper.fromMap(outputMap, "NoteType");
  }
}
