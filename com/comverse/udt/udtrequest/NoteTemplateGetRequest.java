/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTemplateGetRequest.java
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
 * Class used to create a NoteTemplateGetRequest Udt Request
 *
 */

public class NoteTemplateGetRequest extends NoteTemplateSubRequestParent {
/**
 *
 * Constructor to create a  NoteTemplateGetRequest
 * @param id Unique request name
 * @param NoteTemplateGetIn NoteTemplateObjectKeyData for NoteTemplateGetRequest
 *
 */
@JsonCreator
  public NoteTemplateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteTemplate")NoteTemplateObjectKeyData NoteTemplateGetIn) {
    super(id, "NoteTemplateGet");
    if (NoteTemplateGetIn != null) {
      addInput("NoteTemplate", NoteTemplateObjectKeyHelper.toMap(NoteTemplateGetIn, new HashMap(), "NoteTemplateObjectKeyData").get("NoteTemplateObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NoteTemplateObjectData that results from the NoteTemplateGetRequest call
 * @return NoteTemplateObjectData resulting from udt call
 *
 */

  public NoteTemplateObjectData getOutput() {
    return NoteTemplateObjectHelper.fromMap(outputMap, "NoteTemplate");
  }
}
