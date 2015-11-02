/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTemplateDeleteRequest.java
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
 * Class used to create a NoteTemplateDeleteRequest Udt Request
 *
 */

public class NoteTemplateDeleteRequest extends NoteTemplateSubRequestParent {
/**
 *
 * Constructor to create a  NoteTemplateDeleteRequest
 * @param id Unique request name
 * @param NoteTemplateDeleteIn NoteTemplateObjectKeyData for NoteTemplateDeleteRequest
 *
 */
@JsonCreator
  public NoteTemplateDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteTemplate")NoteTemplateObjectKeyData NoteTemplateDeleteIn) {
    super(id, "NoteTemplateDelete");
    if (NoteTemplateDeleteIn != null) {
      addInput("NoteTemplate", NoteTemplateObjectKeyHelper.toMap(NoteTemplateDeleteIn, new HashMap(), "NoteTemplateObjectKeyData").get("NoteTemplateObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NoteTemplateObjectData that results from the NoteTemplateDeleteRequest call
 * @return NoteTemplateObjectData resulting from udt call
 *
 */

  public NoteTemplateObjectData getOutput() {
    return NoteTemplateObjectHelper.fromMap(outputMap, "NoteTemplate");
  }
}
