/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTemplateUpdateRequest.java
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
 * Class used to create a NoteTemplateUpdateRequest Udt Request
 *
 */

public class NoteTemplateUpdateRequest extends NoteTemplateSubRequestParent {
/**
 *
 * Constructor to create a  NoteTemplateUpdateRequest
 * @param id Unique request name
 * @param NoteTemplateUpdateIn NoteTemplateObjectData for NoteTemplateUpdateRequest
 *
 */
@JsonCreator
  public NoteTemplateUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteTemplate")NoteTemplateObjectData NoteTemplateUpdateIn) {
    super(id, "NoteTemplateUpdate");
    if (NoteTemplateUpdateIn != null) {
      addInput("NoteTemplate", NoteTemplateObjectHelper.toMap(NoteTemplateUpdateIn, new HashMap(), "NoteTemplate").get("NoteTemplate"));
    }
  }

/**
 *
 * Retrieves the NoteTemplateObjectData that results from the NoteTemplateUpdateRequest call
 * @return NoteTemplateObjectData resulting from udt call
 *
 */

  public NoteTemplateObjectData getOutput() {
    return NoteTemplateObjectHelper.fromMap(outputMap, "NoteTemplate");
  }
}
