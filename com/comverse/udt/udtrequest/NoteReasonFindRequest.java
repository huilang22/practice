/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteReasonFindRequest.java
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
 * Class used to create a NoteReasonFindRequest Udt Request
 *
 */

public class NoteReasonFindRequest extends NoteReasonRequest {
/**
 *
 * Constructor to create a  NoteReasonFindRequest
 * @param id Unique request name
 * @param NoteReasonFindIn NoteReasonObjectFilter for NoteReasonFindRequest
 *
 */
@JsonCreator
  public NoteReasonFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteReason")NoteReasonObjectFilter NoteReasonFindIn) {
    super(id, "NoteReasonFind");
    if (NoteReasonFindIn != null) {
      Integer index =  NoteReasonFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NoteReason", NoteReasonObjectHelper.toMap(NoteReasonFindIn, new HashMap(), "NoteReason").get("NoteReason"));
    }
  }

/**
 *
 * Retrieves the NoteReasonObjectDataList that results from the NoteReasonFindRequest call
 * @return NoteReasonObjectDataList resulting from udt call
 *
 */

  public NoteReasonObjectDataList getOutput() {
    return NoteReasonObjectHelper.fromMapList(outputMap, "NoteReasonList");
  }
}
