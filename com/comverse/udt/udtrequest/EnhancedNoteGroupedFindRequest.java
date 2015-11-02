/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteGroupedFindRequest.java
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
 * Class used to create a EnhancedNoteGroupedFindRequest Udt Request
 *
 */

public class EnhancedNoteGroupedFindRequest extends EnhancedNoteRequest {
/**
 *
 * Constructor to create a  EnhancedNoteGroupedFindRequest
 * @param id Unique request name
 * @param enhancedNoteGroupedFindIn EnhancedNoteObjectFilter for EnhancedNoteGroupedFindRequest
 * @param delimiter String for EnhancedNoteGroupedFindRequest
 *
 */
@JsonCreator
  public EnhancedNoteGroupedFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("EnhancedNote")EnhancedNoteObjectFilter enhancedNoteGroupedFindIn, @JsonProperty("Delimiter")String delimiter) {
    super(id, "EnhancedNoteGroupedFind");
    if (enhancedNoteGroupedFindIn != null) {
      Integer index =  enhancedNoteGroupedFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(enhancedNoteGroupedFindIn, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
    if (delimiter != null) {
      addInput("Delimiter", delimiter);
    }
  }

/**
 *
 * Retrieves the EnhancedNoteObjectDataList that results from the EnhancedNoteGroupedFindRequest call
 * @return EnhancedNoteObjectDataList resulting from udt call
 *
 */

  public EnhancedNoteObjectDataList getOutput() {
    return EnhancedNoteObjectHelper.fromMapList(outputMap, "EnhancedNoteList");
  }
}
