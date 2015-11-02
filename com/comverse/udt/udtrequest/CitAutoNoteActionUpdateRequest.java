/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitAutoNoteActionUpdateRequest.java
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
 * Class used to create a CitAutoNoteActionUpdateRequest Udt Request
 *
 */

public class CitAutoNoteActionUpdateRequest extends CitAutoNoteActionSubRequestParent {
/**
 *
 * Constructor to create a  CitAutoNoteActionUpdateRequest
 * @param id Unique request name
 * @param citAutoNoteActionUpdateIn CitAutoNoteActionObjectData for CitAutoNoteActionUpdateRequest
 *
 */
@JsonCreator
  public CitAutoNoteActionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitAutoNoteAction")CitAutoNoteActionObjectData citAutoNoteActionUpdateIn) {
    super(id, "CitAutoNoteActionUpdate");
    if (citAutoNoteActionUpdateIn != null) {
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectHelper.toMap(citAutoNoteActionUpdateIn, new HashMap(), "CitAutoNoteAction").get("CitAutoNoteAction"));
    }
  }

/**
 *
 * Retrieves the CitAutoNoteActionObjectData that results from the CitAutoNoteActionUpdateRequest call
 * @return CitAutoNoteActionObjectData resulting from udt call
 *
 */

  public CitAutoNoteActionObjectData getOutput() {
    return CitAutoNoteActionObjectHelper.fromMap(outputMap, "CitAutoNoteAction");
  }
}
