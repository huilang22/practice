/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExpressionFindRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ExpressionFindRequest Udt Request
 *
 */

public class ExpressionFindRequest extends ExpressionRequest {
/**
 *
 * Constructor to create a  ExpressionFindRequest
 * @param id Unique request name
 * @param findIn ExprObjFilter for ExpressionFindRequest
 *
 */
@JsonCreator
  public ExpressionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Expression")ExprObjFilter findIn) {
    super(id, "ExpressionFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Expression", ExprObjHelper.toMap(findIn, new HashMap(), "Expression").get("Expression"));
    }
  }

/**
 *
 * Retrieves the ExprObjDataList that results from the ExpressionFindRequest call
 * @return ExprObjDataList resulting from udt call
 *
 */

  public ExprObjDataList getOutput() {
    return ExprObjHelper.fromMapList(outputMap, "ExpressionList");
  }
}
