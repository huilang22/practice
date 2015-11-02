/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonFindByNoteTypeRequest.java
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
 * Class used to create a NoteReasonFindByNoteTypeRequest Udt Request
 *
 */

public class NoteReasonFindByNoteTypeRequest extends NoteReasonRequest {
/**
 *
 * Constructor to create a  NoteReasonFindByNoteTypeRequest
 * @param id Unique request name
 * @param noteTypeId Integer for NoteReasonFindByNoteTypeRequest
 * @param languageCode Integer for NoteReasonFindByNoteTypeRequest
 *
 */
@JsonCreator
  public NoteReasonFindByNoteTypeRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteTypeId")Integer noteTypeId, @JsonProperty("LanguageCode")Integer languageCode) {
    super(id, "NoteReasonFindByNoteType");
    if (noteTypeId != null) {
      addInput("NoteTypeId", noteTypeId);
    }
    if (languageCode != null) {
      addInput("LanguageCode", languageCode);
    }
  }

/**
 *
 * Retrieves the NoteReasonObjectDataList that results from the NoteReasonFindByNoteTypeRequest call
 * @return NoteReasonObjectDataList resulting from udt call
 *
 */

  public NoteReasonObjectDataList getOutput() {
    return NoteReasonObjectHelper.fromMapList(outputMap, "NoteReasonList");
  }
}
