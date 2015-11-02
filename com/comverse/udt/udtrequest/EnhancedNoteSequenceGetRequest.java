/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteSequenceGetRequest.java
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
 * Class used to create a EnhancedNoteSequenceGetRequest Udt Request
 *
 */

public class EnhancedNoteSequenceGetRequest extends EnhancedNoteSubRequestParent {
/**
 *
 * Constructor to create a  EnhancedNoteSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public EnhancedNoteSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "EnhancedNoteSequenceGet");
  }

/**
 *
 * Retrieves the EnhancedNoteObjectKeyData that results from the EnhancedNoteSequenceGetRequest call
 * @return EnhancedNoteObjectKeyData resulting from udt call
 *
 */

  public EnhancedNoteObjectKeyData getOutput() {
    return EnhancedNoteObjectKeyHelper.fromMap(outputMap, "EnhancedNote");
  }
}
