/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeFindByNoteReasonRequest.java
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
 * Class used to create a NoteTypeFindByNoteReasonRequest Udt Request
 *
 */

public class NoteTypeFindByNoteReasonRequest extends NoteTypeRequest {
/**
 *
 * Constructor to create a  NoteTypeFindByNoteReasonRequest
 * @param id Unique request name
 * @param noteReasonId Integer for NoteTypeFindByNoteReasonRequest
 * @param languageCode Integer for NoteTypeFindByNoteReasonRequest
 *
 */
@JsonCreator
  public NoteTypeFindByNoteReasonRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteReasonId")Integer noteReasonId, @JsonProperty("LanguageCode")Integer languageCode) {
    super(id, "NoteTypeFindByNoteReason");
    if (noteReasonId != null) {
      addInput("NoteReasonId", noteReasonId);
    }
    if (languageCode != null) {
      addInput("LanguageCode", languageCode);
    }
  }

/**
 *
 * Retrieves the NoteTypeObjectDataList that results from the NoteTypeFindByNoteReasonRequest call
 * @return NoteTypeObjectDataList resulting from udt call
 *
 */

  public NoteTypeObjectDataList getOutput() {
    return NoteTypeObjectHelper.fromMapList(outputMap, "NoteTypeList");
  }
}
