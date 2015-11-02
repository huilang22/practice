/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteCodeFindRequest.java
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
 * Class used to create a NoteCodeFindRequest Udt Request
 *
 */

public class NoteCodeFindRequest extends NoteCodeRequest {
/**
 *
 * Constructor to create a  NoteCodeFindRequest
 * @param id Unique request name
 * @param NoteCodeFindIn NoteCodeObjectFilter for NoteCodeFindRequest
 *
 */
@JsonCreator
  public NoteCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteCode")NoteCodeObjectFilter NoteCodeFindIn) {
    super(id, "NoteCodeFind");
    if (NoteCodeFindIn != null) {
      Integer index =  NoteCodeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NoteCode", NoteCodeObjectHelper.toMap(NoteCodeFindIn, new HashMap(), "NoteCode").get("NoteCode"));
    }
  }

/**
 *
 * Retrieves the NoteCodeObjectDataList that results from the NoteCodeFindRequest call
 * @return NoteCodeObjectDataList resulting from udt call
 *
 */

  public NoteCodeObjectDataList getOutput() {
    return NoteCodeObjectHelper.fromMapList(outputMap, "NoteCodeList");
  }
}
