/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitAutoNoteActionCreateRequest.java
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
 * Class used to create a CitAutoNoteActionCreateRequest Udt Request
 *
 */

public class CitAutoNoteActionCreateRequest extends CitAutoNoteActionSubRequestParent {
/**
 *
 * Constructor to create a  CitAutoNoteActionCreateRequest
 * @param id Unique request name
 * @param citAutoNoteActionCreateIn CitAutoNoteActionObjectData for CitAutoNoteActionCreateRequest
 *
 */
@JsonCreator
  public CitAutoNoteActionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitAutoNoteAction")CitAutoNoteActionObjectData citAutoNoteActionCreateIn) {
    super(id, "CitAutoNoteActionCreate");
    if (citAutoNoteActionCreateIn != null) {
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectHelper.toMap(citAutoNoteActionCreateIn, new HashMap(), "CitAutoNoteAction").get("CitAutoNoteAction"));
    }
  }

/**
 *
 * Retrieves the CitAutoNoteActionObjectData that results from the CitAutoNoteActionCreateRequest call
 * @return CitAutoNoteActionObjectData resulting from udt call
 *
 */

  public CitAutoNoteActionObjectData getOutput() {
    return CitAutoNoteActionObjectHelper.fromMap(outputMap, "CitAutoNoteAction");
  }
}
