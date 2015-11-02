/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTextFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NoteTextFindRequest Udt Request
 *
 */

public class NoteTextFindRequest extends NoteTextRequest {
/**
 *
 * Constructor to create a  NoteTextFindRequest
 * @param id Unique request name
 * @param NoteTextFindIn NoteTextObjectFilter for NoteTextFindRequest
 *
 */
@JsonCreator
  public NoteTextFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteText")NoteTextObjectFilter NoteTextFindIn) {
    super(id, "NoteTextFind");
    if (NoteTextFindIn != null) {
      Integer index =  NoteTextFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NoteText", NoteTextObjectHelper.toMap(NoteTextFindIn, new HashMap(), "NoteText").get("NoteText"));
    }
  }

/**
 *
 * Retrieves the NoteTextObjectDataList that results from the NoteTextFindRequest call
 * @return NoteTextObjectDataList resulting from udt call
 *
 */

  public NoteTextObjectDataList getOutput() {
    return NoteTextObjectHelper.fromMapList(outputMap, "NoteTextList");
  }
}
