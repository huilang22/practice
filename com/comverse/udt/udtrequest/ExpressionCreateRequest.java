/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExpressionCreateRequest.java
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
 * Class used to create a ExpressionCreateRequest Udt Request
 *
 */

public class ExpressionCreateRequest extends ExpressionSubRequestParent {
/**
 *
 * Constructor to create a  ExpressionCreateRequest
 * @param id Unique request name
 * @param createIn ExprObjData for ExpressionCreateRequest
 *
 */
@JsonCreator
  public ExpressionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Expression")ExprObjData createIn) {
    super(id, "ExpressionCreate");
    if (createIn != null) {
      addInput("Expression", ExprObjHelper.toMap(createIn, new HashMap(), "Expression").get("Expression"));
    }
  }

/**
 *
 * Retrieves the ExprObjData that results from the ExpressionCreateRequest call
 * @return ExprObjData resulting from udt call
 *
 */

  public ExprObjData getOutput() {
    return ExprObjHelper.fromMap(outputMap, "Expression");
  }
}
