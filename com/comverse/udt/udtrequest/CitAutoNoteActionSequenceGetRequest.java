/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitAutoNoteActionSequenceGetRequest.java
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
 * Class used to create a CitAutoNoteActionSequenceGetRequest Udt Request
 *
 */

public class CitAutoNoteActionSequenceGetRequest extends CitAutoNoteActionSubRequestParent {
/**
 *
 * Constructor to create a  CitAutoNoteActionSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public CitAutoNoteActionSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "CitAutoNoteActionSequenceGet");
  }

/**
 *
 * Retrieves the CitAutoNoteActionObjectKeyData that results from the CitAutoNoteActionSequenceGetRequest call
 * @return CitAutoNoteActionObjectKeyData resulting from udt call
 *
 */

  public CitAutoNoteActionObjectKeyData getOutput() {
    return CitAutoNoteActionObjectKeyHelper.fromMap(outputMap, "CitAutoNoteAction");
  }
}
