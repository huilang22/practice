/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTemplateCreateRequest.java
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
 * Class used to create a NoteTemplateCreateRequest Udt Request
 *
 */

public class NoteTemplateCreateRequest extends NoteTemplateSubRequestParent {
/**
 *
 * Constructor to create a  NoteTemplateCreateRequest
 * @param id Unique request name
 * @param NoteTemplateCreateIn NoteTemplateObjectData for NoteTemplateCreateRequest
 *
 */
@JsonCreator
  public NoteTemplateCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteTemplate")NoteTemplateObjectData NoteTemplateCreateIn) {
    super(id, "NoteTemplateCreate");
    if (NoteTemplateCreateIn != null) {
      addInput("NoteTemplate", NoteTemplateObjectHelper.toMap(NoteTemplateCreateIn, new HashMap(), "NoteTemplate").get("NoteTemplate"));
    }
  }

/**
 *
 * Retrieves the NoteTemplateObjectData that results from the NoteTemplateCreateRequest call
 * @return NoteTemplateObjectData resulting from udt call
 *
 */

  public NoteTemplateObjectData getOutput() {
    return NoteTemplateObjectHelper.fromMap(outputMap, "NoteTemplate");
  }
}
