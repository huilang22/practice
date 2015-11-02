/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitAutoNoteActionDeleteRequest.java
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
 * Class used to create a CitAutoNoteActionDeleteRequest Udt Request
 *
 */

public class CitAutoNoteActionDeleteRequest extends CitAutoNoteActionSubRequestParent {
/**
 *
 * Constructor to create a  CitAutoNoteActionDeleteRequest
 * @param id Unique request name
 * @param citAutoNoteActionDeleteIn CitAutoNoteActionObjectKeyData for CitAutoNoteActionDeleteRequest
 *
 */
@JsonCreator
  public CitAutoNoteActionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitAutoNoteAction")CitAutoNoteActionObjectKeyData citAutoNoteActionDeleteIn) {
    super(id, "CitAutoNoteActionDelete");
    if (citAutoNoteActionDeleteIn != null) {
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectKeyHelper.toMap(citAutoNoteActionDeleteIn, new HashMap(), "CitAutoNoteActionObjectKeyData").get("CitAutoNoteActionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CitAutoNoteActionObjectData that results from the CitAutoNoteActionDeleteRequest call
 * @return CitAutoNoteActionObjectData resulting from udt call
 *
 */

  public CitAutoNoteActionObjectData getOutput() {
    return CitAutoNoteActionObjectHelper.fromMap(outputMap, "CitAutoNoteAction");
  }
}
