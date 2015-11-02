/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CdrDataDucFindRequest.java
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
 * Class used to create a CdrDataDucFindRequest Udt Request
 *
 */

public class CdrDataDucFindRequest extends CdrDataDucRequest {
/**
 *
 * Constructor to create a  CdrDataDucFindRequest
 * @param id Unique request name
 * @param CdrDataDucFindIn CdrDataDucObjectFilter for CdrDataDucFindRequest
 *
 */
@JsonCreator
  public CdrDataDucFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CdrDataDuc")CdrDataDucObjectFilter CdrDataDucFindIn) {
    super(id, "CdrDataDucFind");
    if (CdrDataDucFindIn != null) {
      Integer index =  CdrDataDucFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CdrDataDuc", CdrDataDucObjectHelper.toMap(CdrDataDucFindIn, new HashMap(), "CdrDataDuc").get("CdrDataDuc"));
    }
  }

/**
 *
 * Retrieves the CdrDataDucObjectDataList that results from the CdrDataDucFindRequest call
 * @return CdrDataDucObjectDataList resulting from udt call
 *
 */

  public CdrDataDucObjectDataList getOutput() {
    return CdrDataDucObjectHelper.fromMapList(outputMap, "CdrDataDucList");
  }
}
