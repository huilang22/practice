/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteFindRequest.java
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
 * Class used to create a NoteFindRequest Udt Request
 *
 */

public class NoteFindRequest extends NoteRequest {
/**
 *
 * Constructor to create a  NoteFindRequest
 * @param id Unique request name
 * @param NoteFindIn NoteObjectFilter for NoteFindRequest
 *
 */
@JsonCreator
  public NoteFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Note")NoteObjectFilter NoteFindIn) {
    super(id, "NoteFind");
    if (NoteFindIn != null) {
      Integer index =  NoteFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Note", NoteObjectHelper.toMap(NoteFindIn, new HashMap(), "Note").get("Note"));
    }
  }

/**
 *
 * Retrieves the NoteObjectDataList that results from the NoteFindRequest call
 * @return NoteObjectDataList resulting from udt call
 *
 */

  public NoteObjectDataList getOutput() {
    return NoteObjectHelper.fromMapList(outputMap, "NoteList");
  }
}
