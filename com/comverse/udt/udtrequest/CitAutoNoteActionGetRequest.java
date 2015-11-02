/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitAutoNoteActionGetRequest.java
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
 * Class used to create a CitAutoNoteActionGetRequest Udt Request
 *
 */

public class CitAutoNoteActionGetRequest extends CitAutoNoteActionSubRequestParent {
/**
 *
 * Constructor to create a  CitAutoNoteActionGetRequest
 * @param id Unique request name
 * @param citAutoNoteActionGetIn CitAutoNoteActionObjectKeyData for CitAutoNoteActionGetRequest
 *
 */
@JsonCreator
  public CitAutoNoteActionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitAutoNoteAction")CitAutoNoteActionObjectKeyData citAutoNoteActionGetIn) {
    super(id, "CitAutoNoteActionGet");
    if (citAutoNoteActionGetIn != null) {
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectKeyHelper.toMap(citAutoNoteActionGetIn, new HashMap(), "CitAutoNoteActionObjectKeyData").get("CitAutoNoteActionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CitAutoNoteActionObjectData that results from the CitAutoNoteActionGetRequest call
 * @return CitAutoNoteActionObjectData resulting from udt call
 *
 */

  public CitAutoNoteActionObjectData getOutput() {
    return CitAutoNoteActionObjectHelper.fromMap(outputMap, "CitAutoNoteAction");
  }
}
