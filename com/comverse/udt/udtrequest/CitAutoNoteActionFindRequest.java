/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitAutoNoteActionFindRequest.java
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

import com.csgsystems.cit.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CitAutoNoteActionFindRequest Udt Request
 *
 */

public class CitAutoNoteActionFindRequest extends CitAutoNoteActionRequest {
/**
 *
 * Constructor to create a  CitAutoNoteActionFindRequest
 * @param id Unique request name
 * @param citAutoNoteActionFindIn CitAutoNoteActionObjectFilter for CitAutoNoteActionFindRequest
 *
 */
@JsonCreator
  public CitAutoNoteActionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitAutoNoteAction")CitAutoNoteActionObjectFilter citAutoNoteActionFindIn) {
    super(id, "CitAutoNoteActionFind");
    if (citAutoNoteActionFindIn != null) {
      Integer index =  citAutoNoteActionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectHelper.toMap(citAutoNoteActionFindIn, new HashMap(), "CitAutoNoteAction").get("CitAutoNoteAction"));
    }
  }

/**
 *
 * Retrieves the CitAutoNoteActionObjectDataList that results from the CitAutoNoteActionFindRequest call
 * @return CitAutoNoteActionObjectDataList resulting from udt call
 *
 */

  public CitAutoNoteActionObjectDataList getOutput() {
    return CitAutoNoteActionObjectHelper.fromMapList(outputMap, "CitAutoNoteActionList");
  }
}
