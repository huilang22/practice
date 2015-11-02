/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeReasonFindRequest.java
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
 * Class used to create a NoteTypeReasonFindRequest Udt Request
 *
 */

public class NoteTypeReasonFindRequest extends NoteTypeReasonRequest {
/**
 *
 * Constructor to create a  NoteTypeReasonFindRequest
 * @param id Unique request name
 * @param NoteTypeReasonFindIn NoteTypeReasonObjectFilter for NoteTypeReasonFindRequest
 *
 */
@JsonCreator
  public NoteTypeReasonFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteTypeReason")NoteTypeReasonObjectFilter NoteTypeReasonFindIn) {
    super(id, "NoteTypeReasonFind");
    if (NoteTypeReasonFindIn != null) {
      Integer index =  NoteTypeReasonFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NoteTypeReason", NoteTypeReasonObjectHelper.toMap(NoteTypeReasonFindIn, new HashMap(), "NoteTypeReason").get("NoteTypeReason"));
    }
  }

/**
 *
 * Retrieves the NoteTypeReasonObjectDataList that results from the NoteTypeReasonFindRequest call
 * @return NoteTypeReasonObjectDataList resulting from udt call
 *
 */

  public NoteTypeReasonObjectDataList getOutput() {
    return NoteTypeReasonObjectHelper.fromMapList(outputMap, "NoteTypeReasonList");
  }
}
