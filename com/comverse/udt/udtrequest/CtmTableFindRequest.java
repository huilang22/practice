/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmTableFindRequest.java
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
 * Class used to create a CtmTableFindRequest Udt Request
 *
 */

public class CtmTableFindRequest extends CtmTableRequest {
/**
 *
 * Constructor to create a  CtmTableFindRequest
 * @param id Unique request name
 * @param CtmTableFindIn CtmTableObjectFilter for CtmTableFindRequest
 *
 */
@JsonCreator
  public CtmTableFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmTable")CtmTableObjectFilter CtmTableFindIn) {
    super(id, "CtmTableFind");
    if (CtmTableFindIn != null) {
      Integer index =  CtmTableFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtmTable", CtmTableObjectHelper.toMap(CtmTableFindIn, new HashMap(), "CtmTable").get("CtmTable"));
    }
  }

/**
 *
 * Retrieves the CtmTableObjectDataList that results from the CtmTableFindRequest call
 * @return CtmTableObjectDataList resulting from udt call
 *
 */

  public CtmTableObjectDataList getOutput() {
    return CtmTableObjectHelper.fromMapList(outputMap, "CtmTableList");
  }
}
