/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WriteoffFindRequest.java
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
 * Class used to create a WriteoffFindRequest Udt Request
 *
 */

public class WriteoffFindRequest extends WriteoffRequest {
/**
 *
 * Constructor to create a  WriteoffFindRequest
 * @param id Unique request name
 * @param WRITEOFFfindIn WriteoffObjectFilter for WriteoffFindRequest
 *
 */
@JsonCreator
  public WriteoffFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Writeoff")WriteoffObjectFilter WRITEOFFfindIn) {
    super(id, "WriteoffFind");
    if (WRITEOFFfindIn != null) {
      Integer index =  WRITEOFFfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Writeoff", WriteoffObjectHelper.toMap(WRITEOFFfindIn, new HashMap(), "Writeoff").get("Writeoff"));
    }
  }

/**
 *
 * Retrieves the WriteoffObjectDataList that results from the WriteoffFindRequest call
 * @return WriteoffObjectDataList resulting from udt call
 *
 */

  public WriteoffObjectDataList getOutput() {
    return WriteoffObjectHelper.fromMapList(outputMap, "WriteoffList");
  }
}
