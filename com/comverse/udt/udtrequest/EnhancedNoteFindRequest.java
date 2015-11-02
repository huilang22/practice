/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteFindRequest.java
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
 * Class used to create a EnhancedNoteFindRequest Udt Request
 *
 */

public class EnhancedNoteFindRequest extends EnhancedNoteRequest {
/**
 *
 * Constructor to create a  EnhancedNoteFindRequest
 * @param id Unique request name
 * @param enhancedNoteFindIn EnhancedNoteObjectFilter for EnhancedNoteFindRequest
 *
 */
@JsonCreator
  public EnhancedNoteFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("EnhancedNote")EnhancedNoteObjectFilter enhancedNoteFindIn) {
    super(id, "EnhancedNoteFind");
    if (enhancedNoteFindIn != null) {
      Integer index =  enhancedNoteFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(enhancedNoteFindIn, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }

/**
 *
 * Retrieves the EnhancedNoteObjectDataList that results from the EnhancedNoteFindRequest call
 * @return EnhancedNoteObjectDataList resulting from udt call
 *
 */

  public EnhancedNoteObjectDataList getOutput() {
    return EnhancedNoteObjectHelper.fromMapList(outputMap, "EnhancedNoteList");
  }
}
