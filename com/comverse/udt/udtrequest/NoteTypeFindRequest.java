/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NoteTypeFindRequest Udt Request
 *
 */

public class NoteTypeFindRequest extends NoteTypeRequest {
/**
 *
 * Constructor to create a  NoteTypeFindRequest
 * @param id Unique request name
 * @param NoteTypeFindIn NoteTypeObjectFilter for NoteTypeFindRequest
 *
 */
@JsonCreator
  public NoteTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("NoteType")NoteTypeObjectFilter NoteTypeFindIn) {
    super(id, "NoteTypeFind");
    if (NoteTypeFindIn != null) {
      Integer index =  NoteTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NoteType", NoteTypeObjectHelper.toMap(NoteTypeFindIn, new HashMap(), "NoteType").get("NoteType"));
    }
  }

/**
 *
 * Retrieves the NoteTypeObjectDataList that results from the NoteTypeFindRequest call
 * @return NoteTypeObjectDataList resulting from udt call
 *
 */

  public NoteTypeObjectDataList getOutput() {
    return NoteTypeObjectHelper.fromMapList(outputMap, "NoteTypeList");
  }
}
