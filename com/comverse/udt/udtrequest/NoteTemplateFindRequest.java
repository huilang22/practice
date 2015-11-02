/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTemplateFindRequest.java
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
 * Class used to create a NoteTemplateFindRequest Udt Request
 *
 */

public class NoteTemplateFindRequest extends NoteTemplateRequest {
/**
 *
 * Constructor to create a  NoteTemplateFindRequest
 * @param id Unique request name
 * @param NoteTemplateFindIn NoteTemplateObjectFilter for NoteTemplateFindRequest
 *
 */
@JsonCreator
  public NoteTemplateFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteTemplate")NoteTemplateObjectFilter NoteTemplateFindIn) {
    super(id, "NoteTemplateFind");
    if (NoteTemplateFindIn != null) {
      Integer index =  NoteTemplateFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NoteTemplate", NoteTemplateObjectHelper.toMap(NoteTemplateFindIn, new HashMap(), "NoteTemplate").get("NoteTemplate"));
    }
  }

/**
 *
 * Retrieves the NoteTemplateObjectDataList that results from the NoteTemplateFindRequest call
 * @return NoteTemplateObjectDataList resulting from udt call
 *
 */

  public NoteTemplateObjectDataList getOutput() {
    return NoteTemplateObjectHelper.fromMapList(outputMap, "NoteTemplateList");
  }
}
