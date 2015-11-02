/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExpressionUpdateRequest.java
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
 * Class used to create a ExpressionUpdateRequest Udt Request
 *
 */

public class ExpressionUpdateRequest extends ExpressionSubRequestParent {
/**
 *
 * Constructor to create a  ExpressionUpdateRequest
 * @param id Unique request name
 * @param updateIn ExprObjData for ExpressionUpdateRequest
 *
 */
@JsonCreator
  public ExpressionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Expression")ExprObjData updateIn) {
    super(id, "ExpressionUpdate");
    if (updateIn != null) {
      addInput("Expression", ExprObjHelper.toMap(updateIn, new HashMap(), "Expression").get("Expression"));
    }
  }

/**
 *
 * Retrieves the ExprObjData that results from the ExpressionUpdateRequest call
 * @return ExprObjData resulting from udt call
 *
 */

  public ExprObjData getOutput() {
    return ExprObjHelper.fromMap(outputMap, "Expression");
  }
}
